package com.jin.domain;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/*
 * create table pReply(
    bno number not null,
    rno number not null,
    content VARCHAR2(2000) not null,
    writer varchar2(30) not null,
    regDate date default sysdate,
    primary key (bno, rno)
    );
    
    alter table pReply
        add CONSTRAINT pReply_bno foreign key(bno)
        REFERENCES pPost(bno);
        
        create sequence pReply_seq;
        
        insert INTO preply(bno, rno, content, writer)
            values (395, preply_seq.nextval, '댓글입니다', '작성자입니다');
        
        select 
            rno, content, writer, regDate
            from preply
            where bno = 395;
 * 
 */
/**
 * Handles requests for the application home page.
 */
public class ReplyVO {
/*  
     bno number not null,
    rno number not null,
    content VARCHAR2(2000) not null,
    writer varchar2(30) not null,
    regDate date default sysdate,
    primary key (bno, rno)
*/
	
	private int bno;
	private int rno;
	private String content;
	private String writer;
	private Date regDate;
	
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
	
	
}
