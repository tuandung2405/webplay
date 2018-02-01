package windy.framework.core.eventsource;

import java.util.UUID;

import windy.framework.contracts.IEvent;

public interface IEventStorage {
	
	public boolean doesEventSourceExist(UUID uid);

	public Iterable<IEvent> getAllEvents(UUID sourceId);

	public void save(IEventSource source);
}
