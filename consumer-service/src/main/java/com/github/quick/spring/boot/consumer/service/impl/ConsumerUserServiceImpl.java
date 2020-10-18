package com.github.quick.spring.boot.consumer.service.impl;

import java.util.List;

import com.github.quick.spring.boot.consumer.dao.entity.ConsumerUser;
import com.github.quick.spring.boot.consumer.dao.entity.ConsumerUserAddress;
import com.github.quick.spring.boot.consumer.dao.mapper.ConsumerUserAddressMapper;
import com.github.quick.spring.boot.consumer.dao.mapper.ConsumerUserMapper;
import com.github.quick.spring.boot.consumer.service.ConsumerUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerUserServiceImpl implements ConsumerUserService {

	private static final Logger log = LoggerFactory.getLogger(ConsumerUserServiceImpl.class);

	@Autowired
	private ConsumerUserMapper userMapper;

	@Autowired
	private ConsumerUserAddressMapper addressMapper;

	@Override
	public void addAddress(String address, Long userId, boolean first) {
		ConsumerUserAddress consumerUserAddress = new ConsumerUserAddress();
		consumerUserAddress.setAddress(address);
		consumerUserAddress.setUserId(userId);
		consumerUserAddress.setFirstChoice(first ? (byte) 1 : (byte) 0);
		this.addressMapper.insert(consumerUserAddress);
	}

	@Override
	public void register(String nickName, String loginName, String password) {
		ConsumerUser consumerUser = new ConsumerUser();
		consumerUser.setNickName(nickName);
		consumerUser.setLoginName(loginName);
		consumerUser.setPassword(password);
		consumerUser.setVersion(1L);
		consumerUser.setHasShop((byte) 0);

		this.userMapper.insert(consumerUser);

	}

	@Override
	public void setFirstAddress(Long userId, Long addressId) {
		// 查出这个用户的所有收货地址设置为非首选
		addressMapper.removeFirstChios(userId);
		// 将 addressId 设置为首选
		addressMapper.setFirstChios(addressId);
	}

	@Override
	public List<ConsumerUserAddress> list(Long userId) {
		return addressMapper.findByUserId(userId);
	}

}
