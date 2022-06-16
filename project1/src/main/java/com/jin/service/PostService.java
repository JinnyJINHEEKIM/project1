package com.jin.service;

import com.jin.domain.PostVO;

public interface PostService {
	 
	 // 작성
	 public void write(PostVO vo) throws Exception;
	 
	 // 조회
	 public PostVO read(int bno) throws Exception;
	 
	 // 수정
	 public void update(PostVO vo) throws Exception;
	 
	 // 삭제
	 public void delete(int bno) throws Exception;
	 
	}