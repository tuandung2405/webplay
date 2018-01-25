package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import controllers.result.ApiResult;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;
import windy.framework.infrastructure.messaging.CommandBus;
import windy.infrastructure.contracts.commands.book.CreateBookCommand;
import windy.infrastructure.contracts.commands.book.DeleteBookCommand;
import windy.infrastructure.contracts.commands.book.UpdateBookCommand;
import windy.infrastructure.domains.Book;
import windy.infrastructure.repositories.BookRepository;

import java.util.UUID;

import javax.inject.Inject;

public class BookController extends Controller{
    private CommandBus commandBus;
    private BookRepository bookRepository;

    @Inject
    public BookController(CommandBus commandBus, BookRepository bookRepository) {
        this.commandBus = commandBus;
        this.bookRepository = bookRepository;
    }

    public Result create(){

        JsonNode body = request().body().asJson();
        CreateBookCommand createBookCommand = new CreateBookCommand(UUID.fromString(body.get("uuid").asText()),body.get("title").asText(),body.get("author").asText());
        commandBus.send(createBookCommand);

        ApiResult apiResult = new ApiResult();
        return ok(Json.toJson(apiResult));
    }

    public Result getAll(){
        ApiResult apiResult = new ApiResult();
        apiResult.setData(bookRepository.getAll());
        return ok(Json.toJson(bookRepository.getAll()));
    }

    public Result get(String uuid){
        Book book = bookRepository.getById(UUID.fromString(uuid));
        ApiResult apiResult = new ApiResult();
        apiResult.setData(book);
        return ok(Json.toJson(apiResult));
    }

    public Result update(){
        JsonNode body = request().body().asJson();
        ApiResult apiResult = new ApiResult();
        UpdateBookCommand updateBookCommand = new UpdateBookCommand(UUID.fromString(body.get("uuid").asText()),
                body.get("title").asText(),
                body.get("author").asText(),
                body.get("publishedDate").asLong(),
                body.get("createdAt").asLong(),
                body.get("active").asBoolean(),
                body.get("count").asInt());
        commandBus.send(updateBookCommand);
        return ok(Json.toJson(apiResult));
    }

    public Result delete(String uuid){
        ApiResult apiResult = new ApiResult();
        DeleteBookCommand deleteBookCommand = new DeleteBookCommand(UUID.fromString(uuid));
        commandBus.send(deleteBookCommand);
        return ok(Json.toJson(apiResult));
    }
}