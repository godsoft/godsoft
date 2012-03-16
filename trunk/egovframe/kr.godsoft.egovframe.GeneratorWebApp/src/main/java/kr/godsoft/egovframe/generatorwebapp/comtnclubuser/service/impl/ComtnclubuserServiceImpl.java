package kr.godsoft.egovframe.generatorwebapp.comtnclubuser.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnclubuser.service.ComtnclubuserService;
import kr.godsoft.egovframe.generatorwebapp.comtnclubuser.service.ComtnclubuserVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnclubuserServiceImpl.java
 * @Description : Comtnclubuser Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnclubuserService")
public class ComtnclubuserServiceImpl extends AbstractServiceImpl implements
        ComtnclubuserService {

    @Resource(name="comtnclubuserDAO")
    private ComtnclubuserDAO comtnclubuserDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnclubuserIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnclubuser을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnclubuserVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnclubuser(ComtnclubuserVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnclubuserDAO.insertComtnclubuser(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnclubuser을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnclubuserVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnclubuser(ComtnclubuserVO vo) throws Exception {
        comtnclubuserDAO.updateComtnclubuser(vo);
    }

    /**
	 * comtnclubuser을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnclubuserVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnclubuser(ComtnclubuserVO vo) throws Exception {
        comtnclubuserDAO.deleteComtnclubuser(vo);
    }

    /**
	 * comtnclubuser을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnclubuserVO
	 * @return 조회한 comtnclubuser
	 * @exception Exception
	 */
    public ComtnclubuserVO selectComtnclubuser(ComtnclubuserVO vo) throws Exception {
        ComtnclubuserVO resultVO = comtnclubuserDAO.selectComtnclubuser(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnclubuser 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnclubuser 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnclubuserList(ComtnclubuserVO vo) throws Exception {
        return comtnclubuserDAO.selectComtnclubuserList(vo);
    }

    /**
	 * comtnclubuser 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnclubuser 총 갯수
	 * @exception
	 */
    public int selectComtnclubuserListTotCnt(ComtnclubuserVO vo) {
		return comtnclubuserDAO.selectComtnclubuserListTotCnt(vo);
	}
    
}
