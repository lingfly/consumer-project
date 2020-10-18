package com.github.quick.spring.boot.consumer.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

@TableName(value = "consumer_user_address")
public class ConsumerUserAddress implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 收货地址
     */
    @TableField(value = "address")
    private String address;

    /**
     * 用户id
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 是否默认
     */
    @TableField(value = "first_choice")
    private Byte firstChoice;

    /**
     * 乐观锁
     */
    @TableField(value = "version")
    private Long version;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_ADDRESS = "address";

    public static final String COL_USER_ID = "user_id";

    public static final String COL_FIRST_CHOICE = "first_choice";

    public static final String COL_VERSION = "version";

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
     * 获取收货地址
     *
     * @return address - 收货地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置收货地址
     *
     * @param address 收货地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取是否默认
     *
     * @return first_choice - 是否默认
     */
    public Byte getFirstChoice() {
        return firstChoice;
    }

    /**
     * 设置是否默认
     *
     * @param firstChoice 是否默认
     */
    public void setFirstChoice(Byte firstChoice) {
        this.firstChoice = firstChoice;
    }

    /**
     * 获取乐观锁
     *
     * @return version - 乐观锁
     */
    public Long getVersion() {
        return version;
    }

    /**
     * 设置乐观锁
     *
     * @param version 乐观锁
     */
    public void setVersion(Long version) {
        this.version = version;
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
        ConsumerUserAddress other = (ConsumerUserAddress) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getFirstChoice() == null ? other.getFirstChoice() == null : this.getFirstChoice().equals(other.getFirstChoice()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getFirstChoice() == null) ? 0 : getFirstChoice().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return result;
    }
}