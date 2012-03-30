package kr.godsoft.egovframe.generatorwebapp.comtndampro.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtndampro.service.ComtndamproService;
import kr.godsoft.egovframe.generatorwebapp.comtndampro.service.ComtndamproVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtndamproServiceImpl.java
 * @Description : Comtndampro Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtndamproService")
public class ComtndamproServiceImpl extends AbstractServiceImpl implements
        ComtndamproService {

    @Resource(name="comtndamproDAO")
    private ComtndamproDAO comtndamproDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtndamproIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNDAMPRO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndamproVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtndampro(ComtndamproVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtndamproDAO.insertComtndampro(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNDAMPRO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndamproVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtndampro(ComtndamproVO vo) throws Exception {
        comtndamproDAO.updateComtndampro(vo);
    }

    /**
	 * COMTNDAMPRO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndamproVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtndampro(ComtndamproVO vo) throws Exception {
        comtndamproDAO.deleteComtndampro(vo);
    }

    /**
	 * COMTNDAMPRO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndamproVO
	 * @return 조회한 COMTNDAMPRO
	 * @exception Exception
	 */
    public ComtndamproVO selectComtndampro(ComtndamproVO vo) throws Exception {
        ComtndamproVO resultVO = comtndamproDAO.selectComtndampro(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNDAMPRO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNDAMPRO 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtndamproList(ComtndamproVO vo) throws Exception {
        return comtndamproDAO.selectComtndamproList(vo);
    }

    /**
	 * COMTNDAMPRO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNDAMPRO 총 갯수
	 * @exception
	 */
    public int selectComtndamproListTotCnt(ComtndamproVO vo) {
		return comtndamproDAO.selectComtndamproListTotCnt(vo);
	}
    
}
