package cls;

public class ChildClass extends ParentClass {
	
	private double height;
	
	public void func() {
		System.out.println("ChildClass func()");
		
//		name = "hello";
		age = 24;
		
	}
	
	public ChildClass(String name, double height, int age) {
		super(name, age);
		this.height = height;
	}

	public ChildClass () {
		super("hello");
		System.out.println("ChildClass func");
	}
	
	public void print() {
		System.out.println(super.toString());
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "ChildClass [height=" + height + "]";
	}
	
	
}
