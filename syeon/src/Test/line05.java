package Test;

import java.util.*;

public class line05 {

	static Map<String, Integer> map;

	public static String[] solution(String[][] dataSource, String[] tags) {
		String[] answer = {};
		map = new HashMap<>();
		for (int i = 0; i < dataSource.length; i++) {
			int cnt = 0;

			for (int j = 1; j < dataSource[j].length; j++) {
				for (int k = 0; k < tags.length; k++) {
					if (dataSource[i][j].equals(tags[k])) {
						cnt++;
					}
				}
			}
			map.put(dataSource[i][0], cnt);

		}

		List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				int comparision = (o1.getValue() - o2.getValue()) * -1;
				return comparision == 0 ? o1.getKey().compareTo(o2.getKey()) : comparision;
			}
		});

		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for (Iterator<Map.Entry<String, Integer>> iter = list.iterator(); iter.hasNext();) {
			Map.Entry<String, Integer> entry = iter.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		System.out.println(sortedMap);

		sortedMap.remove(0);
		
		for(String  key : sortedMap.keySet() ){
		    int value = map.get(key))

		}
	            
		return answer;

	}

	public static void main(String[] args) {

		String arr[][] = { { "doc1", "t1", "t2", "t3" }, { "doc2", "t0", "t2", "t3" }, { "doc3", "t1", "t6", "t7" },
				{ "doc4", "t1", "t2", "t4" }, { "doc5", "t6", "t100", "t8" } };
		String arr2[] = { "t1", "t2", "t3" };

		solution(arr, arr2);
	}

}
