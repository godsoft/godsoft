package godsoft.egov.codegen.cmm;

public class CodeGenPathname {

	private DataModelContext dataModelContext;

	private String topLevelPathname;

	private String servicePathname;
	private String serviceImplPathname;
	private String webPathname;

	private String defaultVOPathname;
	private String voPathname;
	private String sqlMapPathname;

	public CodeGenPathname(DataModelContext dataModelContext) {
		this.dataModelContext = dataModelContext;

		this.setTopLevelPathname();

		this.setServicePathname();

		this.setDefaultVOPathname();

		this.setVoPathname();

		this.setSqlMapPathname();
	}

	public void setTopLevelPathname() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.dataModelContext.getProjectLocation());
		sb.append("/src/main/java/");
		sb.append(this.dataModelContext.getTopLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getMiddleLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPackageName());

		this.topLevelPathname = sb.toString();
	}

	public void setServicePathname() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.topLevelPathname);
		sb.append("/service");

		this.servicePathname = sb.toString();
	}

	public void setDefaultVOPathname() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.servicePathname);
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPcName());
		sb.append("DefaultVO.java");

		this.defaultVOPathname = sb.toString();
	}

	public void setVoPathname() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.servicePathname);
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPcName());
		sb.append("VO.java");

		this.voPathname = sb.toString();
	}

	public void setSqlMapPathname() {
		String sqlMapPathname = this.dataModelContext.getTopLevelPackage().replaceAll("\\.", "/");

		StringBuffer sb = new StringBuffer();
		sb.append(this.dataModelContext.getProjectLocation());
		sb.append("/src/main/resources/");
		sb.append(sqlMapPathname.substring(0, sqlMapPathname.indexOf("/")));
		sb.append("/sqlmap");
		sb.append(sqlMapPathname.substring(sqlMapPathname.indexOf("/")));
		sb.append("/");
		sb.append(this.dataModelContext.getMiddleLevelPackage().replaceAll("\\.", "/"));
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPackageName());
		sb.append("/");
		sb.append(this.dataModelContext.getEntity().getPcName());
		sb.append("_SQL_Oracle.xml");

		this.sqlMapPathname = sb.toString();
	}

	public String getServicePathname() {
		return servicePathname;
	}

	public String getServiceImplPathname() {
		return serviceImplPathname;
	}

	public String getWebPathname() {
		return webPathname;
	}

	public String getDefaultVOPathname() {
		return defaultVOPathname;
	}

	public String getVoPathname() {
		return voPathname;
	}

	public String getSqlMapPathname() {
		return sqlMapPathname;
	}

}
