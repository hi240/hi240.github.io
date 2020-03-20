import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex09_File_Format {

	public static void main(String[] args) {
		//https://cafe.naver.com/opensourceweb/441참조
		//화폐단위 처리
//		DecimalFormat df = new DecimalFormat("#,###.0");
//		String result = df.format(1234567.89);
//		System.out.println(result);
//		String result2 = df.format(100000000000L);
//		System.out.println(result2);
        //날짜 처리
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일");
//		Calendar cal = Calendar.getInstance();
//		String sdate=sdf.format(cal.getTime());
//		System.out.println(sdate);
		
		//문자열형식 >>printf랑 비슷.String.format
		//MessageFormat 클래스
//		String userid="kglim";
//		String message="회원 id: {0} \n회원이름: {1} \n전화번호: {2}";
//		String result3=MessageFormat.format(message, userid, "홍길동","111-1111");
//		System.out.println(result3);
//		
		File dir =new File("C:\\Temp"); //★♡이 경로에 dir라는 파일 생성.
		File[] files=dir.listFiles();  //Temp 아래있는 폴더와 파일이 배열에 들어가잇음.
		//★♡저경로 아래에 listfile들이 배열의 형태로 들어가 있음..
		
		for(int i=0;i<files.length;i++) {            //★♡listfile이 있는만큼 반복하고,
			File file = files[i];                    //★♡file중 n번째 있는 애를 파일에 추가하고,
			String name= file.getName();//파일명, 폴더명 //그 파일의 이름을 가져와서,
			SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd aHH-mm");
			String attribute="";
			String size="";
			if(files[i].isDirectory()) { //저폴더에요 Temp
				attribute="<DIR>";
			}else{ //a.txt,1.jpg
				size = file.length()+"byte";
				attribute = file.canRead()?"R":"";
				attribute += file.canWrite()?"W":"";
				attribute += file.isHidden()?"H":"";
			}//폴더와파일에따라 속성값 정의완료.
			System.out.printf("%s   %3s   %10s   %s   \n",
					dt.format(new Date(file.lastModified())),
			attribute,
			size,
			name
			);				
		}
		
	}

}
