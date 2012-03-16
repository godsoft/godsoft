package kr.godsoft.egovframe.generatorwebapp.comtcadministcoderecptnlog.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtcadministcoderecptnlog.service.ComtcadministcoderecptnlogService;
import kr.godsoft.egovframe.generatorwebapp.comtcadministcoderecptnlog.service.ComtcadministcoderecptnlogVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtcadministcoderecptnlogServiceImpl.java
 * @Description : Comtcadministcoderecptnlog Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtcadministcoderecptnlogService")
public class ComtcadministcoderecptnlogServiceImpl extends AbstractServiceImpl implements
        ComtcadministcoderecptnlogService {

    @Resource(name="comtcadministcoderecptnlogDAO")
    private ComtcadministcoderecptnlogDAO comtcadministcoderecptnlogDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtcadministcoderecptnlogIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtcadministcoderecptnlog을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtcadministcoderecptnlogVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtcadministcoderecptnlog(ComtcadministcoderecptnlogVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtcadministcoderecptnlogDAO.insertComtcadministcoderecptnlog(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtcadministcoderecptnlog을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtcadministcoderecptnlogVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtcadministcoderecptnlog(ComtcadministcoderecptnlogVO vo) throws Exception {
        comtcadministcoderecptnlogDAO.updateComtcadministcoderecptnlog(vo);
    }

    /**
	 * comtcadministcoderecptnlog을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtcadministcoderecptnlogVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtcadministcoderecptnlog(ComtcadministcoderecptnlogVO vo) throws Exception {
        comtcadministcoderecptnlogDAO.deleteComtcadministcoderecptnlog(vo);
    }

    /**
	 * comtcadministcoderecptnlog을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtcadministcoderecptnlogVO
	 * @return 조회한 comtcadministcoderecptnlog
	 * @exception Exception
	 */
    public ComtcadministcoderecptnlogVO selectComtcadministcoderecptnlog(ComtcadministcoderecptnlogVO vo) throws Exception {
        ComtcadministcoderecptnlogVO resultVO = comtcadministcoderecptnlogDAO.selectComtcadministcoderecptnlog(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtcadministcoderecptnlog 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtcadministcoderecptnlog 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtcadministcoderecptnlogList(ComtcadministcoderecptnlogVO vo) throws Exception {
        return comtcadministcoderecptnlogDAO.selectComtcadministcoderecptnlogList(vo);
    }

    /**
	 * comtcadministcoderecptnlog 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtcadministcoderecptnlog 총 갯수
	 * @exception
	 */
    public int selectComtcadministcoderecptnlogListTotCnt(ComtcadministcoderecptnlogVO vo) {
		return comtcadministcoderecptnlogDAO.selectComtcadministcoderecptnlogListTotCnt(vo);
	}
    
}
