package kr.or.bit;
/*
 * tv설계도 요구사항 정의
 * tv는 채널 정보를 가지고있다.(ex 1번~200까지 값을가질수잇다)
 * tv는 브랜드이름을 가지고있따. (LG,SAMSUNG)
 * tv는 채널전환 기능을 가지고잇다.  tv는 한 채널씩ㅇ ㅣ동이가능하다.
 * 채널을 증가시키는 기능을 ㅎ가지고잇다.
 * 채널을 감소시키는기능을 가지고잇다.
 * 
 */
public class Tv {
//깨라깨 꺠수깡 꺠라꺠꺠 꺠라꺠라 꺠수깡...................
	public int ch;
	public String brandname="";
	
    public void ch_up() {
    ch++;
    }

    
	public void ch_down(){
	ch--;
	}
    public void tvPrint() {
  	  System.out.printf("[%s],[%d] \n,",brandname,ch);
    }
}