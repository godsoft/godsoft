package godsoft.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class ListTest {

	@Test
	public void test() {
		//		fail("Not yet implemented");

		test test = this.new test();

		List<Map<String, Object>> items = test.items();
		List<Map<String, Object>> items2 = test.items2();
		List<Map<String, Object>> items3 = test.items3();

		List<Map<String, Object>> items10 = new ArrayList<Map<String, Object>>();

		int itemsSize = items.size();
		int items2Size = items2.size();
		int items3Size = items3.size();

		for (int i = 0; i < itemsSize; i++) {
			Map<String, Object> item = items.get(i);

			String pnu = (String) item.get("pnu");

			for (int j = 0; j < items2Size; j++) {
				Map<String, Object> item2 = items2.get(j);

				String pnu2 = (String) item2.get("pnu");

				if (pnu.equals(pnu2)) {
					items10.add(i, item2);
				}
			}

			for (int k = 0; k < items3Size; k++) {
				Map<String, Object> item3 = items3.get(k);

				String pnu3 = (String) item3.get("pnu");

				if (pnu.equals(pnu3)) {
					items10.add(i, item3);
				}
			}
		}

		System.out.println("items10=" + items10);
	}

	private class test {
		private List<Map<String, Object>> items() {
			List<Map<String, Object>> items = new ArrayList<Map<String, Object>>();

			for (int i = 1; i <= 5; i++) {
				Map<String, Object> item = new HashMap<String, Object>();

				item.put("pnu", Integer.toString(i));

				items.add(item);
			}

			System.out.println("items=" + items);

			return items;
		}

		private List<Map<String, Object>> items2() {
			List<Map<String, Object>> items = new ArrayList<Map<String, Object>>();

			for (int i = 1; i <= 2; i++) {
				Map<String, Object> item = new HashMap<String, Object>();

				item.put("pnu", Integer.toString(i));

				items.add(item);
			}

			System.out.println("items2=" + items);

			return items;
		}

		private List<Map<String, Object>> items3() {
			List<Map<String, Object>> items = new ArrayList<Map<String, Object>>();

			for (int i = 1; i <= 3; i++) {
				Map<String, Object> item = new HashMap<String, Object>();

				item.put("pnu", Integer.toString(i));

				items.add(item);
			}

			System.out.println("items3=" + items);

			return items;
		}
	}

}
