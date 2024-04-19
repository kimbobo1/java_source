package pack4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex31Main {
	ArrayList<Ex31StudDto> student = new ArrayList<Ex31StudDto>();
	Ex31StudDto dto;
	String yn = null;
	
	
	public void insertList() {
		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("국어 점수 : ");
				int kor = sc.nextInt();
				System.out.print("영어 점수 : ");
				int eng = sc.nextInt();
				
				dto = new Ex31StudDto();
				dto.setName(name);
				dto.setEng(eng);
				dto.setKor(kor);
				student.add(dto);
				
				System.out.print("계속할까요?(y/n) ");
				yn = sc.next();
				if(yn.equals("n")) break;
			} catch(Exception e) {
				System.out.println("type mismatch");
				break;
			}
		}
	}
	
	public void show() {
		System.out.println("이름"+ " "+"영어" + " " +"국어" + " " +"총점" );
		for(Ex31StudDto d: student) {
			System.out.println(d.getName() + " " + d.getEng() + " " + d.getKor() + " " + (d.getEng() + d.getKor()));
		}
		System.out.println("응시인원 : " + student.size());
	}
	
	public static void main(String[] args) {
		Ex31Main test = new Ex31Main();
		
		test.insertList();
		test.show();
	}

}
