package test.com.board;

public interface BoardDB_postgres {

	String DRIVER_NAME = "org.postgresql.Driver";
	String URL = "jdbc:postgresql://localhost:5432/golfzon";
	String USER = "kosta";
	String PASSWORD = "hi123456";
	String SQL_SELECT_ALL = "SELECT * FROM BOARD ORDER BY NUM DESC";
	String SQL_INSERT = "INSERT INTO BOARD(NUM,TITLE,CONTENT,WRITER) VALUES(NEXTVAL('SEQ_BOARD'),?,?,?)";
	String SQL_UPDATE = "UPDATE BOARD SET TITLE=?,CONTENT=?,WRITER=?, WDATE = NOW() WHERE NUM=?";
	String SQL_DELETE = "DELETE FROM BOARD WHERE NUM=?";
	String SQL_SELECT_ONE = "SELECT * FROM BOARD WHERE NUM=?";
	String SQL_SEARCH_LIST_TITLE = "SELECT * FROM board WHERE TITLE like ?";
	String SQL_SEARCH_LIST_CONTENT = "SELECT * FROM board WHERE CONTENT like ?";
	String SQL_SEARCH_LIST_WRITER = "SELECT * FROM board WHERE WRITER like ?";

}
