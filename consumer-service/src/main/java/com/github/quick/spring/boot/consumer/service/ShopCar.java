package com.github.quick.spring.boot.consumer.service;

import java.util.List;

import com.github.quick.spring.boot.consumer.dao.entity.ConsumerUserShopCar;

public interface ShopCar {
	/**
	 * 添加商品
	 * @param productId
	 * @param shopId
	 * @param userId
	 * @return
	 */
	boolean add(Long productId, Long shopId, Long userId);

	/**
	 * 删除商品
	 * @param productId
	 * @param userId
	 * @return
	 */
	boolean remove(Long productId, Long userId);


	/**
	 * 设置商品数量
	 * @param productId
	 * @param userId
	 * @param size
	 * @return
	 */
	boolean setProductSize(Long productId, Long userId, int size);


	List<ConsumerUserShopCar> list(Long userId);
}
