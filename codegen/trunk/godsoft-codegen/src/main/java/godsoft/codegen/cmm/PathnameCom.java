package godsoft.codegen.cmm;

import godsoft.codegen.cmm.model.DataModelContext;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PathnameCom {

	public PathnameCom(DataModelContext dataModel) {
		setVo(dataModel);
		setSqlMap(dataModel);
		setDao(dataModel);
	}

	private File vo;
	private File sqlMap;
	private File dao;

	public File getVo() {
		return vo;
	}

	public void setVo(DataModelContext dataModel) {
		String format = "%s/src/main/java/%s/%s/service/%sVO.java";

		List<String> args = new ArrayList<String>();
		args.add(dataModel.getProjectName());
		args.add(dataModel.getPackageName().replaceAll("\\.", "/"));
		args.add(dataModel.getEntity().getLcName().replaceAll("_", ""));
		args.add(dataModel.getEntity().getPcName());

		this.vo = new File(String.format(format, args.toArray()));
	}

	public File getSqlMap() {
		return sqlMap;
	}

	public void setSqlMap(DataModelContext dataModel) {
		StringBuilder sb = new StringBuilder();

		sb.append(dataModel.getProjectName());
		sb.append("/src/main/resources/");

		String[] packageNames = dataModel.getPackageName().split("\\.");

		sb.append(packageNames[0]);

		sb.append("/sqlmap/");

		for (int i = 1; i < packageNames.length; i++) {
			sb.append(packageNames[i]);
			sb.append("/");
		}

		sb.append(dataModel.getEntity().getLcName().replaceAll("_", ""));
		sb.append("/");
		sb.append(dataModel.getEntity().getPcName());
		sb.append("_SQL_Oracle.xml");

		this.sqlMap = new File(sb.toString());
	}

	public File getDao() {
		return dao;
	}

	public void setDao(DataModelContext dataModel) {
		String format = "%s/src/main/java/%s/%s/service/impl/%sDAO.java";

		List<String> args = new ArrayList<String>();
		args.add(dataModel.getProjectName());
		args.add(dataModel.getPackageName().replaceAll("\\.", "/"));
		args.add(dataModel.getEntity().getLcName().replaceAll("_", ""));
		args.add(dataModel.getEntity().getPcName());

		this.dao = new File(String.format(format, args.toArray()));
	}

}
