package com.moodopa.sample.service;

import com.moodopa.common.dao.CommonDao;
import com.moodopa.sample.model.SampleModel;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;

@Service
public class SampleServiceImpl implements SampleService {

	private Logger logger = Logger.getLogger(this.getClass());

	@Resource(name = "CommonDao")
	private CommonDao commonDao;

	public int insert(SampleModel model) throws RuntimeException {
		logger.info("========== insert Start ==========");

		int result = 0;

		result = commonDao.insert("sample.insert", model);

		logger.debug("smapleId => "+ model.getSampleId());

		if (result > 0) {
			result = commonDao.insert("sample.insertLog", model);
		}

		logger.info("========== insert End ==========");
		return result;
	}

	public HashMap<String, Object> update(HashMap<String, Object> param)
			throws RuntimeException {
		HashMap<String, Object> result = new HashMap<String, Object>();

		try {

		} catch (Exception e) {

		}
		return result;
	}

	public HashMap<String, Object> delete(HashMap<String, Object> param)
			throws RuntimeException {
		HashMap<String, Object> result = new HashMap<String, Object>();

		try {

		} catch (Exception e) {

		}
		return result;
	}

}
