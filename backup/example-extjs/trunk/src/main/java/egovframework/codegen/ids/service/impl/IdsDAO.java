package egovframework.codegen.ids.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.codegen.ids.service.IdsDefaultVO;
import egovframework.codegen.ids.service.IdsVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : IdsDAO.java
 * @Description : Ids DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2013-01-09
 * @version 1.0
 * @see
 *
 *  Copyright (C)  All right reserved.
 */

@Repository("idsDAO")
public class IdsDAO extends EgovAbstractDAO {

    /**
     * ids을 등록한다.
     * @param vo - 등록할 정보가 담긴 IdsVO
     * @return 등록 결과
     * @exception Exception
     */
    public String insertIds(IdsVO vo) throws Exception {
        return (String) insert("idsDAO.insertIds_S", vo);
    }

    /**
     * ids을 수정한다.
     * @param vo - 수정할 정보가 담긴 IdsVO
     * @return void형
     * @exception Exception
     */
    public int updateIds(IdsVO vo) throws Exception {
        return update("idsDAO.updateIds_S", vo);
    }

    /**
     * ids을 삭제한다.
     * @param vo - 삭제할 정보가 담긴 IdsVO
     * @return void형
     * @exception Exception
     */
    public int deleteIds(IdsVO vo) throws Exception {
        return delete("idsDAO.deleteIds_S", vo);
    }

    /**
     * ids을 조회한다.
     * @param vo - 조회할 정보가 담긴 IdsVO
     * @return 조회한 ids
     * @exception Exception
     */
    public IdsVO selectIds(IdsVO vo) throws Exception {
        return (IdsVO) selectByPk("idsDAO.selectIds_S", vo);
    }

    /**
     * ids 목록을 조회한다.
     * @param searchMap - 조회할 정보가 담긴 Map
     * @return ids 목록
     * @exception Exception
     */
    @SuppressWarnings("unchecked")
    public List<EgovMap> selectIdsList(IdsDefaultVO searchVO) throws Exception {
        return list("idsDAO.selectIdsList_D", searchVO);
    }

    /**
     * ids 총 갯수를 조회한다.
     * @param searchMap - 조회할 정보가 담긴 Map
     * @return ids 총 갯수
     * @exception
     */
    public int selectIdsListTotCnt(IdsDefaultVO searchVO) {
        return (Integer) getSqlMapClientTemplate().queryForObject("idsDAO.selectIdsListTotCnt_S", searchVO);
    }

}