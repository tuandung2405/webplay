package windy.infrastructure.repositories;

import javax.inject.Singleton;

import org.springframework.stereotype.Repository;
import windy.framework.core.eventsource.IDomainRepository;
import windy.infrastructure.domains.BookDomain;

public class BookRepository implements IDomainRepository<BookDomain> {

	public BookRepository(){

	}

	@Override
	public BookDomain getById(String id) {
		
		return null;
	}

	@Override
	public boolean doesExist(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void save(BookDomain aggregate) {
		// TODO Auto-generated method stub
		
	}


	/*private void justTest() {
		Book book1 = new Book();
		book1.setTitle("book1");
		book1.setAuthor("Dung");
		book1.setCreatedAt(System.currentTimeMillis());
		book1.setPublishedDate(System.currentTimeMillis());
		book1.setActive(true);
		book1.setCount(1);
		list.add(book1);
	}*/

}
