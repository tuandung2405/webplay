package windy.framework.core.messaging;

import windy.framework.contracts.ICommand;

public interface ICommandHandler<T extends ICommand> {

	public void handle(T command);
}
