SELECT
    atc.*
    , (SELECT comments FROM all_col_comments WHERE owner = atc.owner AND table_name = atc.table_name AND column_name = atc.column_name ) AS column_comments
FROM ALL_TAB_COLUMNS atc
WHERE 1 = 1
AND atc.owner = 'RTE'
ORDER BY
    atc.owner
    , atc.table_name
    , atc.column_id
;
