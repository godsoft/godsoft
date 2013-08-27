package godsoft.codegen.oracle.alltabcomments.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.codegen.cmm.OracleVO;
import godsoft.codegen.oracle.alltabcomments.service.AllTabCommentsService;

@Service("allTabCommentsService")
public class AllTabCommentsServiceImpl extends AbstractServiceImpl implements AllTabCommentsService {

	@Resource(name = "allTabCommentsDAO")
	private AllTabCommentsDAO allTabCommentsDAO;

	public List<EgovMap> selectAllTabCommentsList(OracleVO oracleVO) throws Exception {
		return allTabCommentsDAO.selectAllTabCommentsList(oracleVO);
	}

	public String getTableComments(List<EgovMap> allTabComments, String key) {
		String tableComments = "";

		for (EgovMap allTabComment : allTabComments) {
			String tableName = (String) allTabComment.get("tableName");

			if (tableName.equals(key)) {
				tableComments = (String) allTabComment.get("comments");

				break;
			}
		}

		return tableComments;
	}

}
