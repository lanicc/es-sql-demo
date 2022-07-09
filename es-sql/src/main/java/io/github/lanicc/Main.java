package io.github.lanicc;

import io.github.lanicc.eql.EqlLexer;
import io.github.lanicc.eql.EqlParser;
import io.github.lanicc.eql.EqlVisitorImpl;
import io.github.lanicc.eql.QueryBuilderWrapper;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

/**
 * Created on ${DATE}.
 *
 * @author lan
 */
public class Main {
    public static void main(String[] args) {
        String eql = "SELECT a, b, c FROM s WHERE a = 1 AND b LIKE \"s\" AND c IN (3, 4, 5)";
        EqlLexer lexer = new EqlLexer(CharStreams.fromString(eql));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        EqlParser parser = new EqlParser(tokenStream);
        EqlParser.SqlContext sql = parser.sql();
        EqlVisitorImpl visitor = new EqlVisitorImpl();
        QueryBuilderWrapper wrapper = visitor.visit(sql);
        System.out.println(wrapper.toString());

        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
        wrapper.getQueryBuilders()
                .forEach(boolQueryBuilder::must);
        System.out.println(boolQueryBuilder);
    }
}
