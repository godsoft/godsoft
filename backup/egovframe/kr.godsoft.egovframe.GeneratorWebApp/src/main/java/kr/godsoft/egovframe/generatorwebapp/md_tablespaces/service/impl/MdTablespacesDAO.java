package kr.godsoft.egovframe.generatorwebapp.md_tablespaces.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_tablespaces.service.MdTablespacesVO;

/**
 * @Class Name : MdTablespacesDAO.java
 * @Description : MdTablespaces DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdTablespacesDAO")
public class MdTablespacesDAO extends EgovAbstractDAO {

	/**
	 * MD_TABLESPACES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdTablespacesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdTablespaces(MdTablespacesVO vo) throws Exception {
        return (String)insert("mdTablespacesDAO.insertMdTablespaces_S", vo);
    }

    /**
	 * MD_TABLESPACES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdTablespacesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdTablespaces(MdTablespacesVO vo) throws Exception {
        update("mdTablespacesDAO.updateMdTablespaces_S", vo);
    }

    /**
	 * MD_TABLESPACES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdTablespacesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdTablespaces(MdTablespacesVO vo) throws Exception {
        delete("mdTablespacesDAO.deleteMdTablespaces_S", vo);
    }

    /**
	 * MD_TABLESPACES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdTablespacesVO
	 * @return 조회한 MD_TABLESPACES
	 * @exception Exception
	 */
    public MdTablespacesVO selectMdTablespaces(MdTablespacesVO vo) throws Exception {
        return (MdTablespacesVO) selectByPk("mdTablespacesDAO.selectMdTablespaces_S", vo);
    }

    /**
	 * MD_TABLESPACES 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_TABLESPACES 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdTablespacesList(MdTablespacesVO vo) throws Exception {
        return list("mdTablespacesDAO.selectMdTablespacesList_D", vo);
    }

    /**
	 * MD_TABLESPACES 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_TABLESPACES 총 갯수
	 * @exception
	 */
    public int selectMdTablespacesListTotCnt(MdTablespacesVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdTablespacesDAO.selectMdTablespacesListTotCnt_S", vo);
    }

}
