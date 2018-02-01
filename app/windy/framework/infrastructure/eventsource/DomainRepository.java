package windy.framework.infrastructure.eventsource;

import java.util.UUID;

import windy.framework.core.eventsource.IDomainRepository;
import windy.framework.core.eventsource.IEventSource;
import windy.framework.core.eventsource.IEventStorage;

public class DomainRepository implements IDomainRepository {

	public DomainRepository(IEventStorage eventStorage) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public <T extends IEventSource> T getById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean doesExist(UUID id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T extends IEventSource> void save(T aggregate) {
		// TODO Auto-generated method stub
		
	}

}
