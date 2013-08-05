package godsoft.codegen.cmm;

import godsoft.codegen.model.DataModelContext;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GodsoftUtils {

	public static String getToday() {
		Date now = new Date();

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		return format.format(now);
	}

	public static String getServicePackage(DataModelContext dataModel) {
		StringBuilder sb = new StringBuilder();

		if (dataModel.getEntity() != null) {
			sb.append(dataModel.getPackageName());
			sb.append(".");
			sb.append(dataModel.getEntity().getLcName());
			sb.append(".service");
		}

		return sb.toString();
	}

	public static String getServiceImplPackage(DataModelContext dataModel) {
		StringBuilder sb = new StringBuilder();

		if (dataModel.getEntity() != null) {
			sb.append(dataModel.getPackageName());
			sb.append(".");
			sb.append(dataModel.getEntity().getLcName());
			sb.append(".service.impl");
		}

		return sb.toString();
	}

	public static File getFileDefaultVO(DataModelContext dataModel) {
		// /pms-webapp/src/main/java/forest/pms/fpuser/service/FpuserVO.java

		StringBuilder sb = new StringBuilder();

		sb.append("../");
		sb.append(dataModel.getProjectName());
		sb.append("/src/main/java/");
		sb.append(dataModel.getPackageName().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(dataModel.getEntity().getLcName());
		sb.append("/service/");
		sb.append(dataModel.getEntity().getPcName());
		sb.append("DefaultVO.java");

		return new File(sb.toString());
	}

	public static File getFileVO(DataModelContext dataModel) {
		// /godsoft.codegen/src/main/resources/eGovFrameTemplates/crud/java/pkg/service/Sample2VO.vm

		StringBuilder sb = new StringBuilder();

		sb.append("../");
		sb.append(dataModel.getProjectName());
		sb.append("/src/main/java/");
		sb.append(dataModel.getPackageName().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(dataModel.getEntity().getLcName());
		sb.append("/service/");
		sb.append(dataModel.getEntity().getPcName());
		sb.append("VO.java");

		return new File(sb.toString());
	}

	public static File getFileSqlMap(DataModelContext dataModel) {
		// /pms-webapp/src/main/resources/forest/sqlmap/pms/fpuser/Fpuser_SQL_Oracle.xml

		String[] packageNames = dataModel.getPackageName().split("\\.");

		StringBuilder sb = new StringBuilder();

		sb.append("../");
		sb.append(dataModel.getProjectName());
		sb.append("/src/main/resources/");
		sb.append(packageNames[0]);
		sb.append("/sqlmap/");
		sb.append(packageNames[1]);
		sb.append("/");
		sb.append(dataModel.getEntity().getLcName());
		sb.append("/");
		sb.append(dataModel.getEntity().getPcName());
		sb.append("_SQL_Oracle.xml");

		return new File(sb.toString());
	}

	public static String getSqlMap(DataModelContext dataModel) {
		// /pms-webapp/src/main/resources/forest/sqlmap/pms/fpuser/Fpuser_SQL_Oracle.xml

		String[] packageNames = dataModel.getPackageName().split("\\.");

		StringBuilder sb = new StringBuilder();

		sb.append(packageNames[0]);
		sb.append("/sqlmap/");
		sb.append(packageNames[1]);
		sb.append("/");
		sb.append(dataModel.getEntity().getLcName());
		sb.append("/");
		sb.append(dataModel.getEntity().getPcName());
		sb.append("_SQL_Oracle.xml");

		return sb.toString();
	}

	public static File getFileSqlMapConfig(DataModelContext dataModel) {
		// /pms-webapp/src/main/resources/forest/sqlmap/config/oracle/sql-map-config-oracle-pms.xml

		String[] packageNames = dataModel.getPackageName().split("\\.");

		String vender = dataModel.getVender().toLowerCase();

		StringBuilder sb = new StringBuilder();

		sb.append("../");
		sb.append(dataModel.getProjectName());
		sb.append("/src/main/resources/");
		sb.append(packageNames[0]);
		sb.append("/sqlmap/config/");
		sb.append(vender);
		sb.append("/sql-map-config-");
		sb.append(vender);
		sb.append("-");
		sb.append(packageNames[1]);
		sb.append("-002.xml");

		return new File(sb.toString());
	}

	public static File getFileDAO(DataModelContext dataModel) {
		// /pms-webapp/src/main/java/forest/pms/fpuser/service/impl/FpuserDAO.java

		StringBuilder sb = new StringBuilder();

		sb.append("../");
		sb.append(dataModel.getProjectName());
		sb.append("/src/main/java/");
		sb.append(dataModel.getPackageName().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(dataModel.getEntity().getLcName());
		sb.append("/service/impl/");
		sb.append(dataModel.getEntity().getPcName());
		sb.append("DAO.java");

		return new File(sb.toString());
	}

	public static File getFileDAOTest(DataModelContext dataModel) {
		// /pms-webapp/src/test/java/forest/pms/fpuser/service/impl/FpuserDAOTest.java

		StringBuilder sb = new StringBuilder();

		sb.append("../");
		sb.append(dataModel.getProjectName());
		sb.append("/src/test/java/");
		sb.append(dataModel.getPackageName().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(dataModel.getEntity().getLcName());
		sb.append("/service/impl/");
		sb.append(dataModel.getEntity().getPcName());
		sb.append("DAOTest.java");

		return new File(sb.toString());
	}

}
