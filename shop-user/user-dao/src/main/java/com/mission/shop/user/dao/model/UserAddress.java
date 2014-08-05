package com.mission.shop.user.dao.model;

import java.io.Serializable;
import java.util.Date;

public class UserAddress implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_address.address_id
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private Long addressId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_address.user_id
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private Long userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_address.post_code
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private String postCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_address.address
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private String address;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_address.consignee
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private String consignee;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_address.phone_num
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private String phoneNum;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_address.province_id
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private Long provinceId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_address.city_id
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private Long cityId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_address.county_id
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private Long countyId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_address.status
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private Short status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_address.create_time
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_address.update_time
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user_address
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_address.address_id
	 * @return  the value of user_address.address_id
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public Long getAddressId() {
		return addressId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_address.address_id
	 * @param addressId  the value for user_address.address_id
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_address.user_id
	 * @return  the value of user_address.user_id
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_address.user_id
	 * @param userId  the value for user_address.user_id
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_address.post_code
	 * @return  the value of user_address.post_code
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_address.post_code
	 * @param postCode  the value for user_address.post_code
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode == null ? null : postCode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_address.address
	 * @return  the value of user_address.address
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_address.address
	 * @param address  the value for user_address.address
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_address.consignee
	 * @return  the value of user_address.consignee
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public String getConsignee() {
		return consignee;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_address.consignee
	 * @param consignee  the value for user_address.consignee
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public void setConsignee(String consignee) {
		this.consignee = consignee == null ? null : consignee.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_address.phone_num
	 * @return  the value of user_address.phone_num
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public String getPhoneNum() {
		return phoneNum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_address.phone_num
	 * @param phoneNum  the value for user_address.phone_num
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum == null ? null : phoneNum.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_address.province_id
	 * @return  the value of user_address.province_id
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public Long getProvinceId() {
		return provinceId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_address.province_id
	 * @param provinceId  the value for user_address.province_id
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_address.city_id
	 * @return  the value of user_address.city_id
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public Long getCityId() {
		return cityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_address.city_id
	 * @param cityId  the value for user_address.city_id
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_address.county_id
	 * @return  the value of user_address.county_id
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public Long getCountyId() {
		return countyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_address.county_id
	 * @param countyId  the value for user_address.county_id
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public void setCountyId(Long countyId) {
		this.countyId = countyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_address.status
	 * @return  the value of user_address.status
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public Short getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_address.status
	 * @param status  the value for user_address.status
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public void setStatus(Short status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_address.create_time
	 * @return  the value of user_address.create_time
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_address.create_time
	 * @param createTime  the value for user_address.create_time
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_address.update_time
	 * @return  the value of user_address.update_time
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_address.update_time
	 * @param updateTime  the value for user_address.update_time
	 * @mbggenerated  Sat Aug 02 20:57:04 CST 2014
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}