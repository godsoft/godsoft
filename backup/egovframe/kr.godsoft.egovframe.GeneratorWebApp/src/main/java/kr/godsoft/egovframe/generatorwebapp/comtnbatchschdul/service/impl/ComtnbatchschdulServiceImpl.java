package kr.godsoft.egovframe.generatorwebapp.comtnbatchschdul.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnbatchschdul.service.ComtnbatchschdulService;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchschdul.service.ComtnbatchschdulVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnbatchschdulServiceImpl.java
 * @Description : Comtnbatchschdul Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
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
	 * COMTNBATCHSCHDUL을 등록한다.
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
	 * COMTNBATCHSCHDUL을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbatchschdulVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbatchschdul(ComtnbatchschdulVO vo) throws Exception {
        comtnbatchschdulDAO.updateComtnbatchschdul(vo);
    }

    /**
	 * COMTNBATCHSCHDUL을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbatchschdulVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbatchschdul(ComtnbatchschdulVO vo) throws Exception {
        comtnbatchschdulDAO.deleteComtnbatchschdul(vo);
    }

    /**
	 * COMTNBATCHSCHDUL을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbatchschdulVO
	 * @return 조회한 COMTNBATCHSCHDUL
	 * @exception Exception
	 */
    public ComtnbatchschdulVO selectComtnbatchschdul(ComtnbatchschdulVO vo) throws Exception {
        ComtnbatchschdulVO resultVO = comtnbatchschdulDAO.selectComtnbatchschdul(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNBATCHSCHDUL 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBATCHSCHDUL 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnbatchschdulList(ComtnbatchschdulVO vo) throws Exception {
        return comtnbatchschdulDAO.selectComtnbatchschdulList(vo);
    }

    /**
	 * COMTNBATCHSCHDUL 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBATCHSCHDUL 총 갯수
	 * @exception
	 */
    public int selectComtnbatchschdulListTotCnt(ComtnbatchschdulVO vo) {
		return comtnbatchschdulDAO.selectComtnbatchschdulListTotCnt(vo);
	}
    
}