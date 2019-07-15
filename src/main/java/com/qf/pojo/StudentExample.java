package com.qf.pojo;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSsexIsNull() {
            addCriterion("ssex is null");
            return (Criteria) this;
        }

        public Criteria andSsexIsNotNull() {
            addCriterion("ssex is not null");
            return (Criteria) this;
        }

        public Criteria andSsexEqualTo(String value) {
            addCriterion("ssex =", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotEqualTo(String value) {
            addCriterion("ssex <>", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThan(String value) {
            addCriterion("ssex >", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThanOrEqualTo(String value) {
            addCriterion("ssex >=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThan(String value) {
            addCriterion("ssex <", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThanOrEqualTo(String value) {
            addCriterion("ssex <=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLike(String value) {
            addCriterion("ssex like", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotLike(String value) {
            addCriterion("ssex not like", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexIn(List<String> values) {
            addCriterion("ssex in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotIn(List<String> values) {
            addCriterion("ssex not in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexBetween(String value1, String value2) {
            addCriterion("ssex between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotBetween(String value1, String value2) {
            addCriterion("ssex not between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSageIsNull() {
            addCriterion("sage is null");
            return (Criteria) this;
        }

        public Criteria andSageIsNotNull() {
            addCriterion("sage is not null");
            return (Criteria) this;
        }

        public Criteria andSageEqualTo(Integer value) {
            addCriterion("sage =", value, "sage");
            return (Criteria) this;
        }

        public Criteria andSageNotEqualTo(Integer value) {
            addCriterion("sage <>", value, "sage");
            return (Criteria) this;
        }

        public Criteria andSageGreaterThan(Integer value) {
            addCriterion("sage >", value, "sage");
            return (Criteria) this;
        }

        public Criteria andSageGreaterThanOrEqualTo(Integer value) {
            addCriterion("sage >=", value, "sage");
            return (Criteria) this;
        }

        public Criteria andSageLessThan(Integer value) {
            addCriterion("sage <", value, "sage");
            return (Criteria) this;
        }

        public Criteria andSageLessThanOrEqualTo(Integer value) {
            addCriterion("sage <=", value, "sage");
            return (Criteria) this;
        }

        public Criteria andSageIn(List<Integer> values) {
            addCriterion("sage in", values, "sage");
            return (Criteria) this;
        }

        public Criteria andSageNotIn(List<Integer> values) {
            addCriterion("sage not in", values, "sage");
            return (Criteria) this;
        }

        public Criteria andSageBetween(Integer value1, Integer value2) {
            addCriterion("sage between", value1, value2, "sage");
            return (Criteria) this;
        }

        public Criteria andSageNotBetween(Integer value1, Integer value2) {
            addCriterion("sage not between", value1, value2, "sage");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNull() {
            addCriterion("classname is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("classname is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(String value) {
            addCriterion("classname =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(String value) {
            addCriterion("classname <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(String value) {
            addCriterion("classname >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("classname >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(String value) {
            addCriterion("classname <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(String value) {
            addCriterion("classname <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLike(String value) {
            addCriterion("classname like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotLike(String value) {
            addCriterion("classname not like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<String> values) {
            addCriterion("classname in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<String> values) {
            addCriterion("classname not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(String value1, String value2) {
            addCriterion("classname between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(String value1, String value2) {
            addCriterion("classname not between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andFirststageIsNull() {
            addCriterion("firststage is null");
            return (Criteria) this;
        }

        public Criteria andFirststageIsNotNull() {
            addCriterion("firststage is not null");
            return (Criteria) this;
        }

        public Criteria andFirststageEqualTo(Integer value) {
            addCriterion("firststage =", value, "firststage");
            return (Criteria) this;
        }

        public Criteria andFirststageNotEqualTo(Integer value) {
            addCriterion("firststage <>", value, "firststage");
            return (Criteria) this;
        }

        public Criteria andFirststageGreaterThan(Integer value) {
            addCriterion("firststage >", value, "firststage");
            return (Criteria) this;
        }

        public Criteria andFirststageGreaterThanOrEqualTo(Integer value) {
            addCriterion("firststage >=", value, "firststage");
            return (Criteria) this;
        }

        public Criteria andFirststageLessThan(Integer value) {
            addCriterion("firststage <", value, "firststage");
            return (Criteria) this;
        }

        public Criteria andFirststageLessThanOrEqualTo(Integer value) {
            addCriterion("firststage <=", value, "firststage");
            return (Criteria) this;
        }

        public Criteria andFirststageIn(List<Integer> values) {
            addCriterion("firststage in", values, "firststage");
            return (Criteria) this;
        }

        public Criteria andFirststageNotIn(List<Integer> values) {
            addCriterion("firststage not in", values, "firststage");
            return (Criteria) this;
        }

        public Criteria andFirststageBetween(Integer value1, Integer value2) {
            addCriterion("firststage between", value1, value2, "firststage");
            return (Criteria) this;
        }

        public Criteria andFirststageNotBetween(Integer value1, Integer value2) {
            addCriterion("firststage not between", value1, value2, "firststage");
            return (Criteria) this;
        }

        public Criteria andSecondstageIsNull() {
            addCriterion("secondstage is null");
            return (Criteria) this;
        }

        public Criteria andSecondstageIsNotNull() {
            addCriterion("secondstage is not null");
            return (Criteria) this;
        }

        public Criteria andSecondstageEqualTo(Integer value) {
            addCriterion("secondstage =", value, "secondstage");
            return (Criteria) this;
        }

        public Criteria andSecondstageNotEqualTo(Integer value) {
            addCriterion("secondstage <>", value, "secondstage");
            return (Criteria) this;
        }

        public Criteria andSecondstageGreaterThan(Integer value) {
            addCriterion("secondstage >", value, "secondstage");
            return (Criteria) this;
        }

        public Criteria andSecondstageGreaterThanOrEqualTo(Integer value) {
            addCriterion("secondstage >=", value, "secondstage");
            return (Criteria) this;
        }

        public Criteria andSecondstageLessThan(Integer value) {
            addCriterion("secondstage <", value, "secondstage");
            return (Criteria) this;
        }

        public Criteria andSecondstageLessThanOrEqualTo(Integer value) {
            addCriterion("secondstage <=", value, "secondstage");
            return (Criteria) this;
        }

        public Criteria andSecondstageIn(List<Integer> values) {
            addCriterion("secondstage in", values, "secondstage");
            return (Criteria) this;
        }

        public Criteria andSecondstageNotIn(List<Integer> values) {
            addCriterion("secondstage not in", values, "secondstage");
            return (Criteria) this;
        }

        public Criteria andSecondstageBetween(Integer value1, Integer value2) {
            addCriterion("secondstage between", value1, value2, "secondstage");
            return (Criteria) this;
        }

        public Criteria andSecondstageNotBetween(Integer value1, Integer value2) {
            addCriterion("secondstage not between", value1, value2, "secondstage");
            return (Criteria) this;
        }

        public Criteria andThirdstageIsNull() {
            addCriterion("thirdstage is null");
            return (Criteria) this;
        }

        public Criteria andThirdstageIsNotNull() {
            addCriterion("thirdstage is not null");
            return (Criteria) this;
        }

        public Criteria andThirdstageEqualTo(Integer value) {
            addCriterion("thirdstage =", value, "thirdstage");
            return (Criteria) this;
        }

        public Criteria andThirdstageNotEqualTo(Integer value) {
            addCriterion("thirdstage <>", value, "thirdstage");
            return (Criteria) this;
        }

        public Criteria andThirdstageGreaterThan(Integer value) {
            addCriterion("thirdstage >", value, "thirdstage");
            return (Criteria) this;
        }

        public Criteria andThirdstageGreaterThanOrEqualTo(Integer value) {
            addCriterion("thirdstage >=", value, "thirdstage");
            return (Criteria) this;
        }

        public Criteria andThirdstageLessThan(Integer value) {
            addCriterion("thirdstage <", value, "thirdstage");
            return (Criteria) this;
        }

        public Criteria andThirdstageLessThanOrEqualTo(Integer value) {
            addCriterion("thirdstage <=", value, "thirdstage");
            return (Criteria) this;
        }

        public Criteria andThirdstageIn(List<Integer> values) {
            addCriterion("thirdstage in", values, "thirdstage");
            return (Criteria) this;
        }

        public Criteria andThirdstageNotIn(List<Integer> values) {
            addCriterion("thirdstage not in", values, "thirdstage");
            return (Criteria) this;
        }

        public Criteria andThirdstageBetween(Integer value1, Integer value2) {
            addCriterion("thirdstage between", value1, value2, "thirdstage");
            return (Criteria) this;
        }

        public Criteria andThirdstageNotBetween(Integer value1, Integer value2) {
            addCriterion("thirdstage not between", value1, value2, "thirdstage");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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