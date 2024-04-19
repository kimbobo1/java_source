package pack4;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex28ListTest {

	public static void main(String[] args) {
		// List류의 ArrayList로 연습 : 중복 가능, 순서 O
		ArrayList<String> list = new ArrayList<String>();
		list.add("lee"); 
		list.add("lee"); // 중복 불가
		list.add("lee");
		list.add("hong");  // 입력 순서와 상관없이 출력된다.
		list.add("park"); 
		//list.remove("park"); // 컬렉션에 들어간 내용을 삭제
		//list.clear(); // 전체 삭제
		list.remove(0);   //List는 가능, Set은 불가
		
		System.out.println("list의 크기 : " + list.size());  // size()는 메소드
		
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
