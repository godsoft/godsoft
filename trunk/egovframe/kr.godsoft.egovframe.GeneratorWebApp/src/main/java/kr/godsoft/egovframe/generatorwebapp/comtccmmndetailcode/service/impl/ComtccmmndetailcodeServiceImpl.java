package kr.godsoft.egovframe.generatorwebapp.comtccmmndetailcode.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtccmmndetailcode.service.ComtccmmndetailcodeService;
import kr.godsoft.egovframe.generatorwebapp.comtccmmndetailcode.service.ComtccmmndetailcodeVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtccmmndetailcodeServiceImpl.java
 * @Description : Comtccmmndetailcode Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtccmmndetailcodeService")
public class ComtccmmndetailcodeServiceImpl extends AbstractServiceImpl implements
        ComtccmmndetailcodeService {

    @Resource(name="comtccmmndetailcodeDAO")
    private ComtccmmndetailcodeDAO comtccmmndetailcodeDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtccmmndetailcodeIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtccmmndetailcode을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtccmmndetailcodeVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtccmmndetailcode(ComtccmmndetailcodeVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtccmmndetailcodeDAO.insertComtccmmndetailcode(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtccmmndetailcode을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtccmmndetailcodeVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtccmmndetailcode(ComtccmmndetailcodeVO vo) throws Exception {
        comtccmmndetailcodeDAO.updateComtccmmndetailcode(vo);
    }

    /**
	 * comtccmmndetailcode을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtccmmndetailcodeVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtccmmndetailcode(ComtccmmndetailcodeVO vo) throws Exception {
        comtccmmndetailcodeDAO.deleteComtccmmndetailcode(vo);
    }

    /**
	 * comtccmmndetailcode을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtccmmndetailcodeVO
	 * @return 조회한 comtccmmndetailcode
	 * @exception Exception
	 */
    public ComtccmmndetailcodeVO selectComtccmmndetailcode(ComtccmmndetailcodeVO vo) throws Exception {
        ComtccmmndetailcodeVO resultVO = comtccmmndetailcodeDAO.selectComtccmmndetailcode(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtccmmndetailcode 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtccmmndetailcode 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtccmmndetailcodeList(ComtccmmndetailcodeVO vo) throws Exception {
        return comtccmmndetailcodeDAO.selectComtccmmndetailcodeList(vo);
    }

    /**
	 * comtccmmndetailcode 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtccmmndetailcode 총 갯수
	 * @exception
	 */
    public int selectComtccmmndetailcodeListTotCnt(ComtccmmndetailcodeVO vo) {
		return comtccmmndetailcodeDAO.selectComtccmmndetailcodeListTotCnt(vo);
	}
    
}
