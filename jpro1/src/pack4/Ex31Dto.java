package pack4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex31Dto {
	ArrayList<Ex31StudDto> list = new ArrayList<Ex31StudDto>();
	Ex31StudDto dto;
	
	public static void main(String[] args) {
		Ex31Dto dtoTest =new Ex31Dto();
		dtoTest.inserList();
		dtoTest.showList();
		
	}
	public void inserList() {
		while(true) {
			dto = new Ex31StudDto();
			Scanner sc = new Scanner(System.in);
			System.out.print("이름 입력:");
			dto.setIrum(sc.next());
			System.out.print("국어점수 입력:");
			dto.setGuk(sc.nextInt());
			System.out.print("영어 입력:");
			dto.setEn(sc.nextInt());
			list.add(dto);
			
			System.out.println("계속 처리할까요?(y/n)");
			if(sc.next().equalsIgnoreCase("n")) break;
		}
		
		
	}
	public void showList() {
		for(Ex31StudDto d:list) {
			System.out.println(d.getIrum() + " "+ d.getGuk() +" "+ d.getEn()+" "+ (d.getEn()+d.getGuk()));
		
			
		
			
		}
		System.out.println("응시인원 :"+list.size());
	}
	
}
