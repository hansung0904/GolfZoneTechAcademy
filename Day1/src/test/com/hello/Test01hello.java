package test.com.hello;

public class Test01hello {

	public static void main(String[] args) {
		System.out.println("Hello,world"); 
		System.out.println('a'); // char
		System.out.println("AAA"); // String
		System.out.println(100); // byte, short, char , long
		System.out.println(3.14); // float, double
		System.out.println(true); // boolean 
		System.out.println(new Object()); // ��ü�� 16������ ǥ��
		System.out.println(new Test01hello()); // �̰͵� ��������
		System.out.println(); // "" ���̵� ��밡�� ���Ϳ� ���� ���
		
		
		System.out.print(100);  
		System.out.print('A'); // print�� �ܼ����  
		System.out.print("kim");
		System.out.println("lee"); // �̷��� print �ڿ� println�� �����°��� println�� ���� ���� ���� �ٹٲ� ����
		
		System.out.printf("han\n"); 
		System.out.printf("yang\n"); // printf �� f�� �����ߴٶ�� ����ȴ�.
		System.out.printf("%dyang%d\n", 100 , 200);
		System.out.printf("%fyang%.2f\n", 100.123, 200.456);
		System.out.printf("%cyang%s\n", 'X', "MMM");
		System.out.printf("%c\tyang%10s\n", 'X', "MMM"); // \t = %10s
	    

	} // end main() : method(�Լ�, function)

} // end class
