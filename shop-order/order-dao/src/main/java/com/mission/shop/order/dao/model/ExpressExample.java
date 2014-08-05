package com.mission.shop.order.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExpressExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table express
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table express
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table express
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table express
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	public ExpressExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table express
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table express
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table express
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table express
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table express
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table express
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table express
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table express
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table express
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table express
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table express
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andExpressIdIsNull() {
			addCriterion("express_id is null");
			return (Criteria) this;
		}

		public Criteria andExpressIdIsNotNull() {
			addCriterion("express_id is not null");
			return (Criteria) this;
		}

		public Criteria andExpressIdEqualTo(Long value) {
			addCriterion("express_id =", value, "expressId");
			return (Criteria) this;
		}

		public Criteria andExpressIdNotEqualTo(Long value) {
			addCriterion("express_id <>", value, "expressId");
			return (Criteria) this;
		}

		public Criteria andExpressIdGreaterThan(Long value) {
			addCriterion("express_id >", value, "expressId");
			return (Criteria) this;
		}

		public Criteria andExpressIdGreaterThanOrEqualTo(Long value) {
			addCriterion("express_id >=", value, "expressId");
			return (Criteria) this;
		}

		public Criteria andExpressIdLessThan(Long value) {
			addCriterion("express_id <", value, "expressId");
			return (Criteria) this;
		}

		public Criteria andExpressIdLessThanOrEqualTo(Long value) {
			addCriterion("express_id <=", value, "expressId");
			return (Criteria) this;
		}

		public Criteria andExpressIdIn(List<Long> values) {
			addCriterion("express_id in", values, "expressId");
			return (Criteria) this;
		}

		public Criteria andExpressIdNotIn(List<Long> values) {
			addCriterion("express_id not in", values, "expressId");
			return (Criteria) this;
		}

		public Criteria andExpressIdBetween(Long value1, Long value2) {
			addCriterion("express_id between", value1, value2, "expressId");
			return (Criteria) this;
		}

		public Criteria andExpressIdNotBetween(Long value1, Long value2) {
			addCriterion("express_id not between", value1, value2, "expressId");
			return (Criteria) this;
		}

		public Criteria andExpressNameIsNull() {
			addCriterion("express_name is null");
			return (Criteria) this;
		}

		public Criteria andExpressNameIsNotNull() {
			addCriterion("express_name is not null");
			return (Criteria) this;
		}

		public Criteria andExpressNameEqualTo(String value) {
			addCriterion("express_name =", value, "expressName");
			return (Criteria) this;
		}

		public Criteria andExpressNameNotEqualTo(String value) {
			addCriterion("express_name <>", value, "expressName");
			return (Criteria) this;
		}

		public Criteria andExpressNameGreaterThan(String value) {
			addCriterion("express_name >", value, "expressName");
			return (Criteria) this;
		}

		public Criteria andExpressNameGreaterThanOrEqualTo(String value) {
			addCriterion("express_name >=", value, "expressName");
			return (Criteria) this;
		}

		public Criteria andExpressNameLessThan(String value) {
			addCriterion("express_name <", value, "expressName");
			return (Criteria) this;
		}

		public Criteria andExpressNameLessThanOrEqualTo(String value) {
			addCriterion("express_name <=", value, "expressName");
			return (Criteria) this;
		}

		public Criteria andExpressNameLike(String value) {
			addCriterion("express_name like", value, "expressName");
			return (Criteria) this;
		}

		public Criteria andExpressNameNotLike(String value) {
			addCriterion("express_name not like", value, "expressName");
			return (Criteria) this;
		}

		public Criteria andExpressNameIn(List<String> values) {
			addCriterion("express_name in", values, "expressName");
			return (Criteria) this;
		}

		public Criteria andExpressNameNotIn(List<String> values) {
			addCriterion("express_name not in", values, "expressName");
			return (Criteria) this;
		}

		public Criteria andExpressNameBetween(String value1, String value2) {
			addCriterion("express_name between", value1, value2, "expressName");
			return (Criteria) this;
		}

		public Criteria andExpressNameNotBetween(String value1, String value2) {
			addCriterion("express_name not between", value1, value2,
					"expressName");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(Short value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(Short value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(Short value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(Short value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(Short value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(Short value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<Short> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<Short> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(Short value1, Short value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(Short value1, Short value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("create_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(Date value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(Date value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(Date value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("create_time >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(Date value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<Date> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<Date> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(Date value1, Date value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("create_time not between", value1, value2,
					"createTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNull() {
			addCriterion("update_time is null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNotNull() {
			addCriterion("update_time is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeEqualTo(Date value) {
			addCriterion("update_time =", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotEqualTo(Date value) {
			addCriterion("update_time <>", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThan(Date value) {
			addCriterion("update_time >", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("update_time >=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThan(Date value) {
			addCriterion("update_time <", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
			addCriterion("update_time <=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIn(List<Date> values) {
			addCriterion("update_time in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotIn(List<Date> values) {
			addCriterion("update_time not in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBetween(Date value1, Date value2) {
			addCriterion("update_time between", value1, value2, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
			addCriterion("update_time not between", value1, value2,
					"updateTime");
			return (Criteria) this;
		}

		public Criteria andTelephoneIsNull() {
			addCriterion("telephone is null");
			return (Criteria) this;
		}

		public Criteria andTelephoneIsNotNull() {
			addCriterion("telephone is not null");
			return (Criteria) this;
		}

		public Criteria andTelephoneEqualTo(String value) {
			addCriterion("telephone =", value, "telephone");
			return (Criteria) this;
		}

		public Criteria andTelephoneNotEqualTo(String value) {
			addCriterion("telephone <>", value, "telephone");
			return (Criteria) this;
		}

		public Criteria andTelephoneGreaterThan(String value) {
			addCriterion("telephone >", value, "telephone");
			return (Criteria) this;
		}

		public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
			addCriterion("telephone >=", value, "telephone");
			return (Criteria) this;
		}

		public Criteria andTelephoneLessThan(String value) {
			addCriterion("telephone <", value, "telephone");
			return (Criteria) this;
		}

		public Criteria andTelephoneLessThanOrEqualTo(String value) {
			addCriterion("telephone <=", value, "telephone");
			return (Criteria) this;
		}

		public Criteria andTelephoneLike(String value) {
			addCriterion("telephone like", value, "telephone");
			return (Criteria) this;
		}

		public Criteria andTelephoneNotLike(String value) {
			addCriterion("telephone not like", value, "telephone");
			return (Criteria) this;
		}

		public Criteria andTelephoneIn(List<String> values) {
			addCriterion("telephone in", values, "telephone");
			return (Criteria) this;
		}

		public Criteria andTelephoneNotIn(List<String> values) {
			addCriterion("telephone not in", values, "telephone");
			return (Criteria) this;
		}

		public Criteria andTelephoneBetween(String value1, String value2) {
			addCriterion("telephone between", value1, value2, "telephone");
			return (Criteria) this;
		}

		public Criteria andTelephoneNotBetween(String value1, String value2) {
			addCriterion("telephone not between", value1, value2, "telephone");
			return (Criteria) this;
		}

		public Criteria andContactIsNull() {
			addCriterion("contact is null");
			return (Criteria) this;
		}

		public Criteria andContactIsNotNull() {
			addCriterion("contact is not null");
			return (Criteria) this;
		}

		public Criteria andContactEqualTo(String value) {
			addCriterion("contact =", value, "contact");
			return (Criteria) this;
		}

		public Criteria andContactNotEqualTo(String value) {
			addCriterion("contact <>", value, "contact");
			return (Criteria) this;
		}

		public Criteria andContactGreaterThan(String value) {
			addCriterion("contact >", value, "contact");
			return (Criteria) this;
		}

		public Criteria andContactGreaterThanOrEqualTo(String value) {
			addCriterion("contact >=", value, "contact");
			return (Criteria) this;
		}

		public Criteria andContactLessThan(String value) {
			addCriterion("contact <", value, "contact");
			return (Criteria) this;
		}

		public Criteria andContactLessThanOrEqualTo(String value) {
			addCriterion("contact <=", value, "contact");
			return (Criteria) this;
		}

		public Criteria andContactLike(String value) {
			addCriterion("contact like", value, "contact");
			return (Criteria) this;
		}

		public Criteria andContactNotLike(String value) {
			addCriterion("contact not like", value, "contact");
			return (Criteria) this;
		}

		public Criteria andContactIn(List<String> values) {
			addCriterion("contact in", values, "contact");
			return (Criteria) this;
		}

		public Criteria andContactNotIn(List<String> values) {
			addCriterion("contact not in", values, "contact");
			return (Criteria) this;
		}

		public Criteria andContactBetween(String value1, String value2) {
			addCriterion("contact between", value1, value2, "contact");
			return (Criteria) this;
		}

		public Criteria andContactNotBetween(String value1, String value2) {
			addCriterion("contact not between", value1, value2, "contact");
			return (Criteria) this;
		}

		public Criteria andContactPhoneNumIsNull() {
			addCriterion("contact_phone_num is null");
			return (Criteria) this;
		}

		public Criteria andContactPhoneNumIsNotNull() {
			addCriterion("contact_phone_num is not null");
			return (Criteria) this;
		}

		public Criteria andContactPhoneNumEqualTo(String value) {
			addCriterion("contact_phone_num =", value, "contactPhoneNum");
			return (Criteria) this;
		}

		public Criteria andContactPhoneNumNotEqualTo(String value) {
			addCriterion("contact_phone_num <>", value, "contactPhoneNum");
			return (Criteria) this;
		}

		public Criteria andContactPhoneNumGreaterThan(String value) {
			addCriterion("contact_phone_num >", value, "contactPhoneNum");
			return (Criteria) this;
		}

		public Criteria andContactPhoneNumGreaterThanOrEqualTo(String value) {
			addCriterion("contact_phone_num >=", value, "contactPhoneNum");
			return (Criteria) this;
		}

		public Criteria andContactPhoneNumLessThan(String value) {
			addCriterion("contact_phone_num <", value, "contactPhoneNum");
			return (Criteria) this;
		}

		public Criteria andContactPhoneNumLessThanOrEqualTo(String value) {
			addCriterion("contact_phone_num <=", value, "contactPhoneNum");
			return (Criteria) this;
		}

		public Criteria andContactPhoneNumLike(String value) {
			addCriterion("contact_phone_num like", value, "contactPhoneNum");
			return (Criteria) this;
		}

		public Criteria andContactPhoneNumNotLike(String value) {
			addCriterion("contact_phone_num not like", value, "contactPhoneNum");
			return (Criteria) this;
		}

		public Criteria andContactPhoneNumIn(List<String> values) {
			addCriterion("contact_phone_num in", values, "contactPhoneNum");
			return (Criteria) this;
		}

		public Criteria andContactPhoneNumNotIn(List<String> values) {
			addCriterion("contact_phone_num not in", values, "contactPhoneNum");
			return (Criteria) this;
		}

		public Criteria andContactPhoneNumBetween(String value1, String value2) {
			addCriterion("contact_phone_num between", value1, value2,
					"contactPhoneNum");
			return (Criteria) this;
		}

		public Criteria andContactPhoneNumNotBetween(String value1,
				String value2) {
			addCriterion("contact_phone_num not between", value1, value2,
					"contactPhoneNum");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table express
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table express
     *
     * @mbggenerated do_not_delete_during_merge Thu Jul 17 21:42:51 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}