package com.moodopa.sample.service;

import com.moodopa.sample.model.SampleModel;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;

@Transactional
public interface SampleService {

	int insert(SampleModel model) throws RuntimeException;

	HashMap<String, Object> update(HashMap<String, Object> param)
			throws RuntimeException;

	HashMap<String, Object> delete(HashMap<String, Object> param)
			throws RuntimeException;
}
