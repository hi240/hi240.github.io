/*
 * ��ü �ڽ��� ����Ű�� this
 * this�� ����ϴ� �ٸ� �����ڸ� ȣ��
 * ��Ģ:�����ڴ� ��ü������ 1���� ȣ��
 * this.�ѹ��� ���� ���� �����ڸ� ȣ���� �� �ִ�.
 */
//Zcar car=new Zcar();
//Zcar car=new Zcar("blue","auto",4);

    class ZCar{
	String color;
	String geartype;
	int door;
	
	ZCar(){ //�⺻Ÿ��
		//this.color="red";
		//this.geartype="auto";
		//this.door=2;
		//���� �ٽúθ���?
		//Zcar("red", "auto", 2);
		this("red", "auto", 2);
		System.out.println("default constructor");
	}
	ZCar(String color,String geartype,int door){
		this.color=color;
		this.geartype=geartype;
		this.door=door;
		System.out.println("Overloading constructor");
	}
	void print(){
		System.out.println(this.color+"/"+this.geartype+"/"+this.door);
	}
}
    //�ڵ差���� ( �����ڿ� thisȰ��)
   class Zcar2{
    	String color;
    	String geartype;
    	int door;
     	
     	Zcar2(){
    		this("red", 2);
    		System.out.println("red,2");     //���3��
    	}

    	Zcar2(String color,int door){
    		this(color,"auto",door);
    		System.out.println("color,auto,door"); //����2��
    	}
     	Zcar2(String color,String geartype,int door){
    		this.color=color;
    		this.geartype=geartype;
    		this.door=door;
    		System.out.println("color,geartype,door"); //���1��
    	}
 	//�����ڴ� ����ʵ� �ʱ�ȭ ��� < ���ڸ� ���� ������ ������ �ٽ� ����.
    	void print(){
    		System.out.println(this.color+"/"+this.geartype+"/"+this.door);
    	}
    }
public class Ex19_this_Constructor {

	public static void main(String[] args) {
	
        Zcar2 z=new Zcar2();
        z.print();
   
        Zcar2 z2=new Zcar2("pink",10);
        z2.print();
	}
}
