package kr.godsoft.egovframe.generatorwebapp.comtnreprtstats.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnreprtstats.service.ComtnreprtstatsService;
import kr.godsoft.egovframe.generatorwebapp.comtnreprtstats.service.ComtnreprtstatsVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnreprtstatsServiceImpl.java
 * @Description : Comtnreprtstats Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnreprtstatsService")
public class ComtnreprtstatsServiceImpl extends AbstractServiceImpl implements
        ComtnreprtstatsService {

    @Resource(name="comtnreprtstatsDAO")
    private ComtnreprtstatsDAO comtnreprtstatsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnreprtstatsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNREPRTSTATS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnreprtstatsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnreprtstats(ComtnreprtstatsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnreprtstatsDAO.insertComtnreprtstats(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNREPRTSTATS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnreprtstatsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnreprtstats(ComtnreprtstatsVO vo) throws Exception {
        comtnreprtstatsDAO.updateComtnreprtstats(vo);
    }

    /**
	 * COMTNREPRTSTATS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnreprtstatsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnreprtstats(ComtnreprtstatsVO vo) throws Exception {
        comtnreprtstatsDAO.deleteComtnreprtstats(vo);
    }

    /**
	 * COMTNREPRTSTATS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnreprtstatsVO
	 * @return 조회한 COMTNREPRTSTATS
	 * @exception Exception
	 */
    public ComtnreprtstatsVO selectComtnreprtstats(ComtnreprtstatsVO vo) throws Exception {
        ComtnreprtstatsVO resultVO = comtnreprtstatsDAO.selectComtnreprtstats(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNREPRTSTATS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNREPRTSTATS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnreprtstatsList(ComtnreprtstatsVO vo) throws Exception {
        return comtnreprtstatsDAO.selectComtnreprtstatsList(vo);
    }

    /**
	 * COMTNREPRTSTATS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNREPRTSTATS 총 갯수
	 * @exception
	 */
    public int selectComtnreprtstatsListTotCnt(ComtnreprtstatsVO vo) {
		return comtnreprtstatsDAO.selectComtnreprtstatsListTotCnt(vo);
	}
    
}
