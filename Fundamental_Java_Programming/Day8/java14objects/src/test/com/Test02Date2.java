package test.com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02Date2 {
	public static void main(String[] args) {
		System.out.println("Hello Date");

		Date ud = new Date();
		System.out.println(ud);
		System.out.println(ud.getTime()); // system.currenttime�̶� ������~
		
		// ��¥Ÿ���� �̻ڰ� ����(����) ���ִ� ��ü
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS"); // parameter�� �� �ִ� ���·� ��ȯ����.
		String str_date = sdf.format(ud);
		System.out.println(str_date);
		
		
		

	

	} // end main
} // end class
