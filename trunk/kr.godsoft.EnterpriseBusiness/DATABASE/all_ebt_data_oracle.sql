-- 아래순서로 테이블생성 및 기초데이터 입력 

-- ID Generation
insert into IDS(TABLE_NAME,NEXT_ID) values ('BBS_ID',1);
insert into IDS(TABLE_NAME,NEXT_ID) values ('FILE_ID',1);
insert into IDS(TABLE_NAME,NEXT_ID) values ('GROUP_ID',1);
insert into IDS(TABLE_NAME,NEXT_ID) values ('LOGINLOG_ID',1);
insert into IDS(TABLE_NAME,NEXT_ID) values ('ROLE_ID',1);
insert into IDS(TABLE_NAME,NEXT_ID) values ('SYSLOG_ID',1);
insert into IDS(TABLE_NAME,NEXT_ID) values ('TMPLAT_ID',1);
insert into IDS(TABLE_NAME,NEXT_ID) values ('USRCNFRM_ID',2);


-- 분류코드
insert into LETTCCMMNCLCODE(CL_CODE,CL_CODE_NM,CL_CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('LET','전자정부 프레임워크 경량환경 템플릿','전자정부 프레임워크 경량환경 템플릿1','Y',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');


-- 공통코드
insert into LETTCCMMNCODE(CODE_ID,CODE_ID_NM,CODE_ID_DC,USE_AT,CL_CODE,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM001','등록구분','게시판, 커뮤니티, 동호회 등록구분코드1','Y','LET',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNCODE(CODE_ID,CODE_ID_NM,CODE_ID_DC,USE_AT,CL_CODE,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM003','업무구분','업무구분코드','Y','LET',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNCODE(CODE_ID,CODE_ID_NM,CODE_ID_DC,USE_AT,CL_CODE,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM004','게시판유형','게시판유형구분코드','Y','LET',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNCODE(CODE_ID,CODE_ID_NM,CODE_ID_DC,USE_AT,CL_CODE,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM005','템플릿유형','템플릿유형구분코드','Y','LET',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNCODE(CODE_ID,CODE_ID_NM,CODE_ID_DC,USE_AT,CL_CODE,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM009','게시판속성','게시판 속성','Y','LET',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNCODE(CODE_ID,CODE_ID_NM,CODE_ID_DC,USE_AT,CL_CODE,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM013','회원상태','회원 가입 신청/승인/삭제를 위한 상태 구분','Y','LET',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNCODE(CODE_ID,CODE_ID_NM,CODE_ID_DC,USE_AT,CL_CODE,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM014','성별구분','남녀 성별 구분','Y','LET',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNCODE(CODE_ID,CODE_ID_NM,CODE_ID_DC,USE_AT,CL_CODE,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM022','비밀번호 힌트','비밀번호 힌트 구분코드','Y','LET',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNCODE(CODE_ID,CODE_ID_NM,CODE_ID_DC,USE_AT,CL_CODE,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM025','소속기관','소속기관정보를 관리할때 사용하는 구분코드(시스템별로 재정의)','Y','LET',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNCODE(CODE_ID,CODE_ID_NM,CODE_ID_DC,USE_AT,CL_CODE,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM029','롤유형코드','','Y','LET',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');


-- 공통상세코드
insert into LETTCCMMNDETAILCODE(CODE_ID,CODE,CODE_NM,CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM001','REGC01','단일 게시판 이용등록','단일 게시판 이용등록','Y',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNDETAILCODE(CODE_ID,CODE,CODE_NM,CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM001','REGC07','게시판사용자등록','게시판사용자등록','Y',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNDETAILCODE(CODE_ID,CODE,CODE_NM,CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM003','BBS','게시판','게시판','Y',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNDETAILCODE(CODE_ID,CODE,CODE_NM,CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM004','BBST01','일반게시판','일반게시판','Y',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNDETAILCODE(CODE_ID,CODE,CODE_NM,CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM004','BBST02','익명게시판','익명게시판','N',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNDETAILCODE(CODE_ID,CODE,CODE_NM,CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM004','BBST03','공지게시판','공지게시판','Y',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNDETAILCODE(CODE_ID,CODE,CODE_NM,CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM005','TMPT01','게시판템플릿','게시판템플릿','Y',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNDETAILCODE(CODE_ID,CODE,CODE_NM,CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM009','BBSA01','유효게시판','유효게시판','N',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNDETAILCODE(CODE_ID,CODE,CODE_NM,CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM009','BBSA02','갤러리','갤러리','Y',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNDETAILCODE(CODE_ID,CODE,CODE_NM,CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM009','BBSA03','일반게시판','일반게시판','Y',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNDETAILCODE(CODE_ID,CODE,CODE_NM,CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM013','A','회원 가입 신청 상태','회원 가입 신청 상태','Y',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNDETAILCODE(CODE_ID,CODE,CODE_NM,CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM013','D','회원 가입 삭제 상태','회원 가입 삭제 상태','Y',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNDETAILCODE(CODE_ID,CODE,CODE_NM,CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM013','P','회원 가입 승인 상태','회원 가입 승인 상태','Y',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNDETAILCODE(CODE_ID,CODE,CODE_NM,CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM014','F','여자','여자','Y',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNDETAILCODE(CODE_ID,CODE,CODE_NM,CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM014','M','남자','남자','Y',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNDETAILCODE(CODE_ID,CODE,CODE_NM,CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM022',' P01','가장 기억에 남는 장소는?','가장 기억에 남는 장소는?','Y',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNDETAILCODE(CODE_ID,CODE,CODE_NM,CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM022',' P02','나의 좌우명은?','나의 좌우명은?','Y',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNDETAILCODE(CODE_ID,CODE,CODE_NM,CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM022',' P03','나의 보물 제1호는?','나의 보물 제1호는?','Y',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNDETAILCODE(CODE_ID,CODE,CODE_NM,CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM022',' P04','가장 기억에 남는 선생님 성함은?','가장 기억에 남는 선생님 성함은?','Y',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNDETAILCODE(CODE_ID,CODE,CODE_NM,CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM022',' P05','다른 사람은 모르는 나만의 신체비밀은?','다른 사람은 모르는 나만의 신체비밀은?','Y',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNDETAILCODE(CODE_ID,CODE,CODE_NM,CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM025','00000001','공공기관','공공기관','Y',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNDETAILCODE(CODE_ID,CODE,CODE_NM,CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM025','00000002','금융기관','금융기관','Y',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNDETAILCODE(CODE_ID,CODE,CODE_NM,CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM025','00000003','교육기관','교육기관','Y',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNDETAILCODE(CODE_ID,CODE,CODE_NM,CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM025','00000004','의료기관','의료기관','Y',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');
insert into LETTCCMMNDETAILCODE(CODE_ID,CODE,CODE_NM,CODE_DC,USE_AT,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('COM029','url','URL','URL','Y',SYSDATE,'SYSTEM',SYSDATE,'SYSTEM');


-- 조직정보
insert into LETTNORGNZTINFO(ORGNZT_ID,ORGNZT_NM,ORGNZT_DC) values ('ORGNZT_0000000000000','기본조직','기본조직');


-- 그룹정보
insert into LETTNAUTHORGROUPINFO(GROUP_ID,GROUP_NM,GROUP_CREAT_DE,GROUP_DC) values ('GROUP_00000000000000','기본 그룹입니다',SYSDATE,'기본 그룹');


-- 권한정보
insert into LETTNAUTHORINFO(AUTHOR_CODE,AUTHOR_NM,AUTHOR_DC,AUTHOR_CREAT_DE) values ('ROLE_ADMIN','관리자','시스템관리자','2011-08-03');
insert into LETTNAUTHORINFO(AUTHOR_CODE,AUTHOR_NM,AUTHOR_DC,AUTHOR_CREAT_DE) values ('ROLE_ANONYMOUS','오픈기능','오픈기능','2011-08-03');
insert into LETTNAUTHORINFO(AUTHOR_CODE,AUTHOR_NM,AUTHOR_DC,AUTHOR_CREAT_DE) values ('ROLE_USER_MEMBER','사용자','일반사용자','2011-08-03');


-- 권한(롤)계층정보
insert into LETTNROLES_HIERARCHY(PARNTS_ROLE,CHLDRN_ROLE) values ('ROLE_USER_MEMBER','ROLE_ADMIN');
insert into LETTNROLES_HIERARCHY(PARNTS_ROLE,CHLDRN_ROLE) values ('ROLE_ANONYMOUS','ROLE_USER_MEMBER');


-- 롤정보
insert into LETTNROLEINFO(ROLE_CODE,ROLE_NM,ROLE_PTTRN,ROLE_DC,ROLE_TY,ROLE_SORT,ROLE_CREAT_DE) values ('cop-bbs','cop-bbs','/cop/bbs/.*.do.*','게시판','url','1','2011-08-31 15:41:24');
insert into LETTNROLEINFO(ROLE_CODE,ROLE_NM,ROLE_PTTRN,ROLE_DC,ROLE_TY,ROLE_SORT,ROLE_CREAT_DE) values ('cop-com','cop-com','/cop/com/.*.do.*','게시판사용','url','2',SYSDATE);
insert into LETTNROLEINFO(ROLE_CODE,ROLE_NM,ROLE_PTTRN,ROLE_DC,ROLE_TY,ROLE_SORT,ROLE_CREAT_DE) values ('sec-gmt','sec-gmt','/sec/gmt/.*.do.*','그룹관리','url','3',SYSDATE);
insert into LETTNROLEINFO(ROLE_CODE,ROLE_NM,ROLE_PTTRN,ROLE_DC,ROLE_TY,ROLE_SORT,ROLE_CREAT_DE) values ('sec-ram','sec-ram','/sec/ram/.*.do.*','권한관리','url','4',SYSDATE);
insert into LETTNROLEINFO(ROLE_CODE,ROLE_NM,ROLE_PTTRN,ROLE_DC,ROLE_TY,ROLE_SORT,ROLE_CREAT_DE) values ('sec-rgm','sec-rgm','/sec/rgm/.*.do.*','권한그룹관리','url','5',SYSDATE);
insert into LETTNROLEINFO(ROLE_CODE,ROLE_NM,ROLE_PTTRN,ROLE_DC,ROLE_TY,ROLE_SORT,ROLE_CREAT_DE) values ('sec-rmt','sec-rmt','/sec/rmt/.*.do.*','롤관리','url','6',SYSDATE);
insert into LETTNROLEINFO(ROLE_CODE,ROLE_NM,ROLE_PTTRN,ROLE_DC,ROLE_TY,ROLE_SORT,ROLE_CREAT_DE) values ('sts-cst','sts-cst','/sts/cst/.*.do.*','접속통계','url','7',SYSDATE);
insert into LETTNROLEINFO(ROLE_CODE,ROLE_NM,ROLE_PTTRN,ROLE_DC,ROLE_TY,ROLE_SORT,ROLE_CREAT_DE) values ('sym-ccm-cca','sym-ccm-cca','/sym/ccm/cca/.*.do.*','공통코드 등록','url','8',SYSDATE);
insert into LETTNROLEINFO(ROLE_CODE,ROLE_NM,ROLE_PTTRN,ROLE_DC,ROLE_TY,ROLE_SORT,ROLE_CREAT_DE) values ('sym-ccm-ccc','sym-ccm-ccc','/sym/ccm/ccc/.*.do.*','공통분류코드 상세조회','url','9',SYSDATE);
insert into LETTNROLEINFO(ROLE_CODE,ROLE_NM,ROLE_PTTRN,ROLE_DC,ROLE_TY,ROLE_SORT,ROLE_CREAT_DE) values ('sym-ccm-cde','sym-ccm-cde','/sym/ccm/cde/.*.do.*','공통상세코드 등록','url','10',SYSDATE);
insert into LETTNROLEINFO(ROLE_CODE,ROLE_NM,ROLE_PTTRN,ROLE_DC,ROLE_TY,ROLE_SORT,ROLE_CREAT_DE) values ('sym-ccm-zip','sym-ccm-zip','/sym/ccm/zip/.*.do.*','우편번호','url','11',SYSDATE);
insert into LETTNROLEINFO(ROLE_CODE,ROLE_NM,ROLE_PTTRN,ROLE_DC,ROLE_TY,ROLE_SORT,ROLE_CREAT_DE) values ('sym-cmm','sym-cmm','/sym/cmm/.*.do.*','우편번호 찾기','url','12',SYSDATE);
insert into LETTNROLEINFO(ROLE_CODE,ROLE_NM,ROLE_PTTRN,ROLE_DC,ROLE_TY,ROLE_SORT,ROLE_CREAT_DE) values ('sym-log-clg','sym-log-clg','/sym/log/clg/.*.do.*','로그인로그조회','url','13',SYSDATE);
insert into LETTNROLEINFO(ROLE_CODE,ROLE_NM,ROLE_PTTRN,ROLE_DC,ROLE_TY,ROLE_SORT,ROLE_CREAT_DE) values ('sym-mnu-mcm','sym-mnu-mcm','/sym/mnu/mcm/.*.do.*','메뉴생성관리','url','14',SYSDATE);
insert into LETTNROLEINFO(ROLE_CODE,ROLE_NM,ROLE_PTTRN,ROLE_DC,ROLE_TY,ROLE_SORT,ROLE_CREAT_DE) values ('sym-mnu-mpm','sym-mnu-mpm','/sym/mnu/mpm/.*.do.*','메뉴관리','url','15',SYSDATE);
insert into LETTNROLEINFO(ROLE_CODE,ROLE_NM,ROLE_PTTRN,ROLE_DC,ROLE_TY,ROLE_SORT,ROLE_CREAT_DE) values ('sym-prm','sym-prm','/sym/prm/.*.do.*','프로그램목록관리','url','16',SYSDATE);
insert into LETTNROLEINFO(ROLE_CODE,ROLE_NM,ROLE_PTTRN,ROLE_DC,ROLE_TY,ROLE_SORT,ROLE_CREAT_DE) values ('uat-uap','uat-uap','/uat/uap/.*.do.*','로그인정책관리','url','17',SYSDATE);
insert into LETTNROLEINFO(ROLE_CODE,ROLE_NM,ROLE_PTTRN,ROLE_DC,ROLE_TY,ROLE_SORT,ROLE_CREAT_DE) values ('uat-uia','uat-uia','/uat/uia/.*.do.*','로그인메인','url','18',SYSDATE);
insert into LETTNROLEINFO(ROLE_CODE,ROLE_NM,ROLE_PTTRN,ROLE_DC,ROLE_TY,ROLE_SORT,ROLE_CREAT_DE) values ('uss-ion-uas','uss-ion-uas','/uss/ion/uas/.*.do.*','사용자부재관리','url','19',SYSDATE);
insert into LETTNROLEINFO(ROLE_CODE,ROLE_NM,ROLE_PTTRN,ROLE_DC,ROLE_TY,ROLE_SORT,ROLE_CREAT_DE) values ('uss-umt-cmm','uss-umt-cmm','/uss/umt/cmm/.*.do.*','아이디중복확인','url','20',SYSDATE);
insert into LETTNROLEINFO(ROLE_CODE,ROLE_NM,ROLE_PTTRN,ROLE_DC,ROLE_TY,ROLE_SORT,ROLE_CREAT_DE) values ('uss-umt-user','uss-umt-user','/uss/umt/user/.*.do.*','사용자등록','url','21',SYSDATE);


-- 권한별 롤
insert into LETTNAUTHORROLERELATE(AUTHOR_CODE,ROLE_CODE,CREAT_DT) values ('ROLE_ADMIN','sec-gmt',SYSDATE);
insert into LETTNAUTHORROLERELATE(AUTHOR_CODE,ROLE_CODE,CREAT_DT) values ('ROLE_ADMIN','sec-ram',SYSDATE);
insert into LETTNAUTHORROLERELATE(AUTHOR_CODE,ROLE_CODE,CREAT_DT) values ('ROLE_ADMIN','sec-rgm',SYSDATE);
insert into LETTNAUTHORROLERELATE(AUTHOR_CODE,ROLE_CODE,CREAT_DT) values ('ROLE_ADMIN','sec-rmt',SYSDATE);
insert into LETTNAUTHORROLERELATE(AUTHOR_CODE,ROLE_CODE,CREAT_DT) values ('ROLE_ADMIN','sym-ccm-cca',SYSDATE);
insert into LETTNAUTHORROLERELATE(AUTHOR_CODE,ROLE_CODE,CREAT_DT) values ('ROLE_ADMIN','sym-ccm-ccc',SYSDATE);
insert into LETTNAUTHORROLERELATE(AUTHOR_CODE,ROLE_CODE,CREAT_DT) values ('ROLE_ADMIN','sym-ccm-cde',SYSDATE);
insert into LETTNAUTHORROLERELATE(AUTHOR_CODE,ROLE_CODE,CREAT_DT) values ('ROLE_ADMIN','sym-ccm-zip',SYSDATE);
insert into LETTNAUTHORROLERELATE(AUTHOR_CODE,ROLE_CODE,CREAT_DT) values ('ROLE_ADMIN','sym-mnu-mcm',SYSDATE);
insert into LETTNAUTHORROLERELATE(AUTHOR_CODE,ROLE_CODE,CREAT_DT) values ('ROLE_ADMIN','sym-mnu-mpm',SYSDATE);
insert into LETTNAUTHORROLERELATE(AUTHOR_CODE,ROLE_CODE,CREAT_DT) values ('ROLE_ADMIN','sym-prm',SYSDATE);
insert into LETTNAUTHORROLERELATE(AUTHOR_CODE,ROLE_CODE,CREAT_DT) values ('ROLE_ADMIN','uat-uap',SYSDATE);
insert into LETTNAUTHORROLERELATE(AUTHOR_CODE,ROLE_CODE,CREAT_DT) values ('ROLE_ADMIN','uss-umt-cmm',SYSDATE);
insert into LETTNAUTHORROLERELATE(AUTHOR_CODE,ROLE_CODE,CREAT_DT) values ('ROLE_ADMIN','uss-umt-user',SYSDATE);
insert into LETTNAUTHORROLERELATE(AUTHOR_CODE,ROLE_CODE,CREAT_DT) values ('ROLE_ANONYMOUS','cop-bbs',SYSDATE);
insert into LETTNAUTHORROLERELATE(AUTHOR_CODE,ROLE_CODE,CREAT_DT) values ('ROLE_ANONYMOUS','sym-cmm',SYSDATE);
insert into LETTNAUTHORROLERELATE(AUTHOR_CODE,ROLE_CODE,CREAT_DT) values ('ROLE_ANONYMOUS','uat-uia',SYSDATE);
insert into LETTNAUTHORROLERELATE(AUTHOR_CODE,ROLE_CODE,CREAT_DT) values ('ROLE_USER_MEMBER','cop-com',SYSDATE);
insert into LETTNAUTHORROLERELATE(AUTHOR_CODE,ROLE_CODE,CREAT_DT) values ('ROLE_USER_MEMBER','sts-cst',SYSDATE);
insert into LETTNAUTHORROLERELATE(AUTHOR_CODE,ROLE_CODE,CREAT_DT) values ('ROLE_USER_MEMBER','sym-log-clg',SYSDATE);
insert into LETTNAUTHORROLERELATE(AUTHOR_CODE,ROLE_CODE,CREAT_DT) values ('ROLE_USER_MEMBER','uss-ion-uas',SYSDATE);


-- 사용자정보
insert into LETTNEMPLYRINFO(EMPLYR_ID,ORGNZT_ID,USER_NM,PASSWORD,EMPL_NO,IHIDNUM,SEXDSTN_CODE,BRTHDY,FXNUM,HOUSE_ADRES,PASSWORD_HINT,PASSWORD_CNSR,HOUSE_END_TELNO,AREA_NO,DETAIL_ADRES,ZIP,OFFM_TELNO,MBTLNUM,EMAIL_ADRES,OFCPS_NM,HOUSE_MIDDLE_TELNO,GROUP_ID,PSTINST_CODE,EMPLYR_STTUS_CODE,ESNTL_ID,CRTFC_DN_VALUE,SBSCRB_DE) values ('admin','ORGNZT_0000000000000','관리자','a4ayc/80/OGda4BO/1o/V0etpOqiLx1JwB5S3beHW0s=','','','','','','','P01','123','','','','','','123456789','admin@test.com','','','GROUP_00000000000000','00000000','P','USRCNFRM_00000000000','',SYSDATE);
insert into LETTNEMPLYRINFO(EMPLYR_ID,ORGNZT_ID,USER_NM,PASSWORD,EMPL_NO,IHIDNUM,SEXDSTN_CODE,BRTHDY,FXNUM,HOUSE_ADRES,PASSWORD_HINT,PASSWORD_CNSR,HOUSE_END_TELNO,AREA_NO,DETAIL_ADRES,ZIP,OFFM_TELNO,MBTLNUM,EMAIL_ADRES,OFCPS_NM,HOUSE_MIDDLE_TELNO,GROUP_ID,PSTINST_CODE,EMPLYR_STTUS_CODE,ESNTL_ID,CRTFC_DN_VALUE,SBSCRB_DE) values ('user1','ORGNZT_0000000000000','유저1','a4ayc/80/OGda4BO/1o/V0etpOqiLx1JwB5S3beHW0s=','','','','','','','P01','123','','','','','','123456789','test01@test.com','','','GROUP_00000000000000','00000000','P','USRCNFRM_00000000001','',SYSDATE);


-- 사용자별권한설정
insert into LETTNEMPLYRSCRTYESTBS(SCRTY_DTRMN_TRGET_ID,MBER_TY_CODE,AUTHOR_CODE) values ('USRCNFRM_00000000000','USR','ROLE_ADMIN');
insert into LETTNEMPLYRSCRTYESTBS(SCRTY_DTRMN_TRGET_ID,MBER_TY_CODE,AUTHOR_CODE) values ('USRCNFRM_00000000001','USR','ROLE_USER_MEMBER');


-- 게시판템플릿
insert into LETTNTMPLATINFO(TMPLAT_ID,TMPLAT_NM,TMPLAT_COURS,USE_AT,TMPLAT_SE_CODE,FRST_REGISTER_ID,FRST_REGIST_PNTTM,LAST_UPDUSR_ID,LAST_UPDT_PNTTM) values ('TMPLAT_BOARD_DEFAULT','게시판 기본템플릿','/css/egovframework/cop/bbs/egovbbsTemplate.css','Y','TMPT01','USRCNFRM_00000000000',SYSDATE,'USRCNFRM_00000000000',SYSDATE);


-- 게시판마스터
insert into LETTNBBSMASTER(BBS_ID,BBS_NM,BBS_INTRCN,BBS_TY_CODE,BBS_ATTRB_CODE,REPLY_POSBL_AT,FILE_ATCH_POSBL_AT,ATCH_POSBL_FILE_NUMBER,ATCH_POSBL_FILE_SIZE,USE_AT,TMPLAT_ID,FRST_REGISTER_ID,FRST_REGIST_PNTTM,LAST_UPDUSR_ID,LAST_UPDT_PNTTM) values ('BBSMSTR_AAAAAAAAAAAA','공지사항','공지사항게시판','BBST03','BBSA03','Y','Y',2,5242880,'Y','TMPLAT_BOARD_DEFAULT','USRCNFRM_00000000000',SYSDATE,'USRCNFRM_00000000000',SYSDATE);
insert into LETTNBBSMASTER(BBS_ID,BBS_NM,BBS_INTRCN,BBS_TY_CODE,BBS_ATTRB_CODE,REPLY_POSBL_AT,FILE_ATCH_POSBL_AT,ATCH_POSBL_FILE_NUMBER,ATCH_POSBL_FILE_SIZE,USE_AT,TMPLAT_ID,FRST_REGISTER_ID,FRST_REGIST_PNTTM,LAST_UPDUSR_ID,LAST_UPDT_PNTTM) values ('BBSMSTR_BBBBBBBBBBBB','갤러리','갤러리게시판','BBST01','BBSA02','Y','Y',2,5242880,'Y','TMPLAT_BOARD_DEFAULT','USRCNFRM_00000000000',SYSDATE,'USRCNFRM_00000000000',SYSDATE);
insert into LETTNBBSMASTER(BBS_ID,BBS_NM,BBS_INTRCN,BBS_TY_CODE,BBS_ATTRB_CODE,REPLY_POSBL_AT,FILE_ATCH_POSBL_AT,ATCH_POSBL_FILE_NUMBER,ATCH_POSBL_FILE_SIZE,USE_AT,TMPLAT_ID,FRST_REGISTER_ID,FRST_REGIST_PNTTM,LAST_UPDUSR_ID,LAST_UPDT_PNTTM) values ('BBSMSTR_CCCCCCCCCCCC','자료실','자료실게시판','BBST01','BBSA03','Y','Y',2,5242880,'Y','TMPLAT_BOARD_DEFAULT','USRCNFRM_00000000000',SYSDATE,'USRCNFRM_00000000000',SYSDATE);


-- 게시판사용
insert into LETTNBBSUSE(BBS_ID,TRGET_ID,USE_AT,REGIST_SE_CODE,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('BBSMSTR_AAAAAAAAAAAA','SYSTEM_DEFAULT_BOARD','Y','REGC01',SYSDATE,'USRCNFRM_00000000000',SYSDATE,'USRCNFRM_00000000000');
insert into LETTNBBSUSE(BBS_ID,TRGET_ID,USE_AT,REGIST_SE_CODE,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('BBSMSTR_BBBBBBBBBBBB','SYSTEM_DEFAULT_BOARD','Y','REGC01',SYSDATE,'USRCNFRM_00000000000',SYSDATE,'USRCNFRM_00000000000');
insert into LETTNBBSUSE(BBS_ID,TRGET_ID,USE_AT,REGIST_SE_CODE,FRST_REGIST_PNTTM,FRST_REGISTER_ID,LAST_UPDT_PNTTM,LAST_UPDUSR_ID) values ('BBSMSTR_CCCCCCCCCCCC','SYSTEM_DEFAULT_BOARD','Y','REGC01',SYSDATE,'USRCNFRM_00000000000',SYSDATE,'USRCNFRM_00000000000');


-- 프로그램목록
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('dir','/','디렉토리','디렉토리','/');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovAuthorGroupManage','/sec/rgm/','권한그룹관리','권한그룹관리','/sec/rgm/EgovAuthorGroupListView.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovAuthorInsert','/sec/ram/','권한등록','권한등록','/sec/ram/EgovAuthorInsertView.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovAuthorManage','/sec/ram/','권한관리','권한관리','/sec/ram/EgovAuthorList.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovAuthorRoleManage','/sec/ram/','사용자별권한관리','사용자별권한롤관리','/sec/rgm/EgovAuthorGroupListView.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovAuthorUpdt','/sec/ram/','권한수정','권한수정','/sec/ram/EgovAuthor.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovBoardMstrList','/cop/bbs/','게시판 목록조회','게시판 목록조회','/cop/bbs/SelectBBSMasterInfs.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovBoardMstrRegist','/cop/bbs/','게시판 생성','게시판 생성','/cop/bbs/addBBSMaster.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovBoardMstrUpdt','/cop/bbs/','게시판 수정','게시판 수정','/cop/bbs/SelectBBSMasterInf.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovBoardUseInfInqire','/cop/com/','게시판사용여부 상세조회','게시판사용여부 상세조회','/cop/com/selectBBSUseInf.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovBoardUseInfList','/cop/com/','게시판사용여부 목록 조회','게시판사용여부 목록 조회','/cop/com/selectBBSUseInfs.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovBoardUseInfRegist','/cop/com/','게시판사용여부 등록','게시판사용여부 등록','/cop/com/addBBSUseInf.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovCcmCmmnClCodeDetail','/sym/ccm/ccc/','공통분류코드 상세조회','공통분류코드 상세조회','/sym/ccm/ccc/EgovCcmCmmnClCodeDetail.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovCcmCmmnClCodeList','/sym/ccm/ccc/','공통분류코드목록 조회','공통분류코드목록 조회','/sym/ccm/ccc/EgovCcmCmmnClCodeList.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovCcmCmmnClCodeModify','/sym/ccm/ccc/','공통분류코드 수정','공통분류코드 수정','/sym/ccm/ccc/EgovCcmCmmnClCodeModify.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovCcmCmmnClCodeRegist','/sym/ccm/ccc/','공통분류코드 등록','공통분류코드 등록','/sym/ccm/ccc/EgovCcmCmmnClCodeRegist.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovCcmCmmnCodeDetail','/sym/ccm/cca/','공통코드 상세조회','공통코드 상세조회','/sym/ccm/cca/EgovCcmCmmnCodeDetail.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovCcmCmmnCodeList','/sym/ccm/cca/','공통코드목록 조회','공통코드목록 조회','/sym/ccm/cca/EgovCcmCmmnCodeList.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovCcmCmmnCodeModify','/sym/ccm/cca/','공통코드 수정','공통코드 수정','/sym/ccm/cca/EgovCcmCmmnCodeModify.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovCcmCmmnCodeRegist','/sym/ccm/cca/','공통코드 등록','공통코드 등록','/sym/ccm/cca/EgovCcmCmmnCodeRegist.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovCcmCmmnDetailCodeDetail','/sym/ccm/cde/','공통상세코드 상세조회','공통상세코드 상세조회','/sym/ccm/cde/EgovCcmCmmnDetailCodeDetail.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovCcmCmmnDetailCodeList','/sym/ccm/cde/','공통상세코드목록 조회','공통상세코드목록 조회','/sym/ccm/cde/EgovCcmCmmnDetailCodeList.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovCcmCmmnDetailCodeModify','/sym/ccm/cde/','공통상세코드 수정','공통상세코드 수정','/sym/ccm/cde/EgovCcmCmmnDetailCodeModify.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovCcmCmmnDetailCodeRegist','/sym/ccm/cde/','공통상세코드 등록','공통상세코드 등록','/sym/ccm/cde/EgovCcmCmmnDetailCodeRegist.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovCcmExcelZipRegist','/sym/ccm/zip/','우편번호 엑셀파일 등록','우편번호 엑셀파일 등록','/sym/ccm/zip/EgovCcmExcelZipRegist.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovCcmZipDetail','/sym/ccm/zip/','우편번호 상세조회','우편번호 상세조회','/sym/ccm/zip/EgovCcmZipDetail.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovCcmZipList','/sym/ccm/zip/','우편번호목록 조회','우편번호목록 조회','/sym/ccm/zip/EgovCcmZipList.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovCcmZipModify','/sym/ccm/zip/','우편번호 수정','우편번호 수정','/sym/ccm/zip/EgovCcmZipModify.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovCcmZipRegist','/sym/ccm/zip/','우편번호 등록','우편번호 등록','/sym/ccm/zip/EgovCcmZipRegist.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovCcmZipSearchPopup','/sym/cmm/','우편번호 찾기','우편번호 찾기','/sym/cmm/EgovCcmZipSearchPopup.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovConectStats','/sts/cst/','접속통계','접속통계','/sts/cst/selectConectStats.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovFileNmSearch','/sym/prm/','파일명검색','파일명검색','/sym/prm/EgovProgramListSearch.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovGroupInsert','/sec/gmt/','그룹등록','그룹등록','/sec/gmt/EgovGroupInsertView.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovGroupManage','/sec/gmt/','그룹관리','그룹관리','/sec/gmt/EgovGroupList.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovGroupUpdt','/sec/gmt/','그룹수정','그룹수정','/sec/gmt/EgovGroup.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovIdDplctCnfirm','/uss/umt/cmm/','아이디중복확인','아이디중복확인','/uss/umt/cmm/EgovIdDplctCnfirmView.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovInfoNotice','/cop/bbs/','공지사항','공지사항','/cop/bbs/selectBoardList.do?bbsId=BBSMSTR_AAAAAAAAAAAA');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovInfoNoticeAdmin','/cop/bbs/','공지사항관리','공지사항관리','/cop/bbs/selectBoardList.do?bbsId=BBSMSTR_AAAAAAAAAAAA');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovInfoWork','/cop/bbs/','업무게시판','업무게시판','/cop/bbs/selectBoardList.do?bbsId=BBSMSTR_CCCCCCCCCCCC');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovInfoWorkAdmin','/cop/bbs/','업무게시판관리','업무게시판관리','/cop/bbs/selectBoardList.do?bbsId=BBSMSTR_CCCCCCCCCCCC');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovJoinHistory','/','입퇴사정보 관리','입퇴사정보 관리','/EgovPageLink.do?link=main/sample_menu/Sample');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovLoginLogInqire','/sym/log/clg/','로그인로그상세조회','로그인로그상세조회','/sym/log/clg/SelectLoginLogList.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovLoginLogList','/sym/log/clg/','로그인로그조회','로그인로그조회','/sym/log/clg/SelectLoginLogList.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovLoginPolicyList','/uat/uap/','로그인정책관리','로그인정책관리','/uat/uap/selectLoginPolicyList.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovLoginPolicyRegist','/uat/uap/','로그인정책등록','로그인정책등록','/uat/uap/getLoginPolicy.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovLoginPolicyUpdt','/uat/uia/','로그인정책수정','로그인정책수정','/uat/uap/getLoginPolicy.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovLoginUsr','/uat/uia/','내부업무 로그인','내부업무 로그인','/uat/uia/egovLoginUsr.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovMainHome','/uat/uia/','내부업무 메인','내부업무 메인','/uat/uia/actionMain.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovMberPositionl','/','직위정보 관리','직위정보 관리','/EgovPageLink.do?link=main/sample_menu/Sample');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovMberRank','/','직급정보 관리','직급정보 관리','/EgovPageLink.do?link=main/sample_menu/Sample');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovMenuBndeRegist','/sym/mnu/mpm/','메뉴일괄등록','메뉴일괄등록','/sym/mnu/mpm/EgovMenuBndeRegist.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovMenuCreat','/sym/mnu/mcm/','메뉴생성','메뉴생성','/sym/mnu/mcm/EgovMenuCreatSelect.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovMenuCreatManage','/sym/mnu/mcm/','메뉴생성관리','메뉴생성관리','/sym/mnu/mcm/EgovMenuCreatManageSelect.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovMenuDetailSelectUpdt','/sym/mnu/mpm/','메뉴상세조회/수정','메뉴상세조회/수정','/sym/mnu/mpm/EgovMenuManageListDetailSelect.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovMenuManage','/sym/mnu/mpm/','메뉴관리','메뉴관리','/sym/mnu/mpm/EgovMenuManageSelect.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovMenuRegist','/sym/mnu/mpm/','메뉴등록','메뉴등록','/sym/mnu/mpm/EgovMenuRegistInsert.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovNoticeInqire','/cop/bbs/','게시물조회','게시물조회','/cop/bbs/selectBoardArticle.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovNoticeList','/cop/bbs/','게시물 목록','게시물 목록','/cop/bbs/selectBoardList.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovNoticeRegist','/cop/bbs/','게시물 등록','게시물 등록','/cop/bbs/addBoardArticle.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovNoticeReply','/cop/bbs/','답글 작성','답글 작성','/cop/bbs/addReplyBoardArticle.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovNoticeUpdt','/cop/bbs/','게시물 수정','게시물 수정','/cop/bbs/forUpdateBoardArticle.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovProgramListDetailSelectUpdt','/sym/prm/','프로그램목록상세조회/수정','프로그램목록상세조회/수정','/sym/prm/EgovProgramListDetailSelect.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovProgramListManage','/sym/prm/','프로그램목록관리','프로그램목록관리','/sym/prm/EgovProgramListManageSelect.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovProgramListRegist','/sym/prm/','프로그램목록등록','프로그램목록등록','/sym/prm/EgovProgramListRegist.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovRoleInsert','/sec/rmt/','롤등록','롤등록','/sec/rmt/EgovRoleInsertView.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovRoleManage','/sec/rmt/','롤관리','롤관리','/sec/rmt/EgovRoleList.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovRoleUpdt','/sec/rmt/','롤수정','롤수정','/sec/rmt/EgovRole.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovTemplateInqirePopup','/cop/com/','템플릿 조회팝업','템플릿 조회팝업','/cop/com/selectTemplateInfs.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovTemplateList','/cop/com/','템플릿 목록 조회','템플릿 목록 조회','/cop/com/selectTemplateInfs.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovTemplateRegist','/cop/com/','템플릿 등록','템플릿 등록','/cop/com/addTemplateInf.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovTemplateUpdt','/cop/com/','템플릿 수정','템플릿 수정','/cop/com/selectTemplateInf.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovUserAbsnceList','/uss/ion/uas/','사용자부재관리','사용자부재관리','/uss/ion/uas/selectUserAbsnceListView.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovUserAbsnceRegist','/uss/ion/uas/','사용자부재등록','사용자부재등록','/uss/ion/uas/addViewUserAbsnce.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovUserAbsnceUpdt','/uss/ion/uas/','사용자부재수정','사용자부재수정','/uss/ion/uas/getUserAbsnce.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovUserInsert','/uss/umt/user/','사용자등록','사용자등록','/uss/umt/user/EgovUserInsertView.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovUserManage','/uss/umt/user/','사용자관리(조회,삭제)','사용자관리(조회,삭제)','/uss/umt/user/EgovUserManage.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovUserPasswordUpdt','/uss/umt/user/','사용자암호수정','사용자암호수정','/uss/umt/user/EgovUserPasswordUpdtView.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovUserSelectUpdt','/uss/umt/user/','사용자상세조회,수정','사용자상세조회,수정','/uss/umt/user/EgovUserSelectUpdtView.do');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovWorkAttendance','/','출퇴근정보 관리','출퇴근정보 관리','/EgovPageLink.do?link=main/sample_menu/Sample');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovWorkAward','/','상벌정보 관리','상벌정보 관리','/EgovPageLink.do?link=main/sample_menu/Sample');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovWorkEstimation','/','업무평가점수 관리','업무평가점수 관리','/EgovPageLink.do?link=main/sample_menu/Sample');
insert into LETTNPROGRMLIST(PROGRM_FILE_NM,PROGRM_STRE_PATH,PROGRM_KOREAN_NM,PROGRM_DC,URL) values ('EgovWorkVacation','/','휴무정보 관리','휴무정보 관리','/EgovPageLink.do?link=main/sample_menu/Sample');


-- 메뉴목록
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('root','dir',0,0,1,'root','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('알림정보','dir',1000000,0,1,'알림정보','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('공지사항','EgovInfoNotice',1010000,1000000,1,'공지사항','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('업무게시판','EgovInfoWork',1020000,1000000,2,'업무게시판','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('직급체계관리','dir',2000000,0,2,'직급체계관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('입퇴사정보 관리','EgovJoinHistory',2010000,2000000,1,'입퇴사정보 관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('직급정보 관리','EgovMberRank',2020000,2000000,2,'직급정보 관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('직위정보 관리','EgovMberPositionl',2030000,2000000,3,'직위정보 관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('진급관리','dir',3000000,0,3,'진급관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('업무평가점수 관리','EgovWorkEstimation',3010000,3000000,1,'업무평가점수 관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('상벌정보 관리','EgovWorkAward',3040000,3000000,2,'상벌정보 관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('근태관리','dir',4000000,0,4,'근태관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('출퇴근정보 관리','EgovWorkAttendance',4010000,4000000,1,'출퇴근정보 관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('휴무정보 관리','EgovWorkVacation',4020000,4000000,2,'휴무정보 관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('내부서비스관리','dir',5000000,0,5,'내부서비스관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('내부업무게시판관리','dir',5010000,5000000,1,'내부업무게시판관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('게시판템플릿관리','EgovTemplateList',5010100,5010000,1,'게시판템플릿관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('게시판생성관리','EgovBoardMstrList',5010200,5010000,2,'게시판생성관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('게시판사용관리','EgovBoardUseInfList',5010300,5010000,3,'게시판사용관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('공지사항관리','EgovInfoNoticeAdmin',5010400,5010000,4,'공지사항관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('업무게시판관리','EgovInfoWorkAdmin',5010500,5010000,5,'업무게시판관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('사용현황관리','dir',5020000,5000000,2,'사용현황관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('접속로그관리','EgovLoginLogList',5020100,5020000,1,'접속로그관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('접속통계관리','EgovConectStats',5020200,5020000,2,'접속통계관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('로그인정책관리','EgovLoginPolicyList',5020300,5020000,3,'로그인정책관리','','');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('내부시스템관리','dir',6000000,0,6,'내부시스템관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('사용자관리','dir',6010000,6000000,1,'사용자관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('사용자등록관리','EgovUserManage',6010100,6010000,1,'사용자등록관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('사용자부재관리','EgovUserAbsnceList',6010200,6010000,2,'사용자부재관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('사용자권한관리','dir',6020000,6000000,2,'사용자권한관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('권한관리','EgovAuthorManage',6020100,6020000,1,'권한관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('사용자그룹관리','EgovGroupManage',6020200,6020000,2,'사용자그룹관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('사용자별권한관리','EgovAuthorRoleManage',6020300,6020000,3,'사용자별권한관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('롤관리','EgovRoleManage',6020400,6020000,4,'롤관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('메뉴관리','dir',6030000,6000000,3,'메뉴관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('프로그램목록관리','EgovProgramListManage',6030100,6030000,1,'프로그램목록관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('메뉴생성관리','EgovMenuCreatManage',6030200,6030000,2,'메뉴생성관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('메뉴목록관리','EgovMenuManage',6030300,6030000,4,'메뉴목록관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('코드관리','dir',6040000,6000000,4,'코드관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('분류코드관리','EgovCcmCmmnClCodeList',6040100,6040000,1,'분류코드관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('공통코드관리','EgovCcmCmmnCodeList',6040200,6040000,2,'공통코드관리','/','/');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('상세코드관리','EgovCcmCmmnDetailCodeList',6040300,6040000,3,'상세코드관리','','');
insert into LETTNMENUINFO(MENU_NM,PROGRM_FILE_NM,MENU_NO,UPPER_MENU_NO,MENU_ORDR,MENU_DC,RELATE_IMAGE_PATH,RELATE_IMAGE_NM) values ('우편번호관리','EgovCcmZipList',6040400,6040000,4,'우편번호관리','/','/');


-- 메뉴생성목록
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (1000000,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (1000000,'ROLE_USER_MEMBER',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (1010000,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (1010000,'ROLE_USER_MEMBER',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (1020000,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (1020000,'ROLE_USER_MEMBER',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (2000000,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (2000000,'ROLE_USER_MEMBER',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (2010000,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (2010000,'ROLE_USER_MEMBER',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (2020000,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (2020000,'ROLE_USER_MEMBER',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (2030000,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (2030000,'ROLE_USER_MEMBER',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (3000000,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (3000000,'ROLE_USER_MEMBER',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (3010000,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (3010000,'ROLE_USER_MEMBER',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (3040000,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (3040000,'ROLE_USER_MEMBER',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (4000000,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (4000000,'ROLE_USER_MEMBER',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (4010000,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (4010000,'ROLE_USER_MEMBER',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (4020000,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (4020000,'ROLE_USER_MEMBER',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (5000000,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (5000000,'ROLE_USER_MEMBER',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (5010000,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (5010000,'ROLE_USER_MEMBER',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (5010100,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (5010100,'ROLE_USER_MEMBER',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (5010200,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (5010200,'ROLE_USER_MEMBER',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (5010300,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (5010300,'ROLE_USER_MEMBER',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (5010400,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (5010400,'ROLE_USER_MEMBER',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (5010500,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (5010500,'ROLE_USER_MEMBER',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (5020000,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (5020000,'ROLE_USER_MEMBER',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (5020100,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (5020100,'ROLE_USER_MEMBER',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (5020200,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (5020200,'ROLE_USER_MEMBER',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (5020300,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (5020300,'ROLE_USER_MEMBER',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (6000000,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (6010000,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (6010100,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (6010200,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (6020000,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (6020100,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (6020200,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (6020300,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (6020400,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (6030000,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (6030100,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (6030200,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (6030300,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (6040000,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (6040100,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (6040200,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (6040300,'ROLE_ADMIN',null);
insert into LETTNMENUCREATDTLS(MENU_NO,AUTHOR_CODE,MAPNG_CREAT_ID) values (6040400,'ROLE_ADMIN',null);

