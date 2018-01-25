package windy.framework.eventsource;

import java.util.UUID;

import windy.framework.contracts.IEvent;

public abstract class IEventSource {

	private UUID uid;
	private int version;
	
	protected UUID getUid() {
		return uid;
	}

	protected int getVersion() {
		return version;
	}

	protected abstract boolean markedAsCommited();

    protected abstract void loadFromHistory(Iterable<IEvent> events);

    protected abstract void updateVersion(int version);
    
    protected abstract Iterable<IEvent> getChanges();
}
