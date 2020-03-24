import javax.swing.JOptionPane;

class WordInputProcess2 extends Thread{
static int i;
static int j;
String question() {
i = (int)(Math.random()*8)+2;
j = (int)(Math.random()*8)+2;

return i+"X"+j+"는?";

}

@Override
public void run() {
while(true) {
String inputdata = JOptionPane.showInputDialog(question());
if(inputdata.equals(i*j+"")) {
System.out.println("정답입니다.");
Wh.correct++;

}else {
System.out.println("틀렸어요 ㅠㅠ");
}

Wh.total++;
}
}
}


class WordTimeOut2 extends Thread{
@Override
public void run() {
for(int i=10; i > 0 ; i--) {



System.out.println("남은 시간: " + i);
try {
Thread.sleep(1000); //대기실에서 1초간 쉬었다 ....
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
time.join(); //main에게 time이 종료할 때까지 대기하라고 명령
} catch (Exception e) {

} 

System.out.println("총 문제수: " + total+"/"+"정답 개수: "+correct
);
System.out.println("게임 종료");
System.exit(0);
}

}