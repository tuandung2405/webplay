package windy.framework.infrastructure.eventsource;


import javax.inject.Inject;

import windy.framework.core.eventsource.IDomainRepository;
import windy.framework.core.eventsource.IEventSource;
import windy.framework.core.eventsource.IEventStorage;

public class DomainRepository<T extends IEventSource> implements IDomainRepository<T> {

	private IEventStorage eventStorage;
	
	@Inject
	public DomainRepository(IEventStorage eventStorage) {
		this.eventStorage = eventStorage;
	}

	@Override
	public T getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean doesExist(String id) {
		return eventStorage.doesEventSourceExist(id);
	}

	@Override
	public void save(T aggregate) {
		eventStorage.save(aggregate);
	}
}
