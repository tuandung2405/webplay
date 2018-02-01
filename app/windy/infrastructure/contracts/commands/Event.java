package windy.infrastructure.contracts.commands;

import java.util.UUID;

import windy.framework.contracts.IEvent;

public abstract class Event implements IEvent {

	protected UUID id;
	protected UUID sourceId;
	protected int version;
}
