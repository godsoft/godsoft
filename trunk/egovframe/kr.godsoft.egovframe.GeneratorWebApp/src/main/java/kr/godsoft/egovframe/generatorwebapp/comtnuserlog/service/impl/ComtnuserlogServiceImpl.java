package kr.godsoft.egovframe.generatorwebapp.comtnuserlog.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnuserlog.service.ComtnuserlogService;
import kr.godsoft.egovframe.generatorwebapp.comtnuserlog.service.ComtnuserlogVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnuserlogServiceImpl.java
 * @Description : Comtnuserlog Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnuserlogService")
public class ComtnuserlogServiceImpl extends AbstractServiceImpl implements
        ComtnuserlogService {

    @Resource(name="comtnuserlogDAO")
    private ComtnuserlogDAO comtnuserlogDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnuserlogIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnuserlog을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnuserlogVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnuserlog(ComtnuserlogVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnuserlogDAO.insertComtnuserlog(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnuserlog을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnuserlogVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnuserlog(ComtnuserlogVO vo) throws Exception {
        comtnuserlogDAO.updateComtnuserlog(vo);
    }

    /**
	 * comtnuserlog을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnuserlogVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnuserlog(ComtnuserlogVO vo) throws Exception {
        comtnuserlogDAO.deleteComtnuserlog(vo);
    }

    /**
	 * comtnuserlog을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnuserlogVO
	 * @return 조회한 comtnuserlog
	 * @exception Exception
	 */
    public ComtnuserlogVO selectComtnuserlog(ComtnuserlogVO vo) throws Exception {
        ComtnuserlogVO resultVO = comtnuserlogDAO.selectComtnuserlog(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnuserlog 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnuserlog 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnuserlogList(ComtnuserlogVO vo) throws Exception {
        return comtnuserlogDAO.selectComtnuserlogList(vo);
    }

    /**
	 * comtnuserlog 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnuserlog 총 갯수
	 * @exception
	 */
    public int selectComtnuserlogListTotCnt(ComtnuserlogVO vo) {
		return comtnuserlogDAO.selectComtnuserlogListTotCnt(vo);
	}
    
}
