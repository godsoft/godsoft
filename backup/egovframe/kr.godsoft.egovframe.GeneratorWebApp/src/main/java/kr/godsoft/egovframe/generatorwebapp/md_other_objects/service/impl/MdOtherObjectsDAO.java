package kr.godsoft.egovframe.generatorwebapp.md_other_objects.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_other_objects.service.MdOtherObjectsVO;

/**
 * @Class Name : MdOtherObjectsDAO.java
 * @Description : MdOtherObjects DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdOtherObjectsDAO")
public class MdOtherObjectsDAO extends EgovAbstractDAO {

	/**
	 * MD_OTHER_OBJECTS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdOtherObjectsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdOtherObjects(MdOtherObjectsVO vo) throws Exception {
        return (String)insert("mdOtherObjectsDAO.insertMdOtherObjects_S", vo);
    }

    /**
	 * MD_OTHER_OBJECTS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdOtherObjectsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdOtherObjects(MdOtherObjectsVO vo) throws Exception {
        update("mdOtherObjectsDAO.updateMdOtherObjects_S", vo);
    }

    /**
	 * MD_OTHER_OBJECTS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdOtherObjectsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdOtherObjects(MdOtherObjectsVO vo) throws Exception {
        delete("mdOtherObjectsDAO.deleteMdOtherObjects_S", vo);
    }

    /**
	 * MD_OTHER_OBJECTS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdOtherObjectsVO
	 * @return 조회한 MD_OTHER_OBJECTS
	 * @exception Exception
	 */
    public MdOtherObjectsVO selectMdOtherObjects(MdOtherObjectsVO vo) throws Exception {
        return (MdOtherObjectsVO) selectByPk("mdOtherObjectsDAO.selectMdOtherObjects_S", vo);
    }

    /**
	 * MD_OTHER_OBJECTS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_OTHER_OBJECTS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdOtherObjectsList(MdOtherObjectsVO vo) throws Exception {
        return list("mdOtherObjectsDAO.selectMdOtherObjectsList_D", vo);
    }

    /**
	 * MD_OTHER_OBJECTS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_OTHER_OBJECTS 총 갯수
	 * @exception
	 */
    public int selectMdOtherObjectsListTotCnt(MdOtherObjectsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdOtherObjectsDAO.selectMdOtherObjectsListTotCnt_S", vo);
    }

}
