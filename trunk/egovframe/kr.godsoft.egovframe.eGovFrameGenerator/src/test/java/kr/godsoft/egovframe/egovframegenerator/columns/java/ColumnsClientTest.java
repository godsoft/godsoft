package kr.godsoft.egovframe.egovframegenerator.columns.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import kr.godsoft.egovframe.egovframegenerator.columns.service.ColumnsVO;
import model.Attribute;

import org.junit.BeforeClass;
import org.junit.Test;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public class ColumnsClientTest {

	private static ColumnsClient columnsClient;

	private static List<EgovMap> columns;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		columnsClient = new ColumnsClient();

		// columns
		ColumnsVO columnsVO = new ColumnsVO();
		columnsVO.setTableSchema("rte");

		columns = columnsClient.selectColumnsList(columnsVO);
	}

	// @Test
	public void selectColumnsListColumnsVO() throws Exception {
		if (columns != null) {
			for (int i = 0; i < columns.size(); i++) {
				EgovMap egovMap = columns.get(i);

				String tableName = (String) egovMap.get("tableName");
				String columnName = (String) egovMap.get("columnName");

				System.out.println("tableName=" + tableName);
				System.out.println("columnName=" + columnName);
			}
		}
	}

	// @Test
	public void getTablesTest() throws Exception {
		if (columns != null) {
			Set<String> tables = new HashSet<String>();

			for (int i = 0; i < columns.size(); i++) {
				EgovMap egovMap = columns.get(i);

				String tableName = (String) egovMap.get("tableName");
				String columnName = (String) egovMap.get("columnName");

				// System.out.println("tableName=" + tableName);
				// System.out.println("columnName=" + columnName);

				tables.add(tableName);
			}

			System.out.println("tables=" + tables);

			int i = 0;

			for (String tableName : tables) {
				System.out.println("tables[" + i + "]=" + tableName);

				i++;
			}
		}
	}

	@Test
	public void getColumnsTest() throws Exception {
		if (columns != null) {
			Set<String> tables = new HashSet<String>();

			Map<String, Attribute> attributes = new HashMap<String, Attribute>();

			for (int i = 0; i < columns.size(); i++) {
				EgovMap egovMap = columns.get(i);

				String tableName = (String) egovMap.get("tableName");
				String columnName = (String) egovMap.get("columnName");

				System.out.println("columns[" + i + "].tableName=" + tableName);
				System.out.println("columns[" + i + "].columnName="
						+ columnName);

				tables.add(tableName);

				// attributes
				Attribute attribute = new Attribute(columnName);
				attribute.setJavaType("String");
				// attributes.add(attr);
				// primaryKeys.add(attr);

				attributes.put(tableName, attribute);
			}

			// System.out.println("tables=" + tables);
			//
			// int i = 0;
			//
			// for (String tableName : tables) {
			// System.out.println("tables[" + i + "]=" + tableName);
			//
			// // EgovMap egovMap = new EgovMap();
			// // egovMap.put("tableName", tableName);
			// //
			// // System.out.println(columns.indexOf(egovMap));
			//
			// i++;
			// }

			// // attributes
			// i = 0;
			// for (Attribute attribute : attributes.values()) {
			// System.out.println("attributes[" + i + "]="
			// + attribute.getName());
			//
			// i++;
			// }
		}
	}

	// @Test
	public void indexOfTest() throws Exception {
		// System.out.println(columns.indexOf("comtnhttpmon"));

		EgovMap egovMap = new EgovMap();
		egovMap.put("tableName", "comtnhttpmon");

		System.out.println(columns.indexOf(egovMap));
	}

}
