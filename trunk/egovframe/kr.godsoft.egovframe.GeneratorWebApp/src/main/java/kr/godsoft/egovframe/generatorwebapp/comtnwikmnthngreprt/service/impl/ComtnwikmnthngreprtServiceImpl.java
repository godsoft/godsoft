package kr.godsoft.egovframe.generatorwebapp.comtnwikmnthngreprt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnwikmnthngreprt.service.ComtnwikmnthngreprtService;
import kr.godsoft.egovframe.generatorwebapp.comtnwikmnthngreprt.service.ComtnwikmnthngreprtVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnwikmnthngreprtServiceImpl.java
 * @Description : Comtnwikmnthngreprt Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnwikmnthngreprtService")
public class ComtnwikmnthngreprtServiceImpl extends AbstractServiceImpl implements
        ComtnwikmnthngreprtService {

    @Resource(name="comtnwikmnthngreprtDAO")
    private ComtnwikmnthngreprtDAO comtnwikmnthngreprtDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnwikmnthngreprtIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnwikmnthngreprt을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnwikmnthngreprtVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnwikmnthngreprt(ComtnwikmnthngreprtVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnwikmnthngreprtDAO.insertComtnwikmnthngreprt(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnwikmnthngreprt을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnwikmnthngreprtVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnwikmnthngreprt(ComtnwikmnthngreprtVO vo) throws Exception {
        comtnwikmnthngreprtDAO.updateComtnwikmnthngreprt(vo);
    }

    /**
	 * comtnwikmnthngreprt을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnwikmnthngreprtVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnwikmnthngreprt(ComtnwikmnthngreprtVO vo) throws Exception {
        comtnwikmnthngreprtDAO.deleteComtnwikmnthngreprt(vo);
    }

    /**
	 * comtnwikmnthngreprt을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnwikmnthngreprtVO
	 * @return 조회한 comtnwikmnthngreprt
	 * @exception Exception
	 */
    public ComtnwikmnthngreprtVO selectComtnwikmnthngreprt(ComtnwikmnthngreprtVO vo) throws Exception {
        ComtnwikmnthngreprtVO resultVO = comtnwikmnthngreprtDAO.selectComtnwikmnthngreprt(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnwikmnthngreprt 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnwikmnthngreprt 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnwikmnthngreprtList(ComtnwikmnthngreprtVO vo) throws Exception {
        return comtnwikmnthngreprtDAO.selectComtnwikmnthngreprtList(vo);
    }

    /**
	 * comtnwikmnthngreprt 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnwikmnthngreprt 총 갯수
	 * @exception
	 */
    public int selectComtnwikmnthngreprtListTotCnt(ComtnwikmnthngreprtVO vo) {
		return comtnwikmnthngreprtDAO.selectComtnwikmnthngreprtListTotCnt(vo);
	}
    
}
