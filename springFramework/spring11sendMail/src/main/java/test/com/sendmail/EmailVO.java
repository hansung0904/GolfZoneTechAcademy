package test.com.sendmail;

public class EmailVO {

	private String reciver;
	private String subject;
	private String content;
	private String regdate;

	public String getReciver() {
		return reciver;
	}

	public void setReciver(String reciver) {
		this.reciver = reciver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "EmailVO [reciver=" + reciver + ", subject=" + subject + ", content=" + content + ", regdate=" + regdate
				+ "]";
	}

}
