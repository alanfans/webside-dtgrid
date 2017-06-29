package com.webside.user.service;

import com.webside.exception.ServiceException;
import com.webside.user.model.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserService {

	List<UserEntity> queryListByPage(Map<String, Object> parameter);

	UserEntity findByName(String accountName);
	
	int insert(UserEntity userEntity, String password);
	
	UserEntity findById(Long id);

	int update(UserEntity userEntity);
	
	int updateOnly(UserEntity userEntity) throws ServiceException;
	
	int updatePassword(UserEntity userEntity, String password) throws ServiceException;
    
    int deleteBatchById(List<Long> userIds);
    
}