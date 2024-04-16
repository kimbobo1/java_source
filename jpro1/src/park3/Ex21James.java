package park3;

//신입 지원 제임스 
public class Ex21James implements Ex21Resume{
	private String irum,phone,skill;
	
	public Ex21James() {
		
	}
	
	@Override
	public void setIrum(String irum) {
		if(irum.equals(null)) {
			this.irum="아무개";
		}else {
			this.irum = irum;
		}
		this.irum = irum;
		
		
	}
	
	@Override
	public void setPhone(String phone) {
		this.phone = phone;
		
	}
	
	public void setskill(String s ){
		skill = s;
	}
	@Override
	public void printData() {
		System.out.println("이력 규격은 "+ Ex21Resume.SIZE);
		System.out.println("이름 :" + irum + ", 전화:"+ phone + ", 보유기술:"+skill);
		
	}

}
