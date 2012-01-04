package egovframework.mbl.com.syn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mbl.com.syn.service.EgovSyncService;
import egovframework.mbl.com.syn.service.Sync;
import egovframework.mbl.com.syn.service.SyncVO;
import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
//import egovframework.rte.fdl.idgnr.EgovIdGnrService;
/**
 * 개요
 * - 동기화 서비스에 대한 Service Interface를 구현한다.
 * 
 * 상세내용
 * - 동기화 서비스에 대한 등록, 삭제, 조회 기능을 제공한다.
 * - 동기화 서비스에 대한 조회기능은 목록, 상세조회로 구분된다.
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
 *   2011.09.06  조준형          동기화 기능 추가
 *
 * </pre>
 */
@SuppressWarnings("unchecked")
@Service("SyncService")
public class EgovSyncServiceImpl extends AbstractServiceImpl implements EgovSyncService{
	/** ID Generation */    
	//@Resource(name="egovRealtimeNoticeIdGnrService")
	//private EgovIdGnrService idgenService;
	
	@Resource(name="SyncDAO")
    private SyncDAO syncDAO;
	
	/**
	 * 동기화 서비스 글 총 갯수
	 * 
	 * @param searchVO
	 * @return
	 */
	public int selectSyncListTotCnt(SyncVO searchVO) {
		int rtn = 0;
		
		try {
			rtn = syncDAO.selectSyncListTotCnt(searchVO);
			
		} catch(Exception e) {
			e.printStackTrace();
		}		
		
		return rtn;
	}
	
	/**
	 * 동기화 서비스 글 목록 조회
	 * 
	 * @param searchVO
	 * @return
	 */
	public List selectSyncList(SyncVO searchVO) {
		List rtnList = null;
		
		try {
			searchVO.setFetchRow(searchVO.getFetchRow() * 5);
			rtnList = syncDAO.selectSyncList(searchVO);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return rtnList;
	}

	/**
	 * 동기화 서비스글 상세 조회 
	 * 
	 * @param searchVO
	 * @return
	 */
	public Sync selectSync(SyncVO searchVO) {
		Sync sync = null;

		try {
			sync = syncDAO.selectSync(searchVO);
			
		} catch(Exception e) {
			e.printStackTrace();
		}		
		
		return sync;
	}
	
	/**
	 * 동기호 서비스 글 등록 
	 * 
	 * @param sync
	 * @return
	 */
	public int insertSync(Sync sync) {
		int rtn = 0;
		
		try {
			int newSn = syncDAO.selectSyncNewSn();
			sync.setSn(newSn);
			
			rtn = syncDAO.insertSync(sync);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return rtn;
	}
	
	/**
	 * 동기화 서비스 글 삭제
	 * 
	 * @param searchVO
	 */
	public int deleteSync(Sync sync) {
		int rtn = 0;

		try {
			rtn = syncDAO.deleteSync(sync);

		} catch(Exception e) {
			e.printStackTrace();
		}		
		
		return rtn;
		
	}

	/**
	 * 동기화 서비스 글 수정
	 * 
	 * @param searchVO
	 * @return
	 */
	public int updateSync(Sync sync) {
		int rtn = 0;
		
		try {
			rtn = syncDAO.updateSync(sync);
			
		} catch(Exception e) {
			e.printStackTrace();
		}		
		
		return rtn;
		
	}
	
	/**
	 * 동기화 서비스 글 '동기화'를 실행
	 * 
	 * @param searchVO
	 * @return
	 */
	public int executeSync(Sync sync, String localData) {
		int rtn = 0;
		
		try {
			String[] localDataArr = localData.split("∀");
			for(int i=0; i<localDataArr.length; i++) {
				String[] syncDataArr = localDataArr[i].split("\\|");
				
				if("I".equals(syncDataArr[0].toString())) {
					sync.setSyncSj(syncDataArr[2]);
					sync.setSyncCn(syncDataArr[3]);
					rtn = insertSync(sync);
					
				} else if("U".equals(syncDataArr[0].toString())) {
					int updateSn = Integer.parseInt(syncDataArr[1]);

					sync.setSn(updateSn);
					sync.setSyncSj(syncDataArr[2]);
					sync.setSyncCn(syncDataArr[3]);
					rtn = updateSync(sync);
					
				} else if("D".equals(syncDataArr[0].toString())) {
					int deleteSn = Integer.parseInt(syncDataArr[1]);

					sync.setSn(deleteSn);
					rtn = deleteSync(sync);
					
				} 
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}		
		
		return rtn;
	}
}
