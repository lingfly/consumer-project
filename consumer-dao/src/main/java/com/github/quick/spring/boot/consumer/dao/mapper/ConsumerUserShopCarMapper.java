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

	int deleteByUserIdAndProductId(@Param("productId") Long productId, @Param("userId") Long userId);

	List<ConsumerUserShopCar> list(Long userId);

	int updateByProductAndUserId(@Param("productId") Long productId, @Param("userId") Long userId, @Param("size") int size);
}