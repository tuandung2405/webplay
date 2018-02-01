package windy.infrastructure.repositories;

import windy.infrastructure.domains.Magazine;

public class MagazineRepository extends BaseRepository<Magazine>{

	public MagazineRepository(Class<Magazine> clazz) {
		super(clazz);
		// TODO Auto-generated constructor stub
	}


	public MagazineRepository() {
		super(Magazine.class);
		justTest();
	}
	
	private void justTest() {
		Magazine magazine = new Magazine();
		magazine.setTitle("magazine");
		magazine.setAuthor("Dung1");
		magazine.setCreatedAt(System.currentTimeMillis());
		magazine.setPublishedDate(System.currentTimeMillis());
		magazine.setActive(true);
		magazine.setCount(1);
        list.add(magazine);
	}
}
