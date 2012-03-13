package kr.godsoft.egovframe.generatorwebapp.comtnqustnriem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnriem.service.ComtnqustnriemService;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnriem.service.ComtnqustnriemDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnriem.service.ComtnqustnriemVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqustnriem.service.impl.ComtnqustnriemDAO;

/**
 * @Class Name : ComtnqustnriemServiceImpl.java
 * @Description : Comtnqustnriem Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnqustnriemService")
public class ComtnqustnriemServiceImpl extends AbstractServiceImpl implements
        ComtnqustnriemService {

    @Resource(name="comtnqustnriemDAO")
    private ComtnqustnriemDAO comtnqustnriemDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnqustnriemIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnqustnriem을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqustnriemVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnqustnriem(ComtnqustnriemVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnqustnriemDAO.insertComtnqustnriem(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnqustnriem을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqustnriemVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnqustnriem(ComtnqustnriemVO vo) throws Exception {
        comtnqustnriemDAO.updateComtnqustnriem(vo);
    }

    /**
	 * comtnqustnriem을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqustnriemVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnqustnriem(ComtnqustnriemVO vo) throws Exception {
        comtnqustnriemDAO.deleteComtnqustnriem(vo);
    }

    /**
	 * comtnqustnriem을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqustnriemVO
	 * @return 조회한 comtnqustnriem
	 * @exception Exception
	 */
    public ComtnqustnriemVO selectComtnqustnriem(ComtnqustnriemVO vo) throws Exception {
        ComtnqustnriemVO resultVO = comtnqustnriemDAO.selectComtnqustnriem(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnqustnriem 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnqustnriem 목록
	 * @exception Exception
	 */
    public List selectComtnqustnriemList(ComtnqustnriemDefaultVO searchVO) throws Exception {
        return comtnqustnriemDAO.selectComtnqustnriemList(searchVO);
    }

    /**
	 * comtnqustnriem 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnqustnriem 총 갯수
	 * @exception
	 */
    public int selectComtnqustnriemListTotCnt(ComtnqustnriemDefaultVO searchVO) {
		return comtnqustnriemDAO.selectComtnqustnriemListTotCnt(searchVO);
	}
    
}
