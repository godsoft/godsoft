package kr.godsoft.egovframe.generatorwebapp.md_migr_weakdep.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_migr_weakdep.service.MdMigrWeakdepService;
import kr.godsoft.egovframe.generatorwebapp.md_migr_weakdep.service.MdMigrWeakdepVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdMigrWeakdepServiceImpl.java
 * @Description : MdMigrWeakdep Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdMigrWeakdepService")
public class MdMigrWeakdepServiceImpl extends AbstractServiceImpl implements
        MdMigrWeakdepService {

    @Resource(name="mdMigrWeakdepDAO")
    private MdMigrWeakdepDAO mdMigrWeakdepDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdMigrWeakdepIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_MIGR_WEAKDEP을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdMigrWeakdepVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdMigrWeakdep(MdMigrWeakdepVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdMigrWeakdepDAO.insertMdMigrWeakdep(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_MIGR_WEAKDEP을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdMigrWeakdepVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdMigrWeakdep(MdMigrWeakdepVO vo) throws Exception {
        mdMigrWeakdepDAO.updateMdMigrWeakdep(vo);
    }

    /**
	 * MD_MIGR_WEAKDEP을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdMigrWeakdepVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdMigrWeakdep(MdMigrWeakdepVO vo) throws Exception {
        mdMigrWeakdepDAO.deleteMdMigrWeakdep(vo);
    }

    /**
	 * MD_MIGR_WEAKDEP을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdMigrWeakdepVO
	 * @return 조회한 MD_MIGR_WEAKDEP
	 * @exception Exception
	 */
    public MdMigrWeakdepVO selectMdMigrWeakdep(MdMigrWeakdepVO vo) throws Exception {
        MdMigrWeakdepVO resultVO = mdMigrWeakdepDAO.selectMdMigrWeakdep(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_MIGR_WEAKDEP 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_MIGR_WEAKDEP 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdMigrWeakdepList(MdMigrWeakdepVO vo) throws Exception {
        return mdMigrWeakdepDAO.selectMdMigrWeakdepList(vo);
    }

    /**
	 * MD_MIGR_WEAKDEP 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_MIGR_WEAKDEP 총 갯수
	 * @exception
	 */
    public int selectMdMigrWeakdepListTotCnt(MdMigrWeakdepVO vo) {
		return mdMigrWeakdepDAO.selectMdMigrWeakdepListTotCnt(vo);
	}
    
}
