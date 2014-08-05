package com.mission.shop.user.dao.model;

import java.io.Serializable;
import java.util.Date;

public class UserIntegeral implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_integeral.id
     *
     * @mbggenerated Sat Aug 02 20:57:04 CST 2014
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_integeral.user_id
     *
     * @mbggenerated Sat Aug 02 20:57:04 CST 2014
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_integeral.order_id
     *
     * @mbggenerated Sat Aug 02 20:57:04 CST 2014
     */
    private Long orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_integeral.user_name
     *
     * @mbggenerated Sat Aug 02 20:57:04 CST 2014
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_integeral.create_time
     *
     * @mbggenerated Sat Aug 02 20:57:04 CST 2014
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_integeral.integral
     *
     * @mbggenerated Sat Aug 02 20:57:04 CST 2014
     */
    private Integer integral;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_integeral.type
     *
     * @mbggenerated Sat Aug 02 20:57:04 CST 2014
     */
    private Short type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_integeral.remark
     *
     * @mbggenerated Sat Aug 02 20:57:04 CST 2014
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_integeral
     *
     * @mbggenerated Sat Aug 02 20:57:04 CST 2014
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_integeral.id
     *
     * @return the value of user_integeral.id
     *
     * @mbggenerated Sat Aug 02 20:57:04 CST 2014
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_integeral.id
     *
     * @param id the value for user_integeral.id
     *
     * @mbggenerated Sat Aug 02 20:57:04 CST 2014
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_integeral.user_id
     *
     * @return the value of user_integeral.user_id
     *
     * @mbggenerated Sat Aug 02 20:57:04 CST 2014
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_integeral.user_id
     *
     * @param userId the value for user_integeral.user_id
     *
     * @mbggenerated Sat Aug 02 20:57:04 CST 2014
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_integeral.order_id
     *
     * @return the value of user_integeral.order_id
     *
     * @mbggenerated Sat Aug 02 20:57:04 CST 2014
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_integeral.order_id
     *
     * @param orderId the value for user_integeral.order_id
     *
     * @mbggenerated Sat Aug 02 20:57:04 CST 2014
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_integeral.user_name
     *
     * @return the value of user_integeral.user_name
     *
     * @mbggenerated Sat Aug 02 20:57:04 CST 2014
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_integeral.user_name
     *
     * @param userName the value for user_integeral.user_name
     *
     * @mbggenerated Sat Aug 02 20:57:04 CST 2014
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_integeral.create_time
     *
     * @return the value of user_integeral.create_time
     *
     * @mbggenerated Sat Aug 02 20:57:04 CST 2014
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_integeral.create_time
     *
     * @param createTime the value for user_integeral.create_time
     *
     * @mbggenerated Sat Aug 02 20:57:04 CST 2014
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_integeral.integral
     *
     * @return the value of user_integeral.integral
     *
     * @mbggenerated Sat Aug 02 20:57:04 CST 2014
     */
    public Integer getIntegral() {
        return integral;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_integeral.integral
     *
     * @param integral the value for user_integeral.integral
     *
     * @mbggenerated Sat Aug 02 20:57:04 CST 2014
     */
    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_integeral.type
     *
     * @return the value of user_integeral.type
     *
     * @mbggenerated Sat Aug 02 20:57:04 CST 2014
     */
    public Short getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_integeral.type
     *
     * @param type the value for user_integeral.type
     *
     * @mbggenerated Sat Aug 02 20:57:04 CST 2014
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_integeral.remark
     *
     * @return the value of user_integeral.remark
     *
     * @mbggenerated Sat Aug 02 20:57:04 CST 2014
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_integeral.remark
     *
     * @param remark the value for user_integeral.remark
     *
     * @mbggenerated Sat Aug 02 20:57:04 CST 2014
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}