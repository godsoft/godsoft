package kr.godsoft.egovframe.generatorwebapp.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.sample.service.SampleVO;

/**
 * @Class Name : SampleDAO.java
 * @Description : Sample DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("sampleDAO")
public class SampleDAO extends EgovAbstractDAO {

	/**
	 * sample을 등록한다.
	 * @param vo - 등록할 정보가 담긴 SampleVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertSample(SampleVO vo) throws Exception {
        return (String)insert("sampleDAO.insertSample_S", vo);
    }

    /**
	 * sample을 수정한다.
	 * @param vo - 수정할 정보가 담긴 SampleVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateSample(SampleVO vo) throws Exception {
        update("sampleDAO.updateSample_S", vo);
    }

    /**
	 * sample을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 SampleVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteSample(SampleVO vo) throws Exception {
        delete("sampleDAO.deleteSample_S", vo);
    }

    /**
	 * sample을 조회한다.
	 * @param vo - 조회할 정보가 담긴 SampleVO
	 * @return 조회한 sample
	 * @exception Exception
	 */
    public SampleVO selectSample(SampleVO vo) throws Exception {
        return (SampleVO) selectByPk("sampleDAO.selectSample_S", vo);
    }

    /**
	 * sample 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return sample 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectSampleList(SampleVO vo) throws Exception {
        return list("sampleDAO.selectSampleList_D", vo);
    }

    /**
	 * sample 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return sample 총 갯수
	 * @exception
	 */
    public int selectSampleListTotCnt(SampleVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("sampleDAO.selectSampleListTotCnt_S", vo);
    }

}
