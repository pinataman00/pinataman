package com.bs.practice1.func;

import java.util.Scanner;


public class VariablePractice2 {

	/*	�ǽ�����2
	 * 	Ű����� ���� �� ���� �Է� �޾� �� ���� ��, ��, ��, �������� ���� ����ϼ���
	 * 
	 */
	
	public void calculator() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("ù ��° ����: ");
		int su= sc.nextInt();
		System.out.print("�� ��° ����: ");
		int su2= sc.nextInt();
		
		System.out.println("���ϱ� ��� : " + (su + su2));	//�켱 ���� ����!
		System.out.println("���� ��� : " + (su - su2));
		System.out.println("���ϱ� ��� : " + su * su2);
		System.out.println("������ ��� : " + su / su2);

	}

}
