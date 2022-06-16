package fileIO;

import java.io.File;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * 저장매체 : file, Database
		 *  *.txt 최상위 파일 어떤파일이던 다 텍스트 파일로 시작
		 *  , dll, lib  , jar--> java lib
		 *  *.xml 전부 파일이야
		 *  *.json 전부 파일이야
		 *  Dynimic Link Library --> 동적 파일 
		 *  program -> 1 -> 2 -> 3  
		 *  우선 진행되다가 필요한 순간에 dll읽고와서 계속 진행한다. 메로리 관리에 좋음 단 보안에 취약함
		 *  
		 *  Library --> 정적 파일
		 * 	program -> 1 -> 2 -> 3 
		 *  lib 정적이기때문에 메모리에 상주 시켜야되서 무조건 읽고 들어간다. 그담에 1 -> 2 ... 진행 보안적으론 훌륭 메모리엔 바이너리코드로 올라가니까
		 * 
		 */

//		File file = new File("c:\\");
		
//		String filelist[] = file.list();
		
//		for (int i = 0; i < filelist.length; i++) {
//			System.out.println(filelist[i]);
//		}
		
		
//		String filelist[] = file.listFiles();
//		
//		for (int i = 0; i < filelist.length; i++) {
//			if (filelist[i].isFile) {
//				System.out.println("[파일] = " + FileList[i].getName());
//			} else if(filelist[i].isDreectory()){
//				System.out.println("[폴더] = " + FileList[i].getName());
//			} else {
//				System.out.println("[?] = " + FileList[i].getName());
//			}
//		}
		// 파일 생성
		File newfile = new File("c:\\Temp\\newfile.txt"); // 덮어쓰기 안됨
		if (newfile.createNewFile()) {
			System.out.println("success!!");
		} else {
			System.out.println("fail");
		}

		// 폴더 생성
		File newDir = new File("c:\\Temp\\sub\\Dir");
		if (newDir.mkdirs()) {
			System.out.println("create folder success!!");
		} else {
			System.out.println("create folder fail 가나다");
		}
		
		// 파일 존재 여부 
		if (newfile.exists()) {
			System.out.println("File exists!!");
		} else {
			System.out.println("File not found!!");
		}
		
		// 읽기전용
//		newfile.setReadOnly();		
		// 쓰기전용
		newfile.setWritable(true);
		
		//삭제
		newfile.delete();
	}

}
