package windy.framework.core.eventsource;

import windy.framework.contracts.IEvent;

public interface IEventStorage {
	
	public boolean doesEventSourceExist(String uid);

	public Iterable<IEvent> getAllEvents(String sourceId);

	public void save(IEventSource source);
}
