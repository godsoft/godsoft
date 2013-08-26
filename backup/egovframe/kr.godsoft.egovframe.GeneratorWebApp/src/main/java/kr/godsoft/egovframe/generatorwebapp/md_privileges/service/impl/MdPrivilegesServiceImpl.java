package kr.godsoft.egovframe.generatorwebapp.md_privileges.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_privileges.service.MdPrivilegesService;
import kr.godsoft.egovframe.generatorwebapp.md_privileges.service.MdPrivilegesVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdPrivilegesServiceImpl.java
 * @Description : MdPrivileges Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdPrivilegesService")
public class MdPrivilegesServiceImpl extends AbstractServiceImpl implements
        MdPrivilegesService {

    @Resource(name="mdPrivilegesDAO")
    private MdPrivilegesDAO mdPrivilegesDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdPrivilegesIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_PRIVILEGES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdPrivilegesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdPrivileges(MdPrivilegesVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdPrivilegesDAO.insertMdPrivileges(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_PRIVILEGES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdPrivilegesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdPrivileges(MdPrivilegesVO vo) throws Exception {
        mdPrivilegesDAO.updateMdPrivileges(vo);
    }

    /**
	 * MD_PRIVILEGES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdPrivilegesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdPrivileges(MdPrivilegesVO vo) throws Exception {
        mdPrivilegesDAO.deleteMdPrivileges(vo);
    }

    /**
	 * MD_PRIVILEGES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdPrivilegesVO
	 * @return 조회한 MD_PRIVILEGES
	 * @exception Exception
	 */
    public MdPrivilegesVO selectMdPrivileges(MdPrivilegesVO vo) throws Exception {
        MdPrivilegesVO resultVO = mdPrivilegesDAO.selectMdPrivileges(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_PRIVILEGES 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_PRIVILEGES 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdPrivilegesList(MdPrivilegesVO vo) throws Exception {
        return mdPrivilegesDAO.selectMdPrivilegesList(vo);
    }

    /**
	 * MD_PRIVILEGES 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_PRIVILEGES 총 갯수
	 * @exception
	 */
    public int selectMdPrivilegesListTotCnt(MdPrivilegesVO vo) {
		return mdPrivilegesDAO.selectMdPrivilegesListTotCnt(vo);
	}
    
}
