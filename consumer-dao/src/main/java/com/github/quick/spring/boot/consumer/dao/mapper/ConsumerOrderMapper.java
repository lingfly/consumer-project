package com.github.quick.spring.boot.consumer.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.quick.spring.boot.consumer.dao.entity.ConsumerOrder;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ConsumerOrderMapper extends BaseMapper<ConsumerOrder> {
    int updateBatch(List<ConsumerOrder> list);

    int updateBatchSelective(List<ConsumerOrder> list);

    int batchInsert(@Param("list") List<ConsumerOrder> list);

    int insertOrUpdate(ConsumerOrder record);

    int insertOrUpdateSelective(ConsumerOrder record);
}