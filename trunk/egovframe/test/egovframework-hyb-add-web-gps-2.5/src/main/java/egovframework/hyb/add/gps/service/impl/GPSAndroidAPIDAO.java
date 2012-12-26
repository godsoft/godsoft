/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package egovframework.hyb.add.gps.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.hyb.add.gps.service.GPSAndroidAPIDefaultVO;
import egovframework.hyb.add.gps.service.GPSAndroidAPIVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;


/**  
 * @Class Name : GPSAndroidAPIDAO.java
 * @Description : GPSAndroidAPIDAO Class
 * @Modification Information  
 * @
 * @  수정일              수정자                   수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2012.08.27    나신일                   최초생성
 * 
 * @author 디바이스 API 실행환경 개발팀
 * @since 2012. 08.27
 * @version 1.0
 * @see
 * 
 *  Copyright (C) by MOPAS All right reserved.
 */

@Repository("GPSAndroidAPIDAO")
public class GPSAndroidAPIDAO extends EgovAbstractDAO {

    /**
     * gps 정보를 등록한다.
     * 
     * @param vo
     *            - 등록할 정보가 담긴 GPSAPIVO
     * @return 등록 결과
     * @exception Exception
     */
    public int insertGPSInfo(GPSAndroidAPIVO vo) throws Exception {
        return (Integer) insert("gpsAndroidAPIDAO.insertGPSInfo", vo);
    }

    /**
     * gps 정보를 삭제한다.
     * 
     * @param vo
     *            - 삭제할 정보가 담긴 GPSAPIVO
     * @return void형
     * @exception Exception
     */
    public int deleteGPSInfo(GPSAndroidAPIVO vo) throws Exception {
        return delete("gpsAndroidAPIDAO.deleteGPSInfo", vo);
    }

    /**
     * gps 정보 목록을 조회한다.
     * 
     * @param vo
     *            - 조회할 정보가 담긴 GPSAPIDefaultVO
     * @return gps 정보 목록
     * @exception Exception
     */
    public List selectGPSInfoList(GPSAndroidAPIVO searchVO) throws Exception {
        return list("gpsAndroidAPIDAO.selectGPSInfoList", searchVO);
    }

    /**
     * gps 정보 총 갯수를 조회한다.
     * 
     * @param vo
     *            - 조회할 정보가 담긴 GPSAPIDefaultVO
     * @return 네트워크 정보 총 갯수
     * @exception
     */
    public int selectGPSInfoListTotCnt(GPSAndroidAPIDefaultVO searchVO) {
        return (Integer) getSqlMapClientTemplate().queryForObject(
                "gpsAndroidAPIDAO.selectGPSInfoListTotCnt", searchVO);
    }

}
