package com.webside.user.mapper;

import com.webside.base.basemapper.BaseMapper;
import com.webside.user.model.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper extends BaseMapper<UserEntity, Long>{
	
	/**
	 * 添加用户和角色对应关系
	 * @param userEntity
	 * @return
	 */
	int insertUserRole(UserEntity userEntity);
	
	/**
	 * 更新用户和角色对应关系
	 * @param userEntity
	 * @return
	 */
	int updateUserRole(UserEntity userEntity);
	
	/**
	 * 删除用户和角色对应关系
	 * @param userEntity
	 * @return
	 */
	int deleteBatchUserRole(List<Long> userIds);
	
	/**
	 * 添加用户个人资料信息
	 * @param userEntity
	 * @return
	 */
	int insertUserInfo(UserEntity userEntity);
	
	/**
	 * 更新用户个人资料信息
	 * @param userEntity
	 * @return
	 */
	int updateUserInfo(UserEntity userEntity);
}
