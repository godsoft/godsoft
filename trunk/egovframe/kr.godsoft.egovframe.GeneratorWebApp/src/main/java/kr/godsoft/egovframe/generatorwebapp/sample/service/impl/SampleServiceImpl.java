package kr.godsoft.egovframe.generatorwebapp.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.sample.service.SampleService;
import kr.godsoft.egovframe.generatorwebapp.sample.service.SampleVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : SampleServiceImpl.java
 * @Description : Sample Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("sampleService")
public class SampleServiceImpl extends AbstractServiceImpl implements
        SampleService {

    @Resource(name="sampleDAO")
    private SampleDAO sampleDAO;
    
    /** ID Generation */
    //@Resource(name="{egovSampleIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * sample을 등록한다.
	 * @param vo - 등록할 정보가 담긴 SampleVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertSample(SampleVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	sampleDAO.insertSample(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * sample을 수정한다.
	 * @param vo - 수정할 정보가 담긴 SampleVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateSample(SampleVO vo) throws Exception {
        sampleDAO.updateSample(vo);
    }

    /**
	 * sample을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 SampleVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteSample(SampleVO vo) throws Exception {
        sampleDAO.deleteSample(vo);
    }

    /**
	 * sample을 조회한다.
	 * @param vo - 조회할 정보가 담긴 SampleVO
	 * @return 조회한 sample
	 * @exception Exception
	 */
    public SampleVO selectSample(SampleVO vo) throws Exception {
        SampleVO resultVO = sampleDAO.selectSample(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * sample 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return sample 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectSampleList(SampleVO vo) throws Exception {
        return sampleDAO.selectSampleList(vo);
    }

    /**
	 * sample 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return sample 총 갯수
	 * @exception
	 */
    public int selectSampleListTotCnt(SampleVO vo) {
		return sampleDAO.selectSampleListTotCnt(vo);
	}
    
}
