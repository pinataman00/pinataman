package com.bs.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {

	/*
	 * 	�ǽ�����1
	 * 	�̸�, ����, ����, Ű�� ����ڿ��� �Է� �޾� ������ ���� ������ ��� ����ϼ���.
	 */

	public void info() {
		Scanner sc= new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���: ");
		String name= sc.next();
		System.out.print("������ �Է��ϼ���(����/����): ");
		String gender= sc.next();
		System.out.print("���̸� �Է��ϼ���: ");
		int age= sc.nextInt();
		System.out.print("Ű�� �Է��ϼ���(cm): ");
		double height= sc.nextDouble();
		
		System.out.println("Ű "+height+"cm�� "+age+"�� "+gender+" "+name+"�� �ݰ����ϴ�^^");
	}
}
