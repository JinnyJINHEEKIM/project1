package com.jin.dao;

import java.util.List;

import com.jin.domain.Criteria;
import com.jin.domain.PostVO;

public interface PostDAO {
	 
	 // 작성
	 public void write(PostVO vo) throws Exception;
	 
	 // 조회
	 public PostVO read(int bno) throws Exception;
	 
	 // 수정
	 public void update(PostVO vo) throws Exception;
	 
	 // 삭제
	 public void delete(int bno) throws Exception;
	 
	 // 목록 조회
	 public List<PostVO> list() throws Exception;
	 
	 // 목록 그리고 페이징
	 public List<PostVO> listPage(Criteria cri) throws Exception;
	 
	 //총 개수 확인
	 public int listCount() throws Exception;
	 
	}