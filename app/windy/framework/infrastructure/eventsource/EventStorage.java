package windy.framework.infrastructure.eventsource;

import java.util.UUID;

import windy.framework.contracts.IEvent;
import windy.framework.core.eventsource.IEventSource;
import windy.framework.core.eventsource.IEventStorage;

public class EventStorage implements IEventStorage {

	@Override
	public boolean doesEventSourceExist(UUID uid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<IEvent> getAllEvents(UUID sourceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(IEventSource source) {
		// TODO Auto-generated method stub

	}

}
