package kr.or.bit;

public class Mainbody {
	int price=20000000;
	 String serial="12313454623";
	 String brand="brand";
	 String cpu="3";
	 String memory="128Gb";
    Boolean power = new Boolean(true); //상태전원 on
    Boolean poweroff = new Boolean(false); //상태전원 off
    
    public Boolean power1;
 public void power1() {
	 power1=!power;
 }
 
}
