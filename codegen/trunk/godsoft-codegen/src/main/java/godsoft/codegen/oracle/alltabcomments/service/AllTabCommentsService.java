package godsoft.codegen.oracle.alltabcomments.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.codegen.cmm.OracleVO;

public interface AllTabCommentsService {

	List<EgovMap> selectAllTabCommentsList(OracleVO oracleVO) throws Exception;

	String getTableComments(List<EgovMap> allTabComments, String key) throws Exception;

}
