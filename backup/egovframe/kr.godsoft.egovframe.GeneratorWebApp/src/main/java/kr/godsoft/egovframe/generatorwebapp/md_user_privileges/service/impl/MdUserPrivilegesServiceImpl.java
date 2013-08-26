package kr.godsoft.egovframe.generatorwebapp.md_user_privileges.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_user_privileges.service.MdUserPrivilegesService;
import kr.godsoft.egovframe.generatorwebapp.md_user_privileges.service.MdUserPrivilegesVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdUserPrivilegesServiceImpl.java
 * @Description : MdUserPrivileges Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdUserPrivilegesService")
public class MdUserPrivilegesServiceImpl extends AbstractServiceImpl implements
        MdUserPrivilegesService {

    @Resource(name="mdUserPrivilegesDAO")
    private MdUserPrivilegesDAO mdUserPrivilegesDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdUserPrivilegesIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_USER_PRIVILEGES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdUserPrivilegesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdUserPrivileges(MdUserPrivilegesVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdUserPrivilegesDAO.insertMdUserPrivileges(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_USER_PRIVILEGES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdUserPrivilegesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdUserPrivileges(MdUserPrivilegesVO vo) throws Exception {
        mdUserPrivilegesDAO.updateMdUserPrivileges(vo);
    }

    /**
	 * MD_USER_PRIVILEGES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdUserPrivilegesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdUserPrivileges(MdUserPrivilegesVO vo) throws Exception {
        mdUserPrivilegesDAO.deleteMdUserPrivileges(vo);
    }

    /**
	 * MD_USER_PRIVILEGES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdUserPrivilegesVO
	 * @return 조회한 MD_USER_PRIVILEGES
	 * @exception Exception
	 */
    public MdUserPrivilegesVO selectMdUserPrivileges(MdUserPrivilegesVO vo) throws Exception {
        MdUserPrivilegesVO resultVO = mdUserPrivilegesDAO.selectMdUserPrivileges(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_USER_PRIVILEGES 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_USER_PRIVILEGES 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdUserPrivilegesList(MdUserPrivilegesVO vo) throws Exception {
        return mdUserPrivilegesDAO.selectMdUserPrivilegesList(vo);
    }

    /**
	 * MD_USER_PRIVILEGES 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_USER_PRIVILEGES 총 갯수
	 * @exception
	 */
    public int selectMdUserPrivilegesListTotCnt(MdUserPrivilegesVO vo) {
		return mdUserPrivilegesDAO.selectMdUserPrivilegesListTotCnt(vo);
	}
    
}
