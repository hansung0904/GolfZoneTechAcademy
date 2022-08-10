package test.com.memeber;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MemberMain {

	static final String URL = "jdbc:postgresql://localhost:5432/postgres";
	static final String USER = "postgres";
	static final String PASSWORD = "admin1234";

	public static void main(String[] args) {
		System.out.println("Hello jdbc...");

		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver successed...");

//			jdbcConnectionTest();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// table ����,����,��������,���� : DDL -> Data Definition Language

		// �������, ����,�Է� : DML -> Data Manipulation Language
		MemberVO vo = new MemberVO();
		vo.setId("bb20");
		vo.setPw("bb222200");
		vo.setName("bbb20");
		vo.setTel("bb20");
		int result = insert(vo);
		System.out.println("result: " + result);

		// ����˻�(���, �Ѱ� , �˻���) : DQL -> Data Query Language
		selectAll();

	} // end main

	private static int insert(MemberVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int flag = 0;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("conn successed...");
			String sql = "insert into member(num,id,pw,name,tel) values(nextval('seq_member'),?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getTel());
			flag = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return flag;
	}

	private static List<MemberVO> selectAll() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("conn successed...");
			// �˻� : DQL -> ���������Ͱ� ����Ǿ��� �ִµ� ��� �˻��� �Ұų�
			String sql = "SELECT * FROM MEMBER ORDER BY NUM DESC"; // �����ͷ� ���̴� �κ��� ��ҹ��� �����ϰ� ��ɾ�� ����ϴ°��� ��ҹ��� �������� ����.
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.print(rs.getInt("num") + " ");
				System.out.print(rs.getString("id") + " ");
				System.out.print(rs.getString("pw") + " ");
				System.out.print(rs.getString("name") + " ");
				System.out.println(rs.getString("tel") + " ");

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return null;
	}

	private static void jdbcConnectionTest() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("conn successed...");
			// �˻� : DQL -> ���������Ͱ� ����Ǿ��� �ִµ� ��� �˻��� �Ұų�
			String sql = "SELECT VERSION() AS VERSION"; // �����ͷ� ���̴� �κ��� ��ҹ��� �����ϰ� ��ɾ�� ����ϴ°��� ��ҹ��� �������� ����.
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String version = rs.getString("version");
				System.out.println(version);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

} // end class
