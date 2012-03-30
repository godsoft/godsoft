package kr.godsoft.egovframe.generatorwebapp.migration_reserved_words.service;

/**
 * @Class Name : MigrationReservedWordsVO.java
 * @Description : MigrationReservedWords VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class MigrationReservedWordsVO extends MigrationReservedWordsDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** KEYWORD */
    private String keyword;
    
    public String getKeyword() {
        return this.keyword;
    }
    
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    
}
