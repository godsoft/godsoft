package kr.godsoft.egovframe.generatorwebapp.comtecopseq.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtecopseq.service.ComtecopseqService;
import kr.godsoft.egovframe.generatorwebapp.comtecopseq.service.ComtecopseqDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtecopseq.service.ComtecopseqVO;
import kr.godsoft.egovframe.generatorwebapp.comtecopseq.service.impl.ComtecopseqDAO;

/**
 * @Class Name : ComtecopseqServiceImpl.java
 * @Description : Comtecopseq Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtecopseqService")
public class ComtecopseqServiceImpl extends AbstractServiceImpl implements
        ComtecopseqService {

    @Resource(name="comtecopseqDAO")
    private ComtecopseqDAO comtecopseqDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtecopseqIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtecopseq을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtecopseqVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtecopseq(ComtecopseqVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtecopseqDAO.insertComtecopseq(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtecopseq을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtecopseqVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtecopseq(ComtecopseqVO vo) throws Exception {
        comtecopseqDAO.updateComtecopseq(vo);
    }

    /**
	 * comtecopseq을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtecopseqVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtecopseq(ComtecopseqVO vo) throws Exception {
        comtecopseqDAO.deleteComtecopseq(vo);
    }

    /**
	 * comtecopseq을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtecopseqVO
	 * @return 조회한 comtecopseq
	 * @exception Exception
	 */
    public ComtecopseqVO selectComtecopseq(ComtecopseqVO vo) throws Exception {
        ComtecopseqVO resultVO = comtecopseqDAO.selectComtecopseq(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtecopseq 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtecopseq 목록
	 * @exception Exception
	 */
    public List selectComtecopseqList(ComtecopseqDefaultVO searchVO) throws Exception {
        return comtecopseqDAO.selectComtecopseqList(searchVO);
    }

    /**
	 * comtecopseq 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtecopseq 총 갯수
	 * @exception
	 */
    public int selectComtecopseqListTotCnt(ComtecopseqDefaultVO searchVO) {
		return comtecopseqDAO.selectComtecopseqListTotCnt(searchVO);
	}
    
}
