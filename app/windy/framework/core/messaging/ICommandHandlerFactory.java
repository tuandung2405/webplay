package windy.framework.core.messaging;

import windy.framework.contracts.ICommand;

public interface ICommandHandlerFactory {

	public <T extends ICommand> ICommandHandler<T> createCommandHandler(T command);
}