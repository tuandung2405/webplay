package windy.infrastructure.contracts.commands.book;

public class CreateBookCommand extends BookCommand {

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
}
