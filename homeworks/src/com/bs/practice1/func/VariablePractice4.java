package com.bs.practice1.func;
import java.util.Scanner;
public class VariablePractice4 {

	/*	�ǽ�����4
	 * 	���� ���ڿ� ���� Ű����� �Է� �޾� ���ڿ��� �տ��� �� ���� ����ϼ���.
	 */
	
	public void extract() {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���: ");
		String input= sc.next();
		
		System.out.println("ù ��° ����: "+input.charAt(0));
		System.out.println("�� ��° ����: "+input.charAt(1));
		System.out.println("�� ��° ����: "+input.charAt(2));
		
	}
	
	
}
