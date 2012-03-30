package kr.godsoft.egovframe.generatorwebapp.comthemaildsptchmanage.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comthemaildsptchmanage.service.ComthemaildsptchmanageService;
import kr.godsoft.egovframe.generatorwebapp.comthemaildsptchmanage.service.ComthemaildsptchmanageVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComthemaildsptchmanageServiceImpl.java
 * @Description : Comthemaildsptchmanage Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comthemaildsptchmanageService")
public class ComthemaildsptchmanageServiceImpl extends AbstractServiceImpl implements
        ComthemaildsptchmanageService {

    @Resource(name="comthemaildsptchmanageDAO")
    private ComthemaildsptchmanageDAO comthemaildsptchmanageDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComthemaildsptchmanageIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTHEMAILDSPTCHMANAGE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComthemaildsptchmanageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComthemaildsptchmanage(ComthemaildsptchmanageVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comthemaildsptchmanageDAO.insertComthemaildsptchmanage(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTHEMAILDSPTCHMANAGE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComthemaildsptchmanageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComthemaildsptchmanage(ComthemaildsptchmanageVO vo) throws Exception {
        comthemaildsptchmanageDAO.updateComthemaildsptchmanage(vo);
    }

    /**
	 * COMTHEMAILDSPTCHMANAGE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComthemaildsptchmanageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComthemaildsptchmanage(ComthemaildsptchmanageVO vo) throws Exception {
        comthemaildsptchmanageDAO.deleteComthemaildsptchmanage(vo);
    }

    /**
	 * COMTHEMAILDSPTCHMANAGE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComthemaildsptchmanageVO
	 * @return 조회한 COMTHEMAILDSPTCHMANAGE
	 * @exception Exception
	 */
    public ComthemaildsptchmanageVO selectComthemaildsptchmanage(ComthemaildsptchmanageVO vo) throws Exception {
        ComthemaildsptchmanageVO resultVO = comthemaildsptchmanageDAO.selectComthemaildsptchmanage(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTHEMAILDSPTCHMANAGE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTHEMAILDSPTCHMANAGE 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComthemaildsptchmanageList(ComthemaildsptchmanageVO vo) throws Exception {
        return comthemaildsptchmanageDAO.selectComthemaildsptchmanageList(vo);
    }

    /**
	 * COMTHEMAILDSPTCHMANAGE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTHEMAILDSPTCHMANAGE 총 갯수
	 * @exception
	 */
    public int selectComthemaildsptchmanageListTotCnt(ComthemaildsptchmanageVO vo) {
		return comthemaildsptchmanageDAO.selectComthemaildsptchmanageListTotCnt(vo);
	}
    
}
