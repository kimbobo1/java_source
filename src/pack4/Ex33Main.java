package pack4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.StringTokenizer;

public class Ex33Main {
	private ArrayList<Ex33JikwonDto> list = new ArrayList<Ex33JikwonDto>();
	
	public void inputData(String[] datas) {
		for(int i = 0; i < datas.length; i++) {
			StringTokenizer tok = new StringTokenizer(datas[i], ",");
			String sabun = tok.nextToken();
			String ir = tok.nextToken();
			int gibon = Integer.parseInt(tok.nextToken());
			String ibsa = tok.nextToken();
			
			Ex33JikwonDto dto = new Ex33JikwonDto();  // DTO 처리용
			dto.setSabun(sabun);
			dto.setIrum(ir);
			dto.setGibon(gibon);
			dto.setIbsa(ibsa);
			
			list.add(dto);
		}
	}
	
	public void displayData() {
		Calendar today = Calendar.getInstance();
		int sudang, salary, suryoung;
		double gongje;
		
		System.out.println("사번\t이름\t기본급\t근무년수\t근속수당\t공제액\t수령액");
		for(Ex33JikwonDto hd: list) {
			// 근무년수
			int year = today.get(Calendar.YEAR) - Integer.parseInt(hd.getIbsa());
			
			// 근속수당
			if(year >= 0 && year <= 3) sudang = 150000;
			else if(year >= 4 && year <= 8) sudang = 450000; 
			else sudang = 1000000;
			
			// 급여액
			salary = hd.getGibon() + sudang;
			
			// 공제액
			if(salary >= 3000000) gongje = salary * 0.5;
			else if(salary >= 2000000) gongje = salary * 0.3;
			else gongje = salary * 0.15;
			
			// 수령액
			suryoung = salary - (int)gongje;
			
			System.out.println(hd.getSabun() + "\t" + hd.getIrum() + "\t" + hd.getGibon() +
					"\t" + year + "\t" + sudang + "\t" + (int)gongje + "\t" + suryoung);
		}
		System.out.println("\n처리 건수 : " + list.size() + " 건");
	}
	
	public static void main(String[] args) {
		String[] datas = new String[3];
		Ex33Main test2 = new Ex33Main();
		
		datas[0] = "1,신선해,1500000,2020";   // 데이터를 콤마로 구분
		datas[1] = "2,신기해,1800000,2022";
		datas[2] = "3,신기루,2500000,2015";
		
		test2.inputData(datas);
		test2.displayData();
	}

}
