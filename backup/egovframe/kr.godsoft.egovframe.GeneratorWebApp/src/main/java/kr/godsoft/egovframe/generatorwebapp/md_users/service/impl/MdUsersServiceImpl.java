package kr.godsoft.egovframe.generatorwebapp.md_users.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_users.service.MdUsersService;
import kr.godsoft.egovframe.generatorwebapp.md_users.service.MdUsersVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdUsersServiceImpl.java
 * @Description : MdUsers Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdUsersService")
public class MdUsersServiceImpl extends AbstractServiceImpl implements
        MdUsersService {

    @Resource(name="mdUsersDAO")
    private MdUsersDAO mdUsersDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdUsersIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_USERS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdUsersVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdUsers(MdUsersVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdUsersDAO.insertMdUsers(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_USERS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdUsersVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdUsers(MdUsersVO vo) throws Exception {
        mdUsersDAO.updateMdUsers(vo);
    }

    /**
	 * MD_USERS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdUsersVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdUsers(MdUsersVO vo) throws Exception {
        mdUsersDAO.deleteMdUsers(vo);
    }

    /**
	 * MD_USERS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdUsersVO
	 * @return 조회한 MD_USERS
	 * @exception Exception
	 */
    public MdUsersVO selectMdUsers(MdUsersVO vo) throws Exception {
        MdUsersVO resultVO = mdUsersDAO.selectMdUsers(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_USERS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_USERS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdUsersList(MdUsersVO vo) throws Exception {
        return mdUsersDAO.selectMdUsersList(vo);
    }

    /**
	 * MD_USERS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_USERS 총 갯수
	 * @exception
	 */
    public int selectMdUsersListTotCnt(MdUsersVO vo) {
		return mdUsersDAO.selectMdUsersListTotCnt(vo);
	}
    
}
