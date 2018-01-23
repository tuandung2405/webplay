package windy.framework.core;

import windy.framework.contracts.Command;

public interface ICommandBus {

	public <T extends Command> void send(T command);
}
