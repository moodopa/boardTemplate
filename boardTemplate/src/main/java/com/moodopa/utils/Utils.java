package com.moodopa.utils;

import org.springframework.stereotype.Component;

/**
 * 공통 유틸 클래스
 * @auth	: 김우남
 * @version	: 1.0.0
 * @since	: 2017. 12. 3. PM 7:59
 */
@Component
public class Utils {

	/**
	 * Null 체크
	 * @auth	: 김우남
	 * @version	: 1.0.0
	 * @since	: 2017. 12. 3. PM 8:00
	 * @params	: 
	 * @return	: 
	 */	
	public boolean isNull(String str) {

		boolean result = true;

		if (str == null) {
			result  = true;
		} else {
			result = false;
		}

		return result;
	}
}
