package windy.infrastructure.contracts.commands;

import windy.framework.contracts.ICommand;

public abstract class Command implements ICommand {

	protected String id;

	public Command(String id) {
		super();
		this.id = id;
	}

	public void execute() {

	}
}
