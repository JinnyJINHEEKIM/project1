package com.jin.service;

import java.util.List;

import com.jin.domain.BoardVO;
import com.jin.domain.Criteria;
import com.jin.domain.MemberVO;
import com.jin.domain.ReplyVO;
import com.jin.domain.SearchCriteria;

public interface MemberService {

	// 회원 가입
	public void register(MemberVO vo) throws Exception;

	// 로그인
	public MemberVO login(MemberVO vo) throws Exception;

	// 회원정보 수정
	public void modify(MemberVO vo) throws Exception;
	
	// 회원 탈퇴
	public void withdrawal(MemberVO vo) throws Exception;

}
