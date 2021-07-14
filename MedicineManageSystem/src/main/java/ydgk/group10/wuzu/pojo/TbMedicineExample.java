package ydgk.group10.wuzu.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbMedicineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbMedicineExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMednoIsNull() {
            addCriterion("medNo is null");
            return (Criteria) this;
        }

        public Criteria andMednoIsNotNull() {
            addCriterion("medNo is not null");
            return (Criteria) this;
        }

        public Criteria andMednoEqualTo(String value) {
            addCriterion("medNo =", value, "medno");
            return (Criteria) this;
        }

        public Criteria andMednoNotEqualTo(String value) {
            addCriterion("medNo <>", value, "medno");
            return (Criteria) this;
        }

        public Criteria andMednoGreaterThan(String value) {
            addCriterion("medNo >", value, "medno");
            return (Criteria) this;
        }

        public Criteria andMednoGreaterThanOrEqualTo(String value) {
            addCriterion("medNo >=", value, "medno");
            return (Criteria) this;
        }

        public Criteria andMednoLessThan(String value) {
            addCriterion("medNo <", value, "medno");
            return (Criteria) this;
        }

        public Criteria andMednoLessThanOrEqualTo(String value) {
            addCriterion("medNo <=", value, "medno");
            return (Criteria) this;
        }

        public Criteria andMednoLike(String value) {
            addCriterion("medNo like", value, "medno");
            return (Criteria) this;
        }

        public Criteria andMednoNotLike(String value) {
            addCriterion("medNo not like", value, "medno");
            return (Criteria) this;
        }

        public Criteria andMednoIn(List<String> values) {
            addCriterion("medNo in", values, "medno");
            return (Criteria) this;
        }

        public Criteria andMednoNotIn(List<String> values) {
            addCriterion("medNo not in", values, "medno");
            return (Criteria) this;
        }

        public Criteria andMednoBetween(String value1, String value2) {
            addCriterion("medNo between", value1, value2, "medno");
            return (Criteria) this;
        }

        public Criteria andMednoNotBetween(String value1, String value2) {
            addCriterion("medNo not between", value1, value2, "medno");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andFactoryaddIsNull() {
            addCriterion("factoryAdd is null");
            return (Criteria) this;
        }

        public Criteria andFactoryaddIsNotNull() {
            addCriterion("factoryAdd is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryaddEqualTo(String value) {
            addCriterion("factoryAdd =", value, "factoryadd");
            return (Criteria) this;
        }

        public Criteria andFactoryaddNotEqualTo(String value) {
            addCriterion("factoryAdd <>", value, "factoryadd");
            return (Criteria) this;
        }

        public Criteria andFactoryaddGreaterThan(String value) {
            addCriterion("factoryAdd >", value, "factoryadd");
            return (Criteria) this;
        }

        public Criteria andFactoryaddGreaterThanOrEqualTo(String value) {
            addCriterion("factoryAdd >=", value, "factoryadd");
            return (Criteria) this;
        }

        public Criteria andFactoryaddLessThan(String value) {
            addCriterion("factoryAdd <", value, "factoryadd");
            return (Criteria) this;
        }

        public Criteria andFactoryaddLessThanOrEqualTo(String value) {
            addCriterion("factoryAdd <=", value, "factoryadd");
            return (Criteria) this;
        }

        public Criteria andFactoryaddLike(String value) {
            addCriterion("factoryAdd like", value, "factoryadd");
            return (Criteria) this;
        }

        public Criteria andFactoryaddNotLike(String value) {
            addCriterion("factoryAdd not like", value, "factoryadd");
            return (Criteria) this;
        }

        public Criteria andFactoryaddIn(List<String> values) {
            addCriterion("factoryAdd in", values, "factoryadd");
            return (Criteria) this;
        }

        public Criteria andFactoryaddNotIn(List<String> values) {
            addCriterion("factoryAdd not in", values, "factoryadd");
            return (Criteria) this;
        }

        public Criteria andFactoryaddBetween(String value1, String value2) {
            addCriterion("factoryAdd between", value1, value2, "factoryadd");
            return (Criteria) this;
        }

        public Criteria andFactoryaddNotBetween(String value1, String value2) {
            addCriterion("factoryAdd not between", value1, value2, "factoryadd");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andMedcountIsNull() {
            addCriterion("medCount is null");
            return (Criteria) this;
        }

        public Criteria andMedcountIsNotNull() {
            addCriterion("medCount is not null");
            return (Criteria) this;
        }

        public Criteria andMedcountEqualTo(Integer value) {
            addCriterion("medCount =", value, "medcount");
            return (Criteria) this;
        }

        public Criteria andMedcountNotEqualTo(Integer value) {
            addCriterion("medCount <>", value, "medcount");
            return (Criteria) this;
        }

        public Criteria andMedcountGreaterThan(Integer value) {
            addCriterion("medCount >", value, "medcount");
            return (Criteria) this;
        }

        public Criteria andMedcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("medCount >=", value, "medcount");
            return (Criteria) this;
        }

        public Criteria andMedcountLessThan(Integer value) {
            addCriterion("medCount <", value, "medcount");
            return (Criteria) this;
        }

        public Criteria andMedcountLessThanOrEqualTo(Integer value) {
            addCriterion("medCount <=", value, "medcount");
            return (Criteria) this;
        }

        public Criteria andMedcountIn(List<Integer> values) {
            addCriterion("medCount in", values, "medcount");
            return (Criteria) this;
        }

        public Criteria andMedcountNotIn(List<Integer> values) {
            addCriterion("medCount not in", values, "medcount");
            return (Criteria) this;
        }

        public Criteria andMedcountBetween(Integer value1, Integer value2) {
            addCriterion("medCount between", value1, value2, "medcount");
            return (Criteria) this;
        }

        public Criteria andMedcountNotBetween(Integer value1, Integer value2) {
            addCriterion("medCount not between", value1, value2, "medcount");
            return (Criteria) this;
        }

        public Criteria andPhotopathIsNull() {
            addCriterion("photoPath is null");
            return (Criteria) this;
        }

        public Criteria andPhotopathIsNotNull() {
            addCriterion("photoPath is not null");
            return (Criteria) this;
        }

        public Criteria andPhotopathEqualTo(String value) {
            addCriterion("photoPath =", value, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathNotEqualTo(String value) {
            addCriterion("photoPath <>", value, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathGreaterThan(String value) {
            addCriterion("photoPath >", value, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathGreaterThanOrEqualTo(String value) {
            addCriterion("photoPath >=", value, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathLessThan(String value) {
            addCriterion("photoPath <", value, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathLessThanOrEqualTo(String value) {
            addCriterion("photoPath <=", value, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathLike(String value) {
            addCriterion("photoPath like", value, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathNotLike(String value) {
            addCriterion("photoPath not like", value, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathIn(List<String> values) {
            addCriterion("photoPath in", values, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathNotIn(List<String> values) {
            addCriterion("photoPath not in", values, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathBetween(String value1, String value2) {
            addCriterion("photoPath between", value1, value2, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathNotBetween(String value1, String value2) {
            addCriterion("photoPath not between", value1, value2, "photopath");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNull() {
            addCriterion("categoryId is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("categoryId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(Integer value) {
            addCriterion("categoryId =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(Integer value) {
            addCriterion("categoryId <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(Integer value) {
            addCriterion("categoryId >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("categoryId >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(Integer value) {
            addCriterion("categoryId <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("categoryId <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<Integer> values) {
            addCriterion("categoryId in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<Integer> values) {
            addCriterion("categoryId not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(Integer value1, Integer value2) {
            addCriterion("categoryId between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("categoryId not between", value1, value2, "categoryid");
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