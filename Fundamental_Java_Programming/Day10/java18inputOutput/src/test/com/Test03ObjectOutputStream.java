package test.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test03ObjectOutputStream {
	public static void main(String[] args) {
		System.out.println("Hello ObjectOutput...");

		String path = "test.db";
		File file = new File(path);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(file); // outputstream 이라 없으면 만들어버림.
			oos = new ObjectOutputStream(fos);
			List<TestVO> vos = new ArrayList<TestVO>();

			for (int i = 0; i < 5; i++) {
				TestVO vo = new TestVO();
				vo.setNum(1 + i);
				vo.setName("kim" + i);
				vo.setAge(33 + i);
				vos.add(vo);
			}
			oos.writeObject(vos);

			oos.flush();
			System.out.println("oos successed...");

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
