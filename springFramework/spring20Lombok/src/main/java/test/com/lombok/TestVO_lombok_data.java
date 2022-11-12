package test.com.lombok;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

import com.google.gson.GsonBuilder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
public class TestVO_lombok_data implements Serializable {

	/**
	 * @Getter + @Setter + @ToString + @NoArgsConstructor + @AllArgsConstructor
	 *         + @EqualsAndHashCod = @Data
	 */

	private int num;
	private String name;
	private int age;
	private String imgName;
	private MultipartFile multipartFile;

	// Gson 사용
	@Override
	public String toString() {
		return new GsonBuilder().setPrettyPrinting().create().toJson(this);
	}

}
