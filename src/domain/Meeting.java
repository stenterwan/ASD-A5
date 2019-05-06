package domain;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Meeting {

	private PrintStream log = System.out;

	private MeetingId meetingId;

	private Map<String, VideoStream> videoStreams = new HashMap<String, VideoStream>();

	private Map<MessageId, Message> messages = new HashMap<MessageId, Message>();

	public Meeting(MeetingId id) {
		this.meetingId = id;
	}

	public MeetingId getMeetingId() {
		return meetingId;
	}

	public synchronized void addStream(VideoStream vs) {
		videoStreams.put(vs.getStreamId(), vs);
		log.print("stream now contains: ");
		for (Map.Entry<String, VideoStream> entry : videoStreams.entrySet()) {
			log.print(entry.getKey() + ", ");
		}
		log.println("");
	}

	public synchronized void removeStream(String streamId) {
		VideoStream vs = videoStreams.remove(streamId);
		log.println("stream now contains: ");
		for (Map.Entry<String, VideoStream> entry : videoStreams.entrySet()) {
			log.print(entry.getKey() + ", ");
		}
		log.println("");
	}

	public void sendMessage(Message message) {
		messages.put(message.getMessageId(), message);
	}

}
