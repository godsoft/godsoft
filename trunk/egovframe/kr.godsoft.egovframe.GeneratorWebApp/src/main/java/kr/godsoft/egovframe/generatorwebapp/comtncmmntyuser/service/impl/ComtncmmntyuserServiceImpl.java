package kr.godsoft.egovframe.generatorwebapp.comtncmmntyuser.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtncmmntyuser.service.ComtncmmntyuserService;
import kr.godsoft.egovframe.generatorwebapp.comtncmmntyuser.service.ComtncmmntyuserVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtncmmntyuserServiceImpl.java
 * @Description : Comtncmmntyuser Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtncmmntyuserService")
public class ComtncmmntyuserServiceImpl extends AbstractServiceImpl implements
        ComtncmmntyuserService {

    @Resource(name="comtncmmntyuserDAO")
    private ComtncmmntyuserDAO comtncmmntyuserDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtncmmntyuserIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtncmmntyuser을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncmmntyuserVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtncmmntyuser(ComtncmmntyuserVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtncmmntyuserDAO.insertComtncmmntyuser(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtncmmntyuser을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncmmntyuserVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtncmmntyuser(ComtncmmntyuserVO vo) throws Exception {
        comtncmmntyuserDAO.updateComtncmmntyuser(vo);
    }

    /**
	 * comtncmmntyuser을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncmmntyuserVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtncmmntyuser(ComtncmmntyuserVO vo) throws Exception {
        comtncmmntyuserDAO.deleteComtncmmntyuser(vo);
    }

    /**
	 * comtncmmntyuser을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncmmntyuserVO
	 * @return 조회한 comtncmmntyuser
	 * @exception Exception
	 */
    public ComtncmmntyuserVO selectComtncmmntyuser(ComtncmmntyuserVO vo) throws Exception {
        ComtncmmntyuserVO resultVO = comtncmmntyuserDAO.selectComtncmmntyuser(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtncmmntyuser 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncmmntyuser 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtncmmntyuserList(ComtncmmntyuserVO vo) throws Exception {
        return comtncmmntyuserDAO.selectComtncmmntyuserList(vo);
    }

    /**
	 * comtncmmntyuser 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncmmntyuser 총 갯수
	 * @exception
	 */
    public int selectComtncmmntyuserListTotCnt(ComtncmmntyuserVO vo) {
		return comtncmmntyuserDAO.selectComtncmmntyuserListTotCnt(vo);
	}
    
}
