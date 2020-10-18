package com.github.quick.spring.boot.consumer.service;

import java.util.List;

import com.github.quick.spring.boot.consumer.dao.entity.ConsumerUserAddress;

public interface ConsumerUserService {
	void addAddress(String address , Long userId , boolean first);

	void register(String nickName, String loginName, String password);

	void setFirstAddress(Long userId, Long addressId);

	List<ConsumerUserAddress> list(Long userId);
}
