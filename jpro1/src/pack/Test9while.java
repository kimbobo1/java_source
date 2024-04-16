package pack;

import java.util.Scanner;

public class Test9while {

	public static void main(String[] args) {
		// 반복문 while
		//while(조건) {실행문들..}
		int w = 1;
		while(w <= 5) {
		System.out.println("w=" + w + " ");	
		w++;
		}
        System.out.println("\nwhile 수행 후 w:" + w);
        
        System.out.println();
        int count = 0;
        while(count < 5) {
        	count++;
        	System.out.println("count :" + count);
        	if(count ==3) {
        		System.out.println("쉬어가가");
        	
        	}
        	if(count == 5) {
        		System.out.println("cout가 5라서 종료:" + count);
        	
        	}
        }
        
        System.out.println();
        
        w = 0;
        while(true) {//무한 루프
        	w++;
        	if(w == 5) break;
        	if(w ==3) continue;
        	System.out.println("w는 " + w);
        	
        }
        System.out.println();
        // facotorial n!은 1부터 n까지의 모든 정수의 곱을 의미
        //ex: 5!= 5*4*3*2*1 = 120
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("정수 입력:");
        //int number = scanner.nextInt(); //API를 가져다 적용
        int number =5;
        //facotorial 계산을 위한 초기값 설정
        int factiroal = 1;
        int i = 1;  //반복을 위한 counter 변수
        while(i <= number) {
        	//System.out.println(i);
        	factiroal *= i;
        	i++;
        	
        }
        System.out.printf("number는 %d factiroal은 %d이다", number, factiroal );
        
        System.out.println("\n다중 while ---");
        int a=1;
        while(a <=3) {
        	System.out.println("a:" + a);
        	int b=1;
        	while(b <=4) {
        		System.out.println("b:" + b);
        		b++;
        	}
        	a++;
        	System.out.println();
        }
        /*System.out.println();
        //키보드로 입력받은 숫자에 대해 1부터 시작해 그 숫자까지 모든수에
        //나누기를 시도하고 나누어 떨어지는 경우
        //0이나 음수를 입력하면 프로그램 종료 한다
        Scanner scanner = new Scanner(System.in);
        while(true) {
        	System.out.println("정수 입력(0 이나음수면 종료):");
        	int num = scanner.nextInt();
        	if(num <= 0) {
        		System.out.println("프로그램 종료");
        		break;
        	}
        	System.out.println(num + "의 약수는");
        	int divisor =1; //약수를 찾기 위해1부터 시작
        	while(divisor <=num) {
        		if(num % divisor ==0) {
        			System.out.println(divisor); //약수 출력
        		}
        		divisor++;  //다음수로 이동
        			
        		
        	}
        }
        */
        System.out.println();
        //do{반복 수행문..}while(조건);
        int k =1;
        do {//최소 1회는 수행
        	System.out.println("k : " + k);
        	k = k +1;
        }
        while(k <=5);
        
        System.out.println("exam -----");
        //문1) 1 ~ 100사이의 정수 중 3의 배수이지만 2의 배수가 아닌 수를 출력하고, 합과 갯수도 출력
       
        	
      int count12=0;
      int gkq=0;
      int rotn=0;
      while( count12<100)  { 
    	  count12++;
    	
    	  if(count12 % 3 == 0 &&count12%2!=0) {
    		  System.out.println(count12);
    		  rotn = rotn + 1;
				gkq = gkq + count12;
    	
    		  
    	  }
    		

        
        //문2)-1,3,-5,7,-9,11...99까지의 합출력
        //문3)1~100 사이의 정수중에서 소수와 그 갯수를 출력 소수:1보다크며 1과 그 수 자체이외의 다른 수로는 나누어 떨어지지 않는 수
 
    
      }
      System.out.println("합"+ gkq + "갯수" + rotn);
      
      System.out.println("2번문제------");
      int n=1, cnt=1, haq =0;
      while(n<100) {
    	  if(cnt % 2 ==0) {
    		  haq +=n;
    		  System.out.println("짝수"+n);
    		 
    	  }else {
    		  int imsi = n*-1;
    		  haq +=imsi; //부호변경후 누적
    		  System.out.println("홀수"+imsi);
    	  }
    	  //System.out.println(n);
    	  n +=2; //2씩 증가
    	  cnt +=1;
      }
      System.out.println("합은" + haq + "입니다");
      
      //for로 출력
      int hap2=0,cnt2=1;
      for(int iG=1; 1<100; iG +=2) {
    	  if(cnt2 % 2==0) {
    		  hap2 += iG;
    				  
    	  }else { 
    		  hap2 += (-1) * iG;
    	  }
    	  cnt2++;{
    		  
    	  }
    	  System.out.println(hap2);
   
     int aa=2;
     int count44 =0;
     int su2 =0;
     System.out.println("1부터 100까지의 소수:");
     while(aa<=100) {
    	 boolean imsi3 = false;
    	 int bb=2;
    	 while(bb<=aa -1) {
    		 if(aa%bb==0) {
    			 imsi3=true;
    			 
    		 }
    		 bb++;
    	 
    	 } 
    	 if(imsi3 == false) {
    		 System.out.println(aa + " ");
    		 count44++;
    		
    	 }
    	 aa++;
     
    
     }System.out.println("\n건수 :"+ count44);
     break;
      }
     System.out.println("2부터 그숫자의 제곱근까지의 모든 수로 나누어 떨어지는지");
     //소수를 찾는 이유로 제곱끈 까지만 검사하는 것은 어떤 수의 약수는 그 수의 제곱근을
     int num=2;
     int count5=0;
     System.out.println("1부터 100까지의 소수");
     boolean isPrime = true;
     while(num<=100) {
    	 int divisor =2;
    	 while(divisor <= Math.sqrt(num)) {
    		 if(num %divisor ==0) {
    			 
    		 }
    		 isPrime = false;
    		 break;//나누어 떨어지지 않으면 더 이상 검사는 필요없음
    	 }
    	 divisor++;
     }
     if(isPrime == true) { //if(isPrime){
    	 count5++;//소수의 갯수증가
    	 System.out.println(num+" ");
     }
     num++;
    
	
	}
 
	}



	
