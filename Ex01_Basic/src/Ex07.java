
public class Ex07 {
	public static void main(String[] args) {
		int jumsu = ((int)(Math.random() * 10) +1)*100;
		System.out.println("��÷��ȣ : " + jumsu);
		String msg = ""; //�ʱ�ȭ
		msg += "������ ������ : " + jumsu + " �̰� ��ǰ�� : ";
		switch(jumsu) {
		case 1000:msg+="Tv ";
		case 900:msg+="NoteBook ";  
		case 800:msg+="����� ";
		case 700:msg+="�ѿ� ";
		case 600:msg+="���� ";
			break;
		default:msg+="ĩ��";
		}
		System.out.println(msg);
	}

}
