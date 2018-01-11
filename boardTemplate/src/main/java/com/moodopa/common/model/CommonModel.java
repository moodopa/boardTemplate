package com.moodopa.common.model;

import org.springframework.stereotype.Component;

/**
 * 공통 VO
 * @auth	: 김우남
 * @version	: 1.0.0
 * @since	: 2017. 11. 21. AM 8:57
 */
@Component
public class CommonModel {

	private String regId;	/* 등록 ID */
	private String regNm;	/* 등록 ID 이름 */
	private String regDt;	/* 등록 일시 */
	private String modId;	/* 수정 ID */
	private String modNm;	/* 수정 ID 이름 */
	private String modDt;	/* 수정 일시 */

	public String getRegId() {
		return regId;
	}

	public String getRegNm() {
		return regNm;
	}

	public String getRegDt() {
		return regDt;
	}

	public String getModId() {
		return modId;
	}

	public String getModNm() {
		return modNm;
	}

	public String getModDt() {
		return modDt;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	public void setRegNm(String regNm) {
		this.regNm = regNm;
	}

	public void setRegDt(String regDt) {
		this.regDt = regDt;
	}

	public void setModId(String modId) {
		this.modId = modId;
	}

	public void setModNm(String modNm) {
		this.modNm = modNm;
	}

	public void setModDt(String modDt) {
		this.modDt = modDt;
	}
}