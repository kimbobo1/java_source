package pack;

import java.util.Scanner;

public class Test5if {
public static void main(String[] args) {
	//조건 판단문 if 연습
	int num = 1;
	
	if(num >= 3) {    // 조건이 참일 때만 두 개의 실행문 수행
		System.out.println("크군요");
		System.out.println("참일 때");
		
	}
	     
	    System.out.println("출력1");
	    
	    num = 5;
	    if(num < 3) { //조건에 따라 참 또는 거짓 영역 수행
	    System.out.println("작군요");	
	    System.out.println("참일 때 수행");
	    }else {
	    	System.out.println("거짓일 때 수행");
	    }
	    System.out.println("출력2");
	    
	    System.out.println("다중 if------");
	    int jumsu = 98;
	    
	    if(jumsu >= 70) {
	    	if(jumsu >= 90) {
	    		System.out.println("우수"); 
	    	}else {
	    		System.out.println("보통");
	    	
	    	}
	    }
	    System.out.println("출력3");
	    
	    jumsu = 60;
	    if(jumsu >= 70) {
	    	if(jumsu >= 90) {
	    		System.out.println("우수"); 
	    	}else {	System.out.println("보통");
	    	}   }else {
		    	System.out.println("어라 70점 미만");
		    	if(jumsu >50) {
		    		System.out.println("50점초과");
		    	}else {
		    	}
		    }
		    System.out.println("출력4");
		    
		    jumsu = 75;
		    String msg = "";
		    if(jumsu >=90) {
		    	msg = "수";
		    }else if(jumsu >=80) {
		    	msg = "우";
		    }else if(jumsu >=70) {
		    	msg = "미";
		    }
		    System.out.println("평가 결과 :" + msg);
		    
		    
		    System.out.println();
		    //입장료 : 8세이하 65세 이상 무료
		    //9세 이상 20세 미만 3000원
		    //20세 이상 65세 미만 5000원
		    int age = 75;
		    if(8 >= age || age >= 65) {
		    	System.out.println("무료");
		    }else if(9 <= age && age <20) {
		    	System.err.println("3000원");
		    }else if(20 <= age && age <65) {
		    	System.out.println("5000원");
		    }
		   
		    System.out.println();
		    age =3;
		    int total = 0;
		    if(9 <= age && age < 20) {
		    	total = 3000;
		    }else if(20 <= age && age <65) {
		    	total = 300;
		    }
		    System.out.println(total + "원");
		    
		    //문제 :키보드로 상품명,수량, 단가를 각각 입력 받아 금액 (수량*단가)을 출력 하시오
		    //조건 금액이 5만원 이상이면 금액에 10%를 아니면 금액에 5%를 세금으로 출력
		    // 출력 모양은 상품명 :*** 금액 :*** 세금:***
		    
		    System.out.println();
		    Scanner sc = new Scanner(System.in);
		    System.out.print("상품명");
		    String sangpum =sc.next();
		    System.out.print("수량");
		    int surang = sc.nextInt();
		    System.out.println("단가");
		    int danga = sc.nextInt();
		    int total1= surang * danga;
		    double tax = (total >= 50000)?0.01*total1:0.05*total1;
		    System.out.println("상품은:" + sangpum   +  "금액:" + total1 + "세금:" + tax );
		 
		    
		   
		    
		    		
	
	
	    
	    
}
}
