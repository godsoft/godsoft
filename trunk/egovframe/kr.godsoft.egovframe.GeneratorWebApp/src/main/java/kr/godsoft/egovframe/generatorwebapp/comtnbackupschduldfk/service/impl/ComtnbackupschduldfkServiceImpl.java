package kr.godsoft.egovframe.generatorwebapp.comtnbackupschduldfk.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnbackupschduldfk.service.ComtnbackupschduldfkService;
import kr.godsoft.egovframe.generatorwebapp.comtnbackupschduldfk.service.ComtnbackupschduldfkVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnbackupschduldfkServiceImpl.java
 * @Description : Comtnbackupschduldfk Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnbackupschduldfkService")
public class ComtnbackupschduldfkServiceImpl extends AbstractServiceImpl implements
        ComtnbackupschduldfkService {

    @Resource(name="comtnbackupschduldfkDAO")
    private ComtnbackupschduldfkDAO comtnbackupschduldfkDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnbackupschduldfkIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnbackupschduldfk을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbackupschduldfkVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbackupschduldfk(ComtnbackupschduldfkVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnbackupschduldfkDAO.insertComtnbackupschduldfk(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnbackupschduldfk을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbackupschduldfkVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbackupschduldfk(ComtnbackupschduldfkVO vo) throws Exception {
        comtnbackupschduldfkDAO.updateComtnbackupschduldfk(vo);
    }

    /**
	 * comtnbackupschduldfk을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbackupschduldfkVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbackupschduldfk(ComtnbackupschduldfkVO vo) throws Exception {
        comtnbackupschduldfkDAO.deleteComtnbackupschduldfk(vo);
    }

    /**
	 * comtnbackupschduldfk을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbackupschduldfkVO
	 * @return 조회한 comtnbackupschduldfk
	 * @exception Exception
	 */
    public ComtnbackupschduldfkVO selectComtnbackupschduldfk(ComtnbackupschduldfkVO vo) throws Exception {
        ComtnbackupschduldfkVO resultVO = comtnbackupschduldfkDAO.selectComtnbackupschduldfk(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnbackupschduldfk 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbackupschduldfk 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnbackupschduldfkList(ComtnbackupschduldfkVO vo) throws Exception {
        return comtnbackupschduldfkDAO.selectComtnbackupschduldfkList(vo);
    }

    /**
	 * comtnbackupschduldfk 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbackupschduldfk 총 갯수
	 * @exception
	 */
    public int selectComtnbackupschduldfkListTotCnt(ComtnbackupschduldfkVO vo) {
		return comtnbackupschduldfkDAO.selectComtnbackupschduldfkListTotCnt(vo);
	}
    
}
