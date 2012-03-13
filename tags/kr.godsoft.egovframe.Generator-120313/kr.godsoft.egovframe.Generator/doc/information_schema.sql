SELECT *
FROM information_schema.tables
WHERE 1 = 1
AND table_schema = 'egovfrm'
;

SELECT
    CONCAT('ALTER TABLE ', table_schema, '.', table_name, ' COMMENT=\'코멘트\';')
FROM information_schema.tables
WHERE 1 = 1
AND table_schema = 'egovfrm'
;

SELECT
                    columns.TABLE_CATALOG
                    , columns.TABLE_SCHEMA
                    , columns.TABLE_NAME
                    , tables.table_comment
                    , COLUMN_NAME
                    , ORDINAL_POSITION
                    , COLUMN_DEFAULT
                    , IS_NULLABLE
                    , DATA_TYPE
                    , CHARACTER_MAXIMUM_LENGTH
                    , CHARACTER_OCTET_LENGTH
                    , NUMERIC_PRECISION
                    , NUMERIC_SCALE
                    , CHARACTER_SET_NAME
                    , COLLATION_NAME
                    , COLUMN_TYPE
                    , COLUMN_KEY
                    , EXTRA
                    , PRIVILEGES
                    , COLUMN_COMMENT
        FROM information_schema.COLUMNS
LEFT OUTER JOIN information_schema.tables ON 1 = 1
    AND tables.table_catalog = columns.table_catalog
    AND tables.table_schema = columns.table_schema
    AND tables.table_name = columns.table_name
WHERE 1=1
    AND columns.table_schema = 'egovfrm'
    /* AND columns.table_name IN ('comtcadministcode', 'comtcadministcoderecptnlog', 'comtccmmnclcode') */
    AND columns.table_name IN ('comtcadministcode')
;
