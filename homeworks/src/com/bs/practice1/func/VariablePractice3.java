package com.bs.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	/*�ǽ�����3
	*	Ű����� ����, ���� ���� ���� �Ǽ������� �Է� �޾� �簢���� ������ �ѷ��� ����Ͽ� ����ϼ���
	*/
	
	public void squareInfo() {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("����: ");
		double width= sc.nextDouble();
		System.out.print("����: ");
		double height= sc.nextDouble();
		
		System.out.println("����: "+width*height);
		System.out.println("�ѷ�: "+(width+height)*2);
	}
	
	
}
