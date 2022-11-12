package test.com.serializedname;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	// Gson object 초기화
	Gson gson = new GsonBuilder().create(); // 한줄로~출력
//	Gson gson = new GsonBuilder().setPrettyPrinting().create();//이쁘게출력

	/**
	 * Simply selects the home view to render by returning its name.
	 */

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);
		return "home";
	}

	@ResponseBody
	@RequestMapping(value = "/test01.do", method = RequestMethod.GET)
	public String test01() {
		logger.info("Welcome test01.do");

		// Gson은 자바 객체와 JSON 간의 직렬화 및 역직렬화를 위한 오픈소스 자바 라이브러리이다.
		// TestResponse Class에는 num,name,age라는 3개의 field가 있다.
		// @SerializedName annotation의 value는 객체를 직렬화 및 역직렬화
		// 할 때 이름으로 사용된다. 위에 personName field는 JSON에서 name으로 표출된다.

		// 직렬화
		TestVOGsonResponse vo_gson = new TestVOGsonResponse();
		vo_gson.setNum(11);
		vo_gson.setName("lee");
		vo_gson.setAge(111);

		// Gson object 초기화
//		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		// TestVOGsonResponse 를 JSON문자열로 변환
		String jsonTestVO = gson.toJson(vo_gson);

		logger.info(jsonTestVO);

		return jsonTestVO;
	}

	@ResponseBody
	@RequestMapping(value = "/test02.do", method = RequestMethod.GET)
	public String test02() {
		logger.info("Welcome test02.do");

		// 여러객체 직렬화
		TestVOGsonResponse vo_gson = new TestVOGsonResponse();
		vo_gson.setNum(11);
		vo_gson.setName("lee");
		vo_gson.setAge(111);

		List<TestVOGsonResponse> vos = new ArrayList<TestVOGsonResponse>();
		vos.add(vo_gson);
		vos.add(vo_gson);
		vos.add(vo_gson);

		// vos 를 JSON문자열로 변환
		String jsonTestVO = gson.toJson(vos);
		logger.info(jsonTestVO);

		return jsonTestVO;
	}

	@ResponseBody
	@RequestMapping(value = "/test03.do", method = RequestMethod.GET)
	public String test03(@RequestParam(value = "txt_json") String txt_json) {
		logger.info("Welcome test03.do");
		logger.info("{}", txt_json);

		// 객체 역직렬화
		TestVOGsonResponse vo_gson = gson.fromJson(txt_json, TestVOGsonResponse.class);

		logger.info(vo_gson.toString());

		return "{\"result\":\"successed test03\"}";
	}

	@ResponseBody
	@RequestMapping(value = "/test04.do", method = RequestMethod.GET)
	public String test04(@RequestParam(value = "txt_json") String txt_json) {
		logger.info("Welcome test04.do");
		logger.info("{}", txt_json);

		// 배열 객체 역직렬화
		TestVOGsonResponse[] vo_gsons = gson.fromJson(txt_json, TestVOGsonResponse[].class);

		for (TestVOGsonResponse vo : vo_gsons) {
			logger.info(vo.toString());
		}

		logger.info("================================");

		// 컬렉션변환.
		List<TestVOGsonResponse> vos = Arrays.asList(vo_gsons);
		for (TestVOGsonResponse vo : vos) {
			logger.info(vo.toString());
		}

		return "{\"result\":\"successed test04\"}";
	}

	@ResponseBody
	@RequestMapping(value = "/str_convert_to_object.do", method = RequestMethod.GET)
	public String str_convert_to_object() {
		logger.info("Welcome str_convert_to_object.do");

		String str_obj = "{amount=10.0, apply_num=null, bank_code=null, bank_name=null, buyer_addr=서울특별시 강남구 신사동, buyer_email=gildong@gmail.com, buyer_name=홍길동, buyer_postcode=01181, buyer_tel=010-4242-4242, cancel_amount=0.0, cancel_history=[], cancel_reason=null, cancel_receipt_urls=[], cancelled_at=0.0, card_code=null, card_name=null, card_number=null, card_quota=0.0, card_type=null, cash_receipt_issued=false, channel=pc, currency=KRW, custom_data=null, customer_uid=null, customer_uid_usage=null, emb_pg_provider=null}";
//		String str_obj = "{amount=10.0, apply_num=null}";
		logger.info("str_obj : {}", str_obj);

		JSONObject jsonObject = new JSONObject();
		str_obj = str_obj.substring(1, str_obj.length() - 1);
		for (String first_txt : str_obj.split(", ")) {
			try {
				jsonObject.put(first_txt.split("=")[0], first_txt.split("=")[1]);
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		logger.info("jsonObject : {}", jsonObject);

		return "{\"result\":\"successed str_convert_to_object\"}";
	}

}
