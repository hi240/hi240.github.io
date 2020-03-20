import java.util.StringTokenizer;

/*String클래스(문자열)
 * 수많은 함수.. 문자열 자르고 합치고 뽑아내고
 * String : static 함수 + 일반 함수
 10개암기
 */
public class Ex06_String_Function {

	public static void main(String[] args) {
		String str=""; //문자열의 초기화,null값
		//int나 double처럼 사용하세요
		String[] strarr= {"aaa","bbb","ccc"};
				for(String s:strarr) {
					System.out.println(s);
				}
				String ss="hello";
				String concatstr=ss.concat("world");
				System.out.println(concatstr);
				
				boolean bo=ss.contains("hel"); //순서대로 있는지 확인
				System.out.println(bo);//true
				
				bo=ss.contains("helo");
				System.out.println(bo);//false
				
				bo=ss.contentEquals("helo");
				System.out.println(bo);
				
				bo=ss.contentEquals("hello");
				System.out.println("bo: "+bo);
				
				String ss2="a b c d";//heap [a][][b][][c][][d]
				System.out.println(ss2.length());
				
				String filename="hello java world";
				System.out.println(filename.indexOf("h")); //index 배열방의 첨자값
				System.out.println(filename.indexOf("java")); //6
				System.out.println(filename.indexOf("폭망")); //찾는게 없을때? -1
				if(filename.indexOf("world")!=-1) {
					System.out.println("world 문자열이 포함되어 있다.");
				}
				System.out.println(filename.lastIndexOf("o")); //o의 마지막 문자는 어디에 있나요?
				//length(),indexOf(),subStirng(),replace(),split()
				String result = "superman";
				System.out.println(result.substring(0));//시작값 부터 모두를 출력.
				System.out.println(result.substring(2));//perman 하하하ㅏ하하하하하ㅏ하핳하하하하하핳하하ㅏㅠㅠ졸려고배고파고눕고싶어
				System.out.println(result.substring(1,2));//endIndex -1//up이 아니고 u 즉,(1,1)
				System.out.println(result.substring(1,1));

				//Quiz
				String filename2="1.txt";
				//파일명과 확장자를 분리해서 출력하세여
				//indexof/length/substring만 사용.
				int a=filename2.lastIndexOf(".");
				System.out.println("파일명 "+filename2.substring(0,a)); //파일이름만출력
				System.out.println("확장자 "+filename2.substring(++a)); //확장자만출력

				//replace (치환함수)
				String s4="ABCDADDDDDA";
				String result4=s4.replace("DDDDD", "오늘은 금요일 입니다리");
				result4 = s4.replace("A", "a");
				System.out.println("result4: "+result4);
				
				//몰라도 되지만 알고있어도 되는 함수
				System.out.println(s4.charAt(0)); //A
				System.out.println(s4.charAt(3)); //D
				System.out.println(s4.endsWith("DDDA")); //뒤에서부터 일치한 문구면 true
				System.out.println(s4.equalsIgnoreCase("abcdADDDDDA"));//대소문자 상관없이 비교해서 true
				
				//Today Point (split) 특정 문자 기준으로 나눠서 배열에 넣는다.
				String s6="슈퍼맨,팬티,노랑색,하하,하하";
				String[] namearray = s6.split(",");
				for(String s: namearray) {
					System.out.println(s);
				}
				/*정규표현식(java) 공통적인 규칙
				특수한 문자로 패턴 설계 > 설계한 형식대로 입력되는지 검증....
				주민번호 숫자6자리-숫자7자리>표현>사용자 입력한 주민번호가 미리 정의한 패턴과 일치
				전화번호, 핸드폰번호,차량번호
				010-{/d4}-0000 정규표현
				010-4444-0000
				. < 정규표현의 문법임. 그래서 /.로 해줘야되는데 자바에서 인식시키기 위해 //.
				*/
				String filename3="bit.hwp";
				String[] filearray= filename3.split("\\."); //점을 기준으로 나눠서 출력.
				for(String s: filearray) {
					System.out.println(s);
				}
				//중요하진 않지만, 가능하다.. 정도!
				String s7 = "a/b,c.d-f"; 
				StringTokenizer sto =new StringTokenizer(s7,"/,.-");
				while(sto.hasMoreTokens()){
				System.out.println(sto.nextToken());	
				}
				
				String s8="홍             길            동";
				//"홍길동" 이렇게 저장하고 싶어. 공백없이 출력해주세요.
				//내가한방법
				StringTokenizer st = new StringTokenizer(s8," ");
				while(st.hasMoreTokens()) {
					System.out.print(st.nextToken());
				}
				System.out.println();
				//더간단한방법
				//System.out.println(s8.replace(" ",""));
				String s9="       홍길동            ";
				System.out.println(">"+s9.trim()+"<"); //trim() 바깥쪽 공백 제거 함수.
				
				String s10="       홍      길          동              ";
				System.out.println(s10.trim());
				System.out.println(s10.replace(" ","")); //무식한 방법입니다.
				
				// 여러 개의 함수를 연결해서 사용 (method chain 기법)
				s10.trim().replace(" ","").substring(2); //여러 함수를 동시에 연결해서 사용. 바깥공백 제거하고,띄어쓰기 없애고, 3번째 글자만 빼와서 출력.
				
				//Quiz1 
				//배열의 문자값을 sum에 담아서 출력 결과 15
				int sum=0;
				String[] numarr= {"1","2","3","4","5"}; //문자열을 숫자로 바꿔서.
				for(String s: numarr) {
					   sum+=Integer.parseInt(s);
				}
				System.out.println(sum);
				
				//Quiz2 주번의 합구하기
				String jumin="123456-1234567";
				
				
				//1
				int sum2=0;
				for(int i=0;i<jumin.length();i++) {
					String numstr=jumin.substring(i,i+1);
					if(numstr.equals("-")) continue;
					sum2+= Integer.parseInt(numstr);        //문자열을 int로
				}
				System.out.println(sum2);
				
				//2
				String[] numarr2=jumin.replace("-", "").split("");
				   int sum5=0;
				   for(String i : numarr2) {
					  sum5+= Integer.parseInt(i);
				}
				
				//내가한거
				String[] juminarray= jumin.split("-"); 
				for(String s: juminarray) {
					System.out.println(s);
				}
				int sumer=0;
				for(int i=0;i<juminarray[0].length();i++) {
				sumer+=(int)(juminarray[0].charAt(i));
				}
				for(int i=0;i<juminarray[1].length();i++) {
				sumer+=(int)(juminarray[1].charAt(i));
				}
				System.out.println(sumer);
				
		}
	}


