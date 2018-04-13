package windy.framework.core.repository;

public interface IReadRepository<T> {

	public Iterable<T> getAll();

	public T getById(String uid);

	public void create(T item);

	public void update(T item);

	public void delete(String uid);
}
