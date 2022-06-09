
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  Exception != error
		 *  
		 *  1 ~ 10 -> 'A' == 65
		 *  
		 *  ex)
		 *  number -> A B C
		 *  array -> index 범위초과		[0] ~ [9] ---> 이때 [10] 들어오면
		 *  Class -> 없음
		 *  file -> 없음
		 *  
		 *  
		 *  형식 : 
		 *  	try {
		 *  // 예외가 발생될 가능성이 있는 코드
		 *  } catch(예외클레스1 e){
		 *  	메시지를 출력
		 *  } catch(예외클레스2 e){
		 *  	메시지를 출력
		 *  } catch(예외클레스3 e){
		 *  	메시지를 출력
		 *  } finally {
		 *  	무조건 실행
		 *  	rollback
		 *  } 
		 *  
		 *  void method() throws 예외클래스 {
		 *  
		 *  }
		 *  
		 *  
		 *  
		 */
		
		
//		int array[] = {1, 2, 3};
//		System.out.println("start");
//		try {
//			for (int i = 0; i < 4; i++) {
//				System.out.println(array[i]);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			//System.out.println("배열 범위 초과 " + e.getMessage());
////			e.printStackTrace();
//			System.out.println(e.getMessage());
////			return;
//		} finally {
//			System.out.println("롤백");
//		}
//		System.out.println("end");
//		mothod();
		callClass();

	}

	static void mothod() throws IndexOutOfBoundsException {
		int array[] = { 1, 2, 3 };
		
		for (int i = 0; i < 4; i++) {
			System.out.println(array[i]);
		}
	}
	
//	static void callClass() throws ClassNotFoundException {
//		Class.forName("myClass");
//		System.out.println("디비가 정상작동 하는지 확인할때 쓰는 방법");
//	}

	static void callClass() {
		try {
			Class.forName("myClass");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("디비가 정상작동 하는지 확인할때 쓰는 방법");
	}

}
