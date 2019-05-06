package domain;

public final class MessageId {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	protected MessageId(String id) {
		this.setId(id);
	}
}
