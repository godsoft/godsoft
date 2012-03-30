package kr.godsoft.egovframe.generatorwebapp.comtncomment.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtncomment.service.ComtncommentService;
import kr.godsoft.egovframe.generatorwebapp.comtncomment.service.ComtncommentVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtncommentServiceImpl.java
 * @Description : Comtncomment Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtncommentService")
public class ComtncommentServiceImpl extends AbstractServiceImpl implements
        ComtncommentService {

    @Resource(name="comtncommentDAO")
    private ComtncommentDAO comtncommentDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtncommentIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNCOMMENT을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncommentVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtncomment(ComtncommentVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtncommentDAO.insertComtncomment(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNCOMMENT을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncommentVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtncomment(ComtncommentVO vo) throws Exception {
        comtncommentDAO.updateComtncomment(vo);
    }

    /**
	 * COMTNCOMMENT을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncommentVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtncomment(ComtncommentVO vo) throws Exception {
        comtncommentDAO.deleteComtncomment(vo);
    }

    /**
	 * COMTNCOMMENT을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncommentVO
	 * @return 조회한 COMTNCOMMENT
	 * @exception Exception
	 */
    public ComtncommentVO selectComtncomment(ComtncommentVO vo) throws Exception {
        ComtncommentVO resultVO = comtncommentDAO.selectComtncomment(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNCOMMENT 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNCOMMENT 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtncommentList(ComtncommentVO vo) throws Exception {
        return comtncommentDAO.selectComtncommentList(vo);
    }

    /**
	 * COMTNCOMMENT 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNCOMMENT 총 갯수
	 * @exception
	 */
    public int selectComtncommentListTotCnt(ComtncommentVO vo) {
		return comtncommentDAO.selectComtncommentListTotCnt(vo);
	}
    
}
