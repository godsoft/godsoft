package godsoft.codegen.oracle.alltabcols.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.codegen.cmm.OracleVO;

public interface AllTabColsService {

	List<EgovMap> selectAllTabColsList(OracleVO oracleVO) throws Exception;

}
