import javax.swing.JOptionPane;

class WordInputProcess2 extends Thread{
static int i;
static int j;
String question() {
i = (int)(Math.random()*8)+2;
j = (int)(Math.random()*8)+2;

return i+"X"+j+"��?";

}

@Override
public void run() {
while(true) {
String inputdata = JOptionPane.showInputDialog(question());
if(inputdata.equals(i*j+"")) {
System.out.println("�����Դϴ�.");
Wh.correct++;

}else {
System.out.println("Ʋ�Ⱦ�� �Ф�");
}

Wh.total++;
}
}
}


class WordTimeOut2 extends Thread{
@Override
public void run() {
for(int i=10; i > 0 ; i--) {



System.out.println("���� �ð�: " + i);
try {
Thread.sleep(1000); //���ǿ��� 1�ʰ� ������ ....
}catch (Exception e) {
System.out.println(e.getMessage());
}
}
}
}
public class Wh {
static int total;
static int correct;
public static void main(String[] args) {
WordInputProcess2 word = new WordInputProcess2();
WordTimeOut2 time = new WordTimeOut2();

word.start();
time.start();

try {
time.join(); //main���� time�� ������ ������ ����϶�� ���
} catch (Exception e) {

} 

System.out.println("�� ������: " + total+"/"+"���� ����: "+correct
);
System.out.println("���� ����");
System.exit(0);
}

}