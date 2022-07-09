# es-sql-demo
使用antlr4实现简单的sql转es query dsl



```sql
SELECT a, b, c FROM s WHERE a = 1 AND b LIKE "s" AND c IN (3, 4, 5)
```

转为es的查询为
```
{
  "bool" : {
    "must" : [
      {
        "term" : {
          "a" : {
            "value" : 1,
            "boost" : 1.0
          }
        }
      },
      {
        "match" : {
          "b" : {
            "query" : "s",
            "operator" : "OR",
            "prefix_length" : 0,
            "max_expansions" : 50,
            "fuzzy_transpositions" : true,
            "lenient" : false,
            "zero_terms_query" : "NONE",
            "boost" : 1.0
          }
        }
      },
      {
        "terms" : {
          "c" : [
            3,
            4,
            5
          ],
          "boost" : 1.0
        }
      }
    ],
    "disable_coord" : false,
    "adjust_pure_negative" : true,
    "boost" : 1.0
  }
}
```
