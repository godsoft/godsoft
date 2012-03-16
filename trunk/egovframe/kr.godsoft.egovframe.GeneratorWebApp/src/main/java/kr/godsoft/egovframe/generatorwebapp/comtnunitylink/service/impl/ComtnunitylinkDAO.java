package kr.godsoft.egovframe.generatorwebapp.comtnunitylink.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnunitylink.service.ComtnunitylinkVO;

/**
 * @Class Name : ComtnunitylinkDAO.java
 * @Description : Comtnunitylink DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnunitylinkDAO")
public class ComtnunitylinkDAO extends EgovAbstractDAO {

	/**
	 * comtnunitylink을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnunitylinkVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnunitylink(ComtnunitylinkVO vo) throws Exception {
        return (String)insert("comtnunitylinkDAO.insertComtnunitylink_S", vo);
    }

    /**
	 * comtnunitylink을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnunitylinkVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnunitylink(ComtnunitylinkVO vo) throws Exception {
        update("comtnunitylinkDAO.updateComtnunitylink_S", vo);
    }

    /**
	 * comtnunitylink을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnunitylinkVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnunitylink(ComtnunitylinkVO vo) throws Exception {
        delete("comtnunitylinkDAO.deleteComtnunitylink_S", vo);
    }

    /**
	 * comtnunitylink을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnunitylinkVO
	 * @return 조회한 comtnunitylink
	 * @exception Exception
	 */
    public ComtnunitylinkVO selectComtnunitylink(ComtnunitylinkVO vo) throws Exception {
        return (ComtnunitylinkVO) selectByPk("comtnunitylinkDAO.selectComtnunitylink_S", vo);
    }

    /**
	 * comtnunitylink 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnunitylink 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnunitylinkList(ComtnunitylinkVO vo) throws Exception {
        return list("comtnunitylinkDAO.selectComtnunitylinkList_D", vo);
    }

    /**
	 * comtnunitylink 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnunitylink 총 갯수
	 * @exception
	 */
    public int selectComtnunitylinkListTotCnt(ComtnunitylinkVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnunitylinkDAO.selectComtnunitylinkListTotCnt_S", vo);
    }

}
