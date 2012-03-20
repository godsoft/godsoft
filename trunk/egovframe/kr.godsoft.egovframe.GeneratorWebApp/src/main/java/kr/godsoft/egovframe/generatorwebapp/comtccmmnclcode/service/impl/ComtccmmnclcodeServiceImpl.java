package kr.godsoft.egovframe.generatorwebapp.comtccmmnclcode.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtccmmnclcode.service.ComtccmmnclcodeService;
import kr.godsoft.egovframe.generatorwebapp.comtccmmnclcode.service.ComtccmmnclcodeVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtccmmnclcodeServiceImpl.java
 * @Description : Comtccmmnclcode Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtccmmnclcodeService")
public class ComtccmmnclcodeServiceImpl extends AbstractServiceImpl implements
        ComtccmmnclcodeService {

    @Resource(name="comtccmmnclcodeDAO")
    private ComtccmmnclcodeDAO comtccmmnclcodeDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtccmmnclcodeIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtccmmnclcode을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtccmmnclcodeVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtccmmnclcode(ComtccmmnclcodeVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtccmmnclcodeDAO.insertComtccmmnclcode(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtccmmnclcode을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtccmmnclcodeVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtccmmnclcode(ComtccmmnclcodeVO vo) throws Exception {
        comtccmmnclcodeDAO.updateComtccmmnclcode(vo);
    }

    /**
	 * comtccmmnclcode을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtccmmnclcodeVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtccmmnclcode(ComtccmmnclcodeVO vo) throws Exception {
        comtccmmnclcodeDAO.deleteComtccmmnclcode(vo);
    }

    /**
	 * comtccmmnclcode을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtccmmnclcodeVO
	 * @return 조회한 comtccmmnclcode
	 * @exception Exception
	 */
    public ComtccmmnclcodeVO selectComtccmmnclcode(ComtccmmnclcodeVO vo) throws Exception {
        ComtccmmnclcodeVO resultVO = comtccmmnclcodeDAO.selectComtccmmnclcode(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtccmmnclcode 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtccmmnclcode 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtccmmnclcodeList(ComtccmmnclcodeVO vo) throws Exception {
        return comtccmmnclcodeDAO.selectComtccmmnclcodeList(vo);
    }

    /**
	 * comtccmmnclcode 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtccmmnclcode 총 갯수
	 * @exception
	 */
    public int selectComtccmmnclcodeListTotCnt(ComtccmmnclcodeVO vo) {
		return comtccmmnclcodeDAO.selectComtccmmnclcodeListTotCnt(vo);
	}
    
}
