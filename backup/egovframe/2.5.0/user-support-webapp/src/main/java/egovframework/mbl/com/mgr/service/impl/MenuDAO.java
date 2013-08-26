package egovframework.mbl.com.mgr.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mbl.com.mgr.service.MenuVO;
import egovframework.com.cmm.service.impl.EgovComAbstractDAO;

/**
 * @Class Name : MenuDAO.java
 * @Description : 모바일 템플릿에서 사용해야 하는 서비스를 정의하기위한 데이터 접근 클래스
 * @Modification Information
 *
 *    수정일                    수정자               수정내용
 *    -------        -------     -------------------
 *    2011.08.23         최서윤		   최초생성
 *
 * @author 모바일 개발환경 개발팀 최서윤
 * @since 2011.08.23
 * @version 1.0
 *
 */

@Repository("MenuDAO")
public class MenuDAO extends EgovComAbstractDAO{
	
	/**
	 * 메뉴정보를 삭제한다.
	 * @param menu
	 * @throws Exception
	 */
	public void deleteMenu(MenuVO menu) throws Exception {
		delete("MenuDAO.deleteMenu_S", menu);
	}


	/**
	 * 메뉴정보를 등록한다.
	 * @param menu
	 * @throws Exception
	 */
	public void insertMenu(MenuVO menu) throws Exception {
        insert("MenuDAO.insertMenu_S", menu);
	}

	/**
	 * 메뉴정보 상세항목을 조회한다.
	 * @param menu
	 * @return CmmnCode(메뉴정보)
	 */
	public MenuVO selectMenuDetail(MenuVO menu) throws Exception {
		return (MenuVO)selectByPk("MenuDAO.selectMenu_S", menu);
	}


    /**
	 * 메뉴정보 목록을 조회한다.
     * @param searchVO
     * @return List(메뉴정보 목록)
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
    public List<MenuVO> selectMenuList(MenuVO menu) throws Exception {
        return list("MenuDAO.selectMenuList_S", menu);
    }
	
	 /**
	 * 상위메뉴 목록을 조회한다.
     * @param searchVO
     * @return List(메뉴정보 목록)
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
    public List<MenuVO> selectUpperMenuList(MenuVO menu) throws Exception {
        return list("MenuDAO.selectUpperMenuList_S", menu);
    }

	/**
	 * 메뉴정보를 수정한다.
	 * @param cmmnCode
	 * @throws Exception
	 */
	public void updateMenu(MenuVO menu) throws Exception {
		update("MenuDAO.updateMenu_S", menu);
	}


	 /**
	 * 사용여부가 참인 목록만 조회한다.
     * @param searchVO
     * @return List(메뉴정보 목록)
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<MenuVO> selectUseList(MenuVO menu) {
		return list("MenuDAO.selectMenuUseList_S", menu);
	}
}
