package cls;
/*
 * 추상 클래슨느 맴버변수 포함, 일반 메소트 포함가능(인스턴스는 둘다 안되)하며 프로토타입 추상 메소드만 생성가능
 */
public abstract class AbstractClass {
	
	private int number; // 맴버 변수 포함 가능 인터페이슨 안되.
	
	public void method() { // 일반 method포함 가능
		//처리내용
	}
	
	public abstract void abstractMethod(); // prototype만 선언가능
}

