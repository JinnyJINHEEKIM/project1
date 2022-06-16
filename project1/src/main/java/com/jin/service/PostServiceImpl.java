package com.jin.service;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jin.dao.PostDAO;
import com.jin.domain.PostVO;

@Repository
public class PostServiceImpl implements PostService {

 // 마이바티스 
 @Inject
 private PostDAO dao;
 

 // 작성
 @Override
 public void write(PostVO vo) throws Exception {
  dao.write(vo);
 }
 // 조회

 @Override
 public PostVO read(int bno) throws Exception {
  return dao.read(bno);
 }

 // 수정
 @Override
 public void update(PostVO vo) throws Exception {
  dao.update(vo);
 }

 // 삭제
 @Override
 public void delete(int bno) throws Exception {
  dao.delete(bno);
 }

}