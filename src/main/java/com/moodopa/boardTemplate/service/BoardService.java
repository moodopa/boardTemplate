package com.moodopa.boardTemplate.service;

import java.util.List;
import java.util.Map;

/**
 * 게시판 서비스
 * @auth	: 김우남
 * @version	: 1.0.0
 * @since	: 2017. 12. 9. AM 8:08
 */
public interface BoardService {

	/**
	 * 테이블 해더정보 조회
	 * @auth	: 김우남
	 * @version	: 1.0.0
	 * @since	: 2017. 12. 19. AM 8:52
	 * @params	: 
	 * @return	: 
	 */
	List<Map<String, Object>> getHeader(Map<String, Object> param)
		throws RuntimeException;

	/**
	 * 페이지 이동
	 * @auth	: 김우남
	 * @version	: 1.0.0
	 * @since	: 2017. 12. 9. AM 8:14
	 * @params	: 
	 * @return	: 
	 */
	Map<String, Object> movingPage(Map<String, Object> param)
		throws RuntimeException;

	/**
	 * 상세정보 조회
	 * @auth	: 김우남
	 * @version	: 1.0.0
	 * @since	: 2017. 12. 9. AM 8:10
	 * @params	: 
	 * @return	: 
	 */
	Map<String, Object> getDetailInfo(Map<String, Object> param)
		throws RuntimeException;

	/**
	 * 목록 조회 
	 * @auth	: 김우남
	 * @version	: 1.0.0
	 * @since	: 2017. 12. 9. AM 8:17
	 * @params	: 
	 * @return	: 
	 */
	Map<String, Object> getList(Map<String, Object> param)
		throws  RuntimeException;

	/**
	 * 저장
	 * @auth	: 김우남
	 * @version	: 1.0.0
	 * @since	: 2017. 12. 9. AM 8:18
	 * @params	: 
	 * @return	: 
	 */
	Map<String, Object> insert(Map<String, Object> param)
			throws RuntimeException;


	/**
	 * 수정
	 * @auth	: 김우남
	 * @version	: 1.0.0
	 * @since	: 2017. 12. 9. AM 8:19
	 * @params	: 
	 * @return	: 
	 */
	Map<String, Object> update(Map<String, Object> param)
			throws RuntimeException;

	/**
	 * 삭제
	 * @auth	: 김우남
	 * @version	: 1.0.0
	 * @since	: 2017. 12. 9. AM 8:19
	 * @params	: 
	 * @return	: 
	 */
	Map<String, Object> delete(Map<String, Object> param)
			throws RuntimeException;
}