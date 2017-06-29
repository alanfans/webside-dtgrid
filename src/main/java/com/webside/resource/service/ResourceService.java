package com.webside.resource.service;

import com.webside.resource.model.ResourceEntity;

import java.util.List;
import java.util.Map;

public interface ResourceService{

	/**
	 * 自定义方法
	 * 获取用户ID对应的资源信息
	 * @param userId
	 * @return
	 */
	List<ResourceEntity> findResourcesByUserId(int userId);

	/**
	 * 自定义方法
	 * 获取用户ID对应的资源菜单信息
	 * @param userId
	 * @return
	 */
	List<ResourceEntity> findResourcesMenuByUserId(int userId);
	
	List<ResourceEntity> queryListByPage(Map<String, Object> parameter);
	
	List<ResourceEntity> queryTreeGridListByPage(Map<String, Object> parameter);
	
	ResourceEntity findByName(String name);
	
	ResourceEntity findById(Long id);

	int update(ResourceEntity resourceEntity);
    
    int deleteBatchById(List<Long> resourceIds);
    
    List<ResourceEntity> queryResourceList(Map<String, Object> parameter);
    
    int insert(ResourceEntity resourceEntity);
    
    int count(Map<String, Object> parameter);
    
    boolean deleteRoleAndResource(List<Long> resourceIds);
    
}
