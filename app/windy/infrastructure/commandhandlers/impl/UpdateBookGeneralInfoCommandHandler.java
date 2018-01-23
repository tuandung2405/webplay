package windy.infrastructure.commandhandlers.impl;

import com.google.inject.Inject;

import windy.infrastructure.commandhandlers.BookCommandHandler;
import windy.infrastructure.contracts.commands.book.UpdateBookGeneralInfoCommand;
import windy.infrastructure.domains.Book;
import windy.infrastructure.repositories.BookRepository;

public class UpdateBookGeneralInfoCommandHandler extends BookCommandHandler<UpdateBookGeneralInfoCommand> {

	@Inject
	public UpdateBookGeneralInfoCommandHandler(BookRepository bookRepository) {
		super(bookRepository);
	}

	@Override
	public void handle(UpdateBookGeneralInfoCommand command) {
		Book b = getBookRepository().getById(command.getUid());
		if (b != null) {
			b.setTitle(command.getTitle());
			b.setAuthor(command.getAuthor());

			getBookRepository().update(b);
		}
	}

}
