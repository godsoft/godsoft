package kr.godsoft.egovframe.generatorwebapp.comtnfiledetail.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnfiledetail.service.ComtnfiledetailService;
import kr.godsoft.egovframe.generatorwebapp.comtnfiledetail.service.ComtnfiledetailVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnfiledetailServiceImpl.java
 * @Description : Comtnfiledetail Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnfiledetailService")
public class ComtnfiledetailServiceImpl extends AbstractServiceImpl implements
        ComtnfiledetailService {

    @Resource(name="comtnfiledetailDAO")
    private ComtnfiledetailDAO comtnfiledetailDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnfiledetailIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnfiledetail을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnfiledetailVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnfiledetail(ComtnfiledetailVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnfiledetailDAO.insertComtnfiledetail(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnfiledetail을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnfiledetailVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnfiledetail(ComtnfiledetailVO vo) throws Exception {
        comtnfiledetailDAO.updateComtnfiledetail(vo);
    }

    /**
	 * comtnfiledetail을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnfiledetailVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnfiledetail(ComtnfiledetailVO vo) throws Exception {
        comtnfiledetailDAO.deleteComtnfiledetail(vo);
    }

    /**
	 * comtnfiledetail을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnfiledetailVO
	 * @return 조회한 comtnfiledetail
	 * @exception Exception
	 */
    public ComtnfiledetailVO selectComtnfiledetail(ComtnfiledetailVO vo) throws Exception {
        ComtnfiledetailVO resultVO = comtnfiledetailDAO.selectComtnfiledetail(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnfiledetail 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnfiledetail 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnfiledetailList(ComtnfiledetailVO vo) throws Exception {
        return comtnfiledetailDAO.selectComtnfiledetailList(vo);
    }

    /**
	 * comtnfiledetail 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnfiledetail 총 갯수
	 * @exception
	 */
    public int selectComtnfiledetailListTotCnt(ComtnfiledetailVO vo) {
		return comtnfiledetailDAO.selectComtnfiledetailListTotCnt(vo);
	}
    
}
