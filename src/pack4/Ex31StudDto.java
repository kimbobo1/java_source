package pack4;



//@Getter
//@Setter
//@NoArgsConstructor  // argument가 없는 생성자가 생성된다.
//@AllArgsConstructor // argument가 있는 생성자가 생성된다.

public class Ex31StudDto {
	private String name;
	private int kor;
	private int eng;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
}
