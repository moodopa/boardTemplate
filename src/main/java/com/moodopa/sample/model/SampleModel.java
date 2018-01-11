package com.moodopa.sample.model;

import com.moodopa.common.model.CommonModel;
import org.springframework.stereotype.Component;

/**
 * Sample Model
 * @auth	: 김우남
 * @version	: 1.0.0
 * @since	: 2017. 11. 21. AM 9:24
 */
@Component
public class SampleModel extends CommonModel {

	private int sampleId;	// ID
	private String title;	// 제목
	private String content;	// 내용

	public int getSampleId() {
		return sampleId;
	}

	public void setSampleId(int sampleId) {
		this.sampleId = sampleId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
