package com.golfzonacademy.score.model;

public interface MemberDB_postgres {
    String DRIVER_NAME = "org.postgresql.Driver";
    String URL = "jdbc:postgresql://localhost:5432/postgres";
    String USER = "postgres";
    String PASSWORD = "admin1234";
    String SQL_SELECT_ALL = "SELECT * FROM MEMBER ORDER BY NUM DESC";
    String SQL_INSERT = "insert into member(num,id,pw,name,tel) values(nextval('seq_member'),?,?,?,?)";
    String SQL_UPDATE = "update member set id=?,pw=?,name=?, tel=? where num=?";
    String SQL_DELETE = "delete from member where num=?";
    String SQL_SELECT_ONE = "select * from member where num=?";
    String SQL_SEARCH_LIST_NAME = "SELECT * FROM MEMBER WHERE NAME like ?";
    String SQL_SEARCH_LIST_TEL = "SELECT * FROM MEMBER WHERE TEL like ?";
    String SQL_ID_CHECK = "SELECT * FROM MEMBER WHERE ID=?";
}
