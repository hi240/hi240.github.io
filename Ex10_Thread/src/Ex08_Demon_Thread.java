/*
 * 데몬:Thread(보조)
 * Main Thread 와 생명을 같이 하겠다.
 * 한글main >> 작업 >>3초 간격으로 작업내용 저장.
 * 한글 작업 종료 >> 3초간격으로 작업 같이 종료
 */
public class Ex08_Demon_Thread implements Runnable{
	static boolean autosave= false;
	public static void main(String[] args) {
		Thread th = new Thread(new Ex08_Demon_Thread());
		th.setDaemon(true);
		//th 라는 thread는 main thread의 보조 thread(demon)을 만들것.
		//main이 하나의 thread, demon이 아닌 모든 thread는 non-demon이라고 부른다.
		//main함수의 thread와 운명을 같이 하겠다. (보조:인 th가)	
		th.start();

		for(int i=0;i<=30;i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			    System.out.println(e.getMessage());	
			}
			System.out.println("Main Thread 동작: "+i);
			if(i==5) { //i값이 5가되는 시점부터
			System.out.println("i: "+i);	
			autosave = true;
			}
		}
	}
	public void autoSave() {
		System.out.println("문자가 3초 간격으로 자동 저장 되었습니다.");
	}
	
public void run() {
	while(true) {
		try {
			Thread.sleep(3000);//3초간격으로 재움
		} catch (Exception e) {
			
		}if(autosave) { //static boolean autosave 가 true 라면..
			autoSave();
		}
	}
}
}
