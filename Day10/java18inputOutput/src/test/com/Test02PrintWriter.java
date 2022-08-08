package test.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Test02PrintWriter {
	public static void main(String[] args) {
		System.out.println("Hello Output...");
		String path = "golfzon.txt";
		File file = new File(path);
		FileOutputStream fos = null;
		PrintStream ps = null;

		try {
			fos = new FileOutputStream(file); // outputstream 이라 없으면 만들어버림.
			ps = new PrintStream(fos);

			for (int i = 0; i < 5; i++) {
				ps.println("Hello Java.." + i);
			}

			ps.flush();
			System.out.println("ps successed...");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				ps.close();
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	} // end main

} // end class
