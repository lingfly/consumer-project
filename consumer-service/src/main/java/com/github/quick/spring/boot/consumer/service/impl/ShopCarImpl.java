package com.github.quick.spring.boot.consumer.service.impl;

import java.util.List;

import com.github.quick.spring.boot.consumer.dao.entity.ConsumerUserShopCar;
import com.github.quick.spring.boot.consumer.dao.mapper.ConsumerUserShopCarMapper;
import com.github.quick.spring.boot.consumer.service.ShopCar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopCarImpl implements ShopCar {
	@Autowired
	private ConsumerUserShopCarMapper shopCarMapper;

	@Override
	public boolean add(Long productId, Long shopId, Long userId) {
		ConsumerUserShopCar consumerUserShopCar = new ConsumerUserShopCar();
		consumerUserShopCar.setConsumerId(userId);
		consumerUserShopCar.setShopId(shopId);
		consumerUserShopCar.setProductId(productId);
		return this.shopCarMapper.insert(consumerUserShopCar) > 0;
	}

	@Override
	public boolean remove(Long productId, Long userId) {
		return this.shopCarMapper.deleteByUserIdAndProductId(productId, userId) > 0;
	}

	@Override
	public boolean setProductSize(Long productId, Long userId, int size) {
		return shopCarMapper.updateByProductAndUserId(productId, userId, size) > 0;
	}

	@Override
	public List<ConsumerUserShopCar> list(Long userId) {
		return this.shopCarMapper.list(userId);
	}

}
