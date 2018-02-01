package windy.framework.core.messaging;

import windy.framework.contracts.ICommand;

public interface ICommandBus {

	public <T extends ICommand> void send(T command);
}
