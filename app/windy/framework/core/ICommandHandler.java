package windy.framework.core;

import windy.framework.contracts.Command;

public interface ICommandHandler<T extends Command> {

	public void handle(T command);
}
