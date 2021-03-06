package windy.infrastructure.contracts.commands.magazine;

public class CreateMagazineCommand extends MagazineCommand{
	
	private String title;
	private String author;

	public CreateMagazineCommand(String id, String title, String author) {
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
