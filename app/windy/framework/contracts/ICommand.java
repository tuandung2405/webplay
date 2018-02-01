package windy.framework.contracts;

import java.util.UUID;

public interface ICommand {
	
	public UUID getUid();

	public void setUid();
}
