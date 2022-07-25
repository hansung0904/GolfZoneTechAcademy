package test.com.hello;

public class Test01hello {

	public static void main(String[] args) {
		System.out.println("Hello,world"); 
		System.out.println('a'); // char
		System.out.println("AAA"); // String
		System.out.println(100); // byte, short, char , long
		System.out.println(3.14); // float, double
		System.out.println(true); // boolean 
		System.out.println(new Object()); // 객체를 16진수로 표현
		System.out.println(new Test01hello()); // 이것도 마찬가지
		System.out.println(); // "" 없이도 사용가능 엔터와 같은 기능
		
		
		System.out.print(100);  
		System.out.print('A'); // print는 단순출력  
		System.out.print("kim");
		System.out.println("lee"); // 이렇게 print 뒤에 println이 나오는경우는 println이 나온 이후 부터 줄바꿈 실행
		
		System.out.printf("han\n"); 
		System.out.printf("yang\n"); // printf 의 f는 포맷했다라고 보면된다.
		System.out.printf("%dyang%d\n", 100 , 200);
		System.out.printf("%fyang%.2f\n", 100.123, 200.456);
		System.out.printf("%cyang%s\n", 'X', "MMM");
		System.out.printf("%c\tyang%10s\n", 'X', "MMM"); // \t = %10s
	    

	} // end main() : method(함수, function)

} // end class
