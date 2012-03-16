package kr.godsoft.egovframe.generatorwebapp.imgtemp.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.imgtemp.service.ImgtempVO;

/**
 * @Class Name : ImgtempDAO.java
 * @Description : Imgtemp DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("imgtempDAO")
public class ImgtempDAO extends EgovAbstractDAO {

	/**
	 * imgtemp을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ImgtempVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertImgtemp(ImgtempVO vo) throws Exception {
        return (String)insert("imgtempDAO.insertImgtemp_S", vo);
    }

    /**
	 * imgtemp을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ImgtempVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateImgtemp(ImgtempVO vo) throws Exception {
        update("imgtempDAO.updateImgtemp_S", vo);
    }

    /**
	 * imgtemp을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ImgtempVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteImgtemp(ImgtempVO vo) throws Exception {
        delete("imgtempDAO.deleteImgtemp_S", vo);
    }

    /**
	 * imgtemp을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ImgtempVO
	 * @return 조회한 imgtemp
	 * @exception Exception
	 */
    public ImgtempVO selectImgtemp(ImgtempVO vo) throws Exception {
        return (ImgtempVO) selectByPk("imgtempDAO.selectImgtemp_S", vo);
    }

    /**
	 * imgtemp 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return imgtemp 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectImgtempList(ImgtempVO vo) throws Exception {
        return list("imgtempDAO.selectImgtempList_D", vo);
    }

    /**
	 * imgtemp 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return imgtemp 총 갯수
	 * @exception
	 */
    public int selectImgtempListTotCnt(ImgtempVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("imgtempDAO.selectImgtempListTotCnt_S", vo);
    }

}
