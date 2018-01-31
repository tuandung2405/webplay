package windy.framework.eventsource.domains;

import windy.framework.contracts.IEvent;
import windy.framework.eventsource.IEventSource;

public class BaseAggregateRoot extends IEventSource {

	@Override
	protected boolean markedAsCommited() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void loadFromHistory(Iterable<IEvent> events) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void updateVersion(int version) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Iterable<IEvent> getChanges() {
		// TODO Auto-generated method stub
		return null;
	}

}
