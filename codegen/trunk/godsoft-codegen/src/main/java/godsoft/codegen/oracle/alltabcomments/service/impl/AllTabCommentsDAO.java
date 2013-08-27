package godsoft.codegen.oracle.alltabcomments.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.codegen.cmm.OracleVO;

@Repository("allTabCommentsDAO")
public class AllTabCommentsDAO extends EgovAbstractDAO {

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectAllTabCommentsList(OracleVO oracleVO) throws Exception {
		return list("allTabCommentsDAO.selectAllTabCommentsList", oracleVO);
	}

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectAllTabCommentsList002(Map<String, Object> parameterObject) throws Exception {
		return list("allTabCommentsDAO.selectAllTabCommentsList.002", parameterObject);
	}

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectAllTabCommentsList003(Map<String, Object> parameterObject) throws Exception {
		return list("allTabCommentsDAO.selectAllTabCommentsList.003", parameterObject);
	}

}
