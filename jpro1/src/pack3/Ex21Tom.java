package pack3;

//신입 지원자 tom
public class Ex21Tom implements Ex21Resume{
	private String irum,phone,juso;
	
	public Ex21Tom() {
		
	}
	
	@Override
	public void setIrum(String irum) {
		this.irum = irum;
		
		
	}
	
	@Override
	public void setPhone(String phone) {
		this.phone = phone;
		
	}
	
	public void setJuso(String juso) {
		this.juso = juso;
	}
	@Override
	public void printData() {
		//Ex21Resume.SIZE = "b6"; //err : final 이므로 
		System.out.println("용지 규격은 "+ Ex21Resume.SIZE);
		System.out.println("이름 :" + irum + ", 전화:"+ phone + ", 주소:"+ juso);
		
	}

}
