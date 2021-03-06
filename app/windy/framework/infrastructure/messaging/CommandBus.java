package windy.framework.infrastructure.messaging;


import javax.inject.Inject;
import javax.inject.Singleton;

import windy.framework.contracts.ICommand;
import windy.framework.core.messaging.ICommandBus;
import windy.framework.core.messaging.ICommandHandlerFactory;

@Singleton
public class CommandBus implements ICommandBus {


    ICommandHandlerFactory commandHandlerFactory;

    @Inject
    public CommandBus(ICommandHandlerFactory commandHandlerFactory){
        this.commandHandlerFactory = commandHandlerFactory;
    }

    @Override
    public <T extends ICommand> void send(T command) {

        commandHandlerFactory.createCommandHandler(command).handle(command);
    }

}