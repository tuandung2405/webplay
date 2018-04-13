package windy.infrastructure.domains;

import java.util.ArrayList;
import java.util.List;

import windy.framework.contracts.IEvent;
import windy.framework.core.domains.BaseAggregateRoot;
import windy.infrastructure.contracts.commands.book.CreateBookCommand;
import windy.infrastructure.contracts.events.BookCreatedEvent;

public class BookDomain extends BaseAggregateRoot {

	List<IEvent> changes;
	
	public BookDomain() {
		super();
		changes = new ArrayList<>();
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

	public void create(CreateBookCommand command) {
		IEvent e = new BookCreatedEvent();
		apply(e);
		when(e);
	}
	
	private void apply(IEvent e) {
		e.setVersion(e.getVersion() + 1);
		e.setSourceId(this.id);
		changes.add(e);
	}

	private void when(BookCreatedEvent event) {
		this.id = event.getId();
		this.version = event.getVersion();
		
	}

	public List<IEvent> getChanges() {
		return changes;
	}
	
/*	public void when(UpdateBookGeneralInfoCommand command) {
		this.author = command.getAuthor();
		this.title = command.getTitle();
	}

	public void when(DeleteBookCommand command) {
		this.count = 0;
	}*/
}
