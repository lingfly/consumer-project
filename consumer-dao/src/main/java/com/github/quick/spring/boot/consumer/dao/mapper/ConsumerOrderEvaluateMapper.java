package com.github.quick.spring.boot.consumer.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.quick.spring.boot.consumer.dao.entity.ConsumerOrderEvaluate;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ConsumerOrderEvaluateMapper extends BaseMapper<ConsumerOrderEvaluate> {
    int updateBatch(List<ConsumerOrderEvaluate> list);

    int updateBatchSelective(List<ConsumerOrderEvaluate> list);

    int batchInsert(@Param("list") List<ConsumerOrderEvaluate> list);

    int insertOrUpdate(ConsumerOrderEvaluate record);

    int insertOrUpdateSelective(ConsumerOrderEvaluate record);
}