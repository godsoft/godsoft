package kr.godsoft.egovframe.generatorwebapp.imgtemp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.imgtemp.service.ImgtempService;
import kr.godsoft.egovframe.generatorwebapp.imgtemp.service.ImgtempVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ImgtempServiceImpl.java
 * @Description : Imgtemp Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("imgtempService")
public class ImgtempServiceImpl extends AbstractServiceImpl implements
        ImgtempService {

    @Resource(name="imgtempDAO")
    private ImgtempDAO imgtempDAO;
    
    /** ID Generation */
    //@Resource(name="{egovImgtempIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * imgtemp을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ImgtempVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertImgtemp(ImgtempVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	imgtempDAO.insertImgtemp(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * imgtemp을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ImgtempVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateImgtemp(ImgtempVO vo) throws Exception {
        imgtempDAO.updateImgtemp(vo);
    }

    /**
	 * imgtemp을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ImgtempVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteImgtemp(ImgtempVO vo) throws Exception {
        imgtempDAO.deleteImgtemp(vo);
    }

    /**
	 * imgtemp을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ImgtempVO
	 * @return 조회한 imgtemp
	 * @exception Exception
	 */
    public ImgtempVO selectImgtemp(ImgtempVO vo) throws Exception {
        ImgtempVO resultVO = imgtempDAO.selectImgtemp(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * imgtemp 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return imgtemp 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectImgtempList(ImgtempVO vo) throws Exception {
        return imgtempDAO.selectImgtempList(vo);
    }

    /**
	 * imgtemp 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return imgtemp 총 갯수
	 * @exception
	 */
    public int selectImgtempListTotCnt(ImgtempVO vo) {
		return imgtempDAO.selectImgtempListTotCnt(vo);
	}
    
}
