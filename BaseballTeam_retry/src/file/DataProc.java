package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 파일생성/ 저장 프로세스 클래스
 * 선수 명단을 .txt 파일로 읽고 쓸 수 있다.
 */
public class DataProc {

	File file;

	public DataProc(String fileName) {
		// 생성자로 초기화때 파일 셋팅
		file = new File("c:\\Temp\\" + fileName + ".txt");
	}

	// 파일 생성
	public void createFile() {
		try {
			if (file.createNewFile()) {
				System.out.println("파일 생성이 완료되었습니다!");
			} else {
				System.out.println("파일 생성에 실패하였습니다..");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 파일 읽기
	public String[] readFile() {
		//배열 준비
		String loadList[] = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str = "";
			// 배열로 읽어서 돌려준다. 우선 배열을 몇칸 만들지 확인 위해 순회하면서 count해준다
			// 바로 담지 않고 에러 있을때 파일이 작성되면 안되므로 우선 돌리고
			// 그담에 다시 읽어드리면서 담는다.
			int count = 0;
			
			while ((str = br.readLine()) != null) {
				count++;
			}
			
			br.close();
			
			//배열 할당
			loadList = new String[count];
			//데이터 건수만큼 배열에 읽어서 넣기
			br = new BufferedReader(new FileReader(file));
			int index = 0;
			while ((str = br.readLine()) != null) {
				loadList[index] = str;
				index++;
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return loadList;
	}

	// 파일 저장
	public void writeFile(String[] datas) {
		//배열 리스트를 받아와서 text로 내린다..	
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			for (int i = 0; i < datas.length; i++) {
				pw.println(datas);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
