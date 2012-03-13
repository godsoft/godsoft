package kr.godsoft.egovframe.generatorwebapp.comtnfilesysmntrng.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnfilesysmntrng.service.ComtnfilesysmntrngService;
import kr.godsoft.egovframe.generatorwebapp.comtnfilesysmntrng.service.ComtnfilesysmntrngDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnfilesysmntrng.service.ComtnfilesysmntrngVO;
import kr.godsoft.egovframe.generatorwebapp.comtnfilesysmntrng.service.impl.ComtnfilesysmntrngDAO;

/**
 * @Class Name : ComtnfilesysmntrngServiceImpl.java
 * @Description : Comtnfilesysmntrng Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnfilesysmntrngService")
public class ComtnfilesysmntrngServiceImpl extends AbstractServiceImpl implements
        ComtnfilesysmntrngService {

    @Resource(name="comtnfilesysmntrngDAO")
    private ComtnfilesysmntrngDAO comtnfilesysmntrngDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnfilesysmntrngIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnfilesysmntrng을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnfilesysmntrngVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnfilesysmntrng(ComtnfilesysmntrngVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnfilesysmntrngDAO.insertComtnfilesysmntrng(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnfilesysmntrng을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnfilesysmntrngVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnfilesysmntrng(ComtnfilesysmntrngVO vo) throws Exception {
        comtnfilesysmntrngDAO.updateComtnfilesysmntrng(vo);
    }

    /**
	 * comtnfilesysmntrng을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnfilesysmntrngVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnfilesysmntrng(ComtnfilesysmntrngVO vo) throws Exception {
        comtnfilesysmntrngDAO.deleteComtnfilesysmntrng(vo);
    }

    /**
	 * comtnfilesysmntrng을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnfilesysmntrngVO
	 * @return 조회한 comtnfilesysmntrng
	 * @exception Exception
	 */
    public ComtnfilesysmntrngVO selectComtnfilesysmntrng(ComtnfilesysmntrngVO vo) throws Exception {
        ComtnfilesysmntrngVO resultVO = comtnfilesysmntrngDAO.selectComtnfilesysmntrng(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnfilesysmntrng 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnfilesysmntrng 목록
	 * @exception Exception
	 */
    public List selectComtnfilesysmntrngList(ComtnfilesysmntrngDefaultVO searchVO) throws Exception {
        return comtnfilesysmntrngDAO.selectComtnfilesysmntrngList(searchVO);
    }

    /**
	 * comtnfilesysmntrng 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnfilesysmntrng 총 갯수
	 * @exception
	 */
    public int selectComtnfilesysmntrngListTotCnt(ComtnfilesysmntrngDefaultVO searchVO) {
		return comtnfilesysmntrngDAO.selectComtnfilesysmntrngListTotCnt(searchVO);
	}
    
}