import java.io.File;


public class Ex08_File_Directory {

	public static void main(String[] args) {
	System.out.println(args.length);
	//System.out.println(args[0]);
	if(args.length!=1) {
		System.out.println("사용법:java 파일명[디렉토리명]");
		System.exit(0); //강ㅡ제ㅡ종ㅡ료!
	}
	File f= new File(args[0]);
	if(!f.exists()||!f.isDirectory()) {
		//존재하지 않거나,디렉토리가 아니라면
		System.out.println("유효하지 않은 경로입니다");
		System.exit(0);//강제ㅡ종ㅡ료!	
	}
	File[] files =f.listFiles();//당신이 제공한 폴더 안에 있는 모든 폴더와 파일을 들고 오겠다.
	//C:\\Temp\\1.jpg >하나하나가 file객체에 담아서 주겠다..
	//C:\\Temp\\a.txt
	for(int i=0;i<files.length;i++) {
		String name= files[i].getName(); //파일명,폴더명
		System.out.println(files[i].isDirectory()?"[DIR]"+name:name);
	}
	
	
	}

}