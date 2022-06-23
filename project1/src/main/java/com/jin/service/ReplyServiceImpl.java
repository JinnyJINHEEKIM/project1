package com.jin.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jin.dao.BoardDAO;
import com.jin.dao.ReplyDAO;
import com.jin.domain.BoardVO;
import com.jin.domain.Criteria;
import com.jin.domain.ReplyVO;
import com.jin.domain.SearchCriteria;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Inject
	private ReplyDAO dao;

	// 댓글 조회
	@Override
	public List<ReplyVO> readReply(int bno) throws Exception {
		return dao.readReply(bno);
	}


	// 댓글 작성
	@Override
	public void writeReply(ReplyVO vo) throws Exception {
		dao.writeReply(vo);		
	} 

	// 특정 댓글 조회
	@Override
	public ReplyVO readReplySelect(int rno) throws Exception {
		return dao.readReplySelect(rno);
	}
	
	// 댓글 수정
	@Override
	public void replyUpdate(ReplyVO vo) throws Exception {
		dao.replyUpdate(vo);
	}

	// 댓글 삭제
	@Override
	public void replyDelete(ReplyVO vo) throws Exception {
		dao.replyDelete(vo);
	}
	
	
}
