package windy.infrastructure.contracts.commands.book;

import windy.framework.contracts.IEvent;

public class CreateBookCommand extends BookCommand implements IEvent {

	private String title;
	private String author;

	public CreateBookCommand(String id, String title, String author) {
		super(id);
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String getSourceId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSourceId(String sourceId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setVersion(int version) {
		// TODO Auto-generated method stub
		
	}
}
