package test.com;

public class MessageListener implements Button.OnclickListener {
	@Override
	public void onClick() {
		System.out.println("메세지를 보낸다~");
	}
}
