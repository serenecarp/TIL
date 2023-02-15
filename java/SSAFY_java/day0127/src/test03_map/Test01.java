package test03_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test01 {
	public static void main(String[] args) {
		// Map
		// - 사전과 같은 자료구조
		// - 키&값의 쌍으로 저장
		// - 키로 구별
		// - 키는 중복되면 안되고, 값은 중복될 수 있음
		Map<String, String> map = new HashMap<>();
//		Map<String, String> map = new TreeMap<>(); // 마찬가지, key대로 순서 정렬됨
		
		// 맵에 값 저장
		map.put("박", "성준");
		map.put("김", "현");
		map.put("리", "차오랑");
		map.put("리", "로이");
		System.out.println(map); // 중복된 키로 값을 넣으면 새로운 값으로 덮어쓰기됨

		
		// 값을 가져오려면?
		System.out.println(map.get("박"));
		// 없는 키로 값을 가져오면?
		System.out.println(map.get("최")); // null
		// 키가 있는지 미리 확인
		System.out.println(map.containsKey("최"));
		// 값이 있는지 확인
		System.out.println(map.containsValue("성준"));
		// 반복문1
		for(Map.Entry<String, String> entry: map.entrySet()) {
			System.out.println(entry.getKey()+" : " + entry.getValue());
		}
		// 반복문2
		Iterator<String> e = map.keySet().iterator();
		while(e.hasNext()) {
			String key = e.next();
			System.out.printf("key: %s, value: %s \n", key, map.get(key));
		}
		// 반복문3
		for(String key: map.keySet()) {
			System.out.printf("키: %s, 값: %s \n", key, map.get(key));
		}
		
		System.out.println(map.size());
	}
}
