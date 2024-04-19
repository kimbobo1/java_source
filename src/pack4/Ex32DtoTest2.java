package pack4;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ex32DtoTest2 {
	private ArrayList<Ex32HaksaengDto> dtos = new ArrayList<Ex32HaksaengDto>();
	
	public void inputData(String[] datas) {
		//System.out.println(datas[0]);
		// "김밥, 100, 100, 100" 이와 같은 문자열을 콤마(,)를 기준으로 분리
		
		/* StringTokenizer tokenizer = new StringTokenizer("kbs,mbc,sbs", ",");  // 자르고 싶은 문자열을 인수로 넣었다.
		String s1 = tokenizer.nextToken();
		String s2 = tokenizer.nextToken();
		String s3 = tokenizer.nextToken();
		System.out.println(s1 + " " + s2 + " " + s3);
		*/
		
		for(int i = 0; i < datas.length; i++) {
			StringTokenizer tok = new StringTokenizer(datas[i], ",");
			String ir = tok.nextToken();
			int kor = Integer.parseInt(tok.nextToken());
			int eng = Integer.parseInt(tok.nextToken());
			int mat = Integer.parseInt(tok.nextToken());
			
			Ex32HaksaengDto dto = new Ex32HaksaengDto();  // DTO 처리용
			dto.setName(ir);
			dto.setKor(kor);
			dto.setEng(eng);
			dto.setMat(mat);
			
			dtos.add(dto);
		}
	}
	
	public void displayData() {
		for(Ex32HaksaengDto hd: dtos) {
			int tot = hd.getKor() + hd.getEng() + hd.getMat();
			double avg = tot / 3.;
			System.out.println(hd.getName() + ", 총점 : " + tot + ", 평균 : " + avg);
		}
	}
	
	public static void main(String[] args) {
		String[] datas = new String[3];
		datas[0] = "김밥,100,100,100";   // 데이터를 콤마로 구분
		datas[1] = "주먹밥,80,75,88";
		datas[2] = "비빔밥,77,88,80";
		
		Ex32DtoTest2 test2 = new Ex32DtoTest2();
		test2.inputData(datas);
		test2.displayData();
	}

}
