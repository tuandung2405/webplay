package windy.infrastructure.contracts.events;

import windy.framework.contracts.IEvent;

public abstract class Event implements IEvent {

	protected String id;
	protected String sourceId;
	protected int version;
}
