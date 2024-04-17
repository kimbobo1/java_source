package pack4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ex31StudDto {
	
	
	private int guk,en;
	private String irum;
	public Ex31StudDto() {
		// TODO Auto-generated constructor stub
	}
	public Ex31StudDto(int guk,int en,String irum) {
		this.guk=guk;
		this.en=en;
		this.irum=irum;
	
	}
	
	
	
}
