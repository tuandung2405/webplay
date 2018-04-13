package windy.infrastructure.contracts.commands.magazine;

public class UpdateMagazineCommand extends MagazineCommand {

	private String title;
	private String author;
	private long publishedDate;
	private long createdAt;
	private boolean isActive;
	private int count;

	public UpdateMagazineCommand(String id, String title, String author, long publishedDate, long createdAt,
			boolean isActive, int count) {
		super(id);
		this.title = title;
		this.author = author;
		this.publishedDate = publishedDate;
		this.createdAt = createdAt;
		this.isActive = isActive;
		this.count = count;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public long getPublishedDate() {
		return publishedDate;
	}

	public long getCreatedAt() {
		return createdAt;
	}

	public boolean isActive() {
		return isActive;
	}

	public int getCount() {
		return count;
	}

}
