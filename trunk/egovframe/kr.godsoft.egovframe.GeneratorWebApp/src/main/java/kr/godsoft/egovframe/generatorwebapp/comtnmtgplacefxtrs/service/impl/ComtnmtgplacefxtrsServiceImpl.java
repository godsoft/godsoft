package kr.godsoft.egovframe.generatorwebapp.comtnmtgplacefxtrs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnmtgplacefxtrs.service.ComtnmtgplacefxtrsService;
import kr.godsoft.egovframe.generatorwebapp.comtnmtgplacefxtrs.service.ComtnmtgplacefxtrsVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnmtgplacefxtrsServiceImpl.java
 * @Description : Comtnmtgplacefxtrs Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnmtgplacefxtrsService")
public class ComtnmtgplacefxtrsServiceImpl extends AbstractServiceImpl implements
        ComtnmtgplacefxtrsService {

    @Resource(name="comtnmtgplacefxtrsDAO")
    private ComtnmtgplacefxtrsDAO comtnmtgplacefxtrsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnmtgplacefxtrsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNMTGPLACEFXTRS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmtgplacefxtrsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnmtgplacefxtrs(ComtnmtgplacefxtrsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnmtgplacefxtrsDAO.insertComtnmtgplacefxtrs(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNMTGPLACEFXTRS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmtgplacefxtrsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnmtgplacefxtrs(ComtnmtgplacefxtrsVO vo) throws Exception {
        comtnmtgplacefxtrsDAO.updateComtnmtgplacefxtrs(vo);
    }

    /**
	 * COMTNMTGPLACEFXTRS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmtgplacefxtrsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnmtgplacefxtrs(ComtnmtgplacefxtrsVO vo) throws Exception {
        comtnmtgplacefxtrsDAO.deleteComtnmtgplacefxtrs(vo);
    }

    /**
	 * COMTNMTGPLACEFXTRS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmtgplacefxtrsVO
	 * @return 조회한 COMTNMTGPLACEFXTRS
	 * @exception Exception
	 */
    public ComtnmtgplacefxtrsVO selectComtnmtgplacefxtrs(ComtnmtgplacefxtrsVO vo) throws Exception {
        ComtnmtgplacefxtrsVO resultVO = comtnmtgplacefxtrsDAO.selectComtnmtgplacefxtrs(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNMTGPLACEFXTRS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNMTGPLACEFXTRS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnmtgplacefxtrsList(ComtnmtgplacefxtrsVO vo) throws Exception {
        return comtnmtgplacefxtrsDAO.selectComtnmtgplacefxtrsList(vo);
    }

    /**
	 * COMTNMTGPLACEFXTRS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNMTGPLACEFXTRS 총 갯수
	 * @exception
	 */
    public int selectComtnmtgplacefxtrsListTotCnt(ComtnmtgplacefxtrsVO vo) {
		return comtnmtgplacefxtrsDAO.selectComtnmtgplacefxtrsListTotCnt(vo);
	}
    
}
