package windy.infrastructure.commandhandlers.impl;

import com.google.inject.Inject;

import windy.framework.core.eventsource.IDomainRepository;
import windy.framework.core.messaging.ICommandHandler;
import windy.infrastructure.contracts.commands.book.DeleteBookCommand;
import windy.infrastructure.domains.BookDomain;

public class DeleteBookCommandHandler implements ICommandHandler<DeleteBookCommand> {

	IDomainRepository<BookDomain> repository;

	@Inject
	public DeleteBookCommandHandler(IDomainRepository<BookDomain> repository) {
		this.repository = repository;
	}

	@Override
	public void handle(DeleteBookCommand command) {
		BookDomain book = new BookDomain();
		book.apply(command);
		repository.save(book);
	}
}
