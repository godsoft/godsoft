package kr.godsoft.egovframe.generatorwebapp.md_sequences.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_sequences.service.MdSequencesService;
import kr.godsoft.egovframe.generatorwebapp.md_sequences.service.MdSequencesVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdSequencesServiceImpl.java
 * @Description : MdSequences Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdSequencesService")
public class MdSequencesServiceImpl extends AbstractServiceImpl implements
        MdSequencesService {

    @Resource(name="mdSequencesDAO")
    private MdSequencesDAO mdSequencesDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdSequencesIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_SEQUENCES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdSequencesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdSequences(MdSequencesVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdSequencesDAO.insertMdSequences(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_SEQUENCES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdSequencesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdSequences(MdSequencesVO vo) throws Exception {
        mdSequencesDAO.updateMdSequences(vo);
    }

    /**
	 * MD_SEQUENCES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdSequencesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdSequences(MdSequencesVO vo) throws Exception {
        mdSequencesDAO.deleteMdSequences(vo);
    }

    /**
	 * MD_SEQUENCES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdSequencesVO
	 * @return 조회한 MD_SEQUENCES
	 * @exception Exception
	 */
    public MdSequencesVO selectMdSequences(MdSequencesVO vo) throws Exception {
        MdSequencesVO resultVO = mdSequencesDAO.selectMdSequences(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_SEQUENCES 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_SEQUENCES 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdSequencesList(MdSequencesVO vo) throws Exception {
        return mdSequencesDAO.selectMdSequencesList(vo);
    }

    /**
	 * MD_SEQUENCES 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_SEQUENCES 총 갯수
	 * @exception
	 */
    public int selectMdSequencesListTotCnt(MdSequencesVO vo) {
		return mdSequencesDAO.selectMdSequencesListTotCnt(vo);
	}
    
}
