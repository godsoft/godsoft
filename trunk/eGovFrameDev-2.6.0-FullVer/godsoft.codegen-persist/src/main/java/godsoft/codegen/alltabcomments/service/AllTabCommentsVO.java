package godsoft.codegen.alltabcomments.service;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

public class AllTabCommentsVO {

	private String owner;

	private List<String> tableNames;

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

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
