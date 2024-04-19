package pack4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex29MapTest {

	public static void main(String[] args) {
		// Map류의 HashMap으로 연습 : 자료를 키와 값으로 저장. 검색이 편리
		HashMap<String, String> list = new HashMap<String, String>();
		list.put("1", "lee");
		list.put("2", "kim");
		list.put("3", "kim");
		list.put("4", "han");
		list.put("5", "choi");
		
		System.out.println("크기 : " + list.size());
		System.out.println(list.containsKey("2"));
		System.out.println(list.containsKey("7"));
		System.out.println(list.containsValue("han"));
		
		System.out.println();

		Set set = list.keySet();        // Set 류로 들어옴.
		Iterator iter = set.iterator();  // 이를 사용하여 컬렉션의 자료를 출력할 수 있다.
		while(iter.hasNext()) {  // 다음 자료가 있다면 true
			String ss = (String)iter.next();  // casting을 해야함 기본적으로 Object 타입이므로 String으로 강제 변경해주어야 한다.
			System.out.println(ss);       // 키를 출력
			System.out.println(list.get(ss)); // 값을 출력
		}
	}

}
