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
import org.springframework.web.bind.annotation.RequestParam;

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
	 public void list(Model model) throws Exception {
		 //모델 : 뷰로 전달하는 역할
		 logger.info("get list");
		 
		 List<PostVO> list = service.list(); //변수 생성 후 모델에 추가
		 
		 model.addAttribute("list", list); //추가되는 명칭 list
	}
	 
	 
	 // 글 조회
	 @RequestMapping(value = "/read", method = RequestMethod.GET)
	 public void getRead(@RequestParam("bno") int bno, Model model) throws Exception {
		 //모델 : 뷰로 전달하는 역할
		 logger.info("get read");
		 
		 PostVO vo = service.read(bno);
		 
		 model.addAttribute("read", vo); 
	}
	 
	// 글 수정 조회와 같음 이유는 작성된 게시글을 모두 가져와야 수정이 가능하기 때문
	 @RequestMapping(value = "/modify", method = RequestMethod.GET)
	 public void getModify(@RequestParam("bno") int bno, Model model) throws Exception {
		 //모델 : 뷰로 전달하는 역할
		 logger.info("get modify");
		 
		 PostVO vo = service.read(bno);
		 
		 model.addAttribute("modify", vo); 
	}
	 
	 
	 //글 수정 post
	 @RequestMapping(value = "/modify", method = RequestMethod.POST)
	 public String postModify(PostVO vo) throws Exception { 
		 logger.info("post modify");
		 
		 service.update(vo);
		 
		 return "redirect:/post/list";
	 }
	 
	 
	// 글 수정 조회와 같음 이유는 작성된 게시글을 모두 가져와야 수정이 가능하기 때문
	 @RequestMapping(value = "/delete", method = RequestMethod.GET)
	 public void getDelete(@RequestParam("bno") int bno, Model model) throws Exception {
		 //모델 : 뷰로 전달하는 역할
		 logger.info("get delete");
		 
		 
		 model.addAttribute("delete", bno); // 삭제는 bno만 있으면 가능
	}		
	 
	 //글 수정 post
	 @RequestMapping(value = "/delete", method = RequestMethod.POST)
	 public String postDelete(@RequestParam("bno") int bno) throws Exception { 
		 logger.info("post delete");
		 
		 service.delete(bno);
		 
		 return "redirect:/post/list";
	 }
}