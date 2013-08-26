select
  *
from all_tab_columns
where 1 = 1
and all_tab_columns.owner = 'TEST'
and all_tab_columns.table_name = 'COMTCADMINISTCODE'
;

select
    all_tab_columns.owner
    , all_tab_columns.table_name
    , all_tab_columns.column_name
    , all_tab_columns.data_type
    , all_tab_columns.data_length
    , all_tab_columns.nullable
    , all_tab_columns.column_id
    , all_tab_comments.comments
    , all_col_comments.comments
--    , nvl2(all_cons_columns.owner, 'PRI', null)
    , (
        SELECT nvl2(cons.owner, 'PRI', null)
        FROM all_constraints cons, all_cons_columns cols
        WHERE 1 = 1
        --AND cols.table_name = 'TABLE_NAME'
        AND cons.constraint_type = 'P'
        AND cons.constraint_name = cols.constraint_name
        AND cons.owner = cols.owner
--
        AND cons.owner = all_tab_columns.owner
        AND cons.table_name = all_tab_columns.table_name
        AND cols.column_name = all_tab_columns.column_name
--        ORDER BY cols.table_name, cols.position
    ) AS column_key
from all_tab_columns
LEFT OUTER JOIN all_tab_comments ON 1 = 1
    AND all_tab_comments.owner = all_tab_columns.owner
    AND all_tab_comments.table_name =  all_tab_columns.table_name
LEFT OUTER JOIN all_col_comments ON 1 = 1
    AND all_col_comments.owner = all_tab_columns.owner
    AND all_col_comments.table_name =  all_tab_columns.table_name
    AND all_col_comments.column_name = all_tab_columns.column_name
--left outer join all_constraints ON 1 = 1
--    AND all_constraints.owner = all_tab_columns.owner
--    AND all_constraints.table_name = all_tab_columns.table_name
--    and all_constraints.constraint_type = 'P'
--left outer join all_cons_columns ON 1 = 1
--    AND all_cons_columns.owner = all_tab_columns.owner
--    AND all_cons_columns.constraint_name = all_constraints.constraint_name
--    AND all_cons_columns.table_name = all_tab_columns.table_name
--    AND all_cons_columns.column_name = all_tab_columns.column_name
--left outer join (
--SELECT cols.table_name, cols.column_name, cols.position, cons.status, cons.owner
--FROM all_constraints cons, all_cons_columns cols
--WHERE 1 = 1
----AND cols.table_name = 'TABLE_NAME'
--AND cons.constraint_type = 'P'
--AND cons.constraint_name = cols.constraint_name
--AND cons.owner = cols.owner
--ORDER BY cols.table_name, cols.position
--) pk on 1 = 1
--    AND pk.owner = all_tab_columns.owner
--    AND pk.table_name = all_tab_columns.table_name
--    AND pk.column_name = all_tab_columns.column_name
where 1 = 1
and all_tab_columns.owner = 'TEST'
--and all_tab_columns.table_name = 'COMTCADMINISTCODE'
--and all_tab_columns.table_name IN ('COMTCADMINISTCODE', 'COMTCADMINISTCODERECPTNLOG')
order by all_tab_columns.owner, all_tab_columns.table_name, all_tab_columns.column_id
;

select *
from all_constraints
where 1 = 1
and owner = 'TEST'
and table_name = 'COMTCADMINISTCODE'
and constraint_type = 'P'
;

--COMTCADMINISTCODE_PK

SELECT *
FROM all_cons_columns cols
WHERE cols.table_name = 'COMTCADMINISTCODE'
;

SELECT cols.table_name, cols.column_name, cols.position, cons.status, cons.owner
FROM all_constraints cons, all_cons_columns cols
WHERE cols.table_name = 'COMTCADMINISTCODE'
AND cons.constraint_type = 'P'
AND cons.constraint_name = cols.constraint_name
AND cons.owner = cols.owner
ORDER BY cols.table_name, cols.position;

SELECT    all_tab_columns.owner    , all_tab_columns.table_name    , all_tab_columns.column_name    , all_tab_columns.data_type    , all_tab_columns.data_length    , all_tab_columns.nullable    , all_tab_columns.column_id    , all_tab_comments.comments AS table_comment    , all_col_comments.comments AS column_comment    FROM all_tab_columns    LEFT OUTER JOIN all_tab_comments ON 1 = 1        AND all_tab_comments.owner = all_tab_columns.owner        AND all_tab_comments.table_name =  all_tab_columns.table_name    LEFT OUTER JOIN all_col_comments ON 1 = 1        AND all_col_comments.owner = all_tab_columns.owner        AND all_col_comments.table_name =  all_tab_columns.table_name        AND all_col_comments.column_name = all_tab_columns.column_name
WHERE 1 = 1
AND all_tab_columns.owner = 'TEST'
AND all_tab_columns.table_name IN (       'COMTCADMINISTCODE'     )      
;

SELECT *
FROM all_cons_columns
WHERE table_name = 'COMTCADMINISTCODE'
;

SELECT cols.table_name, cols.column_name, cols.position, cons.status, cons.owner
FROM all_constraints cons, all_cons_columns cols
WHERE cols.table_name = 'TABLE_NAME'
AND cons.constraint_type = 'P'
AND cons.constraint_name = cols.constraint_name
AND cons.owner = cols.owner
ORDER BY cols.table_name, cols.position;

