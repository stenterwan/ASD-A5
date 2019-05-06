package domain;

public class Main {
	public static void main(String args[]) {
		MeetingManager meetingManager = new MeetingManager();

		Meeting meeting = new Meeting(new MeetingId("1"));

		VideoStream vs = new VideoStream("ASD_Videostream");
		VideoStream vs2 = new VideoStream("ASD_Videostream_test2");

		Message message = new Message(new MessageId("1"), "This is a test message");

		meetingManager.addStream(meeting.getMeetingId(), vs);

		meetingManager.sendMessage(meeting.getMeetingId(), message);

		meetingManager.addStream(meeting.getMeetingId(), vs2);
		meetingManager.removeStream(meeting.getMeetingId(), vs.getStreamId());

	}

}
