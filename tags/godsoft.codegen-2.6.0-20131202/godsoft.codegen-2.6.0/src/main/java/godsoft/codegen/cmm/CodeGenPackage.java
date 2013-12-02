package godsoft.codegen.cmm;

public class CodeGenPackage {

	private DataModelContext dataModelContext;

	private String topLevelPackage;

	private String servicePackage;
	private String serviceImplPackage;
	private String webPackage;

	public CodeGenPackage(DataModelContext dataModelContext) {
		this.dataModelContext = dataModelContext;

		this.setTopLevelPackage();

		this.setServicePackage();
		this.setServiceImplPackage();
		this.setWebPackage();
	}

	public void setTopLevelPackage() {
		StringBuffer sb = new StringBuffer();
		sb.append(dataModelContext.getTopLevelPackage());
		sb.append(".");
		sb.append(dataModelContext.getMiddleLevelPackage());
		sb.append(".");
		sb.append(dataModelContext.getEntity().getPackageName());

		this.topLevelPackage = sb.toString();
	}

	public void setServicePackage() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.topLevelPackage);
		sb.append(".service");

		this.servicePackage = sb.toString();
	}

	public void setServiceImplPackage() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.topLevelPackage);
		sb.append(".service.impl");

		this.serviceImplPackage = sb.toString();
	}

	public void setWebPackage() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.topLevelPackage);
		sb.append(".web");

		this.webPackage = sb.toString();
	}

	public String getServicePackage() {
		return servicePackage;
	}

	public String getServiceImplPackage() {
		return serviceImplPackage;
	}

	public String getWebPackage() {
		return webPackage;
	}

}
