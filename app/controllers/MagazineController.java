package controllers;

import javax.inject.Inject;

import play.mvc.Controller;
import windy.framework.infrastructure.messaging.CommandBus;
import windy.infrastructure.repositories.MagazineRepository;

public class MagazineController extends Controller{

    private CommandBus commandBus;
    private MagazineRepository magazineRepository;

    @Inject
    public MagazineController(CommandBus commandBus, MagazineRepository magazineRepository) {
        this.commandBus = commandBus;
        this.magazineRepository = magazineRepository;
    }


}