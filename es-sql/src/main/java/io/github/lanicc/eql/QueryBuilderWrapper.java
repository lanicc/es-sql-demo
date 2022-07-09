package io.github.lanicc.eql;

import org.elasticsearch.index.query.QueryBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Created on 2022/7/9.
 *
 * @author lan
 */
public class QueryBuilderWrapper {

    private List<QueryBuilder> queryBuilders;

    private List<String> fields;

    private String index;

    public List<QueryBuilder> getQueryBuilders() {
        return Objects.isNull(queryBuilders) ? Collections.emptyList() : queryBuilders;
    }

    public List<String> getFields() {
        return Objects.isNull(fields) ? Collections.emptyList() : fields;
    }

    public String getIndex() {
        return index;
    }

    public QueryBuilderWrapper addQuery(QueryBuilder queryBuilder) {
        if (Objects.isNull(queryBuilders)) {
            queryBuilders = new ArrayList<>();
        }
        queryBuilders.add(queryBuilder);
        return this;
    }

    public QueryBuilderWrapper addField(String field) {
        if (Objects.isNull(fields)) {
            fields = new ArrayList<>();
        }
        fields.add(field);
        return this;
    }

    public QueryBuilderWrapper setIndex(String index) {
        this.index = index;
        return this;
    }

    public QueryBuilderWrapper merge(QueryBuilderWrapper wrapper) {
        this.index = Objects.isNull(this.index) ? wrapper.getIndex() : this.index;
        this.queryBuilders = merge(this.queryBuilders, wrapper.queryBuilders);
        this.fields = merge(this.fields, wrapper.fields);
        return this;
    }

    private <T> List<T> merge(List<T> l1, List<T> l2) {
        if (Objects.isNull(l1)) {
            return l2;
        }
        if (Objects.nonNull(l2)) {
            l1.addAll(l2);
        }
        return l1;
    }

    public static QueryBuilderWrapper merge(QueryBuilderWrapper wrapper1, QueryBuilderWrapper wrapper2) {
        if (Objects.isNull(wrapper1)) {
            return wrapper2;
        }
        if (Objects.nonNull(wrapper2)) {
            return wrapper1.merge(wrapper2);
        }
        return wrapper1;
    }

    @Override
    public String toString() {
        return "QueryBuilderWrapper{" +
                "queryBuilders=" + queryBuilders +
                ", fields=" + fields +
                ", index='" + index + '\'' +
                '}';
    }
}
