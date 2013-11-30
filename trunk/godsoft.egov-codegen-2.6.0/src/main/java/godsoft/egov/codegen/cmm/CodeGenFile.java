package godsoft.egov.codegen.cmm;

public class CodeGenFile {

	private DataModelContext dataModelContext;

	private String topLevelPathname;

	private String servicePathname;
	private String serviceImplPathname;
	private String webPathname;

	private String defaultVOPathname;

	public CodeGenFile(DataModelContext dataModelContext) {
		this.dataModelContext = dataModelContext;

		this.setTopLevelPathname();

		this.setServicePathname();

		this.setDefaultVOPathname();
	}

	public void setTopLevelPathname() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.dataModelContext.getProjectLocation());
		sb.append("/src/main/java/");
		sb.append(this.dataModelContext.getTopLevelPackage().replaceAll("\\.", "/"));
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

}
