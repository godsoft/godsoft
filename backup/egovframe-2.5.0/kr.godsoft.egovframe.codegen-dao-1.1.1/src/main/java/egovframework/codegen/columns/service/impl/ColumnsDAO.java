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
package egovframework.codegen.columns.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ColumnsDAO.java
 * @Description : Columns DAO Class
 * @Modification Information @ @ 수정일 수정자 수정내용 @ --------- ---------
 *               ------------------------------- @ 2012.12.30 최초생성
 *
 * @author 갓소프트 이백행
 * @since 2012. 12.30
 * @version 1.0
 * @see Copyright (C) by godsoft All right reserved.
 */

@Repository("columnsDAO")
public class ColumnsDAO extends EgovAbstractDAO {

    /**
     * 글 목록을 조회한다.
     *
     * @param columnsMap
     *            - 조회할 정보가 담긴 Map
     * @return 글 목록
     * @exception Exception
     */
    @SuppressWarnings("unchecked")
    public List<EgovMap> selectColumnsList(Map<String, Object> columnsMap)
            throws Exception {
        return list("columnsDAO.selectColumnsList", columnsMap);
    }

}
