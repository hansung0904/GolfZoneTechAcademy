package test.com.employee.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOimpl implements EmployeeDAO {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public EmployeeDAOimpl() {
		System.out.println("EmployeeDAO impl()...");
		try {
			Class.forName(EmployeeDB_postgres.DRIVER_NAME);
			System.out.println("Driver successed...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	private static void jdbcConnectionTest() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(EmployeeDB_postgres.URL, EmployeeDB_postgres.USER,
					EmployeeDB_postgres.PASSWORD);
			System.out.println("conn successed...");
			String sql = "SELECT VERSION() AS VERSION";
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

	@Override
	public int insert(EmployeeVO vo) {
		System.out.println("insert()...");
		System.out.println(vo);

		int flag = 0;
		try {

			conn = DriverManager.getConnection(EmployeeDB_postgres.URL, EmployeeDB_postgres.USER,
					EmployeeDB_postgres.PASSWORD);
			System.out.println("conn successed...");
			pstmt = conn.prepareStatement(EmployeeDB_postgres.SQL_INSERT);
			pstmt.setString(1, vo.getFirst_name());
			pstmt.setString(2, vo.getLast_name());
			pstmt.setString(3, vo.getEmail());
			pstmt.setInt(4, vo.getSalary());
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

	@Override
	public int update(EmployeeVO vo) {
		System.out.println("update()...");
		System.out.println(vo);
		int flag = 0;
		try {

			conn = DriverManager.getConnection(EmployeeDB_postgres.URL, EmployeeDB_postgres.USER,
					EmployeeDB_postgres.PASSWORD);
			System.out.println("conn successed...");
			pstmt = conn.prepareStatement(EmployeeDB_postgres.SQL_UPDATE);
			pstmt.setString(1, vo.getFirst_name());
			pstmt.setString(2, vo.getLast_name());
			pstmt.setString(3, vo.getEmail());
			pstmt.setInt(4, vo.getSalary());
			pstmt.setInt(5, vo.getNum());
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

	@Override
	public int delete(EmployeeVO vo) {
		int flag = 0;
		try {

			conn = DriverManager.getConnection(EmployeeDB_postgres.URL, EmployeeDB_postgres.USER,
					EmployeeDB_postgres.PASSWORD);
			System.out.println("conn successed...");
			pstmt = conn.prepareStatement(EmployeeDB_postgres.SQL_DELETE);
			pstmt.setInt(1, vo.getNum());
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

	@Override
	public List<EmployeeVO> selectAll() {
		List<EmployeeVO> vos = new ArrayList<EmployeeVO>();
		try {
			conn = DriverManager.getConnection(EmployeeDB_postgres.URL, EmployeeDB_postgres.USER,
					EmployeeDB_postgres.PASSWORD);
			System.out.println("conn successed...");
			pstmt = conn.prepareStatement(EmployeeDB_postgres.SQL_SELECT_ALL);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmployeeVO vo = new EmployeeVO();
				vo.setNum(rs.getInt("num"));
				vo.setFirst_name(rs.getString("first_name"));
				vo.setLast_name(rs.getString("last_name"));
				vo.setEmail(rs.getString("email"));
				vo.setSalary(rs.getInt("salary"));
				vos.add(vo);
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
		} // end finally
		return vos;
	}

	@Override
	public EmployeeVO selectOne(EmployeeVO vo) {
		System.out.println("selectOne()...");
		System.out.println(vo);

		EmployeeVO vo2 = new EmployeeVO();
		try {
			conn = DriverManager.getConnection(EmployeeDB_postgres.URL, EmployeeDB_postgres.USER,
					EmployeeDB_postgres.PASSWORD);
			System.out.println("conn successed...");
			// 검색 : DQL -> 많은데이터가 구축되어져 있는데 어떻게 검색을 할거냐
			pstmt = conn.prepareStatement(EmployeeDB_postgres.SQL_SELECT_ONE);
			pstmt.setInt(1, vo.getNum());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo2.setNum(rs.getInt("num"));
				vo.setFirst_name(rs.getString("firstname"));
				vo.setLast_name(rs.getString("lastname"));
				vo.setEmail(rs.getString("email"));
				vo.setSalary(rs.getInt("salary"));
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
		return vo2;
	}

	@Override
	public List<EmployeeVO> searchList(String searchKey, String searchWord) {
		System.out.println("searchList()...");
		System.out.println(searchKey);
		System.out.println(searchWord);

		List<EmployeeVO> vos = new ArrayList<EmployeeVO>();

		try {
			conn = DriverManager.getConnection(EmployeeDB_postgres.URL, EmployeeDB_postgres.USER,
					EmployeeDB_postgres.PASSWORD);
			System.out.println("conn successed...");
			if (searchKey.equals("firstname")) {
				pstmt = conn.prepareStatement(EmployeeDB_postgres.SQL_SEARCH_LIST_FIRSTNAME);

			} else if (searchKey.equals("lastname")) {
				pstmt = conn.prepareStatement(EmployeeDB_postgres.SQL_SEARCH_LIST_LASTNAME);
			} else if (searchKey.equals("email")) {
				pstmt = conn.prepareStatement(EmployeeDB_postgres.SQL_SEARCH_LIST_EMAIL);
			}
			pstmt.setString(1, "%" + searchWord + "%");

			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmployeeVO vo = new EmployeeVO();
				vo.setNum(rs.getInt("num"));
				vo.setFirst_name(rs.getString("first_name"));
				vo.setLast_name(rs.getString("last_name"));
				vo.setEmail(rs.getString("email"));
				vo.setSalary(rs.getInt("salary"));
				vos.add(vo);
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
		} // end finally
		return vos;
	}

}
