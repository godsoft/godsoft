package egovframework.mbl.com.rns.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mbl.com.rns.service.EgovRealtimeNoticeService;
import egovframework.mbl.com.rns.service.RealtimeNotice;
import egovframework.mbl.com.rns.service.RealtimeNoticeVO;
import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
//import egovframework.rte.fdl.idgnr.EgovIdGnrService;

/**
 * 개요
 * - 실시간 공지 서비스에 대한 Service Interface를 구현한다.
 * 
 * 상세내용
 * - 실시간 공지 서비스에 대한 등록, 삭제, 조회 기능을 제공한다.
 * - 실시간 공지 서비스에 대한 조회기능은 목록, 상세조회로 구분된다.
 * @author 조준형
 * @since 2011.08.12
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *   
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *   2011.08.12  조준형          최초 생성
 *
 * </pre>
 */
@SuppressWarnings("unchecked")
@Service("RealtimeNoticeService")
public class EgovRealtimeNoticeServiceImpl extends AbstractServiceImpl implements EgovRealtimeNoticeService{

	/** ID Generation */    
	//@Resource(name="egovRealtimeNoticeIdGnrService")
	//private EgovIdGnrService idgenService;
	
	@Resource(name="RealtimeNoticeDAO")
    private RealtimeNoticeDAO realtimeNoticeDAO;

	/**
	 * [관리자] 실시간공지서비스 목록 조회
	 * 
	 * @param realtimceNoticeVO   
	 * @return List
	 */
	public List selectRealtimeNoticeList(RealtimeNoticeVO searchVO) {
		List rtnList = null;
		
		try {
			searchVO.setFetchRow(searchVO.getFetchRow() * 5);
			rtnList = realtimeNoticeDAO.selectRealtimeNoticeList(searchVO);

		} catch(Exception ex) {
			ex.printStackTrace();
			// TODO : logging 
		}
		
		return rtnList;
	}
	
	/**
	 * [관리자/사용자] 실시간공지서비스 상세조회 / 실시간공지 서비스 내용 
	 * 
	 * @param searchVO
	 * @return
	 */
	public RealtimeNotice selectRealtimeNotice(RealtimeNoticeVO searchVO) {
		RealtimeNotice rtnRealtimceNotice = null;
		
		try {
			rtnRealtimceNotice = realtimeNoticeDAO.selectRealtimeNotice(searchVO);
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return rtnRealtimceNotice;
	}
	
	/**
	 * [관리자] 실시간공지서비스 등록
	 * 
	 * @param realtimeNotice
	 */
	public int insertRealtimeNotice(RealtimeNotice realtimeNotice) {
		int rtn = 0;
		
		try {
			int newSn = realtimeNoticeDAO.selectRealtimeNoticeNewSn();
			
			// 1. SN 을 생성한다. 
			// int sn =  idgenService.getNextIntegerId();
			realtimeNotice.setSn(newSn);
			
			// 2. 등록을 한다.
			rtn = realtimeNoticeDAO.insertRealtimeNotice(realtimeNotice);

			// 3. 정상등록 후 등록 행이 첫번째 행이 아니라면 기존의 행의 최신구분을 변경한다.
/*
			if(rtn == 1 && newSn > 1) {
				realtimeNotice.setSn(newSn);
				realtimeNotice.setRecentCode("WRT02");
				realtimeNoticeDAO.updateRealtimeNoticeRecent(realtimeNotice);
			}
*/		
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return rtn;
	}
	
	/**
	 * [관리자] 실시간공지서비스 삭제
	 * 
	 * @param searchVO
	 */
	public int deleteRealtimeNotice(RealtimeNoticeVO realtimeNoticeVO) {
		int rtn = 0;
		
		try {
			// 실시간 공지 서비스를 삭제 한다.
			rtn = realtimeNoticeDAO.deleteRealtimeNotice(realtimeNoticeVO);
		
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return rtn;
	}

	/**
	 * 실시간 공지서비스 메시지 조회
	 * 
	 * @param RealtimeNotice;
	 */
	public RealtimeNotice selectRealtimeNoticeMsg() {
		RealtimeNotice rtnRealtimceNotice = null;
		
		try {
			rtnRealtimceNotice = realtimeNoticeDAO.selectRealtimeNoticeMsg();
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return rtnRealtimceNotice;
	}
}
