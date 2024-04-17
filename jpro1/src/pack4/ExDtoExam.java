package pack4;

import java.util.ArrayList;
import java.util.Scanner;

public class ExDtoExam {
	private ArrayList<ExStudDto>list = new ArrayList<ExStudDto>();
	public void insertList() {
		while(true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("이름:");
				String name = scanner.next();
				System.out.println("국어");
				int kor =scanner.nextInt();
				System.out.println("영어");
				int eng = scanner.nextInt();
				ExStudDto dto = new ExStudDto();
				dto.setName(name);
				dto.setKor(kor);
				dto.setEng(eng);
				list.add(dto);
				System.out.println("계속 할까요?(y/n)");
				if(scanner.next().equalsIgnoreCase("n"))break;
				
			}catch (Exception e) {
				System.out.println("처리중 오류발"+e);
				break;
			}
		}
		
	}
	
	public void showList() {
		System.out.println("이름\t국어\t영어\t총점");
		for(ExStudDto my:list) {
			int tot = my.getKor()+my.getEng();
			System.out.println(my.getName()+"\t"+my.getKor()+"\t"+my.getEng()+"\t"+tot);
		}
		System.out.println("응시인원 :"+list.size());
	}
	public static void main(String[] args) {
		ExDtoExam dtoExam = new ExDtoExam();
		dtoExam.insertList();
		dtoExam.showList();
		
	}

}
