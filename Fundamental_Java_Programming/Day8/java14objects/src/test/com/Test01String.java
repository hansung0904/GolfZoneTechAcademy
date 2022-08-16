package test.com;

import java.io.UnsupportedEncodingException;

public class Test01String {
	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println("Hello String...");

		String txt = "Hello yangssem!!!";
		System.out.println("txt.length(): " + txt.length()); // <-- �����~
		System.out.println("txt.charAt(): " + txt.charAt(0)); // 0��°(ù ��° ����) �̾� ��~
		System.out.println("txt.split(\" \"): " + txt.split(" ")); // ���ڿ� �ڸ��� �迭�� ���.
		System.out.println(txt.split(" ")[0]);
		System.out.println(txt.split(" ")[1]);
		System.out.println("txt.equals(\"kim\"): " + txt.equals("kim")); // ���ڿ� �� boolean Ÿ������ ��ȯ
		System.out.println("txt.equals(\"Hello yangssem!!!\"): " + txt.equals("Hello yangssem!!!")); // ���ڿ� �� boolean
																										// Ÿ������ ��ȯ
		System.out.println("txt.equals(\"hello yangssem!!!\"): " + txt.equals("hello yangssem!!!")); // ��ҹ��� �����Ѵ�.
		System.out.println("txt.equalsIgnoreCase(\"hello yangssem!!!\"): " + txt.equalsIgnoreCase("hello yangssem!!!")); // ��ҹ���
																															// ����
																															// ����
		System.out.println("txt.compareTo(\"hello yangssem!!!\"): " + txt.compareTo("hello yangssem!!!")); // Hashcode
																											// ��ȯ
		System.out.println((int) 'H' - (int) 'h'); // �빮�ڿ��� �ҹ��� ���� ���� ��κ� -32 ���ð���~
		System.out.println(
				"txt.compareToIgnoreCase(\"hello yangssem!!!\"): " + txt.compareToIgnoreCase("hello yangssem!!!")); // ��ҹ���
																													// ���о���
																													// haschode
		System.out.println("txt.indexof(\"h\"): " + txt.indexOf("h")); // h�� �ε����� ����? ������ ������ ���������ʴ°�
		System.out.println("txt.indexof(\"H\"): " + txt.indexOf("H")); // h�� �ε����� ����? ���� ó�������� ���� �˷���.
		System.out.println("txt.startsWith(\"Hell\"): " + txt.startsWith("Hell")); // He�� �����ϴ�? �����ϴ� ���ڸ� �˷��� boolean ����
																					// ��ȯ
		System.out.println("txt.endsWith(\"!!!\"): " + txt.endsWith("!!!")); // !!!�� ������? ������ ���ڸ� �˷��� boolean ���� ��ȯ

		txt = "http://yangssem.com/golfzon/y2.png";
		System.out.println("txt.substring(): " + txt.substring(27)); // 27��°���� �߶� ������ ���������� �������� ���̾����. ���ڰ� �þ�ų� �پ���
																		// �� �ڸ��ų� �� �߶����.
		System.out.println("txt.lastIndexOf(): " + txt.lastIndexOf("/")); // ������ /(������)�� ��ġ�� �˷���
		System.out.println("txt.substring(txt.lasIndexOf): " + txt.substring(txt.lastIndexOf("/")));
		System.out.println("txt.substring(int,int): " + txt.substring(7, 14 + 1)); // ���� �ڸ���
		System.out.println("txt.substring(int , int + String�� length): " + txt.substring(7, 7 + "yangssem".length())); // ����
																														// �ڸ���

		System.out.println("txt.concat(): " + txt.concat("?id = admin")); // ���ڿ� ���ϱ� �ؽ�Ʈ�� �ٲ�°� �ƴ�.
		txt = txt.concat("?id=admin");
		System.out.println(txt); //

		long startTime = System.currentTimeMillis();
		String str = "";
		StringBuffer sb = new StringBuffer(); // String Builder �� String Buffer�� ������ �ٽ� ��������
		for (int i = 0; i < 100000; i++) {
//			str += "Hello"; ȿ���� ���� ������ �ƴ�. 6�ʴ�
//			str = str.concat("Hello"); // + ������ ���� ȿ�� �ξ� ����. 3�ʴ�
			sb.append("Hello"); // 0. 007 ��
		}
		str = sb.toString();
		System.out.println("time: " + (System.currentTimeMillis() - startTime));
		System.out.println("=========================================================");

		txt = "Hello World!!";
		System.out.println(txt.contains("Hello")); // �̷��� �ؽ�Ʈ�� txt �ȿ� �ֳ�?
		System.out.println(txt.contains("World")); // ��ҹ��� ������.
		System.out.println(txt.contains("world")); // ��ҹ��� ������.

		System.out.println("=========================================================");

		System.out.println(txt.replace('o', 'O')); // ���ڿ� �ٲٱ� �̷��� ��ü�ϸ� ��� �Ǵ��� �������~ ������ �ٲ۰� �ƴ�. ���ڸ� �ٲٱ� ����
		txt = txt.replace('o', 'O'); // ��¥ �ٲٱ� ���Ҵ�.
		System.out.println(txt);

		System.out.println("=========================================================");
		System.out.println(txt.replace("He", "����")); // ���ڿ��� �����ϴ� ""
		System.out.println(txt.replace("\s", ":"));
		System.out.println("=========================================================");

		char[] cs = txt.toCharArray();
		for (char c : cs) {
			System.out.print(c);
			System.out.println();
		}

		System.out.println("=========================================================");
		System.out.println(txt.toLowerCase()); // �� �ҹ��ڷ� �ٲ��
		System.out.println(txt.toUpperCase()); // �� �빮�ڷ� �ٲ��
		txt = "   Hello World!!    ";
		System.out.println(txt.length());
		System.out.println(txt.trim().length());
		System.out.println("=========================================================");
		byte[] bs = txt.getBytes("utf-8");
		System.out.println(bs);
		for (byte b : bs) {
			System.out.println(b);
		}
		System.out.println("=========================================================");
		System.out.println(String.join("-", "aaa", "bbb", "ccc"));
		System.out.println(String.join("-", new String[] { "aaa", "bbb", "ccc" }));
		System.out.println(String.valueOf(1000) + 1000); // ���ڿ��� �ƴٴ� �ǹ�
		System.out.println("=========================================================");

	} // end main

} // end class
