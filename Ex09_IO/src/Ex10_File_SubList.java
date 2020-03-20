import java.io.File;
import java.util.ArrayList;
public class Ex10_File_SubList {

	static int totalfiles=0;
	static int totaldirs=0;
	
	public static void main(String[] args) {
		if(args.length != 1) { //★♡배열이 비어있는게 아니라면, 사용법 알려주기.
			System.out.println("사용법:java[실행파일명][경로명]");
			System.out.println("예시: java Ex10_File_SubList C:\\Temp");
	    	System.exit(0);			
		}
		File f = new File(args[0]); //★♡파일이 비어있거나 존재하지않으면 오류출력.
		if(!f.exists()||!f.isDirectory()) {//존재하지않거나 디렉토리에없다면
			System.out.println("유효하지 않은 디렉토리 입니다.");
			System.exit(0);
		}	
		//정상적인 경로, 폴더
		printFileList(f); //★♡출력!
		System.out.println("누적 총 파일수: "+totalfiles);
		System.out.println("누적 총 폴더수: "+totaldirs);		
	}
	static void printFileList(File dir) {
		System.out.println("[full path: ]"+dir.getAbsolutePath());		
		ArrayList<Integer> subdir = new ArrayList<Integer>();
		File[] files = dir.listFiles();
		//C:\\Temp
		//files[0] 에 a.txt
		//files[1] 에 aaaa라는 폴더가 있을 수 있다.
		//flies[4] bbbb
		for(int i=0;i<files.length;i++) {
			String filename = files[i].getName(); //폴더명 or 파일명
			if(files[i].isDirectory()) { //폴더가 맞으면, arraylist[0]에 폴더 
				filename = "<DIR> ["+filename+"]";
				subdir.add(i); //0번재 방에 i를 넣엇다.> //사이즈를 늘리는것.
				//arrayList는 dir폴더의 배열값을 갖고있다.
			}else {
				filename = filename+ "/"+files[i].length()+"byte";
			}
			System.out.println("  "+filename);
		}
	int dirnum = subdir.size(); //폴더의 개수
	int filenum= files.length-dirnum; //파일개수
	//누적값 폴더몇개 파일몇개
	totaldirs += dirnum; //총 누적 폴더 개수
	totalfiles += filenum; //총 파일 누적 개수
	System.out.println("[Current dirNum "+ dirnum);
	System.out.println("[Current fileNum"+ filenum);
	System.out.println("**************************");
	
	//point
	//files[0]a.txt
	//files[1]aaaa ..
	//files[4]bbbb
	for(int j=0;j<subdir.size();j++) {
		int index=subdir.get(j);
		printFileList(files[index]);
	}
	
	}
	
	
}
