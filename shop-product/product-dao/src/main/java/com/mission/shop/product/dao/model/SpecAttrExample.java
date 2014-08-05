package com.mission.shop.product.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpecAttrExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table spec_attr
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table spec_attr
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table spec_attr
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table spec_attr
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	public SpecAttrExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table spec_attr
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table spec_attr
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table spec_attr
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table spec_attr
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table spec_attr
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table spec_attr
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table spec_attr
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table spec_attr
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table spec_attr
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table spec_attr
	 * @mbggenerated  Mon Jul 28 21:25:09 CST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table spec_attr
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

		public Criteria andSpecIdIsNull() {
			addCriterion("spec_id is null");
			return (Criteria) this;
		}

		public Criteria andSpecIdIsNotNull() {
			addCriterion("spec_id is not null");
			return (Criteria) this;
		}

		public Criteria andSpecIdEqualTo(Long value) {
			addCriterion("spec_id =", value, "specId");
			return (Criteria) this;
		}

		public Criteria andSpecIdNotEqualTo(Long value) {
			addCriterion("spec_id <>", value, "specId");
			return (Criteria) this;
		}

		public Criteria andSpecIdGreaterThan(Long value) {
			addCriterion("spec_id >", value, "specId");
			return (Criteria) this;
		}

		public Criteria andSpecIdGreaterThanOrEqualTo(Long value) {
			addCriterion("spec_id >=", value, "specId");
			return (Criteria) this;
		}

		public Criteria andSpecIdLessThan(Long value) {
			addCriterion("spec_id <", value, "specId");
			return (Criteria) this;
		}

		public Criteria andSpecIdLessThanOrEqualTo(Long value) {
			addCriterion("spec_id <=", value, "specId");
			return (Criteria) this;
		}

		public Criteria andSpecIdIn(List<Long> values) {
			addCriterion("spec_id in", values, "specId");
			return (Criteria) this;
		}

		public Criteria andSpecIdNotIn(List<Long> values) {
			addCriterion("spec_id not in", values, "specId");
			return (Criteria) this;
		}

		public Criteria andSpecIdBetween(Long value1, Long value2) {
			addCriterion("spec_id between", value1, value2, "specId");
			return (Criteria) this;
		}

		public Criteria andSpecIdNotBetween(Long value1, Long value2) {
			addCriterion("spec_id not between", value1, value2, "specId");
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

		public Criteria andSpecNameIsNull() {
			addCriterion("spec_name is null");
			return (Criteria) this;
		}

		public Criteria andSpecNameIsNotNull() {
			addCriterion("spec_name is not null");
			return (Criteria) this;
		}

		public Criteria andSpecNameEqualTo(String value) {
			addCriterion("spec_name =", value, "specName");
			return (Criteria) this;
		}

		public Criteria andSpecNameNotEqualTo(String value) {
			addCriterion("spec_name <>", value, "specName");
			return (Criteria) this;
		}

		public Criteria andSpecNameGreaterThan(String value) {
			addCriterion("spec_name >", value, "specName");
			return (Criteria) this;
		}

		public Criteria andSpecNameGreaterThanOrEqualTo(String value) {
			addCriterion("spec_name >=", value, "specName");
			return (Criteria) this;
		}

		public Criteria andSpecNameLessThan(String value) {
			addCriterion("spec_name <", value, "specName");
			return (Criteria) this;
		}

		public Criteria andSpecNameLessThanOrEqualTo(String value) {
			addCriterion("spec_name <=", value, "specName");
			return (Criteria) this;
		}

		public Criteria andSpecNameLike(String value) {
			addCriterion("spec_name like", value, "specName");
			return (Criteria) this;
		}

		public Criteria andSpecNameNotLike(String value) {
			addCriterion("spec_name not like", value, "specName");
			return (Criteria) this;
		}

		public Criteria andSpecNameIn(List<String> values) {
			addCriterion("spec_name in", values, "specName");
			return (Criteria) this;
		}

		public Criteria andSpecNameNotIn(List<String> values) {
			addCriterion("spec_name not in", values, "specName");
			return (Criteria) this;
		}

		public Criteria andSpecNameBetween(String value1, String value2) {
			addCriterion("spec_name between", value1, value2, "specName");
			return (Criteria) this;
		}

		public Criteria andSpecNameNotBetween(String value1, String value2) {
			addCriterion("spec_name not between", value1, value2, "specName");
			return (Criteria) this;
		}

		public Criteria andSpecValuesIsNull() {
			addCriterion("spec_values is null");
			return (Criteria) this;
		}

		public Criteria andSpecValuesIsNotNull() {
			addCriterion("spec_values is not null");
			return (Criteria) this;
		}

		public Criteria andSpecValuesEqualTo(String value) {
			addCriterion("spec_values =", value, "specValues");
			return (Criteria) this;
		}

		public Criteria andSpecValuesNotEqualTo(String value) {
			addCriterion("spec_values <>", value, "specValues");
			return (Criteria) this;
		}

		public Criteria andSpecValuesGreaterThan(String value) {
			addCriterion("spec_values >", value, "specValues");
			return (Criteria) this;
		}

		public Criteria andSpecValuesGreaterThanOrEqualTo(String value) {
			addCriterion("spec_values >=", value, "specValues");
			return (Criteria) this;
		}

		public Criteria andSpecValuesLessThan(String value) {
			addCriterion("spec_values <", value, "specValues");
			return (Criteria) this;
		}

		public Criteria andSpecValuesLessThanOrEqualTo(String value) {
			addCriterion("spec_values <=", value, "specValues");
			return (Criteria) this;
		}

		public Criteria andSpecValuesLike(String value) {
			addCriterion("spec_values like", value, "specValues");
			return (Criteria) this;
		}

		public Criteria andSpecValuesNotLike(String value) {
			addCriterion("spec_values not like", value, "specValues");
			return (Criteria) this;
		}

		public Criteria andSpecValuesIn(List<String> values) {
			addCriterion("spec_values in", values, "specValues");
			return (Criteria) this;
		}

		public Criteria andSpecValuesNotIn(List<String> values) {
			addCriterion("spec_values not in", values, "specValues");
			return (Criteria) this;
		}

		public Criteria andSpecValuesBetween(String value1, String value2) {
			addCriterion("spec_values between", value1, value2, "specValues");
			return (Criteria) this;
		}

		public Criteria andSpecValuesNotBetween(String value1, String value2) {
			addCriterion("spec_values not between", value1, value2,
					"specValues");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table spec_attr
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
     * This class corresponds to the database table spec_attr
     *
     * @mbggenerated do_not_delete_during_merge Thu Jun 12 11:22:44 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}