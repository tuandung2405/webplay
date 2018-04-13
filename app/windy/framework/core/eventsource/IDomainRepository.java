package windy.framework.core.eventsource;

public interface IDomainRepository<T extends IEventSource> {

	public T getById(String id);

	public boolean doesExist(String id);

	public void save(T aggregate);
}
