package com.uking.mbpro.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictionaryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDicTypeIsNull() {
            addCriterion("dic_type is null");
            return (Criteria) this;
        }

        public Criteria andDicTypeIsNotNull() {
            addCriterion("dic_type is not null");
            return (Criteria) this;
        }

        public Criteria andDicTypeEqualTo(Integer value) {
            addCriterion("dic_type =", value, "dicType");
            return (Criteria) this;
        }

        public Criteria andDicTypeNotEqualTo(Integer value) {
            addCriterion("dic_type <>", value, "dicType");
            return (Criteria) this;
        }

        public Criteria andDicTypeGreaterThan(Integer value) {
            addCriterion("dic_type >", value, "dicType");
            return (Criteria) this;
        }

        public Criteria andDicTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dic_type >=", value, "dicType");
            return (Criteria) this;
        }

        public Criteria andDicTypeLessThan(Integer value) {
            addCriterion("dic_type <", value, "dicType");
            return (Criteria) this;
        }

        public Criteria andDicTypeLessThanOrEqualTo(Integer value) {
            addCriterion("dic_type <=", value, "dicType");
            return (Criteria) this;
        }

        public Criteria andDicTypeIn(List<Integer> values) {
            addCriterion("dic_type in", values, "dicType");
            return (Criteria) this;
        }

        public Criteria andDicTypeNotIn(List<Integer> values) {
            addCriterion("dic_type not in", values, "dicType");
            return (Criteria) this;
        }

        public Criteria andDicTypeBetween(Integer value1, Integer value2) {
            addCriterion("dic_type between", value1, value2, "dicType");
            return (Criteria) this;
        }

        public Criteria andDicTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("dic_type not between", value1, value2, "dicType");
            return (Criteria) this;
        }

        public Criteria andDicNameIsNull() {
            addCriterion("dic_name is null");
            return (Criteria) this;
        }

        public Criteria andDicNameIsNotNull() {
            addCriterion("dic_name is not null");
            return (Criteria) this;
        }

        public Criteria andDicNameEqualTo(String value) {
            addCriterion("dic_name =", value, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameNotEqualTo(String value) {
            addCriterion("dic_name <>", value, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameGreaterThan(String value) {
            addCriterion("dic_name >", value, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameGreaterThanOrEqualTo(String value) {
            addCriterion("dic_name >=", value, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameLessThan(String value) {
            addCriterion("dic_name <", value, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameLessThanOrEqualTo(String value) {
            addCriterion("dic_name <=", value, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameLike(String value) {
            addCriterion("dic_name like", value, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameNotLike(String value) {
            addCriterion("dic_name not like", value, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameIn(List<String> values) {
            addCriterion("dic_name in", values, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameNotIn(List<String> values) {
            addCriterion("dic_name not in", values, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameBetween(String value1, String value2) {
            addCriterion("dic_name between", value1, value2, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameNotBetween(String value1, String value2) {
            addCriterion("dic_name not between", value1, value2, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicDescriptionIsNull() {
            addCriterion("dic_description is null");
            return (Criteria) this;
        }

        public Criteria andDicDescriptionIsNotNull() {
            addCriterion("dic_description is not null");
            return (Criteria) this;
        }

        public Criteria andDicDescriptionEqualTo(Integer value) {
            addCriterion("dic_description =", value, "dicDescription");
            return (Criteria) this;
        }

        public Criteria andDicDescriptionNotEqualTo(Integer value) {
            addCriterion("dic_description <>", value, "dicDescription");
            return (Criteria) this;
        }

        public Criteria andDicDescriptionGreaterThan(Integer value) {
            addCriterion("dic_description >", value, "dicDescription");
            return (Criteria) this;
        }

        public Criteria andDicDescriptionGreaterThanOrEqualTo(Integer value) {
            addCriterion("dic_description >=", value, "dicDescription");
            return (Criteria) this;
        }

        public Criteria andDicDescriptionLessThan(Integer value) {
            addCriterion("dic_description <", value, "dicDescription");
            return (Criteria) this;
        }

        public Criteria andDicDescriptionLessThanOrEqualTo(Integer value) {
            addCriterion("dic_description <=", value, "dicDescription");
            return (Criteria) this;
        }

        public Criteria andDicDescriptionIn(List<Integer> values) {
            addCriterion("dic_description in", values, "dicDescription");
            return (Criteria) this;
        }

        public Criteria andDicDescriptionNotIn(List<Integer> values) {
            addCriterion("dic_description not in", values, "dicDescription");
            return (Criteria) this;
        }

        public Criteria andDicDescriptionBetween(Integer value1, Integer value2) {
            addCriterion("dic_description between", value1, value2, "dicDescription");
            return (Criteria) this;
        }

        public Criteria andDicDescriptionNotBetween(Integer value1, Integer value2) {
            addCriterion("dic_description not between", value1, value2, "dicDescription");
            return (Criteria) this;
        }

        public Criteria andDicDomainIsNull() {
            addCriterion("dic_domain is null");
            return (Criteria) this;
        }

        public Criteria andDicDomainIsNotNull() {
            addCriterion("dic_domain is not null");
            return (Criteria) this;
        }

        public Criteria andDicDomainEqualTo(String value) {
            addCriterion("dic_domain =", value, "dicDomain");
            return (Criteria) this;
        }

        public Criteria andDicDomainNotEqualTo(String value) {
            addCriterion("dic_domain <>", value, "dicDomain");
            return (Criteria) this;
        }

        public Criteria andDicDomainGreaterThan(String value) {
            addCriterion("dic_domain >", value, "dicDomain");
            return (Criteria) this;
        }

        public Criteria andDicDomainGreaterThanOrEqualTo(String value) {
            addCriterion("dic_domain >=", value, "dicDomain");
            return (Criteria) this;
        }

        public Criteria andDicDomainLessThan(String value) {
            addCriterion("dic_domain <", value, "dicDomain");
            return (Criteria) this;
        }

        public Criteria andDicDomainLessThanOrEqualTo(String value) {
            addCriterion("dic_domain <=", value, "dicDomain");
            return (Criteria) this;
        }

        public Criteria andDicDomainLike(String value) {
            addCriterion("dic_domain like", value, "dicDomain");
            return (Criteria) this;
        }

        public Criteria andDicDomainNotLike(String value) {
            addCriterion("dic_domain not like", value, "dicDomain");
            return (Criteria) this;
        }

        public Criteria andDicDomainIn(List<String> values) {
            addCriterion("dic_domain in", values, "dicDomain");
            return (Criteria) this;
        }

        public Criteria andDicDomainNotIn(List<String> values) {
            addCriterion("dic_domain not in", values, "dicDomain");
            return (Criteria) this;
        }

        public Criteria andDicDomainBetween(String value1, String value2) {
            addCriterion("dic_domain between", value1, value2, "dicDomain");
            return (Criteria) this;
        }

        public Criteria andDicDomainNotBetween(String value1, String value2) {
            addCriterion("dic_domain not between", value1, value2, "dicDomain");
            return (Criteria) this;
        }

        public Criteria andDicCodeIsNull() {
            addCriterion("dic_code is null");
            return (Criteria) this;
        }

        public Criteria andDicCodeIsNotNull() {
            addCriterion("dic_code is not null");
            return (Criteria) this;
        }

        public Criteria andDicCodeEqualTo(Integer value) {
            addCriterion("dic_code =", value, "dicCode");
            return (Criteria) this;
        }

        public Criteria andDicCodeNotEqualTo(Integer value) {
            addCriterion("dic_code <>", value, "dicCode");
            return (Criteria) this;
        }

        public Criteria andDicCodeGreaterThan(Integer value) {
            addCriterion("dic_code >", value, "dicCode");
            return (Criteria) this;
        }

        public Criteria andDicCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dic_code >=", value, "dicCode");
            return (Criteria) this;
        }

        public Criteria andDicCodeLessThan(Integer value) {
            addCriterion("dic_code <", value, "dicCode");
            return (Criteria) this;
        }

        public Criteria andDicCodeLessThanOrEqualTo(Integer value) {
            addCriterion("dic_code <=", value, "dicCode");
            return (Criteria) this;
        }

        public Criteria andDicCodeIn(List<Integer> values) {
            addCriterion("dic_code in", values, "dicCode");
            return (Criteria) this;
        }

        public Criteria andDicCodeNotIn(List<Integer> values) {
            addCriterion("dic_code not in", values, "dicCode");
            return (Criteria) this;
        }

        public Criteria andDicCodeBetween(Integer value1, Integer value2) {
            addCriterion("dic_code between", value1, value2, "dicCode");
            return (Criteria) this;
        }

        public Criteria andDicCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("dic_code not between", value1, value2, "dicCode");
            return (Criteria) this;
        }

        public Criteria andDicValueIsNull() {
            addCriterion("dic_value is null");
            return (Criteria) this;
        }

        public Criteria andDicValueIsNotNull() {
            addCriterion("dic_value is not null");
            return (Criteria) this;
        }

        public Criteria andDicValueEqualTo(String value) {
            addCriterion("dic_value =", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueNotEqualTo(String value) {
            addCriterion("dic_value <>", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueGreaterThan(String value) {
            addCriterion("dic_value >", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueGreaterThanOrEqualTo(String value) {
            addCriterion("dic_value >=", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueLessThan(String value) {
            addCriterion("dic_value <", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueLessThanOrEqualTo(String value) {
            addCriterion("dic_value <=", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueLike(String value) {
            addCriterion("dic_value like", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueNotLike(String value) {
            addCriterion("dic_value not like", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueIn(List<String> values) {
            addCriterion("dic_value in", values, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueNotIn(List<String> values) {
            addCriterion("dic_value not in", values, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueBetween(String value1, String value2) {
            addCriterion("dic_value between", value1, value2, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueNotBetween(String value1, String value2) {
            addCriterion("dic_value not between", value1, value2, "dicValue");
            return (Criteria) this;
        }

        public Criteria andParentTypeIsNull() {
            addCriterion("parent_type is null");
            return (Criteria) this;
        }

        public Criteria andParentTypeIsNotNull() {
            addCriterion("parent_type is not null");
            return (Criteria) this;
        }

        public Criteria andParentTypeEqualTo(Integer value) {
            addCriterion("parent_type =", value, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeNotEqualTo(Integer value) {
            addCriterion("parent_type <>", value, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeGreaterThan(Integer value) {
            addCriterion("parent_type >", value, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_type >=", value, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeLessThan(Integer value) {
            addCriterion("parent_type <", value, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("parent_type <=", value, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeIn(List<Integer> values) {
            addCriterion("parent_type in", values, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeNotIn(List<Integer> values) {
            addCriterion("parent_type not in", values, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeBetween(Integer value1, Integer value2) {
            addCriterion("parent_type between", value1, value2, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_type not between", value1, value2, "parentType");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("tenant_id is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("tenant_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("tenant_id =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("tenant_id <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("tenant_id >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_id >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("tenant_id <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("tenant_id <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("tenant_id like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("tenant_id not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("tenant_id in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("tenant_id not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("tenant_id between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("tenant_id not between", value1, value2, "tenantId");
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
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNull() {
            addCriterion("modified_time is null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNotNull() {
            addCriterion("modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeEqualTo(Date value) {
            addCriterion("modified_time =", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotEqualTo(Date value) {
            addCriterion("modified_time <>", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThan(Date value) {
            addCriterion("modified_time >", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modified_time >=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThan(Date value) {
            addCriterion("modified_time <", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("modified_time <=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIn(List<Date> values) {
            addCriterion("modified_time in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotIn(List<Date> values) {
            addCriterion("modified_time not in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("modified_time between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("modified_time not between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIsNull() {
            addCriterion("record_status is null");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIsNotNull() {
            addCriterion("record_status is not null");
            return (Criteria) this;
        }

        public Criteria andRecordStatusEqualTo(Integer value) {
            addCriterion("record_status =", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotEqualTo(Integer value) {
            addCriterion("record_status <>", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusGreaterThan(Integer value) {
            addCriterion("record_status >", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_status >=", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusLessThan(Integer value) {
            addCriterion("record_status <", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusLessThanOrEqualTo(Integer value) {
            addCriterion("record_status <=", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIn(List<Integer> values) {
            addCriterion("record_status in", values, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotIn(List<Integer> values) {
            addCriterion("record_status not in", values, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusBetween(Integer value1, Integer value2) {
            addCriterion("record_status between", value1, value2, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("record_status not between", value1, value2, "recordStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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