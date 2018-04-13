package controllers;

import java.util.UUID;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;

import controllers.result.ApiResult;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import windy.framework.infrastructure.messaging.CommandBus;
import windy.infrastructure.contracts.commands.magazine.CreateMagazineCommand;
import windy.infrastructure.contracts.commands.magazine.DeleteMagazineCommand;
import windy.infrastructure.contracts.commands.magazine.UpdateMagazineCommand;
import windy.infrastructure.domains.MagazineDomain;
import windy.infrastructure.repositories.MagazineRepository;

public class MagazineController extends Controller{

    private CommandBus commandBus;
    private MagazineRepository magazineRepository;

    @Inject
    public MagazineController(CommandBus commandBus, MagazineRepository magazineRepository) {
        this.commandBus = commandBus;
        this.magazineRepository = magazineRepository;
    }

    public Result create(){

        JsonNode body = request().body().asJson();
        CreateMagazineCommand createMagazineCommand = new CreateMagazineCommand(UUID.fromString(body.get("uuid").asText()),body.get("title").asText(),body.get("author").asText());
        commandBus.send(createMagazineCommand);

        ApiResult apiResult = new ApiResult();
        return ok(Json.toJson(apiResult));
    }

    public Result getAll(){
        ApiResult apiResult = new ApiResult();
        apiResult.setData(magazineRepository.getAll());
        return ok(Json.toJson(magazineRepository.getAll()));
    }

    public Result get(String uuid){
        MagazineDomain book = magazineRepository.getById(UUID.fromString(uuid));
        ApiResult apiResult = new ApiResult();
        apiResult.setData(book);
        return ok(Json.toJson(apiResult));
    }

    public Result update(){
        JsonNode body = request().body().asJson();
        ApiResult apiResult = new ApiResult();
        UpdateMagazineCommand updateMagazineCommand = new UpdateMagazineCommand(UUID.fromString(body.get("uuid").asText()),
                body.get("title").asText(),
                body.get("author").asText(),
                body.get("publishedDate").asLong(),
                body.get("createdAt").asLong(),
                body.get("active").asBoolean(),
                body.get("count").asInt());
        commandBus.send(updateMagazineCommand);
        return ok(Json.toJson(apiResult));
    }

    public Result delete(String uuid){
        ApiResult apiResult = new ApiResult();
        DeleteMagazineCommand deleteMagazineCommand = new DeleteMagazineCommand(UUID.fromString(uuid));
        commandBus.send(deleteMagazineCommand);
        return ok(Json.toJson(apiResult));
    }

}