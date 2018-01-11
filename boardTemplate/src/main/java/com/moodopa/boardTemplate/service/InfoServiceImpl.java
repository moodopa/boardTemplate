package com.moodopa.boardTemplate.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("InfoService")
public class InfoServiceImpl implements BoardService {

	/**
	 * 생성자
	 */
	public InfoServiceImpl() {}

	/**
	 * 목록 제목
	 */
	static String[] tableHaerder = null;

	/**
	 * result data
	 */
	static Map<String, Object> result = new HashMap<String, Object>();

	/**
	 * 테이블 해더정보 조회
	 *
	 * @param param
	 * @auth    : 김우남
	 * @version    : 1.0.0
	 * @since    : 2017. 12. 19. AM 8:52
	 * @params    :
	 * @return    :
	 */
	public List<Map<String, Object>> getHeader(Map<String, Object> param) throws RuntimeException {
		return null;
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
	public Map<String, Object> movingPage(Map<String, Object> param) {

		result.put("data", "InfoService");

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
	public Map<String, Object> getDetailInfo(Map<String, Object> param) {
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
	public Map<String, Object> getList(Map<String, Object> param) {
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
		return result;
	}
}
