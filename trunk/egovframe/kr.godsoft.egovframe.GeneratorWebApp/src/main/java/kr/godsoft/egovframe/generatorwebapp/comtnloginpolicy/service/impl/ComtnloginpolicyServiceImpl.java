package kr.godsoft.egovframe.generatorwebapp.comtnloginpolicy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnloginpolicy.service.ComtnloginpolicyService;
import kr.godsoft.egovframe.generatorwebapp.comtnloginpolicy.service.ComtnloginpolicyVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnloginpolicyServiceImpl.java
 * @Description : Comtnloginpolicy Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnloginpolicyService")
public class ComtnloginpolicyServiceImpl extends AbstractServiceImpl implements
        ComtnloginpolicyService {

    @Resource(name="comtnloginpolicyDAO")
    private ComtnloginpolicyDAO comtnloginpolicyDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnloginpolicyIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnloginpolicy을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnloginpolicyVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnloginpolicy(ComtnloginpolicyVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnloginpolicyDAO.insertComtnloginpolicy(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnloginpolicy을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnloginpolicyVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnloginpolicy(ComtnloginpolicyVO vo) throws Exception {
        comtnloginpolicyDAO.updateComtnloginpolicy(vo);
    }

    /**
	 * comtnloginpolicy을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnloginpolicyVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnloginpolicy(ComtnloginpolicyVO vo) throws Exception {
        comtnloginpolicyDAO.deleteComtnloginpolicy(vo);
    }

    /**
	 * comtnloginpolicy을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnloginpolicyVO
	 * @return 조회한 comtnloginpolicy
	 * @exception Exception
	 */
    public ComtnloginpolicyVO selectComtnloginpolicy(ComtnloginpolicyVO vo) throws Exception {
        ComtnloginpolicyVO resultVO = comtnloginpolicyDAO.selectComtnloginpolicy(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnloginpolicy 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnloginpolicy 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnloginpolicyList(ComtnloginpolicyVO vo) throws Exception {
        return comtnloginpolicyDAO.selectComtnloginpolicyList(vo);
    }

    /**
	 * comtnloginpolicy 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnloginpolicy 총 갯수
	 * @exception
	 */
    public int selectComtnloginpolicyListTotCnt(ComtnloginpolicyVO vo) {
		return comtnloginpolicyDAO.selectComtnloginpolicyListTotCnt(vo);
	}
    
}
