package egovframework.com.uss.ion.ntm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.ComDefaultVO;
import egovframework.com.uss.ion.ntm.service.NoteManage;
import egovframework.com.cmm.service.impl.EgovComAbstractDAO;
/**
 * 쪽지 관리(보내기)를 처리하는 Dao Class 구현
 * @author 공통콤포넌트 장동한
 * @since 2010.06.16
 * @version 1.0
 * @see <pre>
 * &lt;&lt; 개정이력(Modification Information) &gt;&gt;
 *   
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *   2009.07.03  장동한          최초 생성
 * 
 * </pre>
 */
@Repository("noteManageDao")
public class NoteManageDao extends EgovComAbstractDAO {

    /**
     * 쪽지관리 정보를 조회한다.
     * @param noteManage -쪽지 관리(보내기) 정보가 담김 객체
     * @throws Exception
     */
    public Map selectNoteManage(NoteManage noteManage) throws Exception {
    	return (Map)getSqlMapClientTemplate().queryForObject("NoteManage.selectNoteManage", noteManage);
    }
	
    /**
     * 쪽지 관리(보내기)를(을) 등록한다.
     * @param noteManage -쪽지 관리(보내기) 정보가 담김 객체
     * @throws Exception
     */
    public void insertNoteManage(NoteManage noteManage) throws Exception {
    	insert("NoteManage.insertNoteManage", noteManage);
    }
    
    
    /**
     * 보낸쪽지를 등록한다.
     * @param noteManage -쪽지 관리(보내기) 정보가 담김 객체
     * @throws Exception
     */
    public void insertNoteTrnsmit(NoteManage noteManage) throws Exception {
    	insert("NoteManage.insertNoteTrnsmit", noteManage);
    }
    
    
    /**
     * 받은쪽지를 등록한다.
     * @param noteManage -쪽지 관리(보내기) 정보가 담김 객체
     * @throws Exception
     */
    public void insertNoteRecptn(NoteManage noteManage) throws Exception {
    	insert("NoteManage.insertNoteRecptn", noteManage);
    }
    
    /**
	 * 수신자/참조자선택팝업 목록을 조회한다. 
	 * @param searchVO -조회할 정보가 담긴 VO
	 * @return List -회원정보 리스트
	 * @throws Exception
	 */
	public List selectNoteEmpListPopup(ComDefaultVO searchVO) throws Exception {
		return (List)list("NoteManage.EovNoteEmpListPopup", searchVO);
	}

    /**
	 * 수신자/참조자선택팝업 건수를 조회한다. 
	 * @param searchVO -조회할 정보가 담긴 VO
	 * @return int -조회된 데이터 갯수
	 * @throws Exception
	 */
	public int selectNoteEmpListPopupCnt(ComDefaultVO searchVO) throws Exception{
		 return (Integer)getSqlMapClientTemplate().queryForObject("NoteManage.EovNoteEmpListPopupCnt", searchVO);
	}
}
