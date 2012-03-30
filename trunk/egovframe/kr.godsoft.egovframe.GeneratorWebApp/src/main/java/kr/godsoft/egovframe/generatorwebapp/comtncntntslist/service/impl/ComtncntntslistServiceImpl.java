package kr.godsoft.egovframe.generatorwebapp.comtncntntslist.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtncntntslist.service.ComtncntntslistService;
import kr.godsoft.egovframe.generatorwebapp.comtncntntslist.service.ComtncntntslistVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtncntntslistServiceImpl.java
 * @Description : Comtncntntslist Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtncntntslistService")
public class ComtncntntslistServiceImpl extends AbstractServiceImpl implements
        ComtncntntslistService {

    @Resource(name="comtncntntslistDAO")
    private ComtncntntslistDAO comtncntntslistDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtncntntslistIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNCNTNTSLIST을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncntntslistVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtncntntslist(ComtncntntslistVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtncntntslistDAO.insertComtncntntslist(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNCNTNTSLIST을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncntntslistVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtncntntslist(ComtncntntslistVO vo) throws Exception {
        comtncntntslistDAO.updateComtncntntslist(vo);
    }

    /**
	 * COMTNCNTNTSLIST을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncntntslistVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtncntntslist(ComtncntntslistVO vo) throws Exception {
        comtncntntslistDAO.deleteComtncntntslist(vo);
    }

    /**
	 * COMTNCNTNTSLIST을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncntntslistVO
	 * @return 조회한 COMTNCNTNTSLIST
	 * @exception Exception
	 */
    public ComtncntntslistVO selectComtncntntslist(ComtncntntslistVO vo) throws Exception {
        ComtncntntslistVO resultVO = comtncntntslistDAO.selectComtncntntslist(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNCNTNTSLIST 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNCNTNTSLIST 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtncntntslistList(ComtncntntslistVO vo) throws Exception {
        return comtncntntslistDAO.selectComtncntntslistList(vo);
    }

    /**
	 * COMTNCNTNTSLIST 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNCNTNTSLIST 총 갯수
	 * @exception
	 */
    public int selectComtncntntslistListTotCnt(ComtncntntslistVO vo) {
		return comtncntntslistDAO.selectComtncntntslistListTotCnt(vo);
	}
    
}
