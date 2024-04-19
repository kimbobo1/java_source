package pack4;

import java.util.ArrayList;

public class Ex30DtoTest {
	// DTO : 레코드 단위의 기억장소
	ArrayList<Ex30StudentDto> list = new ArrayList<Ex30StudentDto>();
	Ex30StudentDto dto;  // 레코드의 기억장소 DTO
	
	// DTO 유추하기
	public void aa() {
		String[] persons = new String[3];
		persons[0] = "홍길동";
		persons[1] = "고길동";
		persons[2] = "신길동";
		
		for(String s: persons) {
			System.out.println(s);
		}
	}
	
	public void insertList() {     // 레코드 단위(DTO)로 학생 정보 입력해 list에 저장
		dto = new Ex30StudentDto();
		dto.setHakbun("ks1");
		dto.setIrum("손오공");
		dto.setJumsu(90);
		list.add(dto); // 첫 번째 학생 자료 list에 등록
		
		dto = new Ex30StudentDto(); // dto 객체가 초기화됨.
		dto.setHakbun("ks2");
		dto.setIrum("저팔계");
		dto.setJumsu(50);
		list.add(dto); // 두 번째 학생 자료 list에 등록
		
		dto = new Ex30StudentDto(); // dto 객체가 초기화됨.
		dto.setHakbun("ks3");
		dto.setIrum("사오정");
		dto.setJumsu(80);
		list.add(dto); // 세 번째 학생 자료 list에 등록
	}
	
	public void showList() {   // list 컬렉션에 저장된 학생 자료를 출력
		System.out.println("학생 수는 " + list.size());
		//System.out.println(list.get(0));  //get 메소드를 사용하여 DTO 타입의 주소를 가져온다. list.get(0)은 객체 주소를 가지고 있다.
		System.out.println(list.get(0).getIrum());  
		
		System.out.println("--------------------");
		for(int i = 0; i < list.size(); i++) {
//			Ex30StudentDto sdto = new Ex30StudentDto(); // StudentDto 타입으로 리스트에 넣었으므로 뺄때도 리스트 타입으로 뺀 다음 각각의 값에 접근하면 되다.
//			sdto = list.get(i);
			Ex30StudentDto sdto = list.get(i);
			System.out.println(sdto.getHakbun() + " " + sdto.getIrum() + " " + list.get(i).getJumsu());
		}
		
		for(Ex30StudentDto d: list) {
			System.out.println(d.getHakbun() + " " + d.getIrum() + " " + d.getJumsu());
		}
	}
	
	public static void main(String[] args) {
		Ex30DtoTest dtoTest = new Ex30DtoTest();
		dtoTest.aa();
		
		System.out.println();
		dtoTest.insertList();
		dtoTest.showList();
	}

}
