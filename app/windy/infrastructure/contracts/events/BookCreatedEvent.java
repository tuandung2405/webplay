package windy.infrastructure.contracts.events;

public class BookCreatedEvent extends Event {

	public String title;
	public String author;
	
	@Override
	public String getSourceId() {
		return sourceId;
	}

	@Override
	public void setSourceId(String sourceId) {
		super.sourceId = sourceId;
	}

	@Override
	public int getVersion() {
		return version;
	}

	@Override
	public void setVersion(int version) {
		super.version = version;
	}

	@Override
	public String getId() {
		return id;
	}
}
