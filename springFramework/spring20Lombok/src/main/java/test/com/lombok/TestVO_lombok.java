package test.com.lombok;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

import com.google.gson.GsonBuilder;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class TestVO_lombok implements Serializable {

	/**
	 * Lombok 사용시의 장점과 주의사항 롬복은 복잡하고 반복되는 코드가 줄어듦으로써 코드의 가독성을 높일 수 있고 코딩 생산성 또한 높일 수
	 * 있습니다. 다만 롬복이 개발자마다 호불호가 나뉘는 라이브러리로 특정 개발자들은 코드가 직접 눈에 보임으로써 직관성을 유지하는것이 좋다고
	 * 보는 의견도 있는 만큼 자신의 프로젝트나 프로젝트 리더의 성향에 따라 사용하면 좋을 것 같습니다.
	 * 
	 * 또한 편리성을 제공하는 라이브러리일수록 주의할 사항으로 API 설명과 내부 동작을 어느정도 숙지하고 사용해야 한다는 점 입니다. 예를 들어
	 * Lombok의 @Data 어노테이션이나 @ToString 어노테이션으로 자동 생성되는 toString()메서드는 순환 참조 또는 무한 재귀
	 * 호출 문제로 인해 StackOverflowError가 발생할수도 있습니다. 물론 이 문제를 인지한 Lombok에서 해결할 수 있는 속성들을
	 * 제공하지만 롬복이 편리하다는 이유만으로 마구 사용한다면 여러가지 문제가 발생할 수 있다는 것입니다. 출처:
	 * https://dololak.tistory.com/783 [코끼리를 냉장고에 넣는 방법:티스토리]
	 * 
	 * 무분별한 Setter 남용 위에서 언급했듯이 @Data를 사용하면 자동으로 Setter를 지원하게 됩니다. 그로 인해서 생기는 문제점들이
	 * 있습니다. 이전에 Setter 사용하지 않기에서 한번 다루었던 내용입니다.
	 * 
	 * 간단하게 정리하면 Setter는 그 의도가 분명하지 않고 객체를 언제든지 변경할 수 있는 상태가 되어서 객체의 안전성이 보장받기 힘듭니다.
	 * 위 코드에서 email의 변경 기능이 제공 되지 않는다고 가정한다면 email 관련된 setter도 제공되지 않아야 안전합니다. 단순
	 * 안전함을 넘어서 해당 객체가 자기 자신을 가장 잘 표현하는 구조 즉 email의 변경 포인트를 제공하지 않음으로써 email 변경 기능이
	 * 없다는 것을 표현한다고 생각합니다.
	 * 
	 * --StackOverflowError : 자바 프로그램에서 함수가 실행될 때 호출 스택에는 스택 프레임이 쌓인다. 스택 프레임은 호출된
	 * 메서드의 매개 변수, 지역 변수, 수행 후 돌아가야 할 메서드의 반환 주소 정보를 가지고 있다. 새 스택 프레임을 할당할 공간이 부족하면
	 * StackOverflowError가 발생한다
	 * 
	 */

	private int num;
	private String name;
	private int age;
	private String imgName;
	private MultipartFile multipartFile;

	// Gson 사용 json data 변환가능 : 오버라이딩하면 @ToString없어도 됨.
	@Override
	public String toString() {
		return new GsonBuilder().setPrettyPrinting().create().toJson(this);
	}

}
