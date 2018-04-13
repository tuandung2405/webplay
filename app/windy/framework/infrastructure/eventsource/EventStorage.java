package windy.framework.infrastructure.eventsource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import windy.framework.contracts.IEvent;
import windy.framework.core.eventsource.IEventSource;
import windy.framework.core.eventsource.IEventStorage;

public class EventStorage implements IEventStorage {

	private Map<String, List<IEvent>> mapEvents;
	
	public EventStorage() {
		this.mapEvents = new HashMap<>();
	}
	
	@Override
	public boolean doesEventSourceExist(String uid) {
		return mapEvents.containsKey(uid);
	}

	@Override
	public Iterable<IEvent> getAllEvents(String sourceId) {
		return mapEvents.get(sourceId);
	}

	@Override
	public void save(IEventSource source) {
		List<IEvent> events = new ArrayList<>();
		
		events.addAll((List<IEvent>)source.getChanges());
		mapEvents.put(source.getId(), events);
	}
	
	public Map<String, List<IEvent>> getMapEvents() {
		return mapEvents;
	}
}
