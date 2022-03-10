package com.declare;

import java.util.Scanner;	//ScannerŬ������ ���� ������, import�� �ؾ� ��. (�ֳĸ�, ���� Ŭ������ ScannerŬ������ �Ҽӵ� ��Ű���� �����ϱ� ��������)

public class InputOutputTest {

	public static void main(String[] args) {
		//����Ϳ� ������ "���"�ϱ�(2����- ����o/x)
		System.out.print(""); //"����"���� �����͸� �����
		System.out.print("�ȳ�");
		System.out.print(" �׽�Ʈ");
		//���-> �ȳ� �׽�Ʈ
		System.out.println(); //"����"�� �� �����Ͱ� ��µ�
		System.out.println("�ȳ�");
		System.out.println(" �׽�Ʈ");
		//���-> �ȳ�
		//      �׽�Ʈ
		
		//System.out.printf(): ������ �̸� ���صΰ�, ���� ���ͷ��� �ڷ����� �̸� ���ص�
		//%s�� String
		//%d�� ����
		//%f�� �Ǽ�
		System.out.printf("���� �̸��� %s ���̴� %d �����Դ� %f�Դϴ�.", "������", 19, 65.5);
		
		System.out.println(); //����: �� ���� ��� ȿ��!
//		System.out.println("�̸� ���� ����");
//		System.out.println("������ 19 ����");
//		System.out.println("��Ȳ 20 ����");
		
		//printf�� ����ϸ�, ���ڰ� ������ �� ����.
		System.out.printf("%-2s %2d %s\n", "������", 19, "����");	 //(������ ����)%3s ������ 3��ŭ Ȯ���ϰ� String�� ���� �־��
																 //(���� ����)%-2s
		System.out.printf("%-3s %2d %s", "��Ȳ", 20, "����");
		
		System.out.println();
		double dnum= 3.1456465454;
		System.out.println(dnum);
		System.out.printf("%.2f", dnum); //".2f"�Ҽ��� �� °�ڸ������� �����
		System.out.println();
		System.out.printf("%.1f", dnum); //".1f"�Ҽ��� ù °�ڸ������� �����
		
		System.out.println();
		//�� ���ڿ��� "escape��" �ۼ��ϱ�
		//1. tab -> ������ ��ŭ�� ������ �� �� �ִ�. 
		//String temp="�ȳ�               ";
		String temp="�ȳ�\t�ϼ���";
		System.out.println(temp);
		
		//2. \n -> ����
		temp= "�ȳ�\n���� �������̾�.";
		System.out.println(temp);

		//3. Ư�����ڸ� ���� ���� ��
		//temp= "c\:Users\Goodee"; //���� �߻�! ���ڿ� Ү �������ô� 'escape'�� �ǹ��ϱ� ������
								   //escape�� ������ ��(\n, \t ��) ���� �ʾƼ� ������ �߻��� ����. 
		temp= "c\\:Users\\Goodee";
		System.out.println(temp); //(�ذ��)�������ø� �ϳ� �� ���ָ� ��
		temp= "�״� \"�ȳ�\", �̶�� ���ߴ�!"; //StringҮ �ֵ���ǥ�� ���� �Ͱŵ�... �ֵ���ǥ �տ� �����ø� �־��ش�. 
		System.out.println(temp);
		
		//�� Ű���忡�� �Է��� �� ��������
		/*	1. ScannerŬ���� import�ϱ� (�ֳĸ�, ScannerŬ������ util��Ű���� �ҼӵǾ� �����Ƿ�)
		 * 		- import java.util.Scanner;
		 * 	2. ScannerŬ���� �����ؼ�, ������ �ֱ�
		 * 		- Scanner sc= new Scanner(System.in); 
		 */
			Scanner sc= new Scanner(System.in);	//new�����ڸ� Ȱ����, ��ü�� ������
			
		/*	3. ���ϴ� ������ �Է¹ޱ�
		 * 	3-1. ScannerŬ����> Ŭ������ �޼ҵ�(���)�� ����!
		 * 		- ����: sc.nextInt();
		 * 		- �Ǽ�: sc.nextDouble();
		 * 		- ���ڿ�: sc.next() �Ǵ� sc.nextLine();
		 */
		 
//			//sc.nextInt(); //������(����)�� �޾ƿ��� �ڵ�: ���⿡ ����ڰ� �Է��� ������ �Էµ� �ž�~
//			System.out.println("����� ���̸� �Է��ϼ���: ");
//			int input= sc.nextInt();	//Ű����κ��� �Է¹޴� ����~ ������ �����, ������ �־��ָ� ��
//			System.out.println("����� ����: "+input);
//			
//			System.out.println("����� Ű��?");
//			double height= sc.nextDouble();
//			System.out.println("����� Ű�� "+height+"cm�Դϴ�.");
			
			//���ڿ� �ޱ�
			//sc.next();	//������ ��������~ ���� �տ� �ִ� ���ڿ��� ������
			//sc.nextLine();	//������ ��������~ ���� ���� ���ڿ��� ������
			System.out.println("����� �̸���? ");
			String name=sc.next();					//�� �� ��
//			System.out.println("����� �̸��� "+name);	//��
			
			System.out.println("����� �̸��� �� ���� �� �˷��ּ���: ");
			sc.nextLine(); //�Է� ���۸� �������!
			String name2=sc.nextLine();	//�� �ڵ尡 ������ ����, next(), nextInt()���� ������... nextLine()���� ���� �Է¹��� �� ����. 
										//�׷���... ����, �Է� ���۸� ����ִ� �ڵ�sc.nextLine();�� �־�ξ���! 
			System.out.println(name2);	//
			
			//����. 2 
			//���ο� ������Ʈ test2�� �����
			//com.test2��Ű���� VariableŬ������ �����ϰ�
			//����ڿ��� �̸�, ����, Ű, ��ȭ��ȣ, �ּҸ� �Է¹ް�
			//����ϴ� ��� �����ϱ�!

		}

	}
