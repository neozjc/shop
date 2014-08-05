package com.mission.shop.product.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttributeExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table attribute
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table attribute
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table attribute
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attribute
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	public AttributeExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attribute
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attribute
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attribute
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attribute
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attribute
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attribute
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attribute
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attribute
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attribute
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attribute
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table attribute
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
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

		public Criteria andAttrIdIsNull() {
			addCriterion("attr_id is null");
			return (Criteria) this;
		}

		public Criteria andAttrIdIsNotNull() {
			addCriterion("attr_id is not null");
			return (Criteria) this;
		}

		public Criteria andAttrIdEqualTo(Long value) {
			addCriterion("attr_id =", value, "attrId");
			return (Criteria) this;
		}

		public Criteria andAttrIdNotEqualTo(Long value) {
			addCriterion("attr_id <>", value, "attrId");
			return (Criteria) this;
		}

		public Criteria andAttrIdGreaterThan(Long value) {
			addCriterion("attr_id >", value, "attrId");
			return (Criteria) this;
		}

		public Criteria andAttrIdGreaterThanOrEqualTo(Long value) {
			addCriterion("attr_id >=", value, "attrId");
			return (Criteria) this;
		}

		public Criteria andAttrIdLessThan(Long value) {
			addCriterion("attr_id <", value, "attrId");
			return (Criteria) this;
		}

		public Criteria andAttrIdLessThanOrEqualTo(Long value) {
			addCriterion("attr_id <=", value, "attrId");
			return (Criteria) this;
		}

		public Criteria andAttrIdIn(List<Long> values) {
			addCriterion("attr_id in", values, "attrId");
			return (Criteria) this;
		}

		public Criteria andAttrIdNotIn(List<Long> values) {
			addCriterion("attr_id not in", values, "attrId");
			return (Criteria) this;
		}

		public Criteria andAttrIdBetween(Long value1, Long value2) {
			addCriterion("attr_id between", value1, value2, "attrId");
			return (Criteria) this;
		}

		public Criteria andAttrIdNotBetween(Long value1, Long value2) {
			addCriterion("attr_id not between", value1, value2, "attrId");
			return (Criteria) this;
		}

		public Criteria andAttrGroupIdIsNull() {
			addCriterion("attr_group_id is null");
			return (Criteria) this;
		}

		public Criteria andAttrGroupIdIsNotNull() {
			addCriterion("attr_group_id is not null");
			return (Criteria) this;
		}

		public Criteria andAttrGroupIdEqualTo(Long value) {
			addCriterion("attr_group_id =", value, "attrGroupId");
			return (Criteria) this;
		}

		public Criteria andAttrGroupIdNotEqualTo(Long value) {
			addCriterion("attr_group_id <>", value, "attrGroupId");
			return (Criteria) this;
		}

		public Criteria andAttrGroupIdGreaterThan(Long value) {
			addCriterion("attr_group_id >", value, "attrGroupId");
			return (Criteria) this;
		}

		public Criteria andAttrGroupIdGreaterThanOrEqualTo(Long value) {
			addCriterion("attr_group_id >=", value, "attrGroupId");
			return (Criteria) this;
		}

		public Criteria andAttrGroupIdLessThan(Long value) {
			addCriterion("attr_group_id <", value, "attrGroupId");
			return (Criteria) this;
		}

		public Criteria andAttrGroupIdLessThanOrEqualTo(Long value) {
			addCriterion("attr_group_id <=", value, "attrGroupId");
			return (Criteria) this;
		}

		public Criteria andAttrGroupIdIn(List<Long> values) {
			addCriterion("attr_group_id in", values, "attrGroupId");
			return (Criteria) this;
		}

		public Criteria andAttrGroupIdNotIn(List<Long> values) {
			addCriterion("attr_group_id not in", values, "attrGroupId");
			return (Criteria) this;
		}

		public Criteria andAttrGroupIdBetween(Long value1, Long value2) {
			addCriterion("attr_group_id between", value1, value2, "attrGroupId");
			return (Criteria) this;
		}

		public Criteria andAttrGroupIdNotBetween(Long value1, Long value2) {
			addCriterion("attr_group_id not between", value1, value2,
					"attrGroupId");
			return (Criteria) this;
		}

		public Criteria andKindIdIsNull() {
			addCriterion("kind_id is null");
			return (Criteria) this;
		}

		public Criteria andKindIdIsNotNull() {
			addCriterion("kind_id is not null");
			return (Criteria) this;
		}

		public Criteria andKindIdEqualTo(Long value) {
			addCriterion("kind_id =", value, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdNotEqualTo(Long value) {
			addCriterion("kind_id <>", value, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdGreaterThan(Long value) {
			addCriterion("kind_id >", value, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdGreaterThanOrEqualTo(Long value) {
			addCriterion("kind_id >=", value, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdLessThan(Long value) {
			addCriterion("kind_id <", value, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdLessThanOrEqualTo(Long value) {
			addCriterion("kind_id <=", value, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdIn(List<Long> values) {
			addCriterion("kind_id in", values, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdNotIn(List<Long> values) {
			addCriterion("kind_id not in", values, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdBetween(Long value1, Long value2) {
			addCriterion("kind_id between", value1, value2, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdNotBetween(Long value1, Long value2) {
			addCriterion("kind_id not between", value1, value2, "kindId");
			return (Criteria) this;
		}

		public Criteria andAttrNameIsNull() {
			addCriterion("attr_name is null");
			return (Criteria) this;
		}

		public Criteria andAttrNameIsNotNull() {
			addCriterion("attr_name is not null");
			return (Criteria) this;
		}

		public Criteria andAttrNameEqualTo(String value) {
			addCriterion("attr_name =", value, "attrName");
			return (Criteria) this;
		}

		public Criteria andAttrNameNotEqualTo(String value) {
			addCriterion("attr_name <>", value, "attrName");
			return (Criteria) this;
		}

		public Criteria andAttrNameGreaterThan(String value) {
			addCriterion("attr_name >", value, "attrName");
			return (Criteria) this;
		}

		public Criteria andAttrNameGreaterThanOrEqualTo(String value) {
			addCriterion("attr_name >=", value, "attrName");
			return (Criteria) this;
		}

		public Criteria andAttrNameLessThan(String value) {
			addCriterion("attr_name <", value, "attrName");
			return (Criteria) this;
		}

		public Criteria andAttrNameLessThanOrEqualTo(String value) {
			addCriterion("attr_name <=", value, "attrName");
			return (Criteria) this;
		}

		public Criteria andAttrNameLike(String value) {
			addCriterion("attr_name like", value, "attrName");
			return (Criteria) this;
		}

		public Criteria andAttrNameNotLike(String value) {
			addCriterion("attr_name not like", value, "attrName");
			return (Criteria) this;
		}

		public Criteria andAttrNameIn(List<String> values) {
			addCriterion("attr_name in", values, "attrName");
			return (Criteria) this;
		}

		public Criteria andAttrNameNotIn(List<String> values) {
			addCriterion("attr_name not in", values, "attrName");
			return (Criteria) this;
		}

		public Criteria andAttrNameBetween(String value1, String value2) {
			addCriterion("attr_name between", value1, value2, "attrName");
			return (Criteria) this;
		}

		public Criteria andAttrNameNotBetween(String value1, String value2) {
			addCriterion("attr_name not between", value1, value2, "attrName");
			return (Criteria) this;
		}

		public Criteria andAttrValuesIsNull() {
			addCriterion("attr_values is null");
			return (Criteria) this;
		}

		public Criteria andAttrValuesIsNotNull() {
			addCriterion("attr_values is not null");
			return (Criteria) this;
		}

		public Criteria andAttrValuesEqualTo(String value) {
			addCriterion("attr_values =", value, "attrValues");
			return (Criteria) this;
		}

		public Criteria andAttrValuesNotEqualTo(String value) {
			addCriterion("attr_values <>", value, "attrValues");
			return (Criteria) this;
		}

		public Criteria andAttrValuesGreaterThan(String value) {
			addCriterion("attr_values >", value, "attrValues");
			return (Criteria) this;
		}

		public Criteria andAttrValuesGreaterThanOrEqualTo(String value) {
			addCriterion("attr_values >=", value, "attrValues");
			return (Criteria) this;
		}

		public Criteria andAttrValuesLessThan(String value) {
			addCriterion("attr_values <", value, "attrValues");
			return (Criteria) this;
		}

		public Criteria andAttrValuesLessThanOrEqualTo(String value) {
			addCriterion("attr_values <=", value, "attrValues");
			return (Criteria) this;
		}

		public Criteria andAttrValuesLike(String value) {
			addCriterion("attr_values like", value, "attrValues");
			return (Criteria) this;
		}

		public Criteria andAttrValuesNotLike(String value) {
			addCriterion("attr_values not like", value, "attrValues");
			return (Criteria) this;
		}

		public Criteria andAttrValuesIn(List<String> values) {
			addCriterion("attr_values in", values, "attrValues");
			return (Criteria) this;
		}

		public Criteria andAttrValuesNotIn(List<String> values) {
			addCriterion("attr_values not in", values, "attrValues");
			return (Criteria) this;
		}

		public Criteria andAttrValuesBetween(String value1, String value2) {
			addCriterion("attr_values between", value1, value2, "attrValues");
			return (Criteria) this;
		}

		public Criteria andAttrValuesNotBetween(String value1, String value2) {
			addCriterion("attr_values not between", value1, value2,
					"attrValues");
			return (Criteria) this;
		}

		public Criteria andAttrTypeIsNull() {
			addCriterion("attr_type is null");
			return (Criteria) this;
		}

		public Criteria andAttrTypeIsNotNull() {
			addCriterion("attr_type is not null");
			return (Criteria) this;
		}

		public Criteria andAttrTypeEqualTo(Short value) {
			addCriterion("attr_type =", value, "attrType");
			return (Criteria) this;
		}

		public Criteria andAttrTypeNotEqualTo(Short value) {
			addCriterion("attr_type <>", value, "attrType");
			return (Criteria) this;
		}

		public Criteria andAttrTypeGreaterThan(Short value) {
			addCriterion("attr_type >", value, "attrType");
			return (Criteria) this;
		}

		public Criteria andAttrTypeGreaterThanOrEqualTo(Short value) {
			addCriterion("attr_type >=", value, "attrType");
			return (Criteria) this;
		}

		public Criteria andAttrTypeLessThan(Short value) {
			addCriterion("attr_type <", value, "attrType");
			return (Criteria) this;
		}

		public Criteria andAttrTypeLessThanOrEqualTo(Short value) {
			addCriterion("attr_type <=", value, "attrType");
			return (Criteria) this;
		}

		public Criteria andAttrTypeIn(List<Short> values) {
			addCriterion("attr_type in", values, "attrType");
			return (Criteria) this;
		}

		public Criteria andAttrTypeNotIn(List<Short> values) {
			addCriterion("attr_type not in", values, "attrType");
			return (Criteria) this;
		}

		public Criteria andAttrTypeBetween(Short value1, Short value2) {
			addCriterion("attr_type between", value1, value2, "attrType");
			return (Criteria) this;
		}

		public Criteria andAttrTypeNotBetween(Short value1, Short value2) {
			addCriterion("attr_type not between", value1, value2, "attrType");
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
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table attribute
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
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
     * This class corresponds to the database table attribute
     *
     * @mbggenerated do_not_delete_during_merge Thu Jun 12 11:22:43 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}