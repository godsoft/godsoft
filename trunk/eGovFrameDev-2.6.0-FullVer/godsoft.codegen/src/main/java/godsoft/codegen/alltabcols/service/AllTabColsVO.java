package godsoft.codegen.alltabcols.service;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

public class AllTabColsVO {

	private String owner;
	private String tableName;

	private List<String> tableNames;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<String> getTableNames() {
		return tableNames;
	}

	public void setTableNames(List<String> tableNames) {
		this.tableNames = tableNames;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
