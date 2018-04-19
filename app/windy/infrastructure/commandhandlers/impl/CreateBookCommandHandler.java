package windy.infrastructure.commandhandlers.impl;

import com.google.inject.Inject;

import windy.framework.core.eventsource.IDomainRepository;
import windy.framework.core.messaging.ICommandHandler;
import windy.infrastructure.contracts.commands.book.CreateBookCommand;
import windy.infrastructure.domains.BookDomain;

public class CreateBookCommandHandler implements ICommandHandler<CreateBookCommand> {

	IDomainRepository<BookDomain> repository;
	
	@Inject
	public CreateBookCommandHandler(IDomainRepository<BookDomain> repository) {
		this.repository = repository;
	}

	@Override
	public void handle(CreateBookCommand command) {
		BookDomain book = new BookDomain();
		book.create(command.getId(), command.getTitle(), command.getAuthor());
		repository.save(book);
	}
}
