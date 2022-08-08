package test.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test01BufferedReader2 {
	public static void main(String[] args) {
		System.out.println("Hello I/O...");

		String path = "C:\\golfzon\\javaStudy\\java18inputOutput\\txt\\language2.txt";
		System.out.println(path);
		File file = new File(path);
		System.out.println(file.exists()); // file이 해당 경로안에 있으면 루프 돌아라 라고 응용가능 return 값은 boolean으로 반환.
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());

		System.out.println("=====================================");

		if (file.exists()) {
			Reader fr = null;
			BufferedReader br = null;

			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				String data = "";
				StringBuilder sb = new StringBuilder();
				while ((data = br.readLine()) != null) {
					System.out.println(data);
					sb.append(data+"\n");
				}
				System.out.println(sb.toString());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (fr != null) {
					try {
						fr.close();
					} catch (IOException e) {
						e.printStackTrace();
					}

				}
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}

				}
			}
		}

	} // end main

} // end class
