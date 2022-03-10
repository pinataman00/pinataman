package com.bs.practice.func;
import java.util.Scanner;
public class OperatorPractice {

	
	
	
	public void practice1() {

		/*
		 * �ǽ�����1 Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�, ����� �ƴϸ� ������� �ƴϴ١��� ����ϼ���.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int input = sc.nextInt();

		System.out.println(input > 0 ? "�����" : "����� �ƴϴ�");

	}
	
	public void practice2() {

		/*
		 * �ǽ�����2 
		 * Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�, ����� �ƴ� ��� �߿��� 0�̸� ��0�̴١�, 0�� �ƴϸ� �������١��� ����ϼ���.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int input = sc.nextInt();

		System.out.println(input > 0 ? "�����" : (input == 0 ? "0�̴�" : "������"));

	}
	
	public void practice3() {
		
		/*	�ǽ�����3
		 * 	Ű����� �Է� ���� �ϳ��� ������ ¦���̸� ��¦���١�, ¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���.
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("���� : ");
		int input= sc.nextInt();
		System.out.println(input%2==0 ? "¦����" : "Ȧ����");
		
	}
	
	public void practice4() {
		
		/*	�ǽ�����4
		 * 	��� ����� ������ ���� ������������ �Ѵ�. 
		 * 	�ο� ���� ���� ������ Ű����� �Է� �ް� 
		 * 	1�δ� �����ϰ� �������� ���� ������ 
		 * 	�����ְ� ���� ������ ������ ����ϼ���.
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("�ο� �� : ");
		int personnel= sc.nextInt();
		System.out.print("���� �� : ");
		int candies= sc.nextInt();

		System.out.print("1�δ� ���� ���� : "+ candies/personnel);
		System.out.print("\n���� ���� ���� : " + candies%personnel);
	}
	
	public void practice5() {
		
		/*	�ǽ�����5
		 * 	Ű����� �Է� ���� ������ ������ ����ϰ� 
		 * 	����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���ϼ���. 
		 * 	�� �� ������ ��M���̸� ���л�, 
		 * 	��M���� �ƴϸ� ���л����� ��� ó�� �ϼ���.
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("�̸� : ");
		String name= sc.next();
		System.out.print("�г�(���ڸ�) : ");
		int grade= sc.nextInt();
		System.out.print("��(���ڸ�) : ");
		int classroom= sc.nextInt();
		System.out.print("��ȣ(���ڸ�) : ");
		int number= sc.nextInt();
		System.out.print("����(M/F) : ");
		String gender= sc.next();
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		double score= sc.nextDouble();
		
		System.out.println(grade+"�г� "+classroom+"�� "+number+"�� "+name+" "+
						  (gender.equals("M")?"���л�" : "���л�")+"�� ������ "+score+"�̴�.");

	}
	
	public void practice6() {
		
		/*	�ǽ�����6
		 * 	���̸� Ű����� �Է� �޾� 
		 * 	���(13�� ����)����, 
		 * 	û�ҳ�(13�� �ʰ� ~ 19�� ����)����, 
		 * 	����(19�� �ʰ�)���� ����ϼ���.
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("���� : ");
		int age= sc.nextInt();
		
		System.out.print(age>13&&age<=19 ? "û�ҳ�" : (age>19 ? "����" : "���"));
		
		
	}
	
	public void practice7() {
		
		/*	�ǽ�����7
		 * 	����, ����, ���п� ���� ������ Ű���带 �̿��� ������ �Է� �ް�, 
		 * 	�� ���� ���� �հ�(����+����+����)�� 
		 * 	���(�հ�/3.0)�� ���ϼ���. 
		 * 	�� ������ ������ ����� ������ �հ� ���θ� ó���ϴµ�
		 * 	�� ���� ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� �� �հ�, 
		 * 	�ƴ϶�� ���հ��� ����ϼ���. 
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("���� : ");
		int kor= sc.nextInt();
		System.out.print("���� : ");
		int eng= sc.nextInt();
		System.out.print("���� : ");
		int math= sc.nextInt();
		
		int sum= kor+eng+math;
		double avg= sum/3.0;
		
		System.out.print("�հ� : " + sum);
		System.out.print("\n��� : " + avg);
		System.out.print(kor>=40 && eng>=40 && math>= 40 && avg>=60? " \n�հ�" : " \n���հ�");
		
	}
	
	public void practice8() {
		
		/*	�ǽ�����8
		 * 	�ֹι�ȣ�� �̿��Ͽ� �������� �������� �����Ͽ� ����ϼ���.
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է��ϼ��� : ");
		String info = sc.next();
		//System.out.println(info.charAt(7)==0? "����" : "����");
		System.out.println(info.charAt(7)=='2'? "����":"����");
		
	}
	
	public void practice9() {
		
		/*	�ǽ�����9
		 * 	Ű����� ���� �� ���� �Է� �޾� ���� ����(num1, num2)�� �����ϼ���.
		 * 	�׸��� �� �ٸ� ������ �Է� �޾� �� ���� num1 ���ϰų� num2 �ʰ��̸� 
		 * 	true�� ����ϰ� �ƴϸ� false�� ����ϼ���.
		 * 	(��, num1�� num2���� �۾ƾ� ��)
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("���� : ");
		int num1= sc.nextInt();
		System.out.print("���� : ");
		int num2= sc.nextInt();
		System.out.print("�Է� : ");
		int num3= sc.nextInt();
		
		System.out.println(num3>=num1||num3>num2);
		
	}
	
	public void practice10() {
		
		/*	�ǽ�����10
		 * 	3���� ���� Ű����� �Է� �޾� �Է� ���� ���� ��� ������ true, �ƴϸ� false�� ����ϼ���.
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("�Է�1 : ");
		int num1= sc.nextInt();
		System.out.print("�Է�2 : ");
		int num2= sc.nextInt();
		System.out.print("�Է�3 : ");
		int num3= sc.nextInt();

		boolean flag= (num1==num2)&&(num1==num3)&&(num2==num3);
		
		System.out.print(flag);
	
	}
	
	public void practice11() {
		
		/*	�ǽ�����11
		 * 	A, B, C ����� ������ �Է� �ް� 
		 * 	�� ����� ������ �μ�Ƽ�긦 ������ ������ ����Ͽ� ����ϰ� 
		 * 	�μ�Ƽ�� ���� �޿��� 3000���� �̻��̸� ��3000 �̻�, 
		 * 	�̸��̸� ��3000 �̸����� ����ϼ���. 
		 * 	(A ����� �μ�Ƽ��� 0.4, B ����� �μ�Ƽ��� ������, C ����� �μ�Ƽ��� 0.15)
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("A����� ���� : ");
		int salaryA = sc.nextInt();
		double finA= salaryA*1.4;
		
		System.out.print("B����� ���� : ");
		int salaryB = sc.nextInt();
		double incentiveB= salaryB*0;
		double finB= salaryB+incentiveB;
		
		System.out.print("C����� ���� : ");
		int salaryC = sc.nextInt();
		double finC= salaryC*1.15;

		
		System.out.println("A��� ����/����+a : "+salaryA+"/"+finA+ (finA>=3000 ? "\n3000�̻�" : "\n3000�̸�"));
		System.out.println("B��� ����/����+a : "+salaryB+"/"+finB+ (finB>=3000 ? "\n3000�̻�" : "\n3000�̸�"));
		System.out.println("C��� ����/����+a : "+salaryC+"/"+finC+ (finC>=3000 ? "\n3000�̻�" : "\n3000�̸�"));
	}
	
	
	
}
