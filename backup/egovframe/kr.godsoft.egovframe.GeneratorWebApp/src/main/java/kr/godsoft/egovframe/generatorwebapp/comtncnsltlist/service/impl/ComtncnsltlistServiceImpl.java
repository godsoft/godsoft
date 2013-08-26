package kr.godsoft.egovframe.generatorwebapp.comtncnsltlist.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtncnsltlist.service.ComtncnsltlistService;
import kr.godsoft.egovframe.generatorwebapp.comtncnsltlist.service.ComtncnsltlistVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtncnsltlistServiceImpl.java
 * @Description : Comtncnsltlist Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtncnsltlistService")
public class ComtncnsltlistServiceImpl extends AbstractServiceImpl implements
        ComtncnsltlistService {

    @Resource(name="comtncnsltlistDAO")
    private ComtncnsltlistDAO comtncnsltlistDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtncnsltlistIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNCNSLTLIST을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncnsltlistVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtncnsltlist(ComtncnsltlistVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtncnsltlistDAO.insertComtncnsltlist(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNCNSLTLIST을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncnsltlistVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtncnsltlist(ComtncnsltlistVO vo) throws Exception {
        comtncnsltlistDAO.updateComtncnsltlist(vo);
    }

    /**
	 * COMTNCNSLTLIST을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncnsltlistVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtncnsltlist(ComtncnsltlistVO vo) throws Exception {
        comtncnsltlistDAO.deleteComtncnsltlist(vo);
    }

    /**
	 * COMTNCNSLTLIST을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncnsltlistVO
	 * @return 조회한 COMTNCNSLTLIST
	 * @exception Exception
	 */
    public ComtncnsltlistVO selectComtncnsltlist(ComtncnsltlistVO vo) throws Exception {
        ComtncnsltlistVO resultVO = comtncnsltlistDAO.selectComtncnsltlist(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNCNSLTLIST 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNCNSLTLIST 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtncnsltlistList(ComtncnsltlistVO vo) throws Exception {
        return comtncnsltlistDAO.selectComtncnsltlistList(vo);
    }

    /**
	 * COMTNCNSLTLIST 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNCNSLTLIST 총 갯수
	 * @exception
	 */
    public int selectComtncnsltlistListTotCnt(ComtncnsltlistVO vo) {
		return comtncnsltlistDAO.selectComtncnsltlistListTotCnt(vo);
	}
    
}
