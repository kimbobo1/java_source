package pack5Io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Ex35Iotest2 {
	// 1byte 단위로 데이터 입출력 : 문자, 그림, 소리 파일 등 다양한 데이터 처리 가능
	public void write_file(File file, ArrayList<String> strdatas) {
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
			
			for(String munja : strdatas) {
				writer.write(munja, 0, munja.length());  // 한 행 작성
				writer.newLine();  // line skip
			}
			
			if(writer != null) writer.close();  // null 아닐때 close -> 저장이 완료
		} catch (Exception e) {
			System.out.println("write_file err : "+ e);
		} 
	}
	
	public void read_file(File file) {
		try {
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));  
			// inputstreamreader : inputstream을 문자단위 데이터로 변환 
			// Fileinputstream : 실제 파일에 연결하여 open
			
			String oneline;
			String strs = null;
			StringBuffer buffer = new StringBuffer();  // 문자열 더하기가 많은 경우 사용
			//StringBuilder builder = new StringBuilder(); // 문자열 더하기가 많은 경우 36행과 37행 중 하나를 추천
			
			while((oneline = reader.readLine()) != null) {  // null이 아닌동안 반복, 새로운 라인을 한 줄씩 읽어온다.
				//strs += oneline  +"\n";  // 문자열 더하기는 비권장 -> 메모리 소모가 커짐 -> immutable -> 문자열을 더할 때마다 새로운 객체의 주소를 가진다.
				buffer.append(oneline + "\n"); // 이걸 사용하면 됨, 권장사항
			}
			if(reader != null) reader.close();
			
			System.out.println(buffer.toString());  // 버퍼 내용을 콘솔로 출력
		} catch (Exception e) {
			System.out.println("read_file err : "+ e);
		} finally {
			
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("하하");
		list.add("호호");
		list.add("허허허");
		
		File file = new File("C:/work/iotest.txt");
		
		Ex35Iotest2 test2 = new Ex35Iotest2();
		test2.write_file(file, list);
		test2.read_file(file);
	}
}
