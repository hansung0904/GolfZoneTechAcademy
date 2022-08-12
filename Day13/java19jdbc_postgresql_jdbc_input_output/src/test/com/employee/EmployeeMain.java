package test.com.employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import test.com.employee.model.EmployeeDAO;
import test.com.employee.model.EmployeeDAOimpl;
import test.com.employee.model.EmployeeVO;

public class EmployeeMain {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello Employee");

		List<EmployeeVO> vos = new ArrayList<EmployeeVO>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		EmployeeDAO dao = new EmployeeDAOimpl();
		EmployeeVO vo = new EmployeeVO();
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
				vo.setFirst_name(br.readLine());
				System.out.print("�̸��� �Է����ּ���: ");
				vo.setLast_name(br.readLine());
				System.out.print("email�� �Է����ּ���: ");
				vo.setEmail(br.readLine());
				System.out.println("�޿��� �Է����ּ���");
				vo.setSalary(Integer.parseInt(br.readLine()));
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
				System.out.print("������ �Է����ּ���: ");
				vo.setFirst_name(br.readLine());
				System.out.print("�̸��� �Է����ּ���: ");
				vo.setLast_name(br.readLine());
				System.out.print("email�� �Է����ּ���: ");
				vo.setEmail(br.readLine());
				System.out.println("�޿��� �Է����ּ���");
				vo.setSalary(Integer.parseInt(br.readLine()));
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
				for (EmployeeVO x : vos) {
					System.out.println(x);
				}

			} else if (inputNumber.equals("6")) {
				System.out.println("KEY VALUE�� DB�� �˻��մϴ�.");
				System.out.println("Ű ���� �Է����ּ���");
				String key = br.readLine();
				System.out.println("value ���� �Է����ּ���");
				String value = br.readLine();
				vos = dao.searchList(key, value);
				for (EmployeeVO y : vos) {
					System.out.println(y);
				}
			}

			if (inputNumber.equals("x"))
				break;
		}
		System.out.println("�ý����� ����Ǿ����ϴ�.");

	} // end main

} // end class
