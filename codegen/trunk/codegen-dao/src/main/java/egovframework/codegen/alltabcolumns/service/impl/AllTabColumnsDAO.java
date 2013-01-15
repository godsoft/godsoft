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
package egovframework.codegen.alltabcolumns.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : AllTabColumnsDAO.java
 * @Description : AllTabColumns DAO Class
 * @Modification Information @ @ 수정일 수정자 수정내용 @ --------- ---------
 *               ------------------------------- @ 2013.01.15 최초생성
 *
 * @author 이백행
 * @since 2013. 01.15
 * @version 1.0
 * @see Copyright (C) by GODSOFT All right reserved.
 */

@Repository("allTabColumnsDAO")
public class AllTabColumnsDAO extends EgovAbstractDAO {

    @SuppressWarnings("unchecked")
    public List<EgovMap> selectAllTabColumnsList(EgovMap egovMap)
            throws Exception {
        return list("allTabColumnsDAO.selectAllTabColumnsList", egovMap);
    }

}
