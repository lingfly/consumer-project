package com.github.quick.spring.boot.consumer.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.quick.spring.boot.consumer.dao.entity.ConsumerOrderItem;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ConsumerOrderItemMapper extends BaseMapper<ConsumerOrderItem> {
    int updateBatch(List<ConsumerOrderItem> list);

    int updateBatchSelective(List<ConsumerOrderItem> list);

    int batchInsert(@Param("list") List<ConsumerOrderItem> list);

    int insertOrUpdate(ConsumerOrderItem record);

    int insertOrUpdateSelective(ConsumerOrderItem record);
}