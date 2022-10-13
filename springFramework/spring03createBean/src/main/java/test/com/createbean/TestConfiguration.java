package test.com.createbean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Bean
	public ArrayList<String> alist() {//메소드명==빈아이디
		logger.info("alist().....");
		ArrayList<String> list = new ArrayList<String>();
		list.add("kim1");
		list.add("kim2");
		list.add("kim3");
		return list;
	}
	@Bean
	public ArrayList<String> blist() {
		logger.info("blist().....");
		ArrayList<String> list = new ArrayList<String>();
		list.add("yang1");
		list.add("yang1");
		list.add("yang1");
		return list;
	}
	
	@Bean(name="names")
	public ArrayList<String> clist() {
		logger.info("clist().....");
		ArrayList<String> list = new ArrayList<String>();
		list.add("choi");
		list.add("choi");
		list.add("choi");
		return list;
	}
	
	@Bean
	@Qualifier("names2")
	public ArrayList<String> dlist() {
		logger.info("dlist().....");
		ArrayList<String> list = new ArrayList<String>();
		list.add("choi2");
		list.add("choi2");
		list.add("choi2");
		return list;
	}
	
	//HashSet<Integer> add 4개
	@Bean
	public HashSet<String> aset(){
		HashSet<String> set = new HashSet<String>();
		set.add("10000");
		set.add("20000");
		set.add("30000");
		set.add("40000");
		return set;
	}
	
	//HashMap<String,String> put 2개
	@Bean
	public HashMap<String,String> amap(){
		logger.info("amap().....");
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("name", "lee");
		map.put("age", "33");
		return map;
	}
	
	//Car,Book
	@Bean
	public Car mcar() {
		logger.info("mcar().....");
//		return new Car();
		return new Car("BMW2",50002);
	}
	
	@Bean
	public Book mbook() {
		logger.info("mbook().....");
		Book book = new Book();
		book.setTitle("javascript2");
		book.setPrice(300002);
		return book;
	}
	
	//Store,Store2
	@Bean
	public Store mstore() {
		logger.info("mstore().....");
		Store st = new Store(new Car(), new Book());
		return st;
	}
	
	@Bean
	public Store tstore(
			@Qualifier("mcar") Car cc,
			@Qualifier("mbook") Book bb) {
		logger.info("tstore().....");
		Store st = new Store(cc, bb);
		return st;
	}
	
	@Bean
	public Store tstore2(Car car,Book book) {//root-context : car, book
		logger.info("tstore2().....");
		Store st = new Store(car, book);
		return st;
	}
	
	@Bean
	public Store2 mstore2() {
		logger.info("mstore2().....");
		Store2 st = new Store2();
		st.setCar(new Car());
		st.setBook(new Book());
		return st;
	}
	
	@Bean
	public TestBean4 testbean4() {
		logger.info("testbean4().....");
		ArrayList<String> list = new ArrayList<String>();
		list.add("lee8");
		list.add("lee9");
		list.add("lee0");
		TestBean4 tb = new TestBean4(list);
		return tb;
	}
	
	@Bean
	public TestBean4 testbean4_alist(
			ArrayList<String> alist) {
		logger.info("testbean4_list().....");
		TestBean4 tb = new TestBean4(alist);
		return tb;
	}
	
	
	
	//TestBean5 set-bean(aset),
	@Bean
	public TestBean5 testbean5_aset(
			HashSet<String> aset) {
		logger.info("testbean5_aset().....");
		TestBean5 tb = new TestBean5(aset);
		return tb;
	}
	
	//TestBean6 map-bean(amap)
	@Bean
	public TestBean6 testbean6_amap(HashMap<String,String> amap) {
		logger.info("testbean6_amap().....");
		TestBean6 tb = new TestBean6(amap);
		return tb;
	}
	
	
}
