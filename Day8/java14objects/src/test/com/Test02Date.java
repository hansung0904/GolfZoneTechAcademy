package test.com;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test02Date {
	public static void main(String[] args) {
		System.out.println("Hello Date");

		Date ud = new Date();
		System.out.println(ud);

		java.sql.Date sd = new java.sql.Date(System.currentTimeMillis());
		System.out.println(sd);

		Timestamp ts = new Timestamp(System.currentTimeMillis());
		System.out.println(ts);

		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR)); // 0��~ 11������ �ۿ����� zerobase���� �׷���..
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println(cal.get(Calendar.MILLISECOND)); // 1/1000 ����~ mili�ϱ�

		GregorianCalendar gCal = new GregorianCalendar(2022, 11, 28, 17, 50, 1); // ��� üũ ����;
		System.out.print(gCal.get(Calendar.YEAR) + "-");
		System.out.print(gCal.get(Calendar.MONTH) + 1 + "-");
		System.out.print(gCal.get(Calendar.DAY_OF_MONTH) + " ");
		System.out.print(gCal.get(Calendar.AM_PM) + " ");
		System.out.print(gCal.get(Calendar.HOUR_OF_DAY) + ":");
//		System.out.print(gCal.get(Calendar.HOUR)+":");
		System.out.print(gCal.get(Calendar.MINUTE) + ":");
		System.out.print(gCal.get(Calendar.SECOND) + ":");
		System.out.print(gCal.get(Calendar.MILLISECOND)); // 1/1000 ����~ mili�ϱ�
		System.out.println(System.nanoTime());
	} // end main
} // end class
