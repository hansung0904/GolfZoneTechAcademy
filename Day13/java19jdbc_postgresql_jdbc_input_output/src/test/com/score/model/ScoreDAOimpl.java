package test.com.score.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ScoreDAOimpl implements ScoreDAO {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public ScoreDAOimpl() {
		System.out.println("ScoreDAOimpl()...");
		
		try {
			Class.forName(ScoreDB_postgres.DRIVER_NAME);
			System.out.println("Driver successed...");

//			jdbcConnectionTest();

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
			conn = DriverManager.getConnection(ScoreDB_postgres.URL, ScoreDB_postgres.USER, ScoreDB_postgres.PASSWORD);
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
	public int insert(ScoreVO vo) {
		System.out.println("insert()...");
		System.out.println(vo);
		int flag = 0;
		try {

			conn = DriverManager.getConnection(ScoreDB_postgres.URL, ScoreDB_postgres.USER, ScoreDB_postgres.PASSWORD);
			System.out.println("conn successed...");
			pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_INSERT);
			pstmt.setInt(1, vo.getKor());
			pstmt.setInt(2, vo.getEng());
			pstmt.setInt(3, vo.getMath());
			pstmt.setString(4, vo.getName());
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
	public int update(ScoreVO vo) {
		System.out.println("update()...");
		System.out.println(vo);
		int flag = 0;
		try {

			conn = DriverManager.getConnection(ScoreDB_postgres.URL, ScoreDB_postgres.USER, ScoreDB_postgres.PASSWORD);
			System.out.println("conn successed...");
			pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_UPDATE);
			pstmt.setString(1, vo.getName());
			pstmt.setInt(2, vo.getKor());
			pstmt.setInt(3, vo.getEng());
			pstmt.setInt(4, vo.getMath());
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
	public int delete(ScoreVO vo) {
		System.out.println("delete()...");
		System.out.println(vo);
		int flag = 0;
		try {

			conn = DriverManager.getConnection(ScoreDB_postgres.URL, ScoreDB_postgres.USER, ScoreDB_postgres.PASSWORD);
			System.out.println("conn successed...");
			pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_DELETE);
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
	public ScoreVO selectOne(ScoreVO vo) {
		System.out.println("selectOne()...");

		ScoreVO vo2 = new ScoreVO();
		try {
			conn = DriverManager.getConnection(ScoreDB_postgres.URL, ScoreDB_postgres.USER, ScoreDB_postgres.PASSWORD);
			System.out.println("conn successed...");
			pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_SELECT_ONE);
			pstmt.setInt(1, vo.getNum());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo2.setNum(rs.getInt("num"));
				vo2.setName(rs.getString("name"));
				vo2.setKor(rs.getInt("kor"));
				vo2.setEng(rs.getInt("eng"));
				vo2.setMath(rs.getInt("math"));
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
	public List<ScoreVO> selectAll() {
		System.out.println("selectAll()...");
		List<ScoreVO> vos = new ArrayList<ScoreVO>();

		try {
			conn = DriverManager.getConnection(ScoreDB_postgres.URL, ScoreDB_postgres.USER, ScoreDB_postgres.PASSWORD);
			System.out.println("conn successed...");
			pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_SELECT_ALL);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ScoreVO vo = new ScoreVO();
				vo.setNum(rs.getInt("num"));
				vo.setKor(rs.getInt("kor"));
				vo.setEng(rs.getInt("eng"));
				vo.setMath(rs.getInt("math"));
				vo.setName(rs.getString("name"));
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
	public List<ScoreVO> searchList(String searchKey, String searchWord) {
		System.out.println("searchList()...");
		System.out.println(searchKey);
		System.out.println(searchWord);
		List<ScoreVO> vos = new ArrayList<ScoreVO>();
		try {
			conn = DriverManager.getConnection(ScoreDB_postgres.URL, ScoreDB_postgres.USER, ScoreDB_postgres.PASSWORD);
			System.out.println("conn successed...");
			if (searchKey.equals("kor")) {
				pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_SEARCH_LIST_KOR);
			} else if (searchKey.equals("eng")) {
				pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_SEARCH_LIST_ENG);
			} else {
				pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_SEARCH_LIST_NAME);
			}
			pstmt.setString(1, "%" + searchWord + "%");

			rs = pstmt.executeQuery();
			while (rs.next()) {
				ScoreVO vo = new ScoreVO();
				vo.setNum(rs.getInt("num"));
				vo.setKor(rs.getInt("kor"));
				vo.setEng(rs.getInt("eng"));
				vo.setMath(rs.getInt("math"));
				vo.setName(rs.getString("name"));
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
