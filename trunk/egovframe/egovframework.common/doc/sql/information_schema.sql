SELECT *
FROM information_schema.columns
WHERE 1 = 1
AND table_schema = 'rte'
AND column_name = 'FRST_REGIST_PNTTM' /* 최초등록시점 */
#AND column_name = 'LAST_UPDT_PNTTM' /* 최종수정시점 */
;
