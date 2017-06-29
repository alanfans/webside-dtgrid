package com.webside.loginfo.mapper;

import com.webside.base.basemapper.BaseMapper;
import com.webside.loginfo.model.LogInfoEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface LogInfoMapper extends BaseMapper<LogInfoEntity, Long> {

}
