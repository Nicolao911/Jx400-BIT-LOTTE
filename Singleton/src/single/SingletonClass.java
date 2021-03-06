package single;
/*
 * 어디서든 접근이 가능한 pointer
 */
public class SingletonClass {

	private static SingletonClass sc = null;

	//여기저기 넘겨줘야되니까 public/ private로 하게되면 g/setter만들어주면됨
	public int num;
	
	private SingletonClass() {// 외부에서 생성자로 생성 못하게 막아둠.private
	}

	/*
	 * SingletonClass를 돌려준다
	 */
	public static SingletonClass getInstance() { // 어디서나 호출 가능하게static
		if (sc == null) {
			sc = new SingletonClass();// 내부이니까 생성자로 생성
		}
		return sc;
	}

}
