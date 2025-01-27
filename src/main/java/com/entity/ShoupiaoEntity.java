package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 售票
 *
 * @author 
 * @email
 * @date 2021-02-24
 */
@TableName("shoupiao")
public class ShoupiaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShoupiaoEntity() {

	}

	public ShoupiaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 车辆id
     */
    @TableField(value = "car_id")

    private String carId;


    /**
     * 售卖金额
     */
    @TableField(value = "actual_money")

    private Double actualMoney;


    /**
     * 售票状态
     */
    @TableField(value = "shoupiao_types")

    private Integer shoupiaoTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：车辆id
	 */
    public String getCarId() {
        return carId;
    }


    /**
	 * 获取：车辆id
	 */

    public void setCarId(String carId) {
        this.carId = carId;
    }
    /**
	 * 设置：售卖金额
	 */
    public Double getActualMoney() {
        return actualMoney;
    }


    /**
	 * 获取：售卖金额
	 */

    public void setActualMoney(Double actualMoney) {
        this.actualMoney = actualMoney;
    }
    /**
	 * 设置：售票状态
	 */
    public Integer getShoupiaoTypes() {
        return shoupiaoTypes;
    }


    /**
	 * 获取：售票状态
	 */

    public void setShoupiaoTypes(Integer shoupiaoTypes) {
        this.shoupiaoTypes = shoupiaoTypes;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Shoupiao{" +
            "id=" + id +
            ", carId=" + carId +
            ", actualMoney=" + actualMoney +
            ", shoupiaoTypes=" + shoupiaoTypes +
            ", createTime=" + createTime +
        "}";
    }
}
