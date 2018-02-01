package windy.infrastructure.commandhandlers;


import com.google.inject.Inject;

import windy.framework.core.messaging.ICommandHandler;
import windy.infrastructure.contracts.commands.book.BookCommand;
import windy.infrastructure.repositories.BookRepository;

public abstract class BookCommandHandler<T extends BookCommand> implements ICommandHandler<T> {

	private BookRepository bookRepository;
	
	@Inject
	public BookCommandHandler(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public BookRepository getBookRepository() {
		return bookRepository;
	}

}
