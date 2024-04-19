package pack4;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex28LiistTest {

	public static void main(String[] args) {
		//list류의 Arraylist로 연습 :중복 가능 순서 o
		ArrayList<String> list = new ArrayList<String>();
		list.add("lee");
		list.add("lee");
		list.add("kim");
		list.add("lee");
		list.add("park");
		//list.remove("park");  //컬렉션에 있는걸 지우는 역할
		list.remove(0); //list는 가능 set은 불가
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
