package cls;

public class ParentClass {
	
	
	private String name; // private 상속안됨
	protected int age; // 자식클래스에서는 접근 허용 하지만 다른클래스(외부)에선 접근 불가
	
//	public ParentClass() {
//		System.out.println("ParentClass fun");
//	}
	
	public ParentClass(String name) {
		super(); //기본적으로 object를 상속
		System.out.println("ParentClass(String name)");
		this.name = name;
	}
	
	public void PaentMethod() {
		System.out.println("ParentClass  ParentMethod()");
	}

	public ParentClass(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "ParentClass [name=" + name + ", age=" + age + "]";
	}


}
