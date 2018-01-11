package com.moodopa.boardTemplate.service;

import com.moodopa.utils.Print;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 게시판 관리 구현
 * @auth	: 김우남
 * @version	: 1.0.0
 * @since	: 2017. 12. 19. AM 9:01
 */
@Service("ManagementService")
public class ManagementServiceImpl implements BoardService {

	Logger logger = Logger.getLogger(this.getClass());

	/**
	 * 생성자
	 */
	public ManagementServiceImpl() {}

	/**
	 * 목록 제목
	 */
	static String[] tableHeader = {
			"checkbox", "게시판 이름", "모든 권한", "읽기 권한", "등록 권한", "수정 권한", "삭제 권한",
			"등록 ID", "등록 ID 이름", "등록 일자", "수정 ID", "수정 ID 이름", "수정 일자"
	};

	final static String classNm = "ManagementServiceImpl.";
	static String methodNm = "";


	public List<Map<String, Object>> getHeader(Map<String, Object> param)
			throws RuntimeException {
		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
		return result;
	}

	/**
	 * 페이지 이동
	 *
	 * @param param
	 * @auth    : 김우남
	 * @version    : 1.0.0
	 * @since    : 2017. 12. 9. AM 8:14
	 * @params    :
	 * @return    :
	 */
	public Map<String, Object> movingPage(Map<String, Object> param)
			throws RuntimeException {
		logger.info("========== movingPage start ==========");

		Map<String, Object> result = new HashMap<String, Object>();

		try {

		} catch (Exception e) {

		}

		logger.info("========== movingPage end ==========");
		return result;
	}

	/**
	 * 상세정보 조회
	 *
	 * @param param
	 * @auth    : 김우남
	 * @version    : 1.0.0
	 * @since    : 2017. 12. 9. AM 8:10
	 * @params    :
	 * @return    :
	 */
	public Map<String, Object> getDetailInfo(Map<String, Object> param)
			throws RuntimeException{
		logger.info("========== getDetailInfo start ===========");

		Map<String, Object> result = new HashMap<String, Object>();

		String title = (String) param.get("title");
		methodNm = classNm + "getDetailInfo";
		Print.parameter(methodNm, param);

		List<Map<String, Object>> headerList = new ArrayList<Map<String, Object>>();

		try {
			for (int i=0; i<tableHeader.length; i++) {
				Map<String, Object> header = new HashMap<String, Object>();
				header.put("tHead", tableHeader[i]);
				headerList.add(i, header);
			}
			result.put("title", title);
			result.put("tHead", headerList);
		} catch (Exception e) {
			throw new RuntimeException();
		}

		logger.info("========== getDetailInfo end ===========");
		return result;
	}

	/**
	 * 목록 조회
	 *
	 * @param param
	 * @auth    : 김우남
	 * @version    : 1.0.0
	 * @since    : 2017. 12. 9. AM 8:17
	 * @params    :
	 * @return    :
	 */
	public Map<String, Object> getList(Map<String, Object> param)
			throws RuntimeException {
		Map<String, Object> result = new HashMap<String, Object>();

		return result;
	}

	/**
	 * 저장
	 *
	 * @param param
	 * @auth    : 김우남
	 * @version    : 1.0.0
	 * @since    : 2017. 12. 9. AM 8:18
	 * @params    :
	 * @return    :
	 */
	public Map<String, Object> insert(Map<String, Object> param)
			throws RuntimeException {
		Map<String, Object> result = new HashMap<String, Object>();
		return result;
	}

	/**
	 * 수정
	 *
	 * @param param
	 * @auth    : 김우남
	 * @version    : 1.0.0
	 * @since    : 2017. 12. 9. AM 8:19
	 * @params    :
	 * @return    :
	 */
	public Map<String, Object> update(Map<String, Object> param)
			throws RuntimeException {
		Map<String, Object> result = new HashMap<String, Object>();
		return result;
	}

	/**
	 * 삭제
	 *
	 * @param param
	 * @auth    : 김우남
	 * @version    : 1.0.0
	 * @since    : 2017. 12. 9. AM 8:19
	 * @params    :
	 * @return    :
	 */
	public Map<String, Object> delete(Map<String, Object> param)
			throws RuntimeException {
		Map<String, Object> result = new HashMap<String, Object>();
		return result;
	}
}
