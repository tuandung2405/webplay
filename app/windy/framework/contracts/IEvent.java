package windy.framework.contracts;

import java.util.UUID;

public abstract class IEvent {

	private UUID uid;
	private UUID sourceId;
	private int version;

	protected UUID getSourceId() {
		return sourceId;
	}

	protected void setSourceId(UUID sourceId) {
		this.sourceId = sourceId;
	}

	protected int getVersion() {
		return version;
	}

	protected void setVersion(int version) {
		this.version = version;
	}

	protected UUID getUid() {
		return uid;
	}
}
