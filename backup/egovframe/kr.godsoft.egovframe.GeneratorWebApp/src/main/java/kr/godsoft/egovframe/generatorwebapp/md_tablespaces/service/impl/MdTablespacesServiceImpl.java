package kr.godsoft.egovframe.generatorwebapp.md_tablespaces.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_tablespaces.service.MdTablespacesService;
import kr.godsoft.egovframe.generatorwebapp.md_tablespaces.service.MdTablespacesVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdTablespacesServiceImpl.java
 * @Description : MdTablespaces Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdTablespacesService")
public class MdTablespacesServiceImpl extends AbstractServiceImpl implements
        MdTablespacesService {

    @Resource(name="mdTablespacesDAO")
    private MdTablespacesDAO mdTablespacesDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdTablespacesIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_TABLESPACES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdTablespacesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdTablespaces(MdTablespacesVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdTablespacesDAO.insertMdTablespaces(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_TABLESPACES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdTablespacesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdTablespaces(MdTablespacesVO vo) throws Exception {
        mdTablespacesDAO.updateMdTablespaces(vo);
    }

    /**
	 * MD_TABLESPACES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdTablespacesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdTablespaces(MdTablespacesVO vo) throws Exception {
        mdTablespacesDAO.deleteMdTablespaces(vo);
    }

    /**
	 * MD_TABLESPACES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdTablespacesVO
	 * @return 조회한 MD_TABLESPACES
	 * @exception Exception
	 */
    public MdTablespacesVO selectMdTablespaces(MdTablespacesVO vo) throws Exception {
        MdTablespacesVO resultVO = mdTablespacesDAO.selectMdTablespaces(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_TABLESPACES 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_TABLESPACES 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdTablespacesList(MdTablespacesVO vo) throws Exception {
        return mdTablespacesDAO.selectMdTablespacesList(vo);
    }

    /**
	 * MD_TABLESPACES 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_TABLESPACES 총 갯수
	 * @exception
	 */
    public int selectMdTablespacesListTotCnt(MdTablespacesVO vo) {
		return mdTablespacesDAO.selectMdTablespacesListTotCnt(vo);
	}
    
}
