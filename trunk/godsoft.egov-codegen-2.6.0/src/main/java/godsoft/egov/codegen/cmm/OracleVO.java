package godsoft.egov.codegen.cmm;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

public class OracleVO {

	private String owner;

	private List<String> tableNames;

	private List<Entity> entitys;

	private boolean isSde;

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public List<String> getTableNames() {
		return tableNames;
	}

	public void setTableNames(List<String> tableNames) {
		this.tableNames = tableNames;
	}

	public boolean isSde() {
		return isSde;
	}

	public void setSde(boolean isSde) {
		this.isSde = isSde;
	}

	public List<Entity> getEntitys() {
		return entitys;
	}

	public void setEntitys(List<Entity> entitys) {
		this.entitys = entitys;
	}

}
