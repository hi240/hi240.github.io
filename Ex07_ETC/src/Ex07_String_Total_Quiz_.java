import java.util.Scanner; 
public class Ex07_String_Total_Quiz_ {
	
	static boolean juminCheck(String str) {
		return str.length() == 14 ? true : false;
	}

	static boolean JunminFirstNumber(String str) {
		boolean numcheck = false;
		int num = Integer.parseInt(str.substring(7, 8));
		if (num > 0 && num < 5) {
			numcheck = true;
		}
		return numcheck;
	}
	
	static void JuminDisplay(String ssn) {
		// CASE1 >
		String gender= ssn.substring(7,8);
		int numgender = Integer.parseInt(gender);
		if(numgender%2 == 0)System.out.println("����");
		if(numgender%2 == 1)System.out.println("����");

		// CASE2 >
	 char cgen = ssn.replace("-", "").charAt(6); // 123456-1234567 ->1234561234567 > 123456[1]234567 ����> '1' 
  switch (cgen) {
  case '1': case '3': System.out.println("����^^"); break;
  case '2': case '4': System.out.println("����^^"); break;
  default: System.out.println("�߼�"); }
		 
	}
	public static void main(String[] args) {
		String ssn = "";
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("�ֹι�ȣ �Է�:");
			ssn = sc.nextLine();
		} while (!juminCheck(ssn) || !JunminFirstNumber(ssn));
		// �Ѵ� true �ΰ��  > false || false Ż��
		// !true || !true => false || false Ż��
		JuminDisplay(ssn);

	}

}
/*
public boolean CheckNumber(String str){
	char check;
	
	if(str.equals(""))
	{
		//���ڿ��� �������� Ȯ��
		return false;
	}
	
	for(int i = 0; i<str.length(); i++){
		check = str.charAt(i);
		if( check < 48 || check > 58)
		{
			//�ش� char���� ���ڰ� �ƴ� ���
			return false;
		}
		
	}		
	return true;
}



�ڹٿ��� �������� üũ�ϴ� ������ ����Դϴ�.

[StringUtil.java]
public static boolean isNumeric(String s) {
  try {
      Double.parseDouble(s);
      return true;
  } catch(NumberFormatException e) {
      return false;
  }
}

if( StringUtil.isNumeric(year) == false ) {
    logger.info(������ ������);
}
*/