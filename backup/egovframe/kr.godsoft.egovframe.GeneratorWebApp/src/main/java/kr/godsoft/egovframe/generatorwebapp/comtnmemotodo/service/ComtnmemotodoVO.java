package kr.godsoft.egovframe.generatorwebapp.comtnmemotodo.service;

/**
 * @Class Name : ComtnmemotodoVO.java
 * @Description : Comtnmemotodo VO class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtnmemotodoVO extends ComtnmemotodoDefaultVO {
    private static final long serialVersionUID = 1L;
    
    /** TODO_ID */
    private String todoId;
    
    /** TODO_SJ */
    private String todoSj;
    
    /** TODO_BEGIN_TIME */
    private String todoBeginTime;
    
    /** TODO_END_TIME */
    private String todoEndTime;
    
    /** WRTER_ID */
    private String wrterId;
    
    /** TODO_CN */
    private String todoCn;
    
    /** FRST_REGISTER_ID */
    private String frstRegisterId;
    
    /** FRST_REGIST_PNTTM */
    private String frstRegistPnttm;
    
    /** LAST_UPDUSR_ID */
    private String lastUpdusrId;
    
    /** LAST_UPDT_PNTTM */
    private String lastUpdtPnttm;
    
    public String getTodoId() {
        return this.todoId;
    }
    
    public void setTodoId(String todoId) {
        this.todoId = todoId;
    }
    
    public String getTodoSj() {
        return this.todoSj;
    }
    
    public void setTodoSj(String todoSj) {
        this.todoSj = todoSj;
    }
    
    public String getTodoBeginTime() {
        return this.todoBeginTime;
    }
    
    public void setTodoBeginTime(String todoBeginTime) {
        this.todoBeginTime = todoBeginTime;
    }
    
    public String getTodoEndTime() {
        return this.todoEndTime;
    }
    
    public void setTodoEndTime(String todoEndTime) {
        this.todoEndTime = todoEndTime;
    }
    
    public String getWrterId() {
        return this.wrterId;
    }
    
    public void setWrterId(String wrterId) {
        this.wrterId = wrterId;
    }
    
    public String getTodoCn() {
        return this.todoCn;
    }
    
    public void setTodoCn(String todoCn) {
        this.todoCn = todoCn;
    }
    
    public String getFrstRegisterId() {
        return this.frstRegisterId;
    }
    
    public void setFrstRegisterId(String frstRegisterId) {
        this.frstRegisterId = frstRegisterId;
    }
    
    public String getFrstRegistPnttm() {
        return this.frstRegistPnttm;
    }
    
    public void setFrstRegistPnttm(String frstRegistPnttm) {
        this.frstRegistPnttm = frstRegistPnttm;
    }
    
    public String getLastUpdusrId() {
        return this.lastUpdusrId;
    }
    
    public void setLastUpdusrId(String lastUpdusrId) {
        this.lastUpdusrId = lastUpdusrId;
    }
    
    public String getLastUpdtPnttm() {
        return this.lastUpdtPnttm;
    }
    
    public void setLastUpdtPnttm(String lastUpdtPnttm) {
        this.lastUpdtPnttm = lastUpdtPnttm;
    }
    
}
