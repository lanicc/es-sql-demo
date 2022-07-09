package io.github.lanicc.eql;

import org.elasticsearch.index.query.QueryBuilders;

import java.util.LinkedList;
import java.util.List;

/**
 * Created on 2022/7/9.
 *
 * @author lan
 */
public class EqlVisitorImpl extends EqlBaseVisitor<QueryBuilderWrapper> {

    @Override
    public QueryBuilderWrapper visitIndex(EqlParser.IndexContext ctx) {
        return new QueryBuilderWrapper().setIndex(ctx.getText());
    }

    @Override
    public QueryBuilderWrapper visitEqual(EqlParser.EqualContext ctx) {
        return new QueryBuilderWrapper()
                .addQuery(
                        QueryBuilders.termQuery(ctx.ID().getText(), exprValue(ctx.expr()))
                );
    }


    @Override
    public QueryBuilderWrapper visitLike(EqlParser.LikeContext ctx) {
        return new QueryBuilderWrapper()
                .addQuery(
                        QueryBuilders.matchQuery(ctx.ID().getText(), removeQuotation(ctx.STRING().getText()))
                );
    }

    @Override
    public QueryBuilderWrapper visitIn(EqlParser.InContext ctx) {
        return new QueryBuilderWrapper()
                .addQuery(
                        QueryBuilders.termsQuery(ctx.ID().getText(), getArrayValues(ctx.array()))
                );
    }

    private List<Object> getArrayValues(EqlParser.ArrayContext array) {
        List<EqlParser.ExprContext> expressions = array.expr();
        List<Object> list = new LinkedList<>();
        for (EqlParser.ExprContext expression : expressions) {
            list.add(exprValue(expression));
        }
        return list;
    }

    @Override
    public QueryBuilderWrapper visitCol(EqlParser.ColContext ctx) {
        return new QueryBuilderWrapper().addField(ctx.getText());
    }

    @Override
    protected QueryBuilderWrapper aggregateResult(QueryBuilderWrapper aggregate, QueryBuilderWrapper nextResult) {
        return QueryBuilderWrapper.merge(aggregate, nextResult);
    }

    private Object exprValue(EqlParser.ExprContext expr) {
        if (expr.DECIMAL() != null) {
            return Double.valueOf(expr.DECIMAL().getText());
        } else if (expr.STRING() != null) {
            String text = expr.STRING().getText();
            return removeQuotation(text);
        } else if (expr.INTEGER() != null) {
            return Long.valueOf(expr.INTEGER().getText());
        } else if (expr.TRUE() != null) {
            return Boolean.TRUE;
        } else if (expr.FALSE() != null) {
            return Boolean.FALSE;
        } else {
            throw new RuntimeException("unknown expr value: " + expr.getText());
        }
    }

    private String removeQuotation(String text) {
        return text.substring(1, text.length() - 1);
    }
}
