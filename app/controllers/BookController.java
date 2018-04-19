package controllers;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;

import controllers.result.ApiResult;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import windy.framework.infrastructure.messaging.CommandBus;
import windy.infrastructure.contracts.commands.book.CreateBookCommand;
import windy.infrastructure.repositories.BookRepository;

public class BookController extends Controller {
	private CommandBus commandBus;
	private BookRepository bookRepository;

	@Inject
	public BookController(CommandBus commandBus, BookRepository bookRepository) {
		this.commandBus = commandBus;
		this.bookRepository = bookRepository;
	}

	public Result create() {

		JsonNode body = request().body().asJson();
		CreateBookCommand createBookCommand = new CreateBookCommand(body.get("uuid").asText(),
				body.get("title").asText(), body.get("author").asText());
		commandBus.send(createBookCommand);

		ApiResult apiResult = new ApiResult();
		return ok(Json.toJson(apiResult));
	}
}