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
package egovframework.codegen.alltables.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.codegen.alltables.service.AllTablesService;
import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : AllTablesServiceImpl.java
 * @Description : AllTables Business Implement Class
 * @Modification Information @ @ 수정일 수정자 수정내용 @ --------- ---------
 *               ------------------------------- @ 2013.01.15 최초생성
 *
 * @author 이백행
 * @since 2013. 01.15
 * @version 1.0
 * @see Copyright (C) by GODSOFT All right reserved.
 */

@Service("allTablesService")
public class AllTablesServiceImpl extends AbstractServiceImpl implements
        AllTablesService {

    /** AllTablesDAO */
    @Resource(name = "allTablesDAO")
    private AllTablesDAO allTablesDAO;

    /** ID Generation */
    @Resource(name = "egovIdGnrService")
    private EgovIdGnrService egovIdGnrService;

    public List<EgovMap> selectAllTablesList(EgovMap egovMap) throws Exception {
        return allTablesDAO.selectAllTablesList(egovMap);
    }

}
