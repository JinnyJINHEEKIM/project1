package com.jin.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jin.domain.PostVO;

@Repository
public class PostDAOImpl implements PostDAO {

 // 마이바티스 
 @Inject
 private SqlSession sql;
 
 // 매퍼
 private static String namespace = "com.jin.mappers.postMapper";
  
 // 작성
 @Override
 public void write(PostVO vo) throws Exception {
  sql.insert(namespace + ".write", vo);
 }
 // 조회

 @Override
 public PostVO read(int bno) throws Exception {
  return sql.selectOne(namespace + ".read", bno);
 }

 // 수정
 @Override
 public void update(PostVO vo) throws Exception {
  sql.update(namespace + ".update", vo);
 }

 // 삭제
 @Override
 public void delete(int bno) throws Exception {
  sql.delete(namespace + ".delete", bno);
 }

}