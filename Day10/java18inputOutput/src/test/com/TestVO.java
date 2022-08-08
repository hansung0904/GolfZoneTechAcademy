package test.com;

import java.io.Serializable;

public class TestVO implements Serializable { // serializable 직렬화 객체로 쓸 수 있게 해주는것.
	
	private int num;
	private String name;
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
		return "TestVO [num=" + num + ", name=" + name + ", age=" + age + "]";
	}

}
