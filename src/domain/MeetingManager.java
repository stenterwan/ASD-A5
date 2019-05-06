package domain;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class MeetingManager {
	private PrintStream log = System.out;

	private Map<MeetingId, Meeting> meetings = new HashMap<MeetingId, Meeting>();

	private void add(Meeting m) {
		meetings.put(m.getMeetingId(), m);
	}

	private void remove(String id) {
		Meeting m = meetings.remove(id);
	}

	public void addStream(MeetingId meetingId, VideoStream vs) {
		log.printf("Stream %s has been added to meeting %s %n", vs.getStreamId(), meetingId.toString());
		// log.printf("De videostream" vs.getStreamId() + meetingId);
		Meeting m = meetings.get(meetingId);
		if (m != null) {
			m.addStream(vs);
		} else {
			Meeting nm = new Meeting(meetingId);
			nm.addStream(vs);
			add(nm);
		}
	}

	public void removeStream(MeetingId meetingId, String streamId) {
		log.printf("Stream %s has been removed from meeting %s %n", streamId, meetingId.toString());
		Meeting m = meetings.get(meetingId);
		if (m != null) {
			m.removeStream(streamId);
		}
	}

	public void sendMessage(MeetingId meetingId, Message message) {
		log.printf("Now sending message: %s  %n", message.getBody());
		Meeting m = meetings.get(meetingId);
		if (m != null) {
			m.sendMessage(message);
		}
	}

}
