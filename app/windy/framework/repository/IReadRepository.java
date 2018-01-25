package windy.framework.repository;

import java.util.UUID;

public interface IReadRepository<T> {

	public Iterable<T> getAll();

	public T getById(UUID uid);

	public void create(T item);

	public void update(T item);

	public void delete(UUID uid);
}
