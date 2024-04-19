package pack4;

public class Ex30StudentDto {
	
	//레코드 단위 기억 장소
	//type이 다른 여러 개의 기억장소를 하나의 묶음으로 만들어 자료 전송
	private String hakbun, irum;
	private int jumsu;
	public Ex30StudentDto() {
		// TODO Auto-generated constructor stub
	}
	
	public Ex30StudentDto(String hakbun,String irum, int jumsu) {
		this.hakbun = hakbun;
		this.irum = irum;
		this.jumsu = jumsu;
		//생성자를 통해 멤버 필드에 값을 준 경우에는 setter 필요없다.
		
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getIrum() {
		return irum;
	}

	public void setIrum(String irum) {
		this.irum = irum;
	}

	public int getJumsu() {
		return jumsu;
	}

	public void setJumsu(int jumsu) {
		this.jumsu = jumsu;
	}
	

}
