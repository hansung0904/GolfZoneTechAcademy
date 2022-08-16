package test.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Test04ObjectInputStream {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		System.out.println("Hello ObjectInputStream...");

		String path = "test.db";
		File file = new File(path);
		FileInputStream fos = null;
		ObjectInputStream oos = null;
		try {
			fos = new FileInputStream(file); // outputstream 이라 없으면 만들어버림.
			oos = new ObjectInputStream(fos);
			List<TestVO> vos = new ArrayList<TestVO>();
			try {
				vos = (List<TestVO>) oos.readObject();
				for (TestVO x : vos) {
					System.out.println(x);
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			System.out.println("oos successed...");

		} catch (FileNotFoundException e) {
			e.printStackTrace(); // e.printStackTrace 는 안써주는게 좋다~
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
