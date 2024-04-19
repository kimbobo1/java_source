package pack5Io;

import java.io.Serializable;  // 이진 데이터로 처리. 네트워크 상에서 자료 전송/수신 시 사용

public class Ex36BinaryData implements Serializable{    // 
	int a = 90;
	double b = 123.456;
	String ss1 = "korea";
	String ss2 = "대한민국";
}
