package com.moodopa.utils;

import java.util.Map;

/**
 * 공통으로 출력하는 파라메터
 * @auth	: 김우남
 * @version	: 1.0.0
 * @since	: 2017. 12. 9. AM 9:56
 */
public class Print {

	public Print() {}

	/**
	 *
	 * @auth	: 김우남
	 * @version	: 1.0.0
	 * @since	: 2017. 12. 9. AM 9:57
	 * @params	: classNm : 실행한 클래스.메소드, param : 각 종 파라메터
	 * @return	: void
	 */
	static public void parameter(String classNm, Map<String, Object> param) {

		for (String key : param.keySet()) {
			Object paramValue = param.get(key);
			System.out.println("["+ classNm +"] key => ["+ key +"] value => ["+ paramValue +"]");
		}
	}
}
