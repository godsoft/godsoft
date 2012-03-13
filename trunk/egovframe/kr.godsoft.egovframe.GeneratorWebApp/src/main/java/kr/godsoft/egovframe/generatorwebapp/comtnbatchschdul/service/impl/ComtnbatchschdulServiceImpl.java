package kr.godsoft.egovframe.generatorwebapp.comtnbatchschdul.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchschdul.service.ComtnbatchschdulService;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchschdul.service.ComtnbatchschdulDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchschdul.service.ComtnbatchschdulVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchschdul.service.impl.ComtnbatchschdulDAO;

/**
 * @Class Name : ComtnbatchschdulServiceImpl.java
 * @Description : Comtnbatchschdul Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnbatchschdulService")
public class ComtnbatchschdulServiceImpl extends AbstractServiceImpl implements
        ComtnbatchschdulService {

    @Resource(name="comtnbatchschdulDAO")
    private ComtnbatchschdulDAO comtnbatchschdulDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnbatchschdulIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnbatchschdul을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbatchschdulVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbatchschdul(ComtnbatchschdulVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnbatchschdulDAO.insertComtnbatchschdul(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnbatchschdul을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbatchschdulVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbatchschdul(ComtnbatchschdulVO vo) throws Exception {
        comtnbatchschdulDAO.updateComtnbatchschdul(vo);
    }

    /**
	 * comtnbatchschdul을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbatchschdulVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbatchschdul(ComtnbatchschdulVO vo) throws Exception {
        comtnbatchschdulDAO.deleteComtnbatchschdul(vo);
    }

    /**
	 * comtnbatchschdul을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbatchschdulVO
	 * @return 조회한 comtnbatchschdul
	 * @exception Exception
	 */
    public ComtnbatchschdulVO selectComtnbatchschdul(ComtnbatchschdulVO vo) throws Exception {
        ComtnbatchschdulVO resultVO = comtnbatchschdulDAO.selectComtnbatchschdul(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnbatchschdul 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbatchschdul 목록
	 * @exception Exception
	 */
    public List selectComtnbatchschdulList(ComtnbatchschdulDefaultVO searchVO) throws Exception {
        return comtnbatchschdulDAO.selectComtnbatchschdulList(searchVO);
    }

    /**
	 * comtnbatchschdul 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbatchschdul 총 갯수
	 * @exception
	 */
    public int selectComtnbatchschdulListTotCnt(ComtnbatchschdulDefaultVO searchVO) {
		return comtnbatchschdulDAO.selectComtnbatchschdulListTotCnt(searchVO);
	}
    
}
