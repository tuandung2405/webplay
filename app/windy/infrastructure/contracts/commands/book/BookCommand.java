package windy.infrastructure.contracts.commands.book;

import java.util.UUID;

import windy.infrastructure.contracts.commands.Command;

public class BookCommand extends Command {

	public BookCommand(UUID uid) {
		super(uid);
	}

	@Override
	public void setUid() {
		// TODO Auto-generated method stub
	}
}
