package windy.framework.contracts;

public interface IEvent {

	public String getSourceId();

	public void setSourceId(String sourceId);

	public int getVersion();

	public void setVersion(int version);

	public String getId();
}
