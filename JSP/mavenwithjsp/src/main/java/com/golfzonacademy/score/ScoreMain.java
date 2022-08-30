package com.golfzonacademy.score;

import com.golfzonacademy.score.model.ScoreDAO;
import com.golfzonacademy.score.model.ScoreDAOimpl;
import com.golfzonacademy.score.model.ScoreVO;

import java.util.List;

public class ScoreMain {
    public static void main(String[] args) {
        System.out.println("Hello Score");

        ScoreDAO dao = new ScoreDAOimpl();

        //1.insert
        ScoreVO vo = new ScoreVO();
        vo.setKor(Integer.parseInt("88"));
        vo.setEng(Integer.parseInt("77"));
        vo.setMath(Integer.parseInt("44"));
//		int result = dao.insert(vo);
//		System.out.println("result:"+result);


//		//2.update
//		vo = new BoardVO();
//		vo.setNum(4);
//		vo.setTitle("title44");
//		vo.setContent("content44");
//		vo.setWriter("kim44");
//
//		int result = dao.update(vo);
//		System.out.println("result:"+result);

//		//3.delete
//		vo = new BoardVO();
//		vo.setNum(1);
//		int result = dao.delete(vo);
//		System.out.println("result:"+result);

        //4.selectOne
        vo = new ScoreVO();
        vo.setNum(10);
        ScoreVO vo2 = dao.selectOne(vo);
        System.out.println(vo2);

        //5.selectAll
        List<ScoreVO> vos = dao.selectAll();
        for (ScoreVO x : vos) {
            System.out.println(x);
        }

        //6.searchList
//		List<BoardVO> vos2 = dao.searchList("title", "ti");
        List<ScoreVO> vos2 = dao.searchList("Kor", "77");
//		List<BoardVO> vos2 = dao.searchList("writer", "ki");
        for (ScoreVO x : vos2) {
            System.out.println(x);
        }

    }
}
