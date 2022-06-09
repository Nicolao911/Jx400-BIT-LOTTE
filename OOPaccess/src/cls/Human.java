package cls;
//캡슐화(은닉성), 상속, 다형성
public class Human {
	private int number;
	public String name;
	double height; // 기본 접근자는 private이다 예전엔 default였으나 자바 버전 올라가면서 없어짐
	
	// setter, getter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	/*
	 * private : 개인적인
	 * public : 대중적인
	 * varialbe : 변수는 대부분 private
	 * method : 대부분 public  자바나 c++에 경우에만. 코틀린 파파이선은 신경안씀..
	 */
	
	public void method() {
		
	}
	
	//특별히 내부용 method는 
}
