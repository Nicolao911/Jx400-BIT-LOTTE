package fileRead;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("c:\\Temp\\newfile.txt");

		// 한글자씩 읽기
//		FileReader fr = new FileReader(file);
//		int ch = fr.read();
//		while((ch = fr.read()) != -1) {
//			System.out.println((char)ch);
////			ch = fr.read();
//		}
//		
//		fr.close();

		// 문장으로 읽기
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str = "";

		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		br.close();

	}

}
