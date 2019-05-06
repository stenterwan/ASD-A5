package domain;

public final class MeetingId {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	protected MeetingId(String id) {
		this.setId(id);
	}

	public String toString() {
		return this.id;
	}
}
