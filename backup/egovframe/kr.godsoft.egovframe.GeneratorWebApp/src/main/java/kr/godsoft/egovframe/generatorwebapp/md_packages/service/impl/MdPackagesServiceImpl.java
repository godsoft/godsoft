package kr.godsoft.egovframe.generatorwebapp.md_packages.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_packages.service.MdPackagesService;
import kr.godsoft.egovframe.generatorwebapp.md_packages.service.MdPackagesVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdPackagesServiceImpl.java
 * @Description : MdPackages Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdPackagesService")
public class MdPackagesServiceImpl extends AbstractServiceImpl implements
        MdPackagesService {

    @Resource(name="mdPackagesDAO")
    private MdPackagesDAO mdPackagesDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdPackagesIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_PACKAGES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdPackagesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdPackages(MdPackagesVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdPackagesDAO.insertMdPackages(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_PACKAGES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdPackagesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdPackages(MdPackagesVO vo) throws Exception {
        mdPackagesDAO.updateMdPackages(vo);
    }

    /**
	 * MD_PACKAGES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdPackagesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdPackages(MdPackagesVO vo) throws Exception {
        mdPackagesDAO.deleteMdPackages(vo);
    }

    /**
	 * MD_PACKAGES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdPackagesVO
	 * @return 조회한 MD_PACKAGES
	 * @exception Exception
	 */
    public MdPackagesVO selectMdPackages(MdPackagesVO vo) throws Exception {
        MdPackagesVO resultVO = mdPackagesDAO.selectMdPackages(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_PACKAGES 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_PACKAGES 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdPackagesList(MdPackagesVO vo) throws Exception {
        return mdPackagesDAO.selectMdPackagesList(vo);
    }

    /**
	 * MD_PACKAGES 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_PACKAGES 총 갯수
	 * @exception
	 */
    public int selectMdPackagesListTotCnt(MdPackagesVO vo) {
		return mdPackagesDAO.selectMdPackagesListTotCnt(vo);
	}
    
}
