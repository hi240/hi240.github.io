package kr.or.bit;

public class Mainbody {
	int price=20000000;
	 String serial="12313454623";
	 String brand="brand";
	 String cpu="3";
	 String memory="128Gb";
    Boolean power = new Boolean(true); //�������� on
    Boolean poweroff = new Boolean(false); //�������� off
    
    public Boolean power1;
 public void power1() {
	 power1=!power;
 }
 
}
