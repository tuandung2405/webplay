package windy.framework.core.domains;

import windy.framework.contracts.IEvent;
import windy.framework.core.eventsource.IEventSource;

public abstract class BaseAggregateRoot implements IEventSource {

	protected String id;
	
	@Override
	public String getId() {
		return id;
	}

	@Override
	public int getVersion() {
		// TODO Auto-generated method stub
		return 0;
	}
/*
	@Override
	public boolean markedAsCommited() {
		// TODO Auto-generated method stub
		return false;
	}*/

	@Override
	public void loadFromHistory(Iterable<IEvent> events) {
		// TODO Auto-generated method stub
		
	}

/*	@Override
	public void updateVersion(int version) {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public Iterable<IEvent> getChanges() {
		// TODO Auto-generated method stub
		return null;
	}


}
