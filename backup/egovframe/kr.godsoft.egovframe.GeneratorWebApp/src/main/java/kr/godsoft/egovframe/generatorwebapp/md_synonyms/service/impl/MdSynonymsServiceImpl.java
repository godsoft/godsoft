package kr.godsoft.egovframe.generatorwebapp.md_synonyms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_synonyms.service.MdSynonymsService;
import kr.godsoft.egovframe.generatorwebapp.md_synonyms.service.MdSynonymsVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdSynonymsServiceImpl.java
 * @Description : MdSynonyms Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdSynonymsService")
public class MdSynonymsServiceImpl extends AbstractServiceImpl implements
        MdSynonymsService {

    @Resource(name="mdSynonymsDAO")
    private MdSynonymsDAO mdSynonymsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdSynonymsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_SYNONYMS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdSynonymsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdSynonyms(MdSynonymsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdSynonymsDAO.insertMdSynonyms(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_SYNONYMS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdSynonymsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdSynonyms(MdSynonymsVO vo) throws Exception {
        mdSynonymsDAO.updateMdSynonyms(vo);
    }

    /**
	 * MD_SYNONYMS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdSynonymsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdSynonyms(MdSynonymsVO vo) throws Exception {
        mdSynonymsDAO.deleteMdSynonyms(vo);
    }

    /**
	 * MD_SYNONYMS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdSynonymsVO
	 * @return 조회한 MD_SYNONYMS
	 * @exception Exception
	 */
    public MdSynonymsVO selectMdSynonyms(MdSynonymsVO vo) throws Exception {
        MdSynonymsVO resultVO = mdSynonymsDAO.selectMdSynonyms(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_SYNONYMS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_SYNONYMS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdSynonymsList(MdSynonymsVO vo) throws Exception {
        return mdSynonymsDAO.selectMdSynonymsList(vo);
    }

    /**
	 * MD_SYNONYMS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_SYNONYMS 총 갯수
	 * @exception
	 */
    public int selectMdSynonymsListTotCnt(MdSynonymsVO vo) {
		return mdSynonymsDAO.selectMdSynonymsListTotCnt(vo);
	}
    
}
