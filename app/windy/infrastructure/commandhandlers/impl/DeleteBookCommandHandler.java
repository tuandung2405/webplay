package windy.infrastructure.commandhandlers.impl;

import windy.infrastructure.commandhandlers.BookCommandHandler;
import windy.infrastructure.contracts.commands.book.DeleteBookCommand;
import windy.infrastructure.repositories.BookRepository;

public class DeleteBookCommandHandler extends BookCommandHandler<DeleteBookCommand>{
	
	public DeleteBookCommandHandler(BookRepository bookRepository) {
		super(bookRepository);
	}

	@Override
	public void handle(DeleteBookCommand command) {
		getBookRepository().delete(command.getUid());
	}

}
