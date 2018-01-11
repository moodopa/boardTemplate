package com.moodopa.boardTemplate.controller;

import com.moodopa.boardTemplate.service.BoardService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 게시판 관리 구현
 * @auth	: 김우남
 * @version	: 1.0.0
 * @since	: 2017. 12. 19. AM 8:57
 */
@Controller
@RequestMapping("/board/management")
public class ManagementController {
	// 로그
	protected Logger logger = Logger.getLogger(this.getClass());
	// 생성자
	public ManagementController() {}

	@Autowired
	BoardService ManagementService;

	final static String path = "board/management";

	@RequestMapping("/list.do")
	public ModelAndView index(HttpServletResponse response, HttpServletRequest request, Model model) {
		logger.info("========== index Start ==========");

		ModelAndView mav = new ModelAndView();
		Map<String, Object> param = new HashMap<String, Object>();

		param.put("title", "게시판 관리");
		Map<String, Object> data = ManagementService.getDetailInfo(param);

		mav.setViewName(path +"/list");
		request.setAttribute("title", data.get("title"));
		request.setAttribute("tHead", data.get("tHead"));
		logger.info("========== index End ========== : "+ mav);

		return mav;
	}

	@RequestMapping("/view.do")
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response, Model model) {
		ModelAndView mav = new ModelAndView();

		return mav;
	}

	@RequestMapping("/create.do")
	public String insert(Model model) throws Exception {
		logger.info("========== create Start ==========");


		logger.info("========== create End ==========");
		return "index";
	}

	@RequestMapping("/update.do")
	public String update(Model model) throws Exception {
		logger.info("========== update Start ==========");


		logger.info("========== update End ==========");
		return "index";
	}

	@RequestMapping("/delete.do")
	public String delete(Model model) throws  Exception {
		logger.info("========== delete Start ==========");


		logger.info("========== delete End ==========");
		return "index";
	}
}