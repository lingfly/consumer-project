package com.github.quick.spring.boot.consumer.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.quick.spring.boot.consumer.dao.entity.ConsumerUser;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ConsumerUserMapper extends BaseMapper<ConsumerUser> {
    int updateBatch(List<ConsumerUser> list);

    int updateBatchSelective(List<ConsumerUser> list);

    int batchInsert(@Param("list") List<ConsumerUser> list);

    int insertOrUpdate(ConsumerUser record);

    int insertOrUpdateSelective(ConsumerUser record);
}