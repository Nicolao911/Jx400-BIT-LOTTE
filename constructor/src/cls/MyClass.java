package cls;
/*
 * java beans
 */
public class MyClass {
	
	private int number;
	private String name;
	private Double height;
	
	public MyClass() { // 기본 생성자
		// TODO Auto-generated constructor stub
		System.out.println("Myclass myClass()");
		number = 1;
		name = "";
		height = 0.0;
	}
	
	public MyClass(int number , String name) {
		this(); // 기본생성자 호출  super()를 하면 부모의 생성자 호출
		System.out.println("int number , String name");
		this.number = number;
		this.name = name;
	}

	public MyClass(int number, String name, Double height) {
		this(number, name); // 두번쨰 생성사 호출 변수 3개짜리 생성자 호출하면 두개짜리 도호출래서 셋팅하고 갈수있다.
		System.out.println("int number, String name, Double height");
		this.number = number;
		this.name = name;
		this.height = height;
	}
	
	/*
	 * this : 자기 참조 -> class생성시에 heap영역에 class가 확보됨 heap영역에 저장되는 영역의 주소
	 * 		  각 함수별로 0번째 매개변수다 눈에는 안보임	자기가 생성된 heap영역의 참조
	 */

	public MyClass getThis() {
		return this;
	}
	
	public void func() {
		this.height = 190.0;
		this.getThis();
		// class내부의 맴버변수나 맴버 함수는 this생략가능 메모리 주소값 접근이니까
		height = 190.0;
		
	}
	
	public void function(int number) {
		this.number = number;
		
	}
	@Override
	public String toString() {
		return "MyClass [number=" + number + ", name=" + name + ", height=" + height + "]";
	}
	
	
	
}
