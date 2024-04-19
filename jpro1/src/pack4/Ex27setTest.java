package pack4;

import java.util.HashSet;
import java.util.Iterator;

//collection :다수의 객체를 담을수 있는 집합형 자료구조
public class Ex27setTest {  //integer = int

	public static void main(String[] args) {
		//Set류의HashSet으로 연습: 중복 불가 순서x
		//object 제일큰타입이라서 다들어간다
		//Ex27setTest test = new Ex27setTest();
		//HashSet<Ex27setTest> list = new HashSet<Ex27setTest>();
		//list.add(1);
		//list.add(test);
		//유니크 하기때문에 lee는 하나만 출력됨
		HashSet<String> list = new HashSet<String>();
		list.add("lee");
		list.add("lee");
		list.add("kim");
		list.add("lee");
		list.add("park");
		//list.remove("park");  //컬렉션에 있는걸 지우는 역할
		//list.clear(); //모두 지우는역할
		System.out.println("크기는:"+list.size());
		
		for(Object obj:list) {
			System.out.println(obj);
		}
		System.out.println();
		//iterator (반복자) 개발자가 컨테이너, 특히 리스트를 순회할수 있게 해주는 객체다.
		Iterator iter =list.iterator();
		while(iter.hasNext()) {
			String ss= (String)iter.next();
			System.out.println(ss);
		}

	}

}
