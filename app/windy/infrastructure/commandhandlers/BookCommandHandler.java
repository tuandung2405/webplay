package windy.infrastructure.commandhandlers;


import com.google.inject.Inject;

import windy.framework.core.eventsource.IDomainRepository;
import windy.framework.core.messaging.ICommandHandler;
import windy.infrastructure.contracts.commands.book.BookCommand;
import windy.infrastructure.domains.BookDomain;

public abstract class BookCommandHandler<T extends BookCommand> implements ICommandHandler<T> {

	private IDomainRepository<BookDomain> repository;
	
	@Inject
	public BookCommandHandler(IDomainRepository<BookDomain> repository) {
		this.repository = repository;
	}
	
	public IDomainRepository<BookDomain> getBookRepository() {
		return repository;
	}
}
