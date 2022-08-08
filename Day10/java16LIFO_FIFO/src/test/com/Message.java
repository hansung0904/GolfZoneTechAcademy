package test.com;

public class Message {
	
	public String command;
	public String to;
	
	public Message() {
		
	}

	public Message(String command, String to) {
		super();
		this.command = command;
		this.to = to;
	}

	@Override
	public String toString() {
		return "Message [command=" + command + ", to=" + to + "]";
	}
	
	

}
