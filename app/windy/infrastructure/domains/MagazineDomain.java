package windy.infrastructure.domains;

import windy.framework.core.domains.BaseAggregateRoot;
import windy.infrastructure.contracts.commands.magazine.CreateMagazineCommand;
import windy.infrastructure.contracts.commands.magazine.DeleteMagazineCommand;
import windy.infrastructure.contracts.commands.magazine.UpdateMagazineGeneralInfoCommand;

public class MagazineDomain extends BaseAggregateRoot {

	public MagazineDomain() {
		super();
	}

	private String title;
	private String author;
	private long publishedDate;
	private long createdAt;
	private boolean isActive;
	private int count;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(long publishedDate) {
		this.publishedDate = publishedDate;
	}

	public long getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(long createdAt) {
		this.createdAt = createdAt;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void apply(CreateMagazineCommand command) {
		this.id = command.getId();
		this.author = command.getAuthor();
		this.title = command.getTitle();
        this.publishedDate = System.currentTimeMillis();
        this.isActive = true;
        this.count = 1;
	}
	
	public void apply(UpdateMagazineGeneralInfoCommand command) {
		this.author = command.getAuthor();
		this.title = command.getTitle();
	}
	
	public void apply(DeleteMagazineCommand command) {
		this.count = 0;
	}
}
