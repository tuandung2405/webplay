package windy.infrastructure.commandhandlers;


import com.google.inject.Inject;

import windy.framework.core.eventsource.IDomainRepository;
import windy.framework.core.messaging.ICommandHandler;
import windy.infrastructure.contracts.commands.book.BookCommand;
import windy.infrastructure.domains.Book;

public abstract class BookCommandHandler<T extends BookCommand> implements ICommandHandler<T> {

	private IDomainRepository<Book> repository;
	
	@Inject
	public BookCommandHandler(IDomainRepository<Book> repository) {
		this.repository = repository;
	}
	
	public IDomainRepository<Book> getBookRepository() {
		return repository;
	}

}
