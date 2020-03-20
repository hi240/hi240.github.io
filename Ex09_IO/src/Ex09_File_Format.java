import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex09_File_Format {

	public static void main(String[] args) {
		//https://cafe.naver.com/opensourceweb/441����
		//ȭ����� ó��
//		DecimalFormat df = new DecimalFormat("#,###.0");
//		String result = df.format(1234567.89);
//		System.out.println(result);
//		String result2 = df.format(100000000000L);
//		System.out.println(result2);
        //��¥ ó��
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
//		Calendar cal = Calendar.getInstance();
//		String sdate=sdf.format(cal.getTime());
//		System.out.println(sdate);
		
		//���ڿ����� >>printf�� ���.String.format
		//MessageFormat Ŭ����
//		String userid="kglim";
//		String message="ȸ�� id: {0} \nȸ���̸�: {1} \n��ȭ��ȣ: {2}";
//		String result3=MessageFormat.format(message, userid, "ȫ�浿","111-1111");
//		System.out.println(result3);
//		
		File dir =new File("C:\\Temp"); //�ڢ��� ��ο� dir��� ���� ����.
		File[] files=dir.listFiles();  //Temp �Ʒ��ִ� ������ ������ �迭�� ������.
		//�ڢ������ �Ʒ��� listfile���� �迭�� ���·� �� ����..
		
		for(int i=0;i<files.length;i++) {            //�ڢ�listfile�� �ִ¸�ŭ �ݺ��ϰ�,
			File file = files[i];                    //�ڢ�file�� n��° �ִ� �ָ� ���Ͽ� �߰��ϰ�,
			String name= file.getName();//���ϸ�, ������ //�� ������ �̸��� �����ͼ�,
			SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd aHH-mm");
			String attribute="";
			String size="";
			if(files[i].isDirectory()) { //���������� Temp
				attribute="<DIR>";
			}else{ //a.txt,1.jpg
				size = file.length()+"byte";
				attribute = file.canRead()?"R":"";
				attribute += file.canWrite()?"W":"";
				attribute += file.isHidden()?"H":"";
			}//���������Ͽ����� �Ӽ��� ���ǿϷ�.
			System.out.printf("%s   %3s   %10s   %s   \n",
					dt.format(new Date(file.lastModified())),
			attribute,
			size,
			name
			);				
		}
		
	}

}
