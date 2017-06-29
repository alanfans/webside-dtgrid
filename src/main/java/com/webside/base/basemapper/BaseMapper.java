package com.webside.base.basemapper;

import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 
 * @Description: 基础mapper定义,可以自己重写，也可加入自己的方法
 * @author gaogang
 * @date 2016年7月12日 下午3:01:23
 *
 * @param <T>	操作的对象类型
 * @param <ID>	id
 */
public interface BaseMapper<T,ID extends Serializable> {

    int insert(T t);
    
    int insertBatch(List<T> t);
    
    int deleteBatchById(List<ID> ids);
 
    int deleteById(@Param("id") ID id);
 
    int deleteById(@Param("id") String id);
 
    int update(T t);
 
    T find(Map<String, Object> parameter);
 
    T findById(@Param("id") ID id);
 
    T findById(@Param("id") String id);
 
    T findByName(@Param("name") String name);
 
    List<T> queryListAll(Map<String, Object> parameter);
    
    List<T> queryListByPage(Map<String, Object> parameter);
    
    int count(Map<String, Object> parameter);
	
}
