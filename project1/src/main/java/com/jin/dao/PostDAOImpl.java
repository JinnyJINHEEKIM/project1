package com.jin.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jin.domain.Criteria;
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
 
 //목록 조회
@Override
public List<PostVO> list() throws Exception {
	// TODO Auto-generated method stub
	return sql.selectList(namespace + ".list");
}

//목록 그리고 페이징
@Override
public List<PostVO> listPage(Criteria cri) throws Exception {
	// TODO Auto-generated method stub
	return sql.selectList(namespace + ".listPage", cri);
}

//총개수
@Override
public int listCount() throws Exception {
	// TODO Auto-generated method stub
	return sql.selectOne(namespace + ".listCount");
}



}