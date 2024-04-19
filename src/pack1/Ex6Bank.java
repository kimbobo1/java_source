package pack1;

// 현재 클래스는 jpro1 프로젝트 - pack1 패키지에 등록
// 성격이 비슷한 클래스들을 특정 패키지(폴더)에 저장
// 패키지가 현재 클래스에서 패키지가 다른 곳의 클래스를 호출할 경우 import를 사용

public class Ex6Bank {
	private int money = 1000; // 은행에 계좌를 만들면 기본금 1000원 지급
	
	int a = 1;        //default
	public int b = 2; //public

	public Ex6Bank() {

	}

	public Ex6Bank(int money) {
		this.money += money;
	}

	public void dePosit(int amount) { // 입금
		if (amount > 0)
			money += amount;
	}

	public void withDraw(int amount) { // 출금
		if ((amount > 0) && (money - amount >= 0)) {
			money -= amount;
		} else {
			System.out.println("출금액이 너무 많아요");
		}
	}

	public int getMoney() {   // 잔고 반환
		return money;
	}
}
