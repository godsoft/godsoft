package kr.godsoft.egovframe.generatorwebapp.md_group_members.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_group_members.service.MdGroupMembersService;
import kr.godsoft.egovframe.generatorwebapp.md_group_members.service.MdGroupMembersVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdGroupMembersServiceImpl.java
 * @Description : MdGroupMembers Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdGroupMembersService")
public class MdGroupMembersServiceImpl extends AbstractServiceImpl implements
        MdGroupMembersService {

    @Resource(name="mdGroupMembersDAO")
    private MdGroupMembersDAO mdGroupMembersDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdGroupMembersIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_GROUP_MEMBERS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdGroupMembersVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdGroupMembers(MdGroupMembersVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdGroupMembersDAO.insertMdGroupMembers(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_GROUP_MEMBERS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdGroupMembersVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdGroupMembers(MdGroupMembersVO vo) throws Exception {
        mdGroupMembersDAO.updateMdGroupMembers(vo);
    }

    /**
	 * MD_GROUP_MEMBERS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdGroupMembersVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdGroupMembers(MdGroupMembersVO vo) throws Exception {
        mdGroupMembersDAO.deleteMdGroupMembers(vo);
    }

    /**
	 * MD_GROUP_MEMBERS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdGroupMembersVO
	 * @return 조회한 MD_GROUP_MEMBERS
	 * @exception Exception
	 */
    public MdGroupMembersVO selectMdGroupMembers(MdGroupMembersVO vo) throws Exception {
        MdGroupMembersVO resultVO = mdGroupMembersDAO.selectMdGroupMembers(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_GROUP_MEMBERS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_GROUP_MEMBERS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdGroupMembersList(MdGroupMembersVO vo) throws Exception {
        return mdGroupMembersDAO.selectMdGroupMembersList(vo);
    }

    /**
	 * MD_GROUP_MEMBERS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_GROUP_MEMBERS 총 갯수
	 * @exception
	 */
    public int selectMdGroupMembersListTotCnt(MdGroupMembersVO vo) {
		return mdGroupMembersDAO.selectMdGroupMembersListTotCnt(vo);
	}
    
}
