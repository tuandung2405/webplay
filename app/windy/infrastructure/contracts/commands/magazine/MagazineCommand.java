package windy.infrastructure.contracts.commands.magazine;

import windy.infrastructure.contracts.commands.Command;

public class MagazineCommand extends Command {

	public MagazineCommand(String id) {
		super(id);
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		super.id = id;
	}
}
