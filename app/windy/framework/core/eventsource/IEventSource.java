package windy.framework.core.eventsource;

import windy.framework.contracts.IEvent;

public interface IEventSource {

	public String getId();

	public int getVersion();

	//public boolean markedAsCommited();

	public void loadFromHistory(Iterable<IEvent> events);

	//public void updateVersion(int version);
    
	public Iterable<IEvent> getChanges();
}
