package windy.framework.contracts;

import java.util.UUID;

public interface IEvent {

	public UUID getSourceId();

	public void setSourceId(UUID sourceId);

	public int getVersion();

	public void setVersion(int version);

	public UUID getUid();
}
