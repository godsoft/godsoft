package kr.godsoft.egovframe.egovframegenerator.alltabcolumns.java;

import java.util.List;

import kr.godsoft.egovframe.egovframegenerator.alltabcolumns.service.AllTabColumnsService;
import kr.godsoft.egovframe.egovframegenerator.util.Util;
import model.DataModelContext;

import org.springframework.context.ApplicationContext;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public class AllTabColumnsClient {

	// private static final Log log =
	// LogFactory.getLog(AllTabColumnsClient.class);

	private ApplicationContext applicationContext;

	private AllTabColumnsService allTabColumnsService;

	public AllTabColumnsClient() {
		applicationContext = Util.getApplicationContext();

		allTabColumnsService = (AllTabColumnsService) applicationContext
				.getBean("allTabColumnsService");
	}

	public List<EgovMap> selectAllTabColumnsList(EgovMap egovMapVO)
			throws Exception {
		return allTabColumnsService.selectAllTabColumnsList(egovMapVO);
	}

	public List<DataModelContext> getDataModelContexts(EgovMap egovMapVO,
			DataModelContext dataModelContext) throws Exception {
		return allTabColumnsService.getDataModelContexts(egovMapVO,
				dataModelContext);
	}

}
