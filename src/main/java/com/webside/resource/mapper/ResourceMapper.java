package com.webside.resource.mapper;

import com.webside.base.basemapper.BaseMapper;
import com.webside.resource.model.ResourceEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ResourceMapper extends BaseMapper<ResourceEntity, Long>{
	
	/**
	 * 自定义方法
	 * 获取用户ID对应的资源信息
	 * @param userId
	 * @return
	 */
	List<ResourceEntity> findResourcesByUserId(@Param(value = "userId") int userId);
	
	/**
	 * 自定义方法
	 * 获取用户ID对应的资源信息
	 * @param userId
	 * @return
	 */
	List<ResourceEntity> findResourcesMenuByUserId(@Param(value = "userId") int userId);
	
	/**
	 * 查询权限树集合
	 * @param parameter 参数中必须包含roleId,其他参数可参考mapping文件
	 * @return
	 */
	List<ResourceEntity> queryResourceList(Map<String, Object> parameter);
    
    /**
     * 
     * @Description 根据资源id删除角色和资源关联关系
     * @param id
     * @return
     *
     * @author wjggwm
     * @data 2016年11月19日 上午1:21:03
     */
	int deleteRolePerm(@Param(value = "id") Long id);
    
	/**
	 * 查询权限树集合
	 * @param parameter 参数中必须包含roleId,其他参数可参考mapping文件
	 * @return
	 */
	List<ResourceEntity> queryTreeGridListByPage(Map<String, Object> parameter);
    
    /**
	 * 根据父id查询资源
	 * @param parameter 参数中必须包含roleId,其他参数可参考mapping文件
	 * @return
	 */
	List<ResourceEntity> queryListByParentId(Map<String, Object> parameter);
    
}
