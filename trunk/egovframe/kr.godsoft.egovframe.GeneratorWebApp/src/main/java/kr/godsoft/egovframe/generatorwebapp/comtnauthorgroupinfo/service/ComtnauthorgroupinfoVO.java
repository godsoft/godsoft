package kr.godsoft.egovframe.generatorwebapp.comtnauthorgroupinfo.service;

/**
 * @Class Name : ComtnauthorgroupinfoVO.java
 * @Description : Comtnauthorgroupinfo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnauthorgroupinfoVO extends ComtnauthorgroupinfoDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** GROUP_ID */
    private String groupId;
    
    /** GROUP_NM */
    private String groupNm;
    
    /** GROUP_CREAT_DE */
    private String groupCreatDe;
    
    /** GROUP_DC */
    private String groupDc;
    
    public String getGroupId() {
        return this.groupId;
    }
    
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    
    public String getGroupNm() {
        return this.groupNm;
    }
    
    public void setGroupNm(String groupNm) {
        this.groupNm = groupNm;
    }
    
    public String getGroupCreatDe() {
        return this.groupCreatDe;
    }
    
    public void setGroupCreatDe(String groupCreatDe) {
        this.groupCreatDe = groupCreatDe;
    }
    
    public String getGroupDc() {
        return this.groupDc;
    }
    
    public void setGroupDc(String groupDc) {
        this.groupDc = groupDc;
    }
    
}
