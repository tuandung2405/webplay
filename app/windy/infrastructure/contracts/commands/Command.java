package windy.infrastructure.contracts.commands;

import java.util.UUID;

import windy.framework.contracts.ICommand;

public abstract class Command implements ICommand {

	protected UUID uid;

	public Command(UUID uid) {
		super();
		this.uid = uid;
	}

	public UUID getUid() {
		return uid;
	}

	public void setUid(UUID uid) {
		this.uid = uid;
	}

	public void execute() {

	}
}
