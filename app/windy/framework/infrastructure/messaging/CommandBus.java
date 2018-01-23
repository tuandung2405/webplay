package windy.framework.infrastructure.messaging;


import javax.inject.Inject;
import javax.inject.Singleton;

import windy.framework.contracts.Command;
import windy.framework.core.ICommandBus;
import windy.framework.core.ICommandHandlerFactory;

@Singleton
public class CommandBus implements ICommandBus {


    ICommandHandlerFactory commandHandlerFactory;

    @Inject
    public CommandBus(ICommandHandlerFactory commandHandlerFactory){
        this.commandHandlerFactory = commandHandlerFactory;
    }

    @Override
    public <T extends Command> void send(T command) {

        commandHandlerFactory.createCommandHandler(command).handle(command);
    }
}