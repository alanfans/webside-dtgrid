package com.webside.logininfo.service;

import com.webside.logininfo.model.LoginInfoEntity;

import java.util.List;
import java.util.Map;

public interface LoginInfoService {

	int log(LoginInfoEntity loginInfo);
	
	List<LoginInfoEntity> queryListByPage(Map<String, Object> parameter);
}
