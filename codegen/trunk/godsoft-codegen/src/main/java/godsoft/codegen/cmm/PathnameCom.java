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
		setDaoTest(dataModel);

		setSqlMapConfig(dataModel);

		setService(dataModel);
		setServiceImpl(dataModel);
		setServiceImplTest(dataModel);
	}

	private File vo;
	private File sqlMap;
	private File dao;
	private File daoTest;
	private File sqlMapConfig;
	private File service;
	private File serviceImpl;
	private File serviceImplTest;

	public File getVo() {
		return vo;
	}

	public void setVo(DataModelContext dataModel) {
		if (dataModel.getEntity() == null) {
			return;
		}

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
		if (dataModel.getEntity() == null) {
			return;
		}

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
		if (dataModel.getEntity() == null) {
			return;
		}

		String format = "%s/src/main/java/%s/%s/service/impl/%sDAO.java";

		List<String> args = new ArrayList<String>();
		args.add(dataModel.getProjectName());
		args.add(dataModel.getPackageName().replaceAll("\\.", "/"));
		args.add(dataModel.getEntity().getLcName().replaceAll("_", ""));
		args.add(dataModel.getEntity().getPcName());

		this.dao = new File(String.format(format, args.toArray()));
	}

	public File getDaoTest() {
		return daoTest;
	}

	public void setDaoTest(DataModelContext dataModel) {
		if (dataModel.getEntity() == null) {
			return;
		}

		String format = "%s/src/test/java/%s/%s/service/impl/%sDAOTest.java";

		List<String> args = new ArrayList<String>();
		args.add(dataModel.getProjectName());
		args.add(dataModel.getPackageName().replaceAll("\\.", "/"));
		args.add(dataModel.getEntity().getLcName().replaceAll("_", ""));
		args.add(dataModel.getEntity().getPcName());

		this.daoTest = new File(String.format(format, args.toArray()));
	}

	public File getSqlMapConfig() {
		return sqlMapConfig;
	}

	public void setSqlMapConfig(DataModelContext dataModel) {
		String[] packageNames = dataModel.getPackageName().split("\\.");

		String vender = dataModel.getVender().toLowerCase();

		StringBuilder sb = new StringBuilder();

		sb.append(dataModel.getProjectName());
		sb.append("/src/main/resources/");
		sb.append(packageNames[0]);
		sb.append("/sqlmap/config/");
		sb.append(vender);
		sb.append("/sql-map-config-");
		sb.append(vender);

		for (int i = 1; i < packageNames.length; i++) {
			sb.append("-");
			sb.append(packageNames[i]);
		}

		sb.append(".xml");

		this.sqlMapConfig = new File(sb.toString());
	}

	public static String getSqlMap(DataModelContext dataModel) {
		String[] packageNames = dataModel.getPackageName().split("\\.");

		StringBuilder sb = new StringBuilder();

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

		return sb.toString();
	}

	public File getService() {
		return service;
	}

	public void setService(DataModelContext dataModel) {
		if (dataModel.getEntity() == null) {
			return;
		}

		String format = "%s/src/main/java/%s/%s/service/%sService.java";

		List<String> args = new ArrayList<String>();
		args.add(dataModel.getProjectName());
		args.add(dataModel.getPackageName().replaceAll("\\.", "/"));
		args.add(dataModel.getEntity().getLcName().replaceAll("_", ""));
		args.add(dataModel.getEntity().getPcName());

		this.service = new File(String.format(format, args.toArray()));
	}

	public File getServiceImpl() {
		return serviceImpl;
	}

	public void setServiceImpl(DataModelContext dataModel) {
		if (dataModel.getEntity() == null) {
			return;
		}

		String format = "%s/src/main/java/%s/%s/service/impl/%sServiceImpl.java";

		List<String> args = new ArrayList<String>();
		args.add(dataModel.getProjectName());
		args.add(dataModel.getPackageName().replaceAll("\\.", "/"));
		args.add(dataModel.getEntity().getLcName().replaceAll("_", ""));
		args.add(dataModel.getEntity().getPcName());

		this.serviceImpl = new File(String.format(format, args.toArray()));
	}

	public File getServiceImplTest() {
		return serviceImplTest;
	}

	public void setServiceImplTest(DataModelContext dataModel) {
		if (dataModel.getEntity() == null) {
			return;
		}

		String format = "%s/src/test/java/%s/%s/service/impl/%sServiceImplTest.java";

		List<String> args = new ArrayList<String>();
		args.add(dataModel.getProjectName());
		args.add(dataModel.getPackageName().replaceAll("\\.", "/"));
		args.add(dataModel.getEntity().getLcName().replaceAll("_", ""));
		args.add(dataModel.getEntity().getPcName());

		this.serviceImplTest = new File(String.format(format, args.toArray()));
	}

}
