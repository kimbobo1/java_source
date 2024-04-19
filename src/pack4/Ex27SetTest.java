package pack4;

import java.util.HashSet;
import java.util.Iterator;

// Collection : 객체를 담을 수 있는 집합형 자료구조
public class Ex27SetTest {

	public static void main(String[] args) {
		// Set류의 HashSet으로 연습 : 중복 불가, 순서 X
		
//		Ex27SetTest test = new Ex27SetTest();
//		HashSet<Ex27SetTest> list = new HashSet<Ex27SetTest>();
//		list.add(1);
//		list.add(test);  // Ex27SetTest 타입만 추가 가능, 부모 타입을 적어주면 서브 클래스도 다 넣을 수 있다.
		
		HashSet<String> list = new HashSet<String>();
		list.add("lee"); 
		list.add("lee"); // 중복 불가
		list.add("lee");
		list.add("hong");  // 입력 순서와 상관없이 출력된다.
		list.add("park"); 
		//list.remove("park"); // 컬렉션에 들어간 내용을 삭제
		//list.clear(); // 전체 삭제
		
		System.out.println("컬렉션의 크기 : " + list.size());  // size()는 메소드
		
		for(Object obj: list) {
			System.out.println(obj);
		}
		
		System.out.println();
		// Iterator(반복자)
		Iterator iter = list.iterator();  // 이를 사용하여 컬렉션의 자료를 출력할 수 있다.
		while(iter.hasNext()) {  // 다음 자료가 있다면 true
			String ss = (String)iter.next();  // casting을 해야함 기본적으로 Object 타입이므로 String으로 강제 변경해주어야 한다.
			System.out.println(ss);
		}
		
		
	}

}
