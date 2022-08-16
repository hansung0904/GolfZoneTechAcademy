package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test02throws {
	public static void main(String[] args) {
		System.out.println("Hello throw");
		// throws 처리 : 예외전가 <<- main에서 JVM으로 떠넘기지 말자 개발자라면 try catch 쓰자 다른 클래스에선 throws 해도 무관
		// try~catch : 예외처리

		InputStream is = null;
		Reader r = null;
		BufferedReader br = null;
		try {
			is = System.in;
			r = new InputStreamReader(is);
			System.out.println(Integer.parseInt("a"));
			br = new BufferedReader(r);
			String txt = br.readLine();

		} catch (IOException e) {
			System.out.println("IOException");
		} catch (NumberFormatException e2) {
			System.out.println("NumberFormatException");
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
				}
			}
			if (r != null) {
				try {
					r.close();
				} catch (IOException e) {
				}
			}
			if (is != null) {
				try {
					r.close();
				} catch (IOException e) {
				}
			}

		}

		System.out.println("end main...");

	} // end main

} // end class
