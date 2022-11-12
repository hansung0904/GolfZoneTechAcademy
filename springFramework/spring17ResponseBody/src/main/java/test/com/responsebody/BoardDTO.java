package test.com.responsebody;

import java.io.Serializable;
import java.util.Date;

public class BoardDTO implements Serializable {

	private int num;
	private String title;
	private String content;
	private String name;
	private String regDate;
	
	public BoardDTO() {
		num = 1;
		title = "title1";
		content = "content1";
		name = "name1";
		regDate = new java.sql.Date(System.currentTimeMillis()).toString();
	}
	public BoardDTO(int num) {
		this.num = num;
		title = "title"+num;
		content = "content"+num;
		name = "name"+num;
		regDate = new java.sql.Date(System.currentTimeMillis()).toString();
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

}
