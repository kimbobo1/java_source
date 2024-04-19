package pack1;

public class Ex7Production {
	public String name;
	private int price;
	private double weight;
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public Ex7Production() {
		
	}
	
	public Ex7Production(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println("이름 : " + name + ", 가격 : " + price + ", 무게 : " + weight);
	}
	
	public void show(String name) {
		System.out.println("이름 : " + name + ", 가격 : " + price + ", 무게 : " + weight);
	}
	
	public void show(String name, int price) {
		System.out.println("이름 : " + name + ", 가격 : " + price + ", 무게 : " + weight);
	}
	
	public void show(String name, int price, double weight) {
		System.out.println("이름 : " + name + ", 가격 : " + price + ", 무게 : " + weight);
	}

}
