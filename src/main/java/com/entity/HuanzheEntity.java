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
 * 患者
 *
 * @author 
 * @email
 */
@TableName("huanzhe")
public class HuanzheEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HuanzheEntity() {

	}

	public HuanzheEntity(T t) {
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
     * 患者姓名
     */
    @TableField(value = "huanzhe_name")

    private String huanzheName;


    /**
     * 患者手机号
     */
    @TableField(value = "huanzhe_phone")

    private String huanzhePhone;


    /**
     * 患者身份证号
     */
    @TableField(value = "huanzhe_id_number")

    private String huanzheIdNumber;


    /**
     * 患者头像
     */
    @TableField(value = "huanzhe_photo")

    private String huanzhePhoto;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 电子邮箱
     */
    @TableField(value = "huanzhe_email")

    private String huanzheEmail;


    /**
     * 患者住址
     */
    @TableField(value = "huanzhe_zhuzhi")

    private String huanzheZhuzhi;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 设置：患者姓名
	 */
    public String getHuanzheName() {
        return huanzheName;
    }
    /**
	 * 获取：患者姓名
	 */

    public void setHuanzheName(String huanzheName) {
        this.huanzheName = huanzheName;
    }
    /**
	 * 设置：患者手机号
	 */
    public String getHuanzhePhone() {
        return huanzhePhone;
    }
    /**
	 * 获取：患者手机号
	 */

    public void setHuanzhePhone(String huanzhePhone) {
        this.huanzhePhone = huanzhePhone;
    }
    /**
	 * 设置：患者身份证号
	 */
    public String getHuanzheIdNumber() {
        return huanzheIdNumber;
    }
    /**
	 * 获取：患者身份证号
	 */

    public void setHuanzheIdNumber(String huanzheIdNumber) {
        this.huanzheIdNumber = huanzheIdNumber;
    }
    /**
	 * 设置：患者头像
	 */
    public String getHuanzhePhoto() {
        return huanzhePhoto;
    }
    /**
	 * 获取：患者头像
	 */

    public void setHuanzhePhoto(String huanzhePhoto) {
        this.huanzhePhoto = huanzhePhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：电子邮箱
	 */
    public String getHuanzheEmail() {
        return huanzheEmail;
    }
    /**
	 * 获取：电子邮箱
	 */

    public void setHuanzheEmail(String huanzheEmail) {
        this.huanzheEmail = huanzheEmail;
    }
    /**
	 * 设置：患者住址
	 */
    public String getHuanzheZhuzhi() {
        return huanzheZhuzhi;
    }
    /**
	 * 获取：患者住址
	 */

    public void setHuanzheZhuzhi(String huanzheZhuzhi) {
        this.huanzheZhuzhi = huanzheZhuzhi;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        return "Huanzhe{" +
            "id=" + id +
            ", huanzheName=" + huanzheName +
            ", huanzhePhone=" + huanzhePhone +
            ", huanzheIdNumber=" + huanzheIdNumber +
            ", huanzhePhoto=" + huanzhePhoto +
            ", sexTypes=" + sexTypes +
            ", huanzheEmail=" + huanzheEmail +
            ", huanzheZhuzhi=" + huanzheZhuzhi +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
