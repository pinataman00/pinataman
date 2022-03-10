package com.declare;

public class StringTest {

	public static void main(String[]args) {
		
		/*	<String �ڷ��� Ȱ���ϱ�>
		 * 	String�� "Ŭ����/��ü"��
		 * 	�׷���, "�⺻ �ڷ���"ó�� ����� �� ���� (���� Ŭ������ �̿��϶��... ��ü�� �����ϰ�... �Ϸ��� ������ �ʿ���)
		 */
		
		//�̸� �����ϱ�
		String name= "������"; //�⺻ �ڷ���ó�� �����
		
		//����, String�� Ŭ����!
		//���Ϲ������� "Ŭ����"�� ����� �� �ʿ��� �ڵ� �ۼ�
		String nameObject= new String("������");
		
		System.out.println(name);
		System.out.println(nameObject);
		
		//	���ڿ��� "+����"�� ������� ��, "���ڿ��� ��ġ��" ���� ������ ������
		
		//int���� ���ϱ� ����
		int su= 20+20;
		System.out.println(su);
		
		//���ڿ��� ���ϱ� ����
		String temp="20"+"20";
		System.out.println(temp); //��� ���ڿ� �ΰ��� ������ ����� ��µ�
		temp= 10+"30";	
		//�� �׳� ����10(����)�� int�� �ٵ�, ������ �߻����� ����(type mismatch������ �� ��). ��?
		//���ڿ��� ��������, '���ϱ�'�ϸ�~ ������ '����'������ �����
		System.out.println(temp);
		temp= 10+20+"30";//3030�� ��µ�. 
		//int(����)+int(����)+String=> "int+int"�� ���� �����ϰ�, �ڿ� ���ڿ��� ����
		//�� ���ϱ��, ���׿���. �׸��� �ڵ�� ���ʿ��� ���������� �帧. 
		temp= "30"+10+20;
		System.out.println(temp); //301020�� ��µ�
		//��ȣ�� Ȱ���ϸ�, ������ �켱 ������ �ٲ� �� �ִ�. 
		temp= "30"+(10+40); //3030�� ��µ�
		System.out.println(temp);
		
		//���̿� ������ ����ϴ� ���α׷� �ۼ��ϱ�
		
		int age=19;
		char gender= 'M';
		
		System.out.println("����� ���̴�: "+age+" ������: "+gender);
		
		//���� �̿� ���
		String msg="����� ���̴� "+age+" ������ "+gender; //������, String�� ������ �Ǹ� ��� ���ڿ��� �Ǵϱ�, �̷� ���·ε� ���� �ʱ�ȭ ������
		System.out.println(msg);
		//System.out.println(age+gender);
	
		//String�� Ŭ����!
		//Ŭ������ ������ ���(�޼ҵ�)�� �����ϰ� ����
		/*	1. String�� �����ϰ� �ִ�, "���ڿ��� ����(���� ����)"�� �� �� ���� -> String.length()�޼ҵ带 �̿�����
		 * 	����٣.length()
		 */
		
			String lengthTest= "������ ���ְ�";
			System.out.println(lengthTest.length());	//lengthTest�� ����� ���ڿ��� ������ �����. 7�� ��µ�
			//��ǻ�ʹ� 0�� 1�� �ȴ�. ���ڸ� ���ڷ� mapping��Ŵ-> ex. �ƽ�Ű �ڵ�
			//���� ���� ������ ���ڷ� ó���Ǿ�, ���� ������ 7�� ��µ� ����
			int size= lengthTest.length(); //���̴� '����'�ϱ�, int�� ������ ������ �� ����
			System.out.println(size);
			
		 /*	2. String�� �����ϰ� �ִ� ���ڿ���, "���� ����"�� Ȯ���� �� ����
		 * 	����٣.charAt(����); //���ڴ� "index��ȣ", 0���� ������!
		 */
			System.out.println(lengthTest.charAt(0));
			System.out.println(lengthTest.charAt(1));
			//lengthTest���� "��" ����ϱ�
			System.out.println(lengthTest.charAt(4));
		
			//"���ͷ�"�� �̿��ؼ���, ���(�޼ҵ�)Ȱ�� ������
			size= "�����ī����".length();
			System.out.println(size);
		
			System.out.println("�����ī����".charAt(4));

			//�ǽ� ����(1)
			//������ �̸�, ����, ����(�� ���� M/F), �ּ�, Ű, ������, ��ȥ ����
			//~�� �����ϴ� ������ ����� -> ���� �����ϰ�-> �Ʒ��� ���� ����ϱ�
			//���� �̸��� 000�̰� ���̴� 00�� 0(����)�Դϴ�. ��� ���� 000�̰� Ű�� 000cm �����Դ� 00kg ��ȥ�� false/true�Դϴ�. 
			
			//Ǯ��. ����٣ ����ϱ�> ������ � �����͸� �ǹ��ϴ��� ������ �� �ֵ���!
			
			String myName= "�赵��";
			int myAge= 32;
			char myGender= 'F';
			String myAddress= "���ν�";
			int myHeight= 160;
			int myWeight= 50;
			boolean maritalStatus= false;
			
			//���ڿ��� �������� �����ϸ�, ���ڿ��� �ȴٴ� ����� �������!
			System.out.println("���� �̸��� "+myName+"�̰�, "+"���̴� "+myAge+"�Դϴ�. "
					+ "��� ���� "+myAddress+"�̰� Ű�� "+myHeight+"cm �����Դ� "+myWeight+"kg ��ȥ�� "+maritalStatus+"�Դϴ�.");
			
			//�ǽ� ����(2)
			//2-1. ��� ������ ���� ���� ����ϱ�
			//2-2. ����� ������ ù ��°, �� ��° ���� ����ϱ�
			
			//Ǯ��. 1 (������ ���� ����)
			String myInfo= "���� �̸��� "+myName+"�̰�, "+"���̴� "+myAge+"�Դϴ�. "
					+ "��� ���� "+myAddress+"�̰� Ű�� "+myHeight+"cm �����Դ� "+myWeight+"kg ��ȥ�� "+maritalStatus+"�Դϴ�.";
			
			System.out.println(myInfo);
			System.out.println(myInfo.length());
			System.out.println("ù��° ����: '"+myInfo.charAt(0)+"' �ι�° ����: '"+myInfo.charAt(1)+"'");
			System.out.println(myInfo.charAt(0)+myInfo.charAt(1)); //���ڰ� ����. ��? �� ���� ���ڴ� ���������� '�ڵ�(���� ����)'��. ���� �ڵ� ���� ������ ����
			System.out.println(""+myInfo.charAt(0)+myInfo.charAt(1)); //
			
			//Ǯ��. 2
//			System.out.println(("���� �̸��� "+myName+"�̰�, "+"���̴� "+myAge+"�Դϴ�. "
//					+ "��� ���� "+myAddress+"�̰� Ű�� "+myHeight+"cm �����Դ� "+myWeight+"kg ��ȥ�� "+maritalStatus+"�Դϴ�.").length());	
//			System.out.println("ù ��° ���� : "+("���� �̸��� "+myName+"�̰�, "+"���̴� "+myAge+"�Դϴ�. "
//					+ "��� ���� "+myAddress+"�̰� Ű�� "+myHeight+"cm �����Դ� "+myWeight+"kg ��ȥ�� "+maritalStatus+"�Դϴ�.").charAt(0));
//			System.out.println("�� ��° ���� : "+("���� �̸��� "+myName+"�̰�, "+"���̴� "+myAge+"�Դϴ�. "
//					+ "��� ���� "+myAddress+"�̰� Ű�� "+myHeight+"cm �����Դ� "+myWeight+"kg ��ȥ�� "+maritalStatus+"�Դϴ�.").charAt(1));
//		
	
			//(���)�� Ǯ��1�� �ϴ� �� �� �����ϴ�. ������ �ϳ� �����, �ڵ尡 ������.
			
			
			
			
			
		}

	}
