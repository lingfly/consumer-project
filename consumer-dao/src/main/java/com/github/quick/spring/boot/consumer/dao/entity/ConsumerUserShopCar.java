package com.github.quick.spring.boot.consumer.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

@TableName(value = "consumer_user_shop_car")
public class ConsumerUserShopCar implements Serializable {
	@TableId(value = "id", type = IdType.AUTO)
	private Long id;

	/**
	 * 商品id
	 */
	@TableField(value = "product_id")
	private Long productId;

	/**
	 * 商铺id
	 */
	@TableField(value = "shop_id")
	private Long shopId;

	/**
	 * 数量
	 */
	@TableField(value = "`size`")
	private Integer size;

	/**
	 * 用户id
	 */
	@TableField(value = "consumer_id")
	private Long consumerId;

	/**
	 * 创建时间
	 */
	@TableField(value = "create_time")
	private Date createTime;

	private static final long serialVersionUID = 1L;

	public static final String COL_ID = "id";

	public static final String COL_PRODUCT_ID = "product_id";

	public static final String COL_SHOP_ID = "shop_id";

	public static final String COL_SIZE = "size";

	public static final String COL_CONSUMER_ID = "consumer_id";

	public static final String COL_CREATE_TIME = "create_time";

	/**
	 * @return id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取商品id
	 *
	 * @return product_id - 商品id
	 */
	public Long getProductId() {
		return productId;
	}

	/**
	 * 设置商品id
	 *
	 * @param productId 商品id
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/**
	 * 获取商铺id
	 *
	 * @return shop_id - 商铺id
	 */
	public Long getShopId() {
		return shopId;
	}

	/**
	 * 设置商铺id
	 *
	 * @param shopId 商铺id
	 */
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	/**
	 * 获取数量
	 *
	 * @return size - 数量
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * 设置数量
	 *
	 * @param size 数量
	 */
	public void setSize(Integer size) {
		this.size = size;
	}

	/**
	 * 获取用户id
	 *
	 * @return consumer_id - 用户id
	 */
	public Long getConsumerId() {
		return consumerId;
	}

	/**
	 * 设置用户id
	 *
	 * @param consumerId 用户id
	 */
	public void setConsumerId(Long consumerId) {
		this.consumerId = consumerId;
	}

	/**
	 * 获取创建时间
	 *
	 * @return create_time - 创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置创建时间
	 *
	 * @param createTime 创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		ConsumerUserShopCar other = (ConsumerUserShopCar) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
				&& (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
				&& (this.getShopId() == null ? other.getShopId() == null : this.getShopId().equals(other.getShopId()))
				&& (this.getSize() == null ? other.getSize() == null : this.getSize().equals(other.getSize()))
				&& (this.getConsumerId() == null ? other.getConsumerId() == null : this.getConsumerId().equals(other.getConsumerId()))
				&& (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
		result = prime * result + ((getShopId() == null) ? 0 : getShopId().hashCode());
		result = prime * result + ((getSize() == null) ? 0 : getSize().hashCode());
		result = prime * result + ((getConsumerId() == null) ? 0 : getConsumerId().hashCode());
		result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
		return result;
	}
}