package com.llsfw.webgen.model.standard.permissions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TsPortalCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TS_PORTAL
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TS_PORTAL
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TS_PORTAL
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PORTAL
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    public TsPortalCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PORTAL
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PORTAL
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PORTAL
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PORTAL
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PORTAL
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PORTAL
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PORTAL
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PORTAL
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PORTAL
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PORTAL
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TS_PORTAL
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFunctionCodeIsNull() {
            addCriterion("FUNCTION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIsNotNull() {
            addCriterion("FUNCTION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeEqualTo(String value) {
            addCriterion("FUNCTION_CODE =", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotEqualTo(String value) {
            addCriterion("FUNCTION_CODE <>", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeGreaterThan(String value) {
            addCriterion("FUNCTION_CODE >", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTION_CODE >=", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLessThan(String value) {
            addCriterion("FUNCTION_CODE <", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLessThanOrEqualTo(String value) {
            addCriterion("FUNCTION_CODE <=", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLike(String value) {
            addCriterion("FUNCTION_CODE like", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotLike(String value) {
            addCriterion("FUNCTION_CODE not like", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIn(List<String> values) {
            addCriterion("FUNCTION_CODE in", values, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotIn(List<String> values) {
            addCriterion("FUNCTION_CODE not in", values, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeBetween(String value1, String value2) {
            addCriterion("FUNCTION_CODE between", value1, value2, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotBetween(String value1, String value2) {
            addCriterion("FUNCTION_CODE not between", value1, value2, "functionCode");
            return (Criteria) this;
        }

        public Criteria andPortalCodeIsNull() {
            addCriterion("PORTAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPortalCodeIsNotNull() {
            addCriterion("PORTAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPortalCodeEqualTo(String value) {
            addCriterion("PORTAL_CODE =", value, "portalCode");
            return (Criteria) this;
        }

        public Criteria andPortalCodeNotEqualTo(String value) {
            addCriterion("PORTAL_CODE <>", value, "portalCode");
            return (Criteria) this;
        }

        public Criteria andPortalCodeGreaterThan(String value) {
            addCriterion("PORTAL_CODE >", value, "portalCode");
            return (Criteria) this;
        }

        public Criteria andPortalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PORTAL_CODE >=", value, "portalCode");
            return (Criteria) this;
        }

        public Criteria andPortalCodeLessThan(String value) {
            addCriterion("PORTAL_CODE <", value, "portalCode");
            return (Criteria) this;
        }

        public Criteria andPortalCodeLessThanOrEqualTo(String value) {
            addCriterion("PORTAL_CODE <=", value, "portalCode");
            return (Criteria) this;
        }

        public Criteria andPortalCodeLike(String value) {
            addCriterion("PORTAL_CODE like", value, "portalCode");
            return (Criteria) this;
        }

        public Criteria andPortalCodeNotLike(String value) {
            addCriterion("PORTAL_CODE not like", value, "portalCode");
            return (Criteria) this;
        }

        public Criteria andPortalCodeIn(List<String> values) {
            addCriterion("PORTAL_CODE in", values, "portalCode");
            return (Criteria) this;
        }

        public Criteria andPortalCodeNotIn(List<String> values) {
            addCriterion("PORTAL_CODE not in", values, "portalCode");
            return (Criteria) this;
        }

        public Criteria andPortalCodeBetween(String value1, String value2) {
            addCriterion("PORTAL_CODE between", value1, value2, "portalCode");
            return (Criteria) this;
        }

        public Criteria andPortalCodeNotBetween(String value1, String value2) {
            addCriterion("PORTAL_CODE not between", value1, value2, "portalCode");
            return (Criteria) this;
        }

        public Criteria andPortalTitleIsNull() {
            addCriterion("PORTAL_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andPortalTitleIsNotNull() {
            addCriterion("PORTAL_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andPortalTitleEqualTo(String value) {
            addCriterion("PORTAL_TITLE =", value, "portalTitle");
            return (Criteria) this;
        }

        public Criteria andPortalTitleNotEqualTo(String value) {
            addCriterion("PORTAL_TITLE <>", value, "portalTitle");
            return (Criteria) this;
        }

        public Criteria andPortalTitleGreaterThan(String value) {
            addCriterion("PORTAL_TITLE >", value, "portalTitle");
            return (Criteria) this;
        }

        public Criteria andPortalTitleGreaterThanOrEqualTo(String value) {
            addCriterion("PORTAL_TITLE >=", value, "portalTitle");
            return (Criteria) this;
        }

        public Criteria andPortalTitleLessThan(String value) {
            addCriterion("PORTAL_TITLE <", value, "portalTitle");
            return (Criteria) this;
        }

        public Criteria andPortalTitleLessThanOrEqualTo(String value) {
            addCriterion("PORTAL_TITLE <=", value, "portalTitle");
            return (Criteria) this;
        }

        public Criteria andPortalTitleLike(String value) {
            addCriterion("PORTAL_TITLE like", value, "portalTitle");
            return (Criteria) this;
        }

        public Criteria andPortalTitleNotLike(String value) {
            addCriterion("PORTAL_TITLE not like", value, "portalTitle");
            return (Criteria) this;
        }

        public Criteria andPortalTitleIn(List<String> values) {
            addCriterion("PORTAL_TITLE in", values, "portalTitle");
            return (Criteria) this;
        }

        public Criteria andPortalTitleNotIn(List<String> values) {
            addCriterion("PORTAL_TITLE not in", values, "portalTitle");
            return (Criteria) this;
        }

        public Criteria andPortalTitleBetween(String value1, String value2) {
            addCriterion("PORTAL_TITLE between", value1, value2, "portalTitle");
            return (Criteria) this;
        }

        public Criteria andPortalTitleNotBetween(String value1, String value2) {
            addCriterion("PORTAL_TITLE not between", value1, value2, "portalTitle");
            return (Criteria) this;
        }

        public Criteria andPortalHeightIsNull() {
            addCriterion("PORTAL_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andPortalHeightIsNotNull() {
            addCriterion("PORTAL_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andPortalHeightEqualTo(Integer value) {
            addCriterion("PORTAL_HEIGHT =", value, "portalHeight");
            return (Criteria) this;
        }

        public Criteria andPortalHeightNotEqualTo(Integer value) {
            addCriterion("PORTAL_HEIGHT <>", value, "portalHeight");
            return (Criteria) this;
        }

        public Criteria andPortalHeightGreaterThan(Integer value) {
            addCriterion("PORTAL_HEIGHT >", value, "portalHeight");
            return (Criteria) this;
        }

        public Criteria andPortalHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("PORTAL_HEIGHT >=", value, "portalHeight");
            return (Criteria) this;
        }

        public Criteria andPortalHeightLessThan(Integer value) {
            addCriterion("PORTAL_HEIGHT <", value, "portalHeight");
            return (Criteria) this;
        }

        public Criteria andPortalHeightLessThanOrEqualTo(Integer value) {
            addCriterion("PORTAL_HEIGHT <=", value, "portalHeight");
            return (Criteria) this;
        }

        public Criteria andPortalHeightIn(List<Integer> values) {
            addCriterion("PORTAL_HEIGHT in", values, "portalHeight");
            return (Criteria) this;
        }

        public Criteria andPortalHeightNotIn(List<Integer> values) {
            addCriterion("PORTAL_HEIGHT not in", values, "portalHeight");
            return (Criteria) this;
        }

        public Criteria andPortalHeightBetween(Integer value1, Integer value2) {
            addCriterion("PORTAL_HEIGHT between", value1, value2, "portalHeight");
            return (Criteria) this;
        }

        public Criteria andPortalHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("PORTAL_HEIGHT not between", value1, value2, "portalHeight");
            return (Criteria) this;
        }

        public Criteria andPortalUrlIsNull() {
            addCriterion("PORTAL_URL is null");
            return (Criteria) this;
        }

        public Criteria andPortalUrlIsNotNull() {
            addCriterion("PORTAL_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPortalUrlEqualTo(String value) {
            addCriterion("PORTAL_URL =", value, "portalUrl");
            return (Criteria) this;
        }

        public Criteria andPortalUrlNotEqualTo(String value) {
            addCriterion("PORTAL_URL <>", value, "portalUrl");
            return (Criteria) this;
        }

        public Criteria andPortalUrlGreaterThan(String value) {
            addCriterion("PORTAL_URL >", value, "portalUrl");
            return (Criteria) this;
        }

        public Criteria andPortalUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PORTAL_URL >=", value, "portalUrl");
            return (Criteria) this;
        }

        public Criteria andPortalUrlLessThan(String value) {
            addCriterion("PORTAL_URL <", value, "portalUrl");
            return (Criteria) this;
        }

        public Criteria andPortalUrlLessThanOrEqualTo(String value) {
            addCriterion("PORTAL_URL <=", value, "portalUrl");
            return (Criteria) this;
        }

        public Criteria andPortalUrlLike(String value) {
            addCriterion("PORTAL_URL like", value, "portalUrl");
            return (Criteria) this;
        }

        public Criteria andPortalUrlNotLike(String value) {
            addCriterion("PORTAL_URL not like", value, "portalUrl");
            return (Criteria) this;
        }

        public Criteria andPortalUrlIn(List<String> values) {
            addCriterion("PORTAL_URL in", values, "portalUrl");
            return (Criteria) this;
        }

        public Criteria andPortalUrlNotIn(List<String> values) {
            addCriterion("PORTAL_URL not in", values, "portalUrl");
            return (Criteria) this;
        }

        public Criteria andPortalUrlBetween(String value1, String value2) {
            addCriterion("PORTAL_URL between", value1, value2, "portalUrl");
            return (Criteria) this;
        }

        public Criteria andPortalUrlNotBetween(String value1, String value2) {
            addCriterion("PORTAL_URL not between", value1, value2, "portalUrl");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("CREATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("CREATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("CREATE_BY =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("CREATE_BY <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("CREATE_BY >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_BY >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("CREATE_BY <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("CREATE_BY <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("CREATE_BY like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("CREATE_BY not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("CREATE_BY in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("CREATE_BY not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("CREATE_BY between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("CREATE_BY not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLikeInsensitive(String value) {
            addCriterion("upper(FUNCTION_CODE) like", value.toUpperCase(), "functionCode");
            return (Criteria) this;
        }

        public Criteria andPortalCodeLikeInsensitive(String value) {
            addCriterion("upper(PORTAL_CODE) like", value.toUpperCase(), "portalCode");
            return (Criteria) this;
        }

        public Criteria andPortalTitleLikeInsensitive(String value) {
            addCriterion("upper(PORTAL_TITLE) like", value.toUpperCase(), "portalTitle");
            return (Criteria) this;
        }

        public Criteria andPortalUrlLikeInsensitive(String value) {
            addCriterion("upper(PORTAL_URL) like", value.toUpperCase(), "portalUrl");
            return (Criteria) this;
        }

        public Criteria andCreateByLikeInsensitive(String value) {
            addCriterion("upper(CREATE_BY) like", value.toUpperCase(), "createBy");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TS_PORTAL
     *
     * @mbggenerated do_not_delete_during_merge Tue Mar 08 12:54:05 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TS_PORTAL
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
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

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
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
}