package kr.godsoft.egovframe.generatorwebapp.comtnmtgplaceresve.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnmtgplaceresve.service.ComtnmtgplaceresveService;
import kr.godsoft.egovframe.generatorwebapp.comtnmtgplaceresve.service.ComtnmtgplaceresveVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnmtgplaceresveServiceImpl.java
 * @Description : Comtnmtgplaceresve Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnmtgplaceresveService")
public class ComtnmtgplaceresveServiceImpl extends AbstractServiceImpl implements
        ComtnmtgplaceresveService {

    @Resource(name="comtnmtgplaceresveDAO")
    private ComtnmtgplaceresveDAO comtnmtgplaceresveDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnmtgplaceresveIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNMTGPLACERESVE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmtgplaceresveVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnmtgplaceresve(ComtnmtgplaceresveVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnmtgplaceresveDAO.insertComtnmtgplaceresve(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNMTGPLACERESVE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmtgplaceresveVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnmtgplaceresve(ComtnmtgplaceresveVO vo) throws Exception {
        comtnmtgplaceresveDAO.updateComtnmtgplaceresve(vo);
    }

    /**
	 * COMTNMTGPLACERESVE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmtgplaceresveVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnmtgplaceresve(ComtnmtgplaceresveVO vo) throws Exception {
        comtnmtgplaceresveDAO.deleteComtnmtgplaceresve(vo);
    }

    /**
	 * COMTNMTGPLACERESVE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmtgplaceresveVO
	 * @return 조회한 COMTNMTGPLACERESVE
	 * @exception Exception
	 */
    public ComtnmtgplaceresveVO selectComtnmtgplaceresve(ComtnmtgplaceresveVO vo) throws Exception {
        ComtnmtgplaceresveVO resultVO = comtnmtgplaceresveDAO.selectComtnmtgplaceresve(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNMTGPLACERESVE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNMTGPLACERESVE 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnmtgplaceresveList(ComtnmtgplaceresveVO vo) throws Exception {
        return comtnmtgplaceresveDAO.selectComtnmtgplaceresveList(vo);
    }

    /**
	 * COMTNMTGPLACERESVE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNMTGPLACERESVE 총 갯수
	 * @exception
	 */
    public int selectComtnmtgplaceresveListTotCnt(ComtnmtgplaceresveVO vo) {
		return comtnmtgplaceresveDAO.selectComtnmtgplaceresveListTotCnt(vo);
	}
    
}
