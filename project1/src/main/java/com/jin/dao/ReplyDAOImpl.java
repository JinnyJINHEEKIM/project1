package com.jin.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jin.domain.BoardVO;
import com.jin.domain.Criteria;
import com.jin.domain.ReplyVO;
import com.jin.domain.SearchCriteria;


@Repository
public class ReplyDAOImpl implements ReplyDAO {

	
	// 마이바티스 
		@Inject
		private SqlSession sql;
		
		// 매퍼 
		private static String namespace = "com.jin.mappers.replyMapper";
		
		// 댓글 조회
		@Override
		public List<ReplyVO> readReply(int bno) throws Exception {
			return sql.selectList(namespace + ".readReply", bno);
		}
	
		
		// 댓글 작성
		@Override
		public void writeReply(ReplyVO vo) throws Exception {
			sql.insert(namespace + ".writeReply", vo);		
		}


		// 특정 댓글 조회
		@Override
		public ReplyVO readReplySelect(int rno) throws Exception {
			return sql.selectOne(namespace + ".readReplySelect", rno);
		}
		
		// 댓글 수정
		@Override
		public void replyUpdate(ReplyVO vo) throws Exception {
			sql.update(namespace + ".updateReply", vo);
		}

		// 댓글 삭제
		@Override
		public void replyDelete(ReplyVO vo) throws Exception {
			sql.delete(namespace + ".deleteReply", vo);
		}
	
	
	
}
