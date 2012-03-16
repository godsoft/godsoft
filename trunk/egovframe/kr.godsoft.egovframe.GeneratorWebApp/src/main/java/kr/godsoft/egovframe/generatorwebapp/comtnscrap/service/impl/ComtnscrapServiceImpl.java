package kr.godsoft.egovframe.generatorwebapp.comtnscrap.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnscrap.service.ComtnscrapService;
import kr.godsoft.egovframe.generatorwebapp.comtnscrap.service.ComtnscrapVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnscrapServiceImpl.java
 * @Description : Comtnscrap Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnscrapService")
public class ComtnscrapServiceImpl extends AbstractServiceImpl implements
        ComtnscrapService {

    @Resource(name="comtnscrapDAO")
    private ComtnscrapDAO comtnscrapDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnscrapIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnscrap을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnscrapVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnscrap(ComtnscrapVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnscrapDAO.insertComtnscrap(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnscrap을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnscrapVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnscrap(ComtnscrapVO vo) throws Exception {
        comtnscrapDAO.updateComtnscrap(vo);
    }

    /**
	 * comtnscrap을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnscrapVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnscrap(ComtnscrapVO vo) throws Exception {
        comtnscrapDAO.deleteComtnscrap(vo);
    }

    /**
	 * comtnscrap을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnscrapVO
	 * @return 조회한 comtnscrap
	 * @exception Exception
	 */
    public ComtnscrapVO selectComtnscrap(ComtnscrapVO vo) throws Exception {
        ComtnscrapVO resultVO = comtnscrapDAO.selectComtnscrap(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnscrap 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnscrap 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnscrapList(ComtnscrapVO vo) throws Exception {
        return comtnscrapDAO.selectComtnscrapList(vo);
    }

    /**
	 * comtnscrap 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnscrap 총 갯수
	 * @exception
	 */
    public int selectComtnscrapListTotCnt(ComtnscrapVO vo) {
		return comtnscrapDAO.selectComtnscrapListTotCnt(vo);
	}
    
}
