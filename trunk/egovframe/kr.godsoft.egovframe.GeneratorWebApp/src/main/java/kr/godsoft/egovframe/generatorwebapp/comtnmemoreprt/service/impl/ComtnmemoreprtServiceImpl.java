package kr.godsoft.egovframe.generatorwebapp.comtnmemoreprt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnmemoreprt.service.ComtnmemoreprtService;
import kr.godsoft.egovframe.generatorwebapp.comtnmemoreprt.service.ComtnmemoreprtVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnmemoreprtServiceImpl.java
 * @Description : Comtnmemoreprt Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnmemoreprtService")
public class ComtnmemoreprtServiceImpl extends AbstractServiceImpl implements
        ComtnmemoreprtService {

    @Resource(name="comtnmemoreprtDAO")
    private ComtnmemoreprtDAO comtnmemoreprtDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnmemoreprtIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnmemoreprt을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmemoreprtVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnmemoreprt(ComtnmemoreprtVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnmemoreprtDAO.insertComtnmemoreprt(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnmemoreprt을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmemoreprtVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnmemoreprt(ComtnmemoreprtVO vo) throws Exception {
        comtnmemoreprtDAO.updateComtnmemoreprt(vo);
    }

    /**
	 * comtnmemoreprt을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmemoreprtVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnmemoreprt(ComtnmemoreprtVO vo) throws Exception {
        comtnmemoreprtDAO.deleteComtnmemoreprt(vo);
    }

    /**
	 * comtnmemoreprt을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmemoreprtVO
	 * @return 조회한 comtnmemoreprt
	 * @exception Exception
	 */
    public ComtnmemoreprtVO selectComtnmemoreprt(ComtnmemoreprtVO vo) throws Exception {
        ComtnmemoreprtVO resultVO = comtnmemoreprtDAO.selectComtnmemoreprt(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnmemoreprt 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmemoreprt 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnmemoreprtList(ComtnmemoreprtVO vo) throws Exception {
        return comtnmemoreprtDAO.selectComtnmemoreprtList(vo);
    }

    /**
	 * comtnmemoreprt 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmemoreprt 총 갯수
	 * @exception
	 */
    public int selectComtnmemoreprtListTotCnt(ComtnmemoreprtVO vo) {
		return comtnmemoreprtDAO.selectComtnmemoreprtListTotCnt(vo);
	}
    
}
