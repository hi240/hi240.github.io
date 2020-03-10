package kr.or.bit;

import java.util.Random;
import java.util.Scanner;

/*
 *1. 1~45������ ������ �߻����� 6���� �迭�� ��������
      (int)(Math.random()*45 + 1)
      lotto[0] = 44 , lotto[1] = 1 .... lotto[5] = 33
 *2. �迭�� ��� 6���� �迭���� �ߺ����� ������ �ȵǿ�  (�ߺ��� ���� :����� ���)
 *3. �迭�� �ִ� 6���� ���� ���� ������ ���� ��Ű����  (���� : �ڸ��ٲ�)
 *4. �� ����� ��� �ִ� �迭�� ����ϼ��� (ȭ�� ���)
Ÿ�� : 8���� + String + class + �迭(Array)  
 */
//������ ���: *Ŭ������ ��������� �ʱ�ȭ�� �ǵ����̸� �����ڿ��� ����.

public class Lotto1 {  
//public int numbers=10; <�̷��� �ʱ�ȭ �ص� �ǳ�, ������ �ϴ°� ������ �����帲.	
//  private int numbers;
//
//  public Lotto() {//�������� ����: �ʱ�ȭ!(**����ʵ��ʱ�ȭ**)
//  	this(10); //�ؿ��� ���� ��.
//  	//this.numbers=10;
//  }
//  public Lotto(int numbers) {
//  	this.numbers=numbers;
//  }
	private int[] numbers;
	private Scanner scanner;    //scanner�� �ѹ��� ���� �ſ�
	private Random r ;// = new Random();

	public Lotto1() {
		//�ʱ�ȭ(member field) ������ �ʱ�ȭ�� �ַ� �����ڿ��� �ϼ���.
		numbers = new int[6];
		scanner = new Scanner(System.in);
		r = new Random();
	}
	
	//��� ... (method)�ȿ��� >> �Լ� �ϳ��� ��� �Ѱ��� 
	//�ǹ�ȣ ������ �ּ���
	//�ߺ����� ������ �ȵſ�
	//���� ������ ���� ��Ű���� 
	//����ϼ��� (ȭ�� ���)
	//�޴� ��� .... ���� ....
	//1 >> �ζ� ����
	//2 >> ���α׷� ����
	
	public void selectLottoNumber() {
	loop_1: while(true) {
			 String selectionnum = showMenu();
			 switch (selectionnum) {
			 	case "1":
			 			//makeLottoNumber(r,numbers); //�ǹ�ȣ ����
			 			//showLottoNumbers(); //���� �ϰ� ����ϱ�
			 			do {
			 				makeLottoNumber(r,numbers); //�ǹ�ȣ ����
			 				makeDoubleNumber(r,numbers);//�ۼ���ȣ ����
			 			}  while(!checkAverage());
			 			showLottoNumbers(); //���� �ϰ� ����ϱ�
					break;
			 	case "2": //���α׷� ���� : return (�Լ� Ż��) , System.exit(0) , �󺧰� 
					System.out.println("Good Luck^^");
			 		break loop_1;
				default: 
					System.out.println("Not in Operation");
					break;
			}
		}
	}
	
	//�� private �ϱ�? >���ο����� ����Ұű� �����̴�..
	private String showMenu() { //�����̴ϱ� (parameter)
		System.out.println("*******************");
		System.out.println("*1. ��÷ ���� ��ȣ ����*");
		System.out.println("*2. ���α׷� ���� ^^!*");
		System.out.println("*******************");
		System.out.print("���ϴ� �۾� ��ȣ�� �Է��ϼ���:");
		String selectionnum = scanner.nextLine();
		return selectionnum;
	}
	
	//��ȣ ���� , �ߺ��� ����
	private void makeLottoNumber(Random r , int[] numbers) { //parameter ����
		for(int i = 0 ; i < 6 ; i++) {
			numbers[i] = (int)(r.nextInt(45)+1); 
		//	numbers[i]= (int)(r.nextInt(22)+1)*2;
			 for(int j = 0 ; j < i ; j++) {              //j < i (ä���� ���� ��ŭ ��)
				 if(numbers[i] == numbers[j]) {
					 i--;                                //point ���� ���� ���� �ٲپ�� �Ѵ�
					 break;
				 }
			 }
		}
	}
	private void makeDoubleNumber(Random r , int[] numbers) { //parameter ����
		for(int i = 0 ; i < 6 ; i++) {
			numbers[i] = ((int)(Math.random()*22+1)*2);  //¦����............
		//	numbers[i]= (int)(r.nextInt(22)+1)*2;
			 for(int j = 0 ; j < i ; j++) {              //j < i (ä���� ���� ��ŭ ��)
				 if(numbers[i] == numbers[j]) {
					 i--;                                //point ���� ���� ���� �ٲپ�� �Ѵ�
					 break;
				 }
			 } //if ¦�����ƴϸ�, ¦���� �ٽ�ä��� �Լ� �����.
		}
	}
	//ȭ�� ��±��
	private void showLottoNumbers() {
		System.out.println("[������ Lotto ��ȣ]");
		for(int i = 0 ; i < numbers.length ;i++) {
			for(int j=i+1 ; j < numbers.length ; j++) {
				if(numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
	
		//����ϱ�
		for(int i = 0 ; i < numbers.length ; i++) {
		System.out.printf("[%2d]",numbers[i]);
		}
		System.out.println();
	}
	
	//��Ģ (�迭�� ���� ����� Ư�� ������ ����� ������)
	private boolean checkAverage() {
		int sum = 0;
		int average = 0;
		for(int num : numbers) {
			sum+=num;
		}
		average = sum/numbers.length;
		System.out.println("��� : " + average);
		return (average >= 15 && average <= 35); //true , false
	}
	
}











