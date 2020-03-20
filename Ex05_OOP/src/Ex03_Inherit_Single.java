class Tv{
	boolean power;
	int ch;
	void power() {
		this.power=!this.power;
	}
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch++;
	}
}

class Vcr{ //비디오 플레이어
	boolean power;
	void power() {
		this.power=!this.power;
	}
	void play() {
		System.out.println("재생하기");
	}
	void stop() {
		System.out.println("정지하기");
	}
	void rew() {}
	void ff() {}
	}
//TV 설계도, Vcr 설계도
//TvVcr 라는 설계도를 만들어 주세요..
//기존에 tv,vcr설계도를 잘 이용해보세요
//상속,포함
//class TvVcr extends Tv, Vcr 다중상속금지
//class TvVcr extends Tv
//class Tv extends Vcr 계층적 상속.. 같은 이름 기능들이 충돌이 난다...
//질문: 어떻게 해결하실건가요?
//Tv vcr 에 tv를 포함시키고, 그다음에 상속시킨다.
//tvvcr 주기능: 메인기능>>비중이 높은 클래스> 상속
//나머지는 포함
class TvVcr extends Tv{
	Vcr vcr;
	TvVcr(){
		vcr=new Vcr();
	}
}
 class Ex03_Inherit_Single {
	public static void main(String[] args) {
		TvVcr t= new TvVcr();
		t.power();
		System.out.println("Tv전원상태: "+t.power);
		t.chUp();
		System.out.println("Tv채널상태: "+t.ch);
        t.vcr.power();
		System.out.println("비디오 전원상태: "+t.vcr.power);
		t.vcr.play();
		t.vcr.stop();
		t.vcr.power();
		t.power();
		System.out.println("Tv전원상태: "+t.power);
		System.out.println("비디오 전원상태: "+t.vcr.power);
	}
}
