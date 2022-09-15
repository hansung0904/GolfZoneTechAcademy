package com.golfzonacademy.major.model;

import test.com.major.model.MajorVO;

import java.util.List;

public interface MajorDAO {

	public int insert(test.com.major.model.MajorVO vo);

	public List<MajorVO> selectAll();


}
