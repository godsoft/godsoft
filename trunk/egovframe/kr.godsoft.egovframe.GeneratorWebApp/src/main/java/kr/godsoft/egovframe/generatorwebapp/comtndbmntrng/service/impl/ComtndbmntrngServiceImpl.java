package kr.godsoft.egovframe.generatorwebapp.comtndbmntrng.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtndbmntrng.service.ComtndbmntrngService;
import kr.godsoft.egovframe.generatorwebapp.comtndbmntrng.service.ComtndbmntrngVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtndbmntrngServiceImpl.java
 * @Description : Comtndbmntrng Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtndbmntrngService")
public class ComtndbmntrngServiceImpl extends AbstractServiceImpl implements
        ComtndbmntrngService {

    @Resource(name="comtndbmntrngDAO")
    private ComtndbmntrngDAO comtndbmntrngDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtndbmntrngIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtndbmntrng을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndbmntrngVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtndbmntrng(ComtndbmntrngVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtndbmntrngDAO.insertComtndbmntrng(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtndbmntrng을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndbmntrngVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtndbmntrng(ComtndbmntrngVO vo) throws Exception {
        comtndbmntrngDAO.updateComtndbmntrng(vo);
    }

    /**
	 * comtndbmntrng을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndbmntrngVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtndbmntrng(ComtndbmntrngVO vo) throws Exception {
        comtndbmntrngDAO.deleteComtndbmntrng(vo);
    }

    /**
	 * comtndbmntrng을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndbmntrngVO
	 * @return 조회한 comtndbmntrng
	 * @exception Exception
	 */
    public ComtndbmntrngVO selectComtndbmntrng(ComtndbmntrngVO vo) throws Exception {
        ComtndbmntrngVO resultVO = comtndbmntrngDAO.selectComtndbmntrng(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtndbmntrng 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndbmntrng 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtndbmntrngList(ComtndbmntrngVO vo) throws Exception {
        return comtndbmntrngDAO.selectComtndbmntrngList(vo);
    }

    /**
	 * comtndbmntrng 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndbmntrng 총 갯수
	 * @exception
	 */
    public int selectComtndbmntrngListTotCnt(ComtndbmntrngVO vo) {
		return comtndbmntrngDAO.selectComtndbmntrngListTotCnt(vo);
	}
    
}
