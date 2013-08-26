package kr.godsoft.egovframe.generatorwebapp.md_group_privileges.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_group_privileges.service.MdGroupPrivilegesService;
import kr.godsoft.egovframe.generatorwebapp.md_group_privileges.service.MdGroupPrivilegesVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdGroupPrivilegesServiceImpl.java
 * @Description : MdGroupPrivileges Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdGroupPrivilegesService")
public class MdGroupPrivilegesServiceImpl extends AbstractServiceImpl implements
        MdGroupPrivilegesService {

    @Resource(name="mdGroupPrivilegesDAO")
    private MdGroupPrivilegesDAO mdGroupPrivilegesDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdGroupPrivilegesIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_GROUP_PRIVILEGES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdGroupPrivilegesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdGroupPrivileges(MdGroupPrivilegesVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdGroupPrivilegesDAO.insertMdGroupPrivileges(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_GROUP_PRIVILEGES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdGroupPrivilegesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdGroupPrivileges(MdGroupPrivilegesVO vo) throws Exception {
        mdGroupPrivilegesDAO.updateMdGroupPrivileges(vo);
    }

    /**
	 * MD_GROUP_PRIVILEGES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdGroupPrivilegesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdGroupPrivileges(MdGroupPrivilegesVO vo) throws Exception {
        mdGroupPrivilegesDAO.deleteMdGroupPrivileges(vo);
    }

    /**
	 * MD_GROUP_PRIVILEGES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdGroupPrivilegesVO
	 * @return 조회한 MD_GROUP_PRIVILEGES
	 * @exception Exception
	 */
    public MdGroupPrivilegesVO selectMdGroupPrivileges(MdGroupPrivilegesVO vo) throws Exception {
        MdGroupPrivilegesVO resultVO = mdGroupPrivilegesDAO.selectMdGroupPrivileges(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_GROUP_PRIVILEGES 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_GROUP_PRIVILEGES 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdGroupPrivilegesList(MdGroupPrivilegesVO vo) throws Exception {
        return mdGroupPrivilegesDAO.selectMdGroupPrivilegesList(vo);
    }

    /**
	 * MD_GROUP_PRIVILEGES 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_GROUP_PRIVILEGES 총 갯수
	 * @exception
	 */
    public int selectMdGroupPrivilegesListTotCnt(MdGroupPrivilegesVO vo) {
		return mdGroupPrivilegesDAO.selectMdGroupPrivilegesListTotCnt(vo);
	}
    
}
