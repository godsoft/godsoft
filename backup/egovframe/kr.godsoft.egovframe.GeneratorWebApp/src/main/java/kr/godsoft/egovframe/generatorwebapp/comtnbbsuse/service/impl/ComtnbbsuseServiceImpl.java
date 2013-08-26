package kr.godsoft.egovframe.generatorwebapp.comtnbbsuse.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnbbsuse.service.ComtnbbsuseService;
import kr.godsoft.egovframe.generatorwebapp.comtnbbsuse.service.ComtnbbsuseVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnbbsuseServiceImpl.java
 * @Description : Comtnbbsuse Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnbbsuseService")
public class ComtnbbsuseServiceImpl extends AbstractServiceImpl implements
        ComtnbbsuseService {

    @Resource(name="comtnbbsuseDAO")
    private ComtnbbsuseDAO comtnbbsuseDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnbbsuseIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNBBSUSE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbbsuseVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbbsuse(ComtnbbsuseVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnbbsuseDAO.insertComtnbbsuse(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNBBSUSE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbbsuseVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbbsuse(ComtnbbsuseVO vo) throws Exception {
        comtnbbsuseDAO.updateComtnbbsuse(vo);
    }

    /**
	 * COMTNBBSUSE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbbsuseVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbbsuse(ComtnbbsuseVO vo) throws Exception {
        comtnbbsuseDAO.deleteComtnbbsuse(vo);
    }

    /**
	 * COMTNBBSUSE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbbsuseVO
	 * @return 조회한 COMTNBBSUSE
	 * @exception Exception
	 */
    public ComtnbbsuseVO selectComtnbbsuse(ComtnbbsuseVO vo) throws Exception {
        ComtnbbsuseVO resultVO = comtnbbsuseDAO.selectComtnbbsuse(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNBBSUSE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBBSUSE 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnbbsuseList(ComtnbbsuseVO vo) throws Exception {
        return comtnbbsuseDAO.selectComtnbbsuseList(vo);
    }

    /**
	 * COMTNBBSUSE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBBSUSE 총 갯수
	 * @exception
	 */
    public int selectComtnbbsuseListTotCnt(ComtnbbsuseVO vo) {
		return comtnbbsuseDAO.selectComtnbbsuseListTotCnt(vo);
	}
    
}
