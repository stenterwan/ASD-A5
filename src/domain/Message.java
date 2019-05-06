package domain;

public class Message {

	private MessageId messageId;

	private String body;

	public String getBody() {
		return body;
	}

	public Message(MessageId messageId, String body) {
		this.messageId = messageId;
		this.body = body;
	}

	public MessageId getMessageId() {
		return messageId;
	}

}
