package test.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test03ObjectOutputStream {
	public static void main(String[] args) {
		System.out.println("Hello ObjectOutput...");

		String path = "golfzon.txt";
		File file = new File(path);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(file); // outputstream 이라 없으면 만들어버림.
			oos = new ObjectOutputStream(fos);

			oos.flush();
			System.out.println("ps successed...");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
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
