package com.declare;

import java.util.Iterator;

public class OverFlowTest {

	
	
	
	public static void main(String[]args) {
	
		//������ ���� �÷ο�Overflow
		byte bnum= 120;
		for (int i=0; i<300; i++) {
			System.out.println(bnum++);
		} //����(for��): �ش� �ڵ带 300ȸ �ݺ��϶�� �ǹ�
		//127�̻��� byte�� ǥ���� �� ����, ���� ����� ���� 127 ������ -128�� ����. 
		//����ε� ���� ����� �� ���� ���, overflow�� �߻��� �� �ƴ��� Ȯ���� ��!
	
	
	int inum= 120;
	for (int i=0; i<300; i++) {
		System.out.println(inum++);
	} //����(for��): �ش� �ڵ带 300ȸ �ݺ��϶�� �ǹ�
	//127�̻��� byte�� ǥ���� �� ����, ���� ����� ���� 127 ������ -128�� ����. 
	//�׷��� �ڷ����� int�� �ٲ�!
}

	
	
	
}
