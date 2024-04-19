package pack1;

public class Ex3Main {

	public static void main(String[] args) {
		// 클래스 기본 연습 중
		Ex3Programmer programmer = new Ex3Programmer(); 
		programmer.displayData();
		
		System.out.println();
		programmer.setAge(33);
		System.out.println("나이는 " + programmer.getAge());
		programmer.displayData();
		
		System.out.println("------------------------------");
		Ex3Programmer tom = new Ex3Programmer();
		tom.nickName = "톰 아저씨";
		tom.displayData();
		
		System.out.println("------------------------------");
		Ex3Programmer james = new Ex3Programmer();
		james.nickName = "제임스 형";
		james.displayData();
		
		System.out.println();
		System.out.println("너의 모토는 " + james.motto);
		// static 멤버는 "클래스이름.멤버" 하고 사용하는 것을 권장 // new를 하지 않아도 됨
		System.out.println("너의 모토는 " + Ex3Programmer.motto); // 클래스 이름으로 직접 부르는 경우, 26행과 동일(권장)
		Ex3Programmer.goodMethod();  // 스태틱 멤버는 클래스이름.멤버로 사용 -> 객체 변수를 사용하지 않음, 스태틱 영역(크기가 작음)에 있으므로 바로 부를 수 있음.
		// 만들어지는 순서 static > heap 영역
		
		
		
		
//		String[] arr = {"a", "b", "c"};
//		Ex3Programmer[] pro = new Ex3Programmer[3];
//		for(int i = 0; i < arr.length; i++) {
//			pro[i] = new Ex3Programmer();
//			pro[i].nickName = arr[i];
//			pro[i].displayData();
//		}
		
	}

}
