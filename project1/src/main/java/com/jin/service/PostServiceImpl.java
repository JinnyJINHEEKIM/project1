package com.jin.service;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jin.dao.PostDAO;
import com.jin.domain.Criteria;
import com.jin.domain.PostVO;
import com.jin.domain.SearchCriteria;

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
 
 //목록 조회
@Override
public List<PostVO> list() throws Exception {
	// TODO Auto-generated method stub
	return dao.list();
}

//목록 그리고 페이징
@Override
public List<PostVO> listPage(Criteria cri) throws Exception {
	// TODO Auto-generated method stub
	return dao.listPage(cri);
}

//총개수
@Override
public int listCount() throws Exception {
	// TODO Auto-generated method stub
	return dao.listCount();
}

@Override
public List<PostVO> listSearch(SearchCriteria scri) throws Exception {
	// TODO Auto-generated method stub
	return dao.listSearch(scri);
}

@Override
public int countSearch(SearchCriteria scri) throws Exception {
	// TODO Auto-generated method stub
	return dao.countSearch(scri);
}

}