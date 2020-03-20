import java.io.File;

/*
 * I/O작업
 * 파일과 폴더를 다룰 수 있는 클래스
 * JAVA: 파일, 폴더 하나의 클래스 : file
 * 기능-a.txt 생성,수정,삭제,정보read
 * Temp 폴더 생성,삭제,정보read
 * 
 * 경로
 * 절대경로:C:\\,D:\\ > C:\\Temp\\a.txt
 * 상대경로:현재 파일을 중심으로 C:\\Temp\\a.txt >
 * 
 */
public class Ex07_File_Directory {

	public static void main(String[] args) throws Exception{

		String path="C:\\Temp\\file.txt";
		File f=new File(path);
		//f.createNewFile(); 함수를 호출할 때 파일 생성
		//File클래스를 통해서 
		System.out.println("실행");
		//다양한 정보를 볼 수 있다..
		String filename=f.getName();
		System.out.println("파일명: "+filename);
		System.out.println("*전체경로: "+f.getPath()); //경로보다는 들어있는 딱거기
		System.out.println("절대경로: "+f.getAbsolutePath()); //c,d드라이브 경로까지
		System.out.println("*너 폴더니: "+f.isDirectory());
		System.out.println("*너 파일이니: "+f.isFile());
		System.out.println("*파일의 크기: "+f.length());
		System.out.println("*부모경로: "+f.getParent());//나를 제외한 상위경로
		System.out.println("*존재여부(파일,폴더): "+f.exists());
		//f.delete() return >> true,false
		//f.canRead()
		//
		
	}

}
