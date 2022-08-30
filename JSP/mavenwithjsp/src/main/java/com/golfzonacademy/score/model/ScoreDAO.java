package com.golfzonacademy.score.model;

import java.util.List;

public interface ScoreDAO {
    int insert(ScoreVO vo);

    int update(ScoreVO vo);

    int delete(ScoreVO vo);

    ScoreVO selectOne(ScoreVO vo);

//	public ScoreVO[] selectAll();

    List<ScoreVO> selectAll();

//	public ScoreVO[] searchList(String searchKey, String searchWorld);


    List<ScoreVO> searchList(String searchKey, String searchWord);

}
