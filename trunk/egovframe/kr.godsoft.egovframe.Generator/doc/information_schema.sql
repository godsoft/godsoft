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
