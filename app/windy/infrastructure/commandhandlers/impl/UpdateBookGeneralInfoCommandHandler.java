package windy.infrastructure.commandhandlers.impl;

import com.google.inject.Inject;

import windy.framework.core.eventsource.IDomainRepository;
import windy.framework.core.messaging.ICommandHandler;
import windy.infrastructure.contracts.commands.book.UpdateBookGeneralInfoCommand;
import windy.infrastructure.domains.BookDomain;

public class UpdateBookGeneralInfoCommandHandler implements ICommandHandler<UpdateBookGeneralInfoCommand> {

	IDomainRepository<BookDomain> repository;
	
	@Inject
	public UpdateBookGeneralInfoCommandHandler(IDomainRepository<BookDomain> repository) {
		this.repository = repository;
	}

	@Override
	public void handle(UpdateBookGeneralInfoCommand command) {
		BookDomain book = new BookDomain();
		//book.apply(command);
		repository.save(book);
	}

}
