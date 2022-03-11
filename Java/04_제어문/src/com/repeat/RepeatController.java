package com.repeat;

import java.util.Iterator;
import java.util.Scanner;

public class RepeatController {

	// <�ݺ��� : for��, while��>
	public void basicFor(){
	
		/*	<�⺻ for��>
		 * 	(����) 
		 * 	for(�ʱ��;���ǽ�;������){�ݺ��� ��ɾ�}
		 * 	�� �ʱ��	:	'�ݺ� Ƚ��' ���� ������ ����� �� �ִ� ��������� ������ (�Ϲ����� �ǹ�)
		 * 	�� ���ǽ�	:	�ݺ��� [���߰ų�/�����ϴ�]������ �Ǵ� �� (boolean�� : true||false)
		 * 				- true�� ��, �ݺ��� ����
		 * 				- false�� ��, �ݺ��� �ߴ�
		 * 
		 * 				�� ���� ���� ��
		 * 				"������"�� ����~ ���ǽ��� [true/false]�� �Ǻ���. 
		 * 				���� ����(�ݺ�)�� ���ϰ� �Ͱŵ�, �������� false�� �������� 
		 * 				���ǽ��� �����ص־� ��. 
		 * 
		 * 	�� ������	:	�ʱ�Ŀ��� ������ ������ ���� ������
		 * 				- (���) '����'�� ���� ~ �ݺ�Ƚ���� ���� [����/����]��
		 * (ȿ��)	'��ɾ�'�� '���� ���ϴ� Ƚ����ŭ' '�ݺ�'�����ų �� �����
		 */
		
		// (����) "�ȳ��ϼ���"�� 10�� ����ϼ���.
		System.out.println("�ȳ��ϼ���. ");
		System.out.println("�ȳ��ϼ���. ");
		System.out.println("�ȳ��ϼ���. ");
		System.out.println("�ȳ��ϼ���. ");
		System.out.println("�ȳ��ϼ���. ");
		System.out.println("�ȳ��ϼ���. ");
		System.out.println("�ȳ��ϼ���. ");
		System.out.println("�ȳ��ϼ���. ");
		System.out.println("�ȳ��ϼ���. ");
		System.out.println("�ȳ��ϼ���. ");
		//����! ����+�ٿ��ֱ�, �� 10�� �ϸ� ����!
		//����? ���� 1,000���� �ݺ��ؾ� �ϸ� ��� �ҷ�?!
		//�̶�, "for��"�� ���� ���ϴ�. 
		
		for (int i=1; i<=100 ; i++) {
			System.out.println("\"�ȳ��ϼ���\", �� "+i+"�� ���ߴ�.");
		}
		
		//(���� ��) 100���� ������ ȸ������ ���� ������ ���� ��, 
		//ȸ�����Լ��� 100�� �ݺ��ǵ��� ������ �� �ִ�. 
		
		for (int i=1 ; i<10 ; i++) {
			
			//���߿�� 
			//for�� �ʱ�Ŀ� �� i������, ��ɹ� �ȿ��� Ȱ���� �� �ִ�. 
			System.out.println(i);
			
		}
		
		// (����) �ݺ����� Ȱ��, ���� �̸��� 5ȸ ����ϼ���. 
		
		for (int i = 1; i <= 5; i++) {

			System.out.println(i+". �赵��");

		}
		
		/*	for�� {}���� : ������, ����, ���ǹ�... �� "��� ��ɹ�"�� ����� �� ����. 
		 */
		
		//{}������ ��ɾ �� 3ȸ �ݺ��� ����.
		for(int i=1; i<=3 ; i++) {
			
			if(i==2) {
						System.out.println("���� 2ȸ�� �ݺ� ����!");
					 }	//���ǹ�> if��
			
			String name = "�赵��";	//���� ����
			
			switch (name) {	
			
			case "�赵��" : System.out.println("�� �̸��� "+name+"�̾�."); break;
			
			}	//���ǹ�> case��
		
		}
		
		//(����)	
		// 1. 1���� 50���� ���ڸ� ����ϼ���. 
		// 2. ���ڸ� ¦���� ����ϼ���
		
		for (int i=1 ; i<=50 ; i++) {
			
			
			//1. 1~50 ���� ���
			//System.out.print(i+" "); //�ڵ带 �̷��� �ۼ��ϸ� 1���� ����ϰ� ��µ�
			
			//2. 1~50 �� ¦���� ���
			if(i%2==0) {
				System.out.println(i+" : ¦������.");
			}

			//3. 1~50���� Ȧ¦ ���� ���
//			if(i%2==1) {
//				System.out.println(i+" : Ȧ������.");
//			} else System.out.println(i+" : ¦������.");

		}
		
		//1~50 ��, ¦���� ����ϰ� ���� ��
		// ���� ȿ������ �ڵ�! (������ ª���ϱ�!)
		for(int i=2 ; i<=50; i+=2) {
			System.out.print(i+" ");
		}
		
		//(����) 1~10���� Ȧ���� ����ϱ�
		
		System.out.println();
		//���1
		for(int i=1; i<=10; i+=2) {
			
			System.out.print(i+" ");
		}
		
		//���2
		System.out.println();
		for (int i=1; i<=10 ; i++) {
			
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
		
		/*	for�� > ���ҽ�
		 * 	100���� 1���� ������������ �� ����ϱ�
		 */
		 
		System.out.println();
		for (int i=100; i>=1; i--) {	//TODO ���ǽ�: "0<i&&i<=100"�̷��� �����ϰ� �������µ�... ������ ���� ���� �־�����.
			
			System.out.print(i+" ");
		}
		
		/*	(ȿ��)
		 * 
		 */
		
		/*	(����)
		 * 	�ݾ��� 5ȸ �Է¹޾�, 
		 * 	�ݾ��� �Ѱ谡 ����� ���, �ܾ׿� �����ϰ� 
		 * 	�ܾ��� ����϶�. 
		 */
		
//		System.out.println();
		Scanner sc= new Scanner(System.in);
//		int account= 10;
//		int money= 0;
//		
////		for (int i = 1; i <= 5; i++) {
////
////			System.out.print(i+". �ݾ� : ");
////			money += sc.nextInt();
////
////		}
//
//		if (money > 0) {
//			account += money;
//		}
//
//		System.out.println("�ܾ� : " + account);
		
		
		/*	(����)
		 * 	�л� ������ �Է¹ް�,
		 * 	����ϴ� ���� 3ȸ �ݺ��ϱ�
		 * 
		 * 	�л� ���� : �̸�, ����, �г�
		 * 
		 */
		
//		System.out.println();
//		String name= "";
//		int age= 0;
//		int grade= 0;
//		

		
//		for(int i=1; i<=3 ; i++) {
//			
//			sc.nextLine();	//�Է� ���� ����ֱ�
//			System.out.println();
//			System.out.println("=== �л� ������ �Է��ϼ��� ===");
//			System.out.print("�̸� : ");
//			name= sc.nextLine();
//			System.out.print("���� : ");
//			age= sc.nextInt();
//			System.out.print("�г� : ");
//			grade= sc.nextInt();
//		
//			System.out.println();
//			System.out.println("=== "+i+"��° �л� ���� ===");
//			System.out.println("�� �̸�: "+name+" \n�� ���� : "+age+"\n�� �г� : "+grade);
//			
//		}
		
		/*	�ݺ����� �߰�ȣ������, 
		 * 	�߰�ȣ �ܺο��� ������ ������ ����� �� �ִ�. 
		 */
		
//		int count = 1;
//		for (int i= 1 ; i<=5; i++) {
//			System.out.println(count++);	//�߰�ȣ �ܺο��� ������, ���� count�� ����� �� ����!
//		}
		
		
		/*	(����)
		 * 	5���� �ݾ��� �Է¹ް�,
		 * 	account������ ���� �����ϰ�,
		 * 	���� ����� ����ϼ���.
		 */
		
		
//		int money1= 0;
//		int account1= 0;
//		
//		for (int i = 1; i <= 5; i++) {
//
//			System.out.print("�ݾ� : ");
//			money1 = sc.nextInt();
//			// TODO �ٽ� Ǯ���!
//			// �Ʊ��, money1+=sc.nextInt()�� �ؼ� ���� ��̾���.
//			// �̷��� �ߴٸ�, account�� ������ money�� ���������� account1�� ���ϸ� ����.
//
//			account1 += money1;
//
//		}
//		
//		System.out.println("�ܾ� : ");
//		System.out.print(account1+" ��");
//		//money1+=sc.nextInt()�� 5ȸ �ݺ����� ���,
//		//System.out.println(account1+money1);

		
		
		
		/*	(����)
		 * 	����ڰ� �Է���, 8���� �޽����� �� ���� ����ϱ�
		 */
		
		System.out.println();
		String msg= "";
		
		//System.out.println();
		for (int i = 1; i <= 2; i++) {

			//sc.nextLine(); //�տ��� sc.next()���� ����� ��쿣 �Է¹��۸� ������ ��.
			System.out.print(i + ". �޽����� �Է��ϼ��� : ");
			msg += sc.nextLine() + "\n"; // "\n"�� ������ ����� ������ ��µ�!

		}
		System.out.println(msg);
		
		/*
		 * (����) 1~100���� ���� ����ϱ�
		 */

		int num = 0;
		System.out.println("1~100������ ��");
		for (int i = 1; i <= 100; i++) {

			num += i;

		}
		System.out.println(num);
		

		 //�� for() ���ο� ����� ���� i��, �ܺο��� ����� �����Ѱ�? 
		 
		for(int i= 0; i<=5 ; i++) {
			
		} 
		//System.out.println(i); ���� �߻�!
		//(���) -> �Ұ����ϴ�!
		
		
		//�� for���� �ʱ��, ���ǽ�, �������� ������ ����ؾ� �ϳ�? -> X
		int count=0;
		
		//1. �ʱ���� ���� ����
		for(;count<10;count++) {	
			System.out.print(count+" ");
		}
		
		//2. �������� ���� ����
		count=0;
		for(;count<10;) {	//�ʱ���� ���� ����
			System.out.println("����Ǵ�?");	//������ �ݺ���. ���ǽ��� false�� ������ �������� �����ϱ� ������
			//���� �ݺ����� ���߰� �Ͱŵ�, 
			count++; //�ݺ��� ���ο��� �������� �߰����ָ� ��. ���ǽ��� ���� ��ȭ��ų �� �ִ�.
		}
		
		String test= "";
		for (; !test.equals("����");) {

			System.out.println("\"����\" �ۼ� ��, for���� ����˴ϴ�.");
			System.out.println("�ܾ� �Ǵ� ������ �Է��ϼ��� : ");
			test = sc.nextLine();

		}
		
		//3. �ǵ������� ���ѷ����� �����ϴ� ���
		//'���ǽ�' ������ ���, 'true'�� ������.
		for(;;) {
			
			System.out.println("����");
			
			//���ѷ����� �����ϰ� �ʹٸ�, 
			count++;	//�� �ռ� count�� 9���� �÷��׾���. 
						//  �ٷ� ���� if���� ���ǿ� �ɷ��� break���� �ɷ� �ݺ����� �����
			if(count>10) {
				break;
			}
		}
		
		for(int a=0, i=1; i<10; i++, a+=2) {
			System.out.println(a+" : "+i);
		}

	}
		

	//for�� ����
	public void forApplication() {
		
		/*	(����)
		 * 	1���� ~ ����ڿ��� �Է¹��� ������ ����ϱ�
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		int su = sc.nextInt();

		for (int i = 1; i <= su; i++) {

			System.out.print(i + " ");

		}
		
	}
		
		/*	(����)
		 * 	�л��� ����ϴ� ����� ������.
		 * 	public void ex_enrollStudent()
		 * 	1. ����� �л��� ���� ���� �Է¹�������.
		 * 	2. �ش� �����ŭ ����ϴ� ����� �����ϼ���. 
		 * 	3. �л� ���� => �̸�, ����, �г�, ����, ����(char)
		 * 	����, ����� �л��� �����͸� �� ���� ��� ���
		 */
		
		
	public void ex_enrollStudent() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("����� �л��� ���� �Է��ϼ��� : ");
		int students= sc.nextInt();
		String name= "";
		int age= 0;
		int grade=0;
		String major= "";
		char gender= ' ';
		//TODO : ����� �л����� ������ �ϰ������� ����ϴ� ��!
		String studentsInfo="";
		
		
		for (int i=1; i<=students ; i++) {
			
			sc.nextLine();
			System.out.println("====== "+i+"�� �л� ��� ���α׷� ���� ======");
			System.out.println("�̸� : ");
			name= sc.nextLine();
			System.out.println("���� : ");
			age= sc.nextInt();
			System.out.println("�г� : ");
			grade= sc.nextInt();
			
			sc.nextLine();
			System.out.println("���� : ");
			major= sc.nextLine();
			System.out.println("����(M/F) : ");
			gender=sc.next().charAt(0);
			
			//System.out.println("====== "+i+"�� �л� ��� �Ϸ� ======");
			//System.out.println("�̸� : \t"+name+"\n���� : \t"+age+"�� \n�г� : \t"+grade+ "\n���� : \t"+major+"\n���� : \t"+gender);
			
			studentsInfo+="�� "+i+"��° �л� ��� ����"+"\n�̸� : \t"+name+"\n���� : \t"+age+"�� \n�г� : \t"+grade+ "\n���� : \t"+major+"\n���� : \t"+gender+"\n";
			
		}
		
		System.out.println("====== �л� ��� �Ϸ� ======");
		System.out.println(studentsInfo);
		
		
		/*	���ڿ� > �� ���ھ� ã�ų�, ������ �� ����
		 */
		
		String name1= "������";
		name1.charAt(0); //��
		name1.charAt(1); //��
		name1.charAt(2); //��
		
		//charAt() ���� ���ڰ�, ��Ģ������ 1�� �����ϰ� ����
		//������ ã�ҳ�! -> �ݺ����� ����ؼ� �� ���ھ� ����� �� ����
		
		for(int i=0; i<3 ; i++) {
			
			
			System.out.println(name1.charAt(i));
			
		}
		
	//	�Է¹��� ���ڿ���, ���Ϲ��� �� ���ھ� ����ϱ�
		
		sc.nextLine();
		System.out.print("���ڿ� �Է� : ");
		String inputStr= sc.nextLine();
		
		//�� length()�޼ҵ� : ���ڿ��� ���̸� �����
		for (int i = 0; i<inputStr.length(); i++) {
			
			System.out.println(inputStr.charAt(i));
			
		}
		
		//	�Է¹��� ���ڿ��� ������ ���ԵǾ� �ִ���, ���� Ȯ���ϴ� ���
		
		boolean flag = false; //���� ���ο� ���� ���� ��: [ true : ���� ���� / false : ���� ���� ]
							  //�ϴ���, ������ ���ٰ� �����Ͽ� false�� �ʱ�ȭ��
		
		for (int i=0; i<inputStr.length(); i++) {
			
			if(inputStr.charAt(i)==' ') {
				flag=true; //Ư�� �ڸ������� ������ �߻��ϸ� (if ���ǹ��� ����)
						   //boolean���� flag�� ���� true�� ��
			}
			
		}
		System.out.println();
		System.out.println(flag ? "������ �ֽ��ϴ�!" : "������ �����ϴ�!");
		
		
		// 	(����) �Է¹��� (����)���ڿ��� �빮��/�ҹ������� Ȯ��
		//	(��ȭ) ������ �ƴ� ���, "������ �ƴѵ���" ���
		// �� ���Ϲ���, �� ��쿣 ��Һ� ������ (�ֳĸ� ���ڴ� ��ǻ�� ���������� '����'�μ� ����Ǳ� ����)
		
		//sc.nextLine();
		System.out.print("����� ������ �ۼ��غ�����. : ");
		String eng = sc.nextLine();
		boolean flag2= false;
		
	
		
		
		
		for (int i=0 ; i<eng.length();i++) {
			
			
			//����||����, �Ǻ��ϴ� �ڵ�� ��� ����� �ɱ�?
			//if (65<=eng.charAt(i)&&eng.charAt(i)<=122) {
				
				//�ƽ�Ű �ڵ带 Ȱ���� (�빮�� A~Z�� 65 ~ 90���� ǥ����)
				if (65<=eng.charAt(i)&&eng.charAt(i)<=90) {
					flag2= true;
				}

			}

			System.out.println(flag2 ? "�빮�ڰ� ���Ե� �����Դϴ�" : "���� �ҹ��ڷθ� ������ �����Դϴ�");
		
		
	}

}
	
	

