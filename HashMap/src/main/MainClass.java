package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	(java) 							web(json)
		 * hashMap 은 사전이다
		 * 사과 : apple
		 * key : value -> 한쌍(pair)
		 * Tree 구조
		 * 
		 * 		*key값은 중복이 되지 않는다!*
		 * TreeMap : 검색은 hashMap보다 느리지만 정렬(sort)가 추가되어있다. hashMap + sorting
		 * 
		 * linkedList arrayList는 호환됨 서로 데이터 던져주기 가능
		 * hashMap과treeMap도 서로 토스가능
		 */
		
//		HashMap<Integer , String> hMap = new HashMap<Integer, String>(); HashMap클레스
		//좌변을 인터페이스로 할때 -> 호화성 생각해서 좌변을 인터페이스로 하자
//		Map<Integer, String> hMap = new HashMap<Integer, String>();
		//상속관계니까 우변을 자식 자식클래스로 할수있다.
		Map<Integer, String> hMap = new TreeMap<Integer, String>();
		
		//추가
		hMap.put(1001, "Tigers");
		hMap.put(1002, "Lions");
		hMap.put(1003, "Twins");
		
		String val = hMap.get(1002);
		System.out.println(val);
		
		System.out.println(hMap.size());
		
		//출력
		//반복자(=포인터)  -> db에선 cursor
		Iterator<Integer> it = hMap.keySet().iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			String value = hMap.get(key);
			System.out.println(key + " : " + value);
		}
		
		hMap.put(1002, "Giants"); //선형구조로 들어가는게 아니라 인덱스가 0부터인건 아님
		// key값은 중복이 안되므로 1002번 키값의 벨류가 수정된다
		it = hMap.keySet().iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			String value = hMap.get(key);
			System.out.println(key + " : " + value);
		}
		
		//삭제
		String delValue = hMap.remove(1003); //뭐가 지워졌는지 돌려줌
		System.out.println("삭제 데이터 : " + delValue);
		
		//검색
		boolean b = hMap.containsKey(1002);
		if (b == true) {
			String s = hMap.get(1002);
			System.out.println("value::: " + s);
		}
		
		//수정
		hMap.replace(1001, "Eagles");
		
		it = hMap.keySet().iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			String value = hMap.get(key);
			System.out.println(key + " : " + value);
		}
		
		// HashMap key : String
//		 Integer, String, MyData 등 어떤 object가 들어와도 받을수 있는 hashMap을 만들려면
		//object로 잡는다
//		Map<String, Object> map = new HashMap<String, Object>();
		//꺼낼때는 타입에 맞춰 꺼내게 뭔지 확인하기 위해 intaceof로 검증하고 꺼내기
		
		
		//순서가 뒤죽박죽. tree구조로 들어간다
		Map<String, String> map = new HashMap<String, String>();
		map.put("apple", "사과");
		map.put("pear", "배");
		map.put("grape", "포도");
		map.put("banana", "바나나");
		map.put("orange", "오렌지");
		
//		Iterator<String> it1 = map.keySet().iterator();
//		while (it1.hasNext()) {
//			//value의 타입으로 좌변
//			String k = it1.next();
//			String v = map.get(k);
//			System.out.println("키 :" + k + "값 : " + v);
//		}
		
		//TreeMap --> 목록 sorting해서 뿌릴때 좋을듯
		TreeMap<String, String> tMap = new TreeMap<String, String>(map);//map을 생성자에 통쨰로 부어넣으면 넘어간다.
		
		//오름
//		Iterator<String> itKey = tMap.keySet().iterator();
		
		//내림
		Iterator<String> itKey = tMap.descendingKeySet().iterator();
		
		while (itKey.hasNext()) {
			//value의 타입으로 좌변
			String k = itKey.next();
			String v = map.get(k);
			System.out.println("키 :" + k + "값 : " + v);
			//여기서 list에 v를 담으면 object를 얻을수있겠지.
		}
		
		
		
		
		
		
		
		
		
	}

}
