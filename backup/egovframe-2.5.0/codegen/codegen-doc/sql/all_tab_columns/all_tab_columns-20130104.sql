SELECT
    atc.*
    , (SELECT comments FROM all_col_comments WHERE owner = atc.owner AND table_name = atc.table_name AND column_name = atc.column_name ) AS column_comments
    , (
        SELECT constraint_type
        FROM ALL_CONSTRAINTS ac
        LEFT OUTER JOIN ALL_CONS_COLUMNS acc ON acc.owner = ac.owner AND acc.constraint_name = ac.constraint_name
        WHERE 1 = 1
        AND ac.owner = atc.owner
        AND ac.constraint_type = 'P'
        AND acc.table_name = atc.table_name
        AND acc.column_name = atc.column_name
    ) AS constraint_type
FROM ALL_TAB_COLUMNS atc
WHERE 1 = 1
AND atc.owner = 'RTE'
ORDER BY
    atc.owner
    , atc.table_name
    , atc.column_id
;
