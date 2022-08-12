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
			System.out.println("1. 입력 2. 수정 3. 삭제 4. 번호검색 5. 모두검색 6. 키워드검색 ");
			System.out.println("                종료시[x]를 입력해주세요                   ");
			System.out.println("=====================================================");
			System.out.println("메뉴를 선택하세요 : ");
			String inputNumber = br.readLine();
			if (inputNumber.equals("1")) {

				System.out.println("DB에 입력합니다.");
				System.out.print("성씨를 입력해주세요: ");
				vo.setFirst_name(br.readLine());
				System.out.print("이름을 입력해주세요: ");
				vo.setLast_name(br.readLine());
				System.out.print("email을 입력해주세요: ");
				vo.setEmail(br.readLine());
				System.out.println("급여를 입력해주세요");
				vo.setSalary(Integer.parseInt(br.readLine()));
				result = dao.insert(vo);
				if (result == 1) {
					System.out.println("입력성공");
				} else {
					System.out.println("입력실패");
				}
			} else if (inputNumber.equals("2")) {

				System.out.println("DB를 수정합니다.");
				System.out.print("수정할 번호를 입력해주세요");
				vo.setNum(Integer.parseInt(br.readLine()));
				System.out.print("성씨를 입력해주세요: ");
				vo.setFirst_name(br.readLine());
				System.out.print("이름을 입력해주세요: ");
				vo.setLast_name(br.readLine());
				System.out.print("email을 입력해주세요: ");
				vo.setEmail(br.readLine());
				System.out.println("급여를 입력해주세요");
				vo.setSalary(Integer.parseInt(br.readLine()));
				result = dao.update(vo);
				if (result == 1) {
					System.out.println("업데이트 성공");
				} else {
					System.out.println("업데이트 실패");
					break;
				}
			} else if (inputNumber.equals("3")) {
				System.out.println("원하는 번호의 DB를 삭제합니다.");
				System.out.println("삭제할 번호를 입력해주세요");
				vo.setNum(Integer.parseInt(br.readLine()));
				result = dao.delete(vo);
				if (result == 1) {
					System.out.println("삭제 성공");
				} else {
					System.out.println("삭제 실패");
				}
			} else if (inputNumber.equals("4")) {
				System.out.println("번호를 통해 DB를 검색합니다.");
				System.out.println("검색할 번호를 입력해주세요");
				vo.setNum(Integer.parseInt(br.readLine()));
				vo = dao.selectOne(vo);
				System.out.println(vo);
			} else if (inputNumber.equals("5")) {
				System.out.println("DB를 전체검색하는 메뉴입니다.");
				System.out.println("DB 전체를 검색합니다.");
				vos = dao.selectAll();
				for (EmployeeVO x : vos) {
					System.out.println(x);
				}

			} else if (inputNumber.equals("6")) {
				System.out.println("KEY VALUE로 DB를 검색합니다.");
				System.out.println("키 값을 입력해주세요");
				String key = br.readLine();
				System.out.println("value 값을 입력해주세요");
				String value = br.readLine();
				vos = dao.searchList(key, value);
				for (EmployeeVO y : vos) {
					System.out.println(y);
				}
			}

			if (inputNumber.equals("x"))
				break;
		}
		System.out.println("시스템이 종료되었습니다.");

	} // end main

} // end class
