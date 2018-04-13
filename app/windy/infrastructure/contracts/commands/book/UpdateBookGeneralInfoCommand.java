package windy.infrastructure.contracts.commands.book;

public class UpdateBookGeneralInfoCommand extends BookCommand {

	private String title;
	private String author;

	public UpdateBookGeneralInfoCommand(String id, String title, String author) {
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
}
