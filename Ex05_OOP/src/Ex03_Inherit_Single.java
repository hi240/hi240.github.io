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

class Vcr{ //���� �÷��̾�
	boolean power;
	void power() {
		this.power=!this.power;
	}
	void play() {
		System.out.println("����ϱ�");
	}
	void stop() {
		System.out.println("�����ϱ�");
	}
	void rew() {}
	void ff() {}
	}
//TV ���赵, Vcr ���赵
//TvVcr ��� ���赵�� ����� �ּ���..
//������ tv,vcr���赵�� �� �̿��غ�����
//���,����
//class TvVcr extends Tv, Vcr ���߻�ӱ���
//class TvVcr extends Tv
//class Tv extends Vcr ������ ���.. ���� �̸� ��ɵ��� �浹�� ����...
//����: ��� �ذ��Ͻǰǰ���?
//Tv vcr �� tv�� ���Խ�Ű��, �״����� ��ӽ�Ų��.
//tvvcr �ֱ��: ���α��>>������ ���� Ŭ����> ���
//�������� ����
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
		System.out.println("Tv��������: "+t.power);
		t.chUp();
		System.out.println("Tvä�λ���: "+t.ch);
        t.vcr.power();
		System.out.println("���� ��������: "+t.vcr.power);
		t.vcr.play();
		t.vcr.stop();
		t.vcr.power();
		t.power();
		System.out.println("Tv��������: "+t.power);
		System.out.println("���� ��������: "+t.vcr.power);
	}
}
