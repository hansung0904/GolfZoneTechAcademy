package test.com.lombok;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestVO_default implements Serializable {

	private int num;
	private String name;
	private int age;
	private String imgName;
	private MultipartFile multipartFile;

	// NoArgsConstructor
	public TestVO_default() {
		// TODO Auto-generated constructor stub
	}

	// AllArgsConstructor
	public TestVO_default(int num, String name, int age, String imgName, MultipartFile multipartFile) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
		this.imgName = imgName;
		this.multipartFile = multipartFile;
	}
	
	//Gson 사용
	@Override
	public String toString() {
		return new GsonBuilder().setPrettyPrinting().create().toJson(this);
	}

	public MultipartFile getMultipartFile() {
		return multipartFile;
	}

	public void setMultipartFile(MultipartFile multipartFile) {
		this.multipartFile = multipartFile;
	}

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

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((imgName == null) ? 0 : imgName.hashCode());
		result = prime * result + ((multipartFile == null) ? 0 : multipartFile.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + num;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestVO_default other = (TestVO_default) obj;
		if (age != other.age)
			return false;
		if (imgName == null) {
			if (other.imgName != null)
				return false;
		} else if (!imgName.equals(other.imgName))
			return false;
		if (multipartFile == null) {
			if (other.multipartFile != null)
				return false;
		} else if (!multipartFile.equals(other.multipartFile))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num != other.num)
			return false;
		return true;
	}

}
