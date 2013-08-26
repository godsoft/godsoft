package egovframework.mbl.com.ows.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mbl.com.ows.service.EgovOfflineWebService;
import egovframework.mbl.com.ows.service.OfflineWeb;
import egovframework.mbl.com.ows.service.OfflineWebVO;
import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
// import egovframework.rte.fdl.idgnr.EgovIdGnrService;
/**
 * 개요
 * - 오프라인웹 서비스에 대한 Service Interface를 구현한다.
 * 
 * 상세내용
 * - 오프라인웹 서비스에 대한 등록, 삭제, 조회 기능을 제공한다.
 * - 오프라인웹 서비스에 대한 조회기능은 목록, 상세조회로 구분된다.
 * @author 조준형
 * @since 2011.09.01
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
@Service("OfflineWebService")
public class EgovOfflineWebServiceImpl extends AbstractServiceImpl implements EgovOfflineWebService{
	/** ID Generation */    
	//@Resource(name="egovRealtimeNoticeIdGnrService")
	//private EgovIdGnrService idgenService;
	
	@Resource(name="OfflineWebDAO")
    private OfflineWebDAO offlineWebDAO;
	
	/**
	 * 오프라인웹 서비스 글 총 갯수
	 * 
	 * @param searchVO
	 * @return
	 */
	public int selectOfflineWebListTotCnt(OfflineWebVO searchVO) {
		int rtn = 0;
		
		try {
			rtn = offlineWebDAO.selectOfflineWebListTotCnt(searchVO);

		} catch(Exception e) {
			e.printStackTrace();
		}		
		
		return rtn;
	}
	
	/**
	 * 오프라인웹 서비스 글 목록 조회
	 * 
	 * @param searchVO
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List selectOfflineWebList(OfflineWebVO searchVO) {
		List rtnList = null;
		
		try {
			searchVO.setFetchRow(searchVO.getFetchRow() * 5);
			rtnList = offlineWebDAO.selectOfflineWebList(searchVO);

		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return rtnList;
	}

	/**
	 * 오프라인웹 서비스글 상세 조회 
	 * 
	 * @param searchVO
	 * @return
	 */
	public OfflineWeb selectOfflineWeb(OfflineWebVO searchVO) {
		OfflineWeb offlineWeb = null;

		try {
			offlineWeb = offlineWebDAO.selectOfflineWeb(searchVO);

		} catch(Exception e) {
			e.printStackTrace();
		}	
		
		return offlineWeb;
	}
	
	/**
	 * 동기호 서비스 글 등록 
	 * 
	 * @param offlineWeb
	 * @return
	 */
	public int insertOfflineWeb(OfflineWeb offlineWeb) {
		int rtn = 0;
		
		try {
			int newSn = offlineWebDAO.selectOfflineWebNewSn();
			offlineWeb.setSn(newSn);
			rtn = offlineWebDAO.insertOfflineWeb(offlineWeb);

		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return rtn;
	}
	
	/**
	 * 오프라인웹 서비스 글 삭제
	 * 
	 * @param searchVO
	 */
	public int deleteOfflineWeb(OfflineWebVO searchVO) {
		int rtn = 0;

		try {
			rtn = offlineWebDAO.deleteOfflineWeb(searchVO);
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return rtn;
	}

	/**
	 * 오프라인웹 서비스 글 수정
	 * 
	 * @param searchVO
	 * @return
	 */
	public int updateOfflineWeb(OfflineWeb offlineWeb) {
		int rtn = 0;
		
		try {
			rtn = offlineWebDAO.updateOfflineWeb(offlineWeb);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return rtn;
	}
}
