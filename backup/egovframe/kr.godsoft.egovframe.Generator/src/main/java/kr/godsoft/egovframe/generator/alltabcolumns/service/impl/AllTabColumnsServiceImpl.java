package kr.godsoft.egovframe.generator.alltabcolumns.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generator.alltabcolumns.service.AllTabColumnsDefaultVO;
import kr.godsoft.egovframe.generator.alltabcolumns.service.AllTabColumnsService;
import kr.godsoft.egovframe.generator.alltabcolumns.service.AllTabColumnsVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;

/**
 * @Class Name : ColumnsServiceImpl.java
 * @Description : Columns Business Implement class
 * @Modification Information
 * 
 * @author 이백행
 * @since 2012-02-01
 * @version 1.0
 * @see Copyright (C) All right reserved.
 */

@Service("allTabColumnsService")
public class AllTabColumnsServiceImpl extends AbstractServiceImpl implements
AllTabColumnsService {

	@Resource(name = "allTabColumnsDAO")
	private AllTabColumnsDAO allTabColumnsDAO;

	/** ID Generation */
	// @Resource(name="{egovColumnsIdGnrService}")
	// private EgovIdGnrService egovIdGnrService;

	/**
	 * COLUMNS을 등록한다.
	 * 
	 * @param vo
	 *            - 등록할 정보가 담긴 ColumnsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
	public String insertColumns(AllTabColumnsVO vo) throws Exception {
		log.debug(vo.toString());

		/** ID Generation Service */
		// TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
		// String id = egovIdGnrService.getNextStringId();
		// vo.setId(id);
		log.debug(vo.toString());

		allTabColumnsDAO.insertColumns(vo);
		// TODO 해당 테이블 정보에 맞게 수정
		return null;
	}

	/**
	 * COLUMNS을 수정한다.
	 * 
	 * @param vo
	 *            - 수정할 정보가 담긴 ColumnsVO
	 * @return void형
	 * @exception Exception
	 */
	public void updateColumns(AllTabColumnsVO vo) throws Exception {
		allTabColumnsDAO.updateColumns(vo);
	}

	/**
	 * COLUMNS을 삭제한다.
	 * 
	 * @param vo
	 *            - 삭제할 정보가 담긴 ColumnsVO
	 * @return void형
	 * @exception Exception
	 */
	public void deleteColumns(AllTabColumnsVO vo) throws Exception {
		allTabColumnsDAO.deleteColumns(vo);
	}

	/**
	 * COLUMNS을 조회한다.
	 * 
	 * @param vo
	 *            - 조회할 정보가 담긴 ColumnsVO
	 * @return 조회한 COLUMNS
	 * @exception Exception
	 */
	public AllTabColumnsVO selectColumns(AllTabColumnsVO vo) throws Exception {
		AllTabColumnsVO resultVO = allTabColumnsDAO.selectColumns(vo);
		if (resultVO == null)
			throw processException("info.nodata.msg");
		return resultVO;
	}

	/**
	 * COLUMNS 목록을 조회한다.
	 * 
	 * @param searchVO
	 *            - 조회할 정보가 담긴 VO
	 * @return COLUMNS 목록
	 * @exception Exception
	 */
	public List selectColumnsList(AllTabColumnsDefaultVO searchVO) throws Exception {
		return allTabColumnsDAO.selectColumnsList(searchVO);
	}

	/**
	 * COLUMNS 총 갯수를 조회한다.
	 * 
	 * @param searchVO
	 *            - 조회할 정보가 담긴 VO
	 * @return COLUMNS 총 갯수
	 * @exception
	 */
	public int selectColumnsListTotCnt(AllTabColumnsDefaultVO searchVO) {
		return allTabColumnsDAO.selectColumnsListTotCnt(searchVO);
	}

}
