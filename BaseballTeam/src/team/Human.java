package team;
/*
 * 인적사항 기본 정보 java beans
 */
public class Human {
	private int number;  //번호 sequence처럼 자동증가 되도록
	private String name; //이름
	private int age; //나이
	private Double height; //키

	public Human() {
	}

	public Human(int number, String name, int age, Double height) {
		this.number = number;
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	/*
	 * 선수 번호를 돌려준다
	 */
	public int getNumber() {
		return number;
	}
	/*
	 * 선수 이름을 돌려준다
	 */
	public String getName() {
		return name;
	}
	/*
	 * 선수 나이를 돌려준다
	 */
	public int getAge() {
		return age;
	}
	/*
	 * 선수 키를 돌려준다
	 */
	public Double getHeight() {
		return height;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Human [number=" + number + ", name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
}
