package windy.infrastructure.contracts.commands;

import windy.framework.contracts.ICommand;

public abstract class Command implements ICommand {

	protected String uid;

	public Command(String uid) {
		super();
		this.uid = uid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public void execute() {

	}
}
