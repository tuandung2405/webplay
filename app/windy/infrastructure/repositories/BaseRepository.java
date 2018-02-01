package windy.infrastructure.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import windy.framework.core.domains.BaseAggregateRoot;
import windy.framework.core.repository.IReadRepository;

public class BaseRepository<T extends BaseAggregateRoot> implements IReadRepository<T> {

	Class<T> clazz;
	protected List<T> list;
	
	public BaseRepository(Class<T> clazz) {
		this.clazz = clazz;
		this.list = new ArrayList<>();
	}
	
	@Override
	public List<T> getAll() {
		return this.list;
	}

	@Override
	public T getById(UUID id) {
		return this.list.stream().filter(t -> t.getUid() == id).findFirst().orElse(null);
	}

	@Override
	public void create(T item) {
		this.list.add(item);
	}

	@Override
	public void update(T item) {
		this.list = this.list.stream().filter(t -> !t.getUid().equals(item.getUid())).collect(Collectors.toList());
		this.list.add(item);
	}

	@Override
	public void delete(UUID id) {
		this.list = this.list.stream().filter(t -> !t.getUid().equals(id)).collect(Collectors.toList());
	}

}
