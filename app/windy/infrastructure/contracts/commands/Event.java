package windy.infrastructure.contracts.commands;

import windy.framework.contracts.IEvent;

public abstract class Event implements IEvent {

	protected String id;
	protected String sourceId;
	protected int version;
}
