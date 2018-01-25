package windy.framework.eventsource;

import java.util.UUID;

public interface IDomainRepository {

	public <T extends IEventSource> T getById(UUID id);
	public boolean doesExist(UUID id);
	public <T extends IEventSource> void save(T aggregate);
}
