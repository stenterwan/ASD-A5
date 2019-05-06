package domain;

import java.io.PrintStream;

public class VideoStream {

    public VideoStream(String recordingStreamName) {
		this.recordingStreamName = recordingStreamName;
	}


	private PrintStream log = System.out;
    
    
    private String recordingStreamName;
    
    
    public String getStreamId() {
        return recordingStreamName;
    }


}
