package windy.infrastructure.commandhandlers;

import com.google.inject.Inject;

import windy.framework.core.eventsource.IDomainRepository;
import windy.framework.core.messaging.ICommandHandler;
import windy.infrastructure.contracts.commands.magazine.MagazineCommand;
import windy.infrastructure.domains.MagazineDomain;

public abstract class MagazineCommandHandler<T extends MagazineCommand> implements ICommandHandler<T>{

	private IDomainRepository<MagazineDomain> repository;
	
	@Inject
	public MagazineCommandHandler(IDomainRepository<MagazineDomain> repository) {
		this.repository = repository;
	}
	
	public IDomainRepository<MagazineDomain> getMagazineRepository() {
		return repository;
	}
}
