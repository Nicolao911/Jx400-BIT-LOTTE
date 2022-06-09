import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//NullPointerException
		String str = null;
		try {
			System.out.println(str.length());
			
		} catch(Exception e) {
			// TODO: handle exception
			System.out.println("str은 null입니다.");
			str = "hello";
		}
		System.out.println("str :::: " + str);
		
		// ArrayIndexOutOfBoundsException
		int arr[] = {1, 2, 3};
		try {
			arr[3] = 4;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		//FileNotFoundException
		File file = new File("c:\\xxx");
		FileInputStream is;
		try {
			is = new FileInputStream(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//NumberFormatException
		try {
			int i = Integer.parseInt("12a34");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("숫자가 아닙니다.");
		}
		
	}

}
