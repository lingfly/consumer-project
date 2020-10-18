package com.github.quick.spring.boot.consumer.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.quick.spring.boot.consumer.dao.entity.ConsumerUserAddress;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ConsumerUserAddressMapper extends BaseMapper<ConsumerUserAddress> {
    int updateBatch(List<ConsumerUserAddress> list);

    int updateBatchSelective(List<ConsumerUserAddress> list);

    int batchInsert(@Param("list") List<ConsumerUserAddress> list);

    int insertOrUpdate(ConsumerUserAddress record);

    int insertOrUpdateSelective(ConsumerUserAddress record);

    int removeFirstChios(@Param("userId") Long userId);

    int setFirstChios(@Param("id") Long id);

    List<ConsumerUserAddress> findByUserId(@Param("userId") Long userId);

}