package egovframework.codegen.cmm.service;

import model.DataModelContext;
import egovframework.rte.psl.dataaccess.util.EgovMap;

public interface OracleService {

    void tables(EgovMap egovMap) throws Exception;

    void columns(EgovMap egovMap) throws Exception;

    void init(DataModelContext dataModel) throws Exception;

    void sqlMap(IsGen isGen) throws Exception;

}
