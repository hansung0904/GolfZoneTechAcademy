package test.com.board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import test.com.board.model.BoardDAO;
import test.com.board.model.BoardDAOimpl;
import test.com.board.model.BoardVO;

public class BoardMain {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello Board");

		List<BoardVO> vos = new ArrayList<BoardVO>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BoardDAO dao = new BoardDAOimpl();
		BoardVO vo = new BoardVO();
		int result = 0;

		while (true) {

			System.out.println("======================MENU===========================");
			System.out.println("1. �Է� 2. ���� 3. ���� 4. ��ȣ�˻� 5. ��ΰ˻� 6. Ű����˻� ");
			System.out.println("                �����[x]�� �Է����ּ���                   ");
			System.out.println("=====================================================");
			System.out.println("�޴��� �����ϼ��� : ");
			String inputNumber = br.readLine();
			if (inputNumber.equals("1")) {

				System.out.println("DB�� �Է��մϴ�.");
				System.out.print("������ �Է����ּ���: ");
				vo.setTitle(br.readLine());
				System.out.print("������ �Է����ּ���: ");
				vo.setContent(br.readLine());
				System.out.println("�ۼ��ڸ� �Է����ּ���: ");
				vo.setWriter(br.readLine());
				result = dao.insert(vo);
				if (result == 1) {
					System.out.println("�Է¼���");
				} else {
					System.out.println("�Է½���");
				}
			} else if (inputNumber.equals("2")) {

				System.out.println("DB�� �����մϴ�.");
				System.out.print("������ ��ȣ�� �Է����ּ���");
				vo.setNum(Integer.parseInt(br.readLine()));
				System.out.println("������ �Է����ּ���");
				vo.setTitle(br.readLine());
				System.out.println("������ �Է����ּ���");
				vo.setContent(br.readLine());
				System.out.println("�ۼ��ڸ� �Է����ּ���");
				vo.setWriter(br.readLine());
				result = dao.update(vo);
				if (result == 1) {
					System.out.println("������Ʈ ����");
				} else {
					System.out.println("������Ʈ ����");
					break;
				}
			} else if (inputNumber.equals("3")) {
				System.out.println("���ϴ� ��ȣ�� DB�� �����մϴ�.");
				System.out.println("������ ��ȣ�� �Է����ּ���");
				vo.setNum(Integer.parseInt(br.readLine()));
				result = dao.delete(vo);
				if (result == 1) {
					System.out.println("���� ����");
				} else {
					System.out.println("���� ����");
				}
			} else if (inputNumber.equals("4")) {
				System.out.println("��ȣ�� ���� DB�� �˻��մϴ�.");
				System.out.println("�˻��� ��ȣ�� �Է����ּ���");
				vo.setNum(Integer.parseInt(br.readLine()));
				vo = dao.selectOne(vo);
				System.out.println(vo);
			} else if (inputNumber.equals("5")) {
				System.out.println("DB�� ��ü�˻��ϴ� �޴��Դϴ�.");
				System.out.println("DB ��ü�� �˻��մϴ�.");
				vos = dao.selectAll();
				for (BoardVO x : vos) {
					System.out.println(x);
				}

			} else if (inputNumber.equals("6")) {
				System.out.println("KEY VALUE�� DB�� �˻��մϴ�.");
				System.out.println("Ű ���� �Է����ּ���");
				String key = br.readLine();
				System.out.println("value ���� �Է����ּ���");
				String value = br.readLine();
				vos = dao.searchList(key, value);
				for (BoardVO y : vos) {
					System.out.println(y);
				}
			}

			if (inputNumber.equals("x"))
				break;
		}
		System.out.println("�ý����� ����Ǿ����ϴ�.");

	} // end main
} // end class
