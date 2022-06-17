package com.jin.project;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jin.domain.PostVO;
import com.jin.service.PostService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/post/*")
public class PostController {
	
	private static final Logger logger = LoggerFactory.getLogger(PostController.class);
	 
	 @Inject
	 PostService service;
	 
	 // 글 작성 get
	 @RequestMapping(value = "/write", method = RequestMethod.GET)
	 public void getWrite() throws Exception {
	  logger.info("get write");
	 }

	 // 글 작성 post
	 @RequestMapping(value = "/write", method = RequestMethod.POST)
	 public String postWrite(PostVO vo) throws Exception {
	  logger.info("post write");
	  
	  service.write(vo);
	  
	  return "redirect:/";
	 }
	 
	 //목록조회
	 @RequestMapping(value = "/list", method = RequestMethod.GET)
	 public void list(Model model) throws Exception { //모델 : 뷰로 전달하는 역할
		 logger.info("get list");
		 
		 List<PostVO> list = service.list(); //변수 생성 후 모델에 추가
		 
		 model.addAttribute("list", list); //추가되는 명칭 list
	}
}