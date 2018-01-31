package windy.framework.infrastructure.messaging;

import javax.inject.Inject;

import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;

import windy.framework.contracts.Command;
import windy.framework.core.ICommandHandler;
import windy.framework.core.ICommandHandlerFactory;

public class CommandHandlerFactory implements ICommandHandlerFactory {

	private Injector injector;

	@Inject
	public CommandHandlerFactory(Injector injector) {
		this.injector = injector;
	}

	@Override
	public <T extends Command> ICommandHandler<T> createCommandHandler(T command) {
		String[] classNames = command.getClass().getName().split("\\.");
		ICommandHandler<T> handler = (ICommandHandler<T>) injector.getInstance(
				Key.get(ICommandHandler.class, Names.named(classNames[classNames.length - 1] + "Handler")));
		return handler;
	}
}