package windy.infrastructure.commandhandlers;

import com.google.inject.Inject;

import windy.framework.core.messaging.ICommandHandler;
import windy.infrastructure.contracts.commands.magazine.MagazineCommand;
import windy.infrastructure.repositories.MagazineRepository;

public abstract class MagazineCommandHandler<T extends MagazineCommand> implements ICommandHandler<T>{

	private MagazineRepository magazineRepository;
	
	@Inject
	public MagazineCommandHandler(MagazineRepository magazineRepository) {
		this.magazineRepository = magazineRepository;
	}
	
	public MagazineRepository getMagazineRepository() {
		return magazineRepository;
	}

}
