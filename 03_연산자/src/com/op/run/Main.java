package com.op.run;
//main�޼ҵ尡 �ִ� Ŭ����

import com.op.controller.OperatorController;
//������ ��Ű���� ����, Ŭ����(Ү�޼ҵ带 �̿��ϰ� ���� ��)

public class Main {
	
	//������ ���ø����̼��� �����ϴ� start point(������)
	public static void main(String[]args) {
		//���α׷��� �۵��� �� �ʿ��� ���α׷����� ȣ����, �̿��� ����
		
		//OperatorController Ŭ������, �޼ҵ�singleOp�� �����Ű�� ����. ���?

		//1. (�ҷ������� Ŭ������ ���� Ŭ������ �Ҽӵ� ��Ű���� �������� Ȯ����) -> import
		//2. new�����ڸ� �̿��� �����Ѵ� -> ���ٿ����� '.', �� �̿��� �޼ҵ带 ��������
		//	 -> newŬ����٣().�޼ҵ�٣();
		//new OperatorController().singleOp();	//���(�޼ҵ�) ȣ��!
		//new OperatorController().calculatorOp();
		//new OperatorController().compareOp();
		//new OperatorController().logicalOp();
		//new OperatorController().complexOp();
		//new OperatorController().thirdOp();
		new OperatorController().bitOp();
		
	}
}
