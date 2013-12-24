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

		List<Map<String, Object>> items = new ArrayList<Map<String, Object>>();
		List<Map<String, Object>> items2 = new ArrayList<Map<String, Object>>();

		for (int i = 1; i < 11; i++) {
			Map<String, Object> item = new HashMap<String, Object>();

			item.put("pnu", Integer.toString(i));

			items.add(item);

			if (i < 3) {
				Map<String, Object> item2 = new HashMap<String, Object>();

				item2.put("pnu", Integer.toString(i));

				items2.add(item2);
			}
		}

		//		System.out.println(items);
		//		System.out.println(items2);

		for (Map<String, Object> item : items) {
			//			System.out.println(item);

			String pnu = (String) item.get("pnu");

			//			System.out.println(items.indexOf(item));
			int index = items.indexOf(item);

			for (Map<String, Object> item2 : items2) {
				//				System.out.println(item2);

				String pnu2 = (String) item.get("pnu");

				if (pnu.equals(pnu2)) {
					items.add(index, item2);
				}
			}
		}

		System.out.println(items);
	}

}
