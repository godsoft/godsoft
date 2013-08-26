package kr.godsoft.egovframe.generatorwebapp.comvnusermaster.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comvnusermaster.service.ComvnusermasterService;
import kr.godsoft.egovframe.generatorwebapp.comvnusermaster.service.ComvnusermasterVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComvnusermasterServiceImpl.java
 * @Description : Comvnusermaster Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comvnusermasterService")
public class ComvnusermasterServiceImpl extends AbstractServiceImpl implements
        ComvnusermasterService {

    @Resource(name="comvnusermasterDAO")
    private ComvnusermasterDAO comvnusermasterDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComvnusermasterIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMVNUSERMASTER을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComvnusermasterVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComvnusermaster(ComvnusermasterVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comvnusermasterDAO.insertComvnusermaster(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMVNUSERMASTER을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComvnusermasterVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComvnusermaster(ComvnusermasterVO vo) throws Exception {
        comvnusermasterDAO.updateComvnusermaster(vo);
    }

    /**
	 * COMVNUSERMASTER을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComvnusermasterVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComvnusermaster(ComvnusermasterVO vo) throws Exception {
        comvnusermasterDAO.deleteComvnusermaster(vo);
    }

    /**
	 * COMVNUSERMASTER을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComvnusermasterVO
	 * @return 조회한 COMVNUSERMASTER
	 * @exception Exception
	 */
    public ComvnusermasterVO selectComvnusermaster(ComvnusermasterVO vo) throws Exception {
        ComvnusermasterVO resultVO = comvnusermasterDAO.selectComvnusermaster(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMVNUSERMASTER 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMVNUSERMASTER 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComvnusermasterList(ComvnusermasterVO vo) throws Exception {
        return comvnusermasterDAO.selectComvnusermasterList(vo);
    }

    /**
	 * COMVNUSERMASTER 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMVNUSERMASTER 총 갯수
	 * @exception
	 */
    public int selectComvnusermasterListTotCnt(ComvnusermasterVO vo) {
		return comvnusermasterDAO.selectComvnusermasterListTotCnt(vo);
	}
    
}
