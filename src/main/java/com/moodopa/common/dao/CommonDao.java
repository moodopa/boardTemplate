package com.moodopa.common.dao;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 공통 DAO
 * @auth	: 김우남
 * @version	: 1.0.0
 * @since	: 2017. 11. 21. AM 8:57
 */
@Repository("CommonDao")
public class CommonDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	protected Logger logger = Logger.getLogger(this.getClass());

	/* 생성자 */
	public CommonDao() {}

	/**
	 * 쿼리 실행 시 SQL 로그 생성
	 * @auth	: 김우남
	 * @version	: 1.0.0
	 * @since	: 2017. 11. 21. AM 8:58
	 * @params	: String
	 * @return	: void
	 */
	protected void printQueryId(String queryId) {
		if (logger.isDebugEnabled()) {
			logger.debug("\t QueryId \t : "+ queryId);
		}
	}

	/**
	 * Insert 실행
	 * @auth	: 김우남
	 * @version	: 1.0.0
	 * @since	: 2017. 11. 21. AM 9:11
	 * @params	: String, Object
	 * @return	: int
	 */
	public int insert(String queryId, Object params) throws RuntimeException {
		printQueryId(queryId);
		return sqlSession.insert(queryId, params);
	}

	/**
	 * update 실행
	 * @auth	: 김우남
	 * @version	: 1.0.0
	 * @since	: 2017. 11. 21. AM 9:11
	 * @params	: String, Object
	 * @return	: int
	 */
	public int update(String queryId, Object params) throws RuntimeException {
		printQueryId(queryId);
		return sqlSession.update(queryId, params);
	}

	/**
	 * delete 실헹
	 * @auth	: 김우남
	 * @version	: 1.0.0
	 * @since	: 2017. 11. 21. AM 9:13
	 * @params	: String, Object
	 * @return	: int
	 */
	public int delete(String queryId, Object params) throws RuntimeException {
		printQueryId(queryId);
		return sqlSession.delete(queryId, params);
	}

	/**
	 * 한 개의 데이터만 조회
	 * @auth	: 김우남
	 * @version	: 1.0.0
	 * @since	: 2017. 11. 21. AM 9:15
	 * @params	: String
	 * @return	: Object
	 */	
	public Object selectOne(String queryId) throws RuntimeException {
		printQueryId(queryId);
		return sqlSession.selectOne(queryId);
	}

	/**
	 * 한 개의 데이터만 조회
	 * @auth	: 김우남
	 * @version	: 1.0.0
	 * @since	: 2017. 11. 21. AM 9:16
	 * @params	: String, Object
	 * @return	: Object
	 */	
	public Object selectOne(String queryId, Object params) throws RuntimeException {
		printQueryId(queryId);
		return sqlSession.selectOne(queryId, params);
	}

	/**
	 * 목록 조회
	 * @auth	: 김우남
	 * @version	: 1.0.0
	 * @since	: 2017. 11. 21. AM 9:17
	 * @params	: String
	 * @return	: List
	 */
	public List selectList(String queryId) throws RuntimeException {
		printQueryId(queryId);
		return sqlSession.selectList(queryId);
	}

	/**
	 * 목록 조회
	 * @auth	: 김우남
	 * @version	: 1.0.0
	 * @since	: 2017. 11. 21. AM 9:17
	 * @params	: String, params
	 * @return	: List
	 */
	public List selectList(String queryId, Object params) throws RuntimeException {
		printQueryId(queryId);
		return sqlSession.selectList(queryId, params);
	}

	public Map selectMap(String queryId, String params) throws  RuntimeException {
		printQueryId(queryId);
		return sqlSession.selectMap(queryId, params);
	}
}