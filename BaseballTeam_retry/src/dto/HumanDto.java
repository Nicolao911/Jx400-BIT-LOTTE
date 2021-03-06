package dto;

/*
 * 인적사항 기본 정보 java beans
 */
public class HumanDto {
	private int number; // 번호 sequence처럼 자동증가 되도록
	private String name; // 이름
	private int age; // 나이
	private Double height; // 키

	public HumanDto() {
	}

	public HumanDto(int number, String name, int age, Double height) {
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

	// 자식클레스에서 부모 클래스의 property를 출력하는 경우가 필요하므로 상속 시켜줄
	// 출력 method를 하나 만들어준다.

	public String writePlayerInfo() {
		return "";// 재정의해서 쓸것이므로 빈값으로 준다.
	}
}
