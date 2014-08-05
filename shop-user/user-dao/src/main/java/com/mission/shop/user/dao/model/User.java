package com.mission.shop.user.dao.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.user_id
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private Long userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.rank_id
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private Long rankId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.user_name
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private String userName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.user_real_name
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private String userRealName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.phone_num
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private String phoneNum;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.mail
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private String mail;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.sex
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private String sex;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.status
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private Short status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.integral
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private Integer integral;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.create_time
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.update_time
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.version
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private Integer version;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.user_id
	 * @return  the value of user.user_id
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.user_id
	 * @param userId  the value for user.user_id
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.rank_id
	 * @return  the value of user.rank_id
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public Long getRankId() {
		return rankId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.rank_id
	 * @param rankId  the value for user.rank_id
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public void setRankId(Long rankId) {
		this.rankId = rankId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.user_name
	 * @return  the value of user.user_name
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.user_name
	 * @param userName  the value for user.user_name
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.user_real_name
	 * @return  the value of user.user_real_name
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public String getUserRealName() {
		return userRealName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.user_real_name
	 * @param userRealName  the value for user.user_real_name
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName == null ? null : userRealName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.phone_num
	 * @return  the value of user.phone_num
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public String getPhoneNum() {
		return phoneNum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.phone_num
	 * @param phoneNum  the value for user.phone_num
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum == null ? null : phoneNum.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.mail
	 * @return  the value of user.mail
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.mail
	 * @param mail  the value for user.mail
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public void setMail(String mail) {
		this.mail = mail == null ? null : mail.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.sex
	 * @return  the value of user.sex
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.sex
	 * @param sex  the value for user.sex
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public void setSex(String sex) {
		this.sex = sex == null ? null : sex.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.status
	 * @return  the value of user.status
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public Short getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.status
	 * @param status  the value for user.status
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public void setStatus(Short status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.integral
	 * @return  the value of user.integral
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public Integer getIntegral() {
		return integral;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.integral
	 * @param integral  the value for user.integral
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.create_time
	 * @return  the value of user.create_time
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.create_time
	 * @param createTime  the value for user.create_time
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.update_time
	 * @return  the value of user.update_time
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.update_time
	 * @param updateTime  the value for user.update_time
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.version
	 * @return  the value of user.version
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public Integer getVersion() {
		return version;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.version
	 * @param version  the value for user.version
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}
}