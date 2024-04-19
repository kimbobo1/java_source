package pack5io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Ex35IoTest2 {
	//1byte 단위로 데이터 입출력 :문자 그림 소리 파일등 다양한 데이터 처리가 가능
	public void write_file(File file,ArrayList<String> strdatas) {
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
			
			for(String munja:strdatas) {
				writer.write(munja, 0, munja.length());
				writer.newLine(); //line skip
				
			}
			if(writer != null) writer.close();
		} catch (Exception e) {
			System.out.println("write_file"+e);
		}
			
		
		
	}
	public void read_file(File file) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"utf-8"));
			
			String oneline;
			//String strs = null;
			//문자열 더하기가 많은 경우  아래 두 개의 클래스중 하나를 추천
			StringBuffer buffer =new StringBuffer();
			//StringBuilder builder = new StringBuilder();
			while((oneline = reader.readLine()) !=null) {
				//strs += oneline + "\n";  //문자열 +는 비 권장
			}
			
		} catch (Exception e) {
			System.out.println("read_file"+e);
		}finally {
			
		}
	}
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("하하");
		list.add("하허");
		list.add("하하하");
		File file =new File("/Users/bohyunkim/iotest.txt");
		Ex35IoTest2 test2 = new Ex35IoTest2();
		test2.write_file(file, list);
		test2.read_file(file);

	}

}
