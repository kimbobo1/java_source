package pack1;

public class Ex9Main {

	public static void main(String[] args) {
		// 메소드 호출 시 매개변수를 통한 자료 전달 (타입이 기본형, 참조형)
		Ex9Callby1 myData = new Ex9Callby1();  
		Ex9Callby2 myMethod = new Ex9Callby2();
		
		System.out.println("원래 a : " + myData.a + ", b : " + myData.b);		
		myMethod.ex(myData.a, myData.b); // 인수로 기본형 전달(값이 전달) data.a = 10, data.b = 20 -> myMethod로 이동하여 a, b(지역변수)에 각각 할당하여 값이 바뀌었다. 값이 잘 넘어감
		System.out.println("1. 수행 후 a : " + myData.a + ", b : " + myData.b); // call-by-value 원래 값은 변하지 않음.
		
		System.out.println();
		myMethod.ex(myData); //Ex9Callby1 객체 타입의 주소를 전달
		System.out.println("2. 수행 후 a : " + myData.a + ", b : " + myData.b); //기억 장소 두개 밖에 없음(Callby1 내부의 멤버 필드 a,b)
	
		System.out.println();
		System.out.println("배열의 대표명 c : " + myData.c);
//		int kbs[] = myData.c;             // 주소 치환 배열 c의 주소를 kbs에 줌
//		System.out.println(myData.c[0]);  // 22행 값과 동일
//		System.out.println(kbs[0]);
		myMethod.ex(myData.c);
		System.out.println("3. 수행 후 a : " + myData.c[0] + ", b : " + myData.c[1]);
		
		
		
		
		// 7헹 : 생성자를 호출한 객체 변수에는 Ex9Callby1에 해당하는 멤버 필드, 메소드가 있다. 
		//      다른 말로 객체 변수 myData에 Ex9Callby1에 있는 값에 접근이 가능하다.
		
		// call-by-value
		// 11행 : 인수로 기본형 데이터를 전달. -> myData의 a값과 b값 자체를 인수로 전달
		//       전달받은 myMethod 객체 변수에는 ex라는 멤버 메소드가 있는데 그 중 파라미터 값이 정수형 데이터 두 개를 받을 수 있는 메소드를 호출한다.
		//       이 메소드의 파라미터는 a,b이고 실행문에 있는 a,b는 지역변수이므로 이 메소드 내에서만 유효. 그러므로 main 함수에서는 변경된 값을 확인할 수 없다.
		//       수행 후, mydata.a, mydata.b 값은 각각 10, 20 이다.
		
		// call-by-reference
		// 15행 : 인수로 참조형 데이터를 전달 -> myData 자체(주소)를 인수로 전달
		//       전달받은 myMethod의 객체 변수에는 ex라는 멤버 메소드가 있는데 그 중 파라미터 값이 참조형 데이터 하나를 받을 수 있는 메소드를 호출(메소드 오버로딩)한다.
		//       
	}

}
