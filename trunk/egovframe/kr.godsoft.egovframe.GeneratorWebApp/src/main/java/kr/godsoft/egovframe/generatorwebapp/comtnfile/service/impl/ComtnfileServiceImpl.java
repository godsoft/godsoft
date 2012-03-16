package kr.godsoft.egovframe.generatorwebapp.comtnfile.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnfile.service.ComtnfileService;
import kr.godsoft.egovframe.generatorwebapp.comtnfile.service.ComtnfileVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnfileServiceImpl.java
 * @Description : Comtnfile Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnfileService")
public class ComtnfileServiceImpl extends AbstractServiceImpl implements
        ComtnfileService {

    @Resource(name="comtnfileDAO")
    private ComtnfileDAO comtnfileDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnfileIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnfile을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnfileVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnfile(ComtnfileVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnfileDAO.insertComtnfile(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnfile을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnfileVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnfile(ComtnfileVO vo) throws Exception {
        comtnfileDAO.updateComtnfile(vo);
    }

    /**
	 * comtnfile을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnfileVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnfile(ComtnfileVO vo) throws Exception {
        comtnfileDAO.deleteComtnfile(vo);
    }

    /**
	 * comtnfile을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnfileVO
	 * @return 조회한 comtnfile
	 * @exception Exception
	 */
    public ComtnfileVO selectComtnfile(ComtnfileVO vo) throws Exception {
        ComtnfileVO resultVO = comtnfileDAO.selectComtnfile(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnfile 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnfile 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnfileList(ComtnfileVO vo) throws Exception {
        return comtnfileDAO.selectComtnfileList(vo);
    }

    /**
	 * comtnfile 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnfile 총 갯수
	 * @exception
	 */
    public int selectComtnfileListTotCnt(ComtnfileVO vo) {
		return comtnfileDAO.selectComtnfileListTotCnt(vo);
	}
    
}
