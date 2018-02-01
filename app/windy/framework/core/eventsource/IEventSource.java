package windy.framework.core.eventsource;

import java.util.UUID;

import windy.framework.contracts.IEvent;

public interface IEventSource {

	public UUID getUid();

	public int getVersion();

	public boolean markedAsCommited();

	public void loadFromHistory(Iterable<IEvent> events);

	public void updateVersion(int version);
    
	public Iterable<IEvent> getChanges();
}
