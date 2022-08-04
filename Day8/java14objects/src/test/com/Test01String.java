package test.com;

import java.io.UnsupportedEncodingException;

public class Test01String {
	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println("Hello String...");

		String txt = "Hello yangssem!!!";
		System.out.println("txt.length(): " + txt.length()); // <-- 몇글자~
		System.out.println("txt.charAt(): " + txt.charAt(0)); // 0번째(첫 번째 글자) 뽑아 내~
		System.out.println("txt.split(\" \"): " + txt.split(" ")); // 문자열 자르기 배열에 담김.
		System.out.println(txt.split(" ")[0]);
		System.out.println(txt.split(" ")[1]);
		System.out.println("txt.equals(\"kim\"): " + txt.equals("kim")); // 문자열 비교 boolean 타입으로 반환
		System.out.println("txt.equals(\"Hello yangssem!!!\"): " + txt.equals("Hello yangssem!!!")); // 문자열 비교 boolean
																										// 타입으로 반환
		System.out.println("txt.equals(\"hello yangssem!!!\"): " + txt.equals("hello yangssem!!!")); // 대소문자 구분한다.
		System.out.println("txt.equalsIgnoreCase(\"hello yangssem!!!\"): " + txt.equalsIgnoreCase("hello yangssem!!!")); // 대소문자
																															// 구분
																															// 없음
		System.out.println("txt.compareTo(\"hello yangssem!!!\"): " + txt.compareTo("hello yangssem!!!")); // Hashcode
																											// 반환
		System.out.println((int) 'H' - (int) 'h'); // 대문자에서 소문자 뺀건 거의 대부분 -32 나올거임~
		System.out.println(
				"txt.compareToIgnoreCase(\"hello yangssem!!!\"): " + txt.compareToIgnoreCase("hello yangssem!!!")); // 대소문자
																													// 구분없는
																													// haschode
		System.out.println("txt.indexof(\"h\"): " + txt.indexOf("h")); // h의 인덱스가 어디니? 음수가 나오면 존재하지않는거
		System.out.println("txt.indexof(\"H\"): " + txt.indexOf("H")); // h의 인덱스가 어디니? 제일 처음만나는 곳을 알려줌.
		System.out.println("txt.startsWith(\"Hell\"): " + txt.startsWith("Hell")); // He로 시작하니? 시작하는 글자를 알려줌 boolean 으로
																					// 반환
		System.out.println("txt.endsWith(\"!!!\"): " + txt.endsWith("!!!")); // !!!로 끝나니? 끝나는 글자를 알려줌 boolean 으로 반환

		txt = "http://yangssem.com/golfzon/y2.png";
		System.out.println("txt.substring(): " + txt.substring(27)); // 27번째부터 잘라서 보여줘 절대적으로 고정적인 값이어야함. 글자가 늘어나거나 줄어들면
																		// 덜 자르거나 더 잘라버림.
		System.out.println("txt.lastIndexOf(): " + txt.lastIndexOf("/")); // 마지막 /(슬래쉬)의 위치를 알려줌
		System.out.println("txt.substring(txt.lasIndexOf): " + txt.substring(txt.lastIndexOf("/")));
		System.out.println("txt.substring(int,int): " + txt.substring(7, 14 + 1)); // 구간 자르기
		System.out.println("txt.substring(int , int + String의 length): " + txt.substring(7, 7 + "yangssem".length())); // 구간
																														// 자르기

		System.out.println("txt.concat(): " + txt.concat("?id = admin")); // 문자열 더하기 텍스트가 바뀌는게 아님.
		txt = txt.concat("?id=admin");
		System.out.println(txt); //

		long startTime = System.currentTimeMillis();
		String str = "";
		StringBuffer sb = new StringBuffer(); // String Builder 와 String Buffer의 차이점 다시 공부하자
		for (int i = 0; i < 100000; i++) {
//			str += "Hello"; 효율이 좋은 연산이 아님. 6초대
//			str = str.concat("Hello"); // + 연산자 보다 효율 훨씬 좋음. 3초대
			sb.append("Hello"); // 0. 007 초
		}
		str = sb.toString();
		System.out.println("time: " + (System.currentTimeMillis() - startTime));
		System.out.println("=========================================================");

		txt = "Hello World!!";
		System.out.println(txt.contains("Hello")); // 이러한 텍스트가 txt 안에 있냐?
		System.out.println(txt.contains("World")); // 대소문자 구별함.
		System.out.println(txt.contains("world")); // 대소문자 구별함.

		System.out.println("=========================================================");

		System.out.println(txt.replace('o', 'O')); // 문자열 바꾸기 이렇게 대체하면 어떻게 되는지 보여줘라~ 실제로 바꾼건 아님. 문자만 바꾸기 구현
		txt = txt.replace('o', 'O'); // 진짜 바꾸기 재할당.
		System.out.println(txt);

		System.out.println("=========================================================");
		System.out.println(txt.replace("He", "히히")); // 문자열도 가능하다 ""
		System.out.println(txt.replace("\s", ":"));
		System.out.println("=========================================================");

		char[] cs = txt.toCharArray();
		for (char c : cs) {
			System.out.print(c);
			System.out.println();
		}

		System.out.println("=========================================================");
		System.out.println(txt.toLowerCase()); // 다 소문자로 바꿔라
		System.out.println(txt.toUpperCase()); // 다 대문자로 바꿔라
		txt = "   Hello World!!    ";
		System.out.println(txt.length());
		System.out.println(txt.trim().length());
		System.out.println("=========================================================");
		byte[] bs = txt.getBytes("utf-8");
		System.out.println(bs);
		for (byte b : bs) {
			System.out.println(b);
		}
		System.out.println("=========================================================");
		System.out.println(String.join("-", "aaa", "bbb", "ccc"));
		System.out.println(String.join("-", new String[] { "aaa", "bbb", "ccc" }));
		System.out.println(String.valueOf(1000) + 1000); // 문자열이 됐다는 의미
		System.out.println("=========================================================");

	} // end main

} // end class
