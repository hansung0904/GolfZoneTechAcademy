package test.com.serializedname;

import java.util.Arrays;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

public class TestVOGsonResponse {

	//json 객체의 키와 java객체 속성을 맵핑 시켜준다.
	@SerializedName("number")
	private int num;

	@SerializedName("user_name")
	private String name;

	@SerializedName("user_age")
	private int age;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n***** TestVOGsonResponse Details *****\n");
		sb.append("num="+getNum()+"\n");
		sb.append("name="+getName()+"\n");
		sb.append("age="+getAge()+"\n");
		sb.append("*****************************");
		
		return sb.toString();
	}
	
//	@Override
//	public String toString() {
//		return new GsonBuilder().create().toJson(this);
//	}
	

}
