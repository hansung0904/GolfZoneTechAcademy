package test.com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;

public class Test01BufferedReader {
	public static void main(String[] args) {
		System.out.println("Hello I/O...");

		Class<?> tm_clazz = Test01BufferedReader.class;
		URL url = tm_clazz.getResource("language.txt");
		String path = url.getPath();
		System.out.println(path);
		Reader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			while (true) {
				String data = br.readLine();
				if (data == null) {
					break;
				}
				System.out.println(data);
			}
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

	} // end main

} // end class
