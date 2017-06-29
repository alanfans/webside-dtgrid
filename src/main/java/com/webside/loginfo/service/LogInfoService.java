package com.webside.loginfo.service;

import com.webside.loginfo.model.LogInfoEntity;

import java.util.List;
import java.util.Map;

public interface LogInfoService {

	int log(LogInfoEntity logInfo);
	
	List<LogInfoEntity> queryListByPage(Map<String, Object> parameter);
}
