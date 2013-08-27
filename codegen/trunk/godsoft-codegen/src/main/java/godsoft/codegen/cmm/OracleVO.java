package godsoft.codegen.cmm;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

import egovframework.dev.imp.codegen.template.model.Entity;

public class OracleVO {

	private String owner;

	private List<Entity> tableNames;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public List<Entity> getTableNames() {
		return tableNames;
	}

	public void setTableNames(List<Entity> tableNames) {
		this.tableNames = tableNames;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
