package windy.infrastructure.repositories;

import windy.framework.core.eventsource.IDomainRepository;
import windy.infrastructure.domains.Magazine;

public class MagazineRepository implements IDomainRepository<Magazine>{


	public MagazineRepository() {
		super();
		//justTest();
	}

	@Override
	public Magazine getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean doesExist(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void save(Magazine aggregate) {
		// TODO Auto-generated method stub
		
	}
	
/*	private void justTest() {
		Magazine magazine = new Magazine();
		magazine.setTitle("magazine");
		magazine.setAuthor("Dung1");
		magazine.setCreatedAt(System.currentTimeMillis());
		magazine.setPublishedDate(System.currentTimeMillis());
		magazine.setActive(true);
		magazine.setCount(1);
        list.add(magazine);
	}*/
}
