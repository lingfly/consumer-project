package com.github.quick.spring.boot.consumer.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.quick.spring.boot.consumer.dao.entity.ConsumerUserShopCar;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ConsumerUserShopCarMapper extends BaseMapper<ConsumerUserShopCar> {
    int updateBatch(List<ConsumerUserShopCar> list);

    int updateBatchSelective(List<ConsumerUserShopCar> list);

    int batchInsert(@Param("list") List<ConsumerUserShopCar> list);

    int insertOrUpdate(ConsumerUserShopCar record);

    int insertOrUpdateSelective(ConsumerUserShopCar record);
}