package windy.infrastructure.contracts.commands.book;

import windy.infrastructure.contracts.commands.Command;

public class BookCommand extends Command {

	public BookCommand(String id) {
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