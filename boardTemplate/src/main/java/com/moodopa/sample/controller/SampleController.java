package com.moodopa.sample.controller;

import com.moodopa.common.dao.CommonDao;
import com.moodopa.sample.model.SampleModel;
import com.moodopa.sample.service.SampleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;

/**
 * 예제를 작성 용
 * @auth	: 김우남
 * @version	: 1.0.0
 * @since	: 2017. 11. 21. AM 9:18
 */
@Controller
@RequestMapping("/sample")
public class SampleController {

	@Resource(name = "CommonDao")
	private CommonDao commonDao;
	@Autowired
	SampleService sample;
	@Autowired
	SampleModel sampleModel;

	protected Logger logger = Logger.getLogger(this.getClass());
	
	private static String success	= "success";
	private static String error		= "exception";
	private static String error1	= "runtime";

	/**
	 * 페이지 이동
	 * @auth	: 김우남
	 * @version	: 1.0.0
	 * @since	: 2017. 11. 21. AM 9:20
	 * @params	:
	 * @return	: sample/list
	 */	
	@RequestMapping("/list.do")
	public ModelAndView index(Model model) throws Exception {
		logger.info("========== index Start ==========");

		ModelAndView mav = new ModelAndView();
		mav.setViewName("sample/list");
		mav.addObject("title", "샘플 게시판");

		logger.info("========== index End ==========");
		return mav;
	}

	@RequestMapping("/list2.do")
	public ModelAndView index2( HttpServletRequest request,Model model ) throws Exception {
		logger.info("========== index Start ==========");

		ModelAndView mav = new ModelAndView();
		mav.setViewName("sample/list2");
		request.setAttribute("title", "샘플 게시판2");

		logger.info("========== index End ==========");
		return mav;
	}

	/**
	 * 목록 조회
	 * @auth	: 김우남
	 * @version	: 1.0.0
	 * @since	: 2017. 11. 21. AM 9:20
	 * @params	:
	 * @return	: sampleList
	 */
	@RequestMapping("/select.do")
	public @ResponseBody HashMap<String, Object> getSampleList
			(HttpServletRequest request, HttpServletResponse response, Model model) {
		logger.info("========== getSampleList Start ==========");

		HashMap<String, Object> result = new HashMap<String, Object>();
		List sampleList = null;

		try {
			// 목록조회
			sampleList = commonDao.selectList("sample.getSampleList");

			result.put("result", success);
			result.put("data", sampleList);
		} catch (RuntimeException re) {
			result.put("result", error1);
			result.put("data", "null");
			logger.error("getSampleList RuntimeException => ", re.fillInStackTrace());
		} catch (Exception e) {
			result.put("result", error);
			result.put("data", "null");
			logger.error("getSampleList Exception => ", e.fillInStackTrace());
		} finally {
			logger.info("========== getSampleList End ==========");
			return result;
		}
	}

	/**
	 * 샘플 등록
	 * @auth	: 김우남
	 * @version	: 1.0.0
	 * @since	: 2017. 11. 21. AM 9:22
	 * @params	: title, content, regId
	 * @return	: insertCount
	 */	
	@RequestMapping("/insert.do")
	public @ResponseBody HashMap<String, Object> insert
			(HttpServletRequest request, HttpServletResponse response, Model model) {
		logger.info("========== insert Start ==========");

		HashMap<String, Object> result = new HashMap<String, Object>();
		int insertCount = 0;

		try {

			sampleModel.setTitle(request.getParameter("title"));
			sampleModel.setContent(request.getParameter("content"));
			sampleModel.setRegId(request.getParameter("regId"));

			insertCount = sample.insert(sampleModel);

			result.put("result", success);
			result.put("data", insertCount);
		} catch (RuntimeException re) {
			result.put("result", error1);
			result.put("data", "null");
			logger.error("insert RuntimeException => ", re.fillInStackTrace());
		} catch (Exception e) {
			result.put("result", error);
			result.put("data", "null");
			logger.error("insert Exception => ", e.fillInStackTrace());
		} finally {
			logger.info("========== insert End ==========");
			return result;
		}
	}

	/**
	 * 샘플 수정
	 * @auth	: 김우남
	 * @version	: 1.0.0
	 * @since	: 2017. 11. 22. AM 8:49
	 * @params	: sampleId, title, content, regId
	 * @return	: updateCount
	 */	
	@RequestMapping("/update.do")
	public @ResponseBody HashMap<String, Object> update
			(HttpServletRequest request, HttpServletResponse response, Model model) {
		logger.info("========== update Start ==========");

		HashMap<String, Object> result = new HashMap<String, Object>();
		int updateCount = 0;

		try {
			HashMap<String, Object> param = new HashMap<String, Object>();
			param.put("sampleId", (String) request.getParameter("sampleId"));
			param.put("title", (String) request.getParameter("title"));
			param.put("content", (String) request.getParameter("content"));
			param.put("regId", (String) request.getParameter("regId"));

			updateCount = commonDao.update("sample.update", param);
			result.put("result", success);
			result.put("data", updateCount);
		} catch (RuntimeException re) {
			result.put("result", error1);
			result.put("data", "null");
			logger.error("update RuntimeException => ", re.fillInStackTrace());
		} catch (Exception e) {
			result.put("result", error);
			result.put("data", "null");
			logger.error("update Exception => ", e.fillInStackTrace());
		} finally {
			logger.info("========== update End ==========");
			return result;
		}
	}

	/**
	 * 샘플 저장
	 * @auth	: 김우남
	 * @version	: 1.0.0
	 * @since	: 2017. 11. 22. AM 8:50
	 * @params	: sampleId
	 * @return	: deleteCount
	 */	
	@RequestMapping("/delete.do")
	public @ResponseBody HashMap<String, Object> delete
			(HttpServletRequest request, HttpServletResponse response, Model model) {
		logger.info("========== delete Start ==========");

		HashMap<String, Object> result = new HashMap<String, Object>();
		int deleteCount = 0;

		try {
			HashMap<String, Object> param = new HashMap<String, Object>();
			param.put("sampleId", (String) request.getParameter("sampleId"));

			deleteCount = commonDao.delete("sample.delete", param);
			result.put("result", success);
			result.put("data", deleteCount);
		} catch (RuntimeException re) {
			result.put("result", error1);
			result.put("data", "null");
			logger.error("delete RuntimeException => ", re.fillInStackTrace());
		} catch (Exception e) {
			result.put("result", error);
			result.put("data", "null");
			logger.error("delete Exception => ", e.fillInStackTrace());
		} finally {
			logger.info("========== delete End ==========");
			return result;
		}
	}
}