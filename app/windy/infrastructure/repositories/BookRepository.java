package windy.infrastructure.repositories;

import windy.infrastructure.domains.Book;

public class BookRepository extends BaseRepository<Book> {

	public BookRepository(Class<Book> clazz) {
		super(clazz);
		// TODO Auto-generated constructor stub
	}

	public BookRepository() {
		super(Book.class);
		justTest();
	}

	private void justTest() {
		Book book1 = new Book();
		book1.setTitle("book1");
		book1.setAuthor("Dung");
		book1.setCreatedAt(System.currentTimeMillis());
		book1.setPublishedDate(System.currentTimeMillis());
		book1.setActive(true);
		book1.setCount(1);
		list.add(book1);
	}
}
