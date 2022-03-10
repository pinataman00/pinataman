package com.op.controller;

import java.util.Iterator;
import java.util.Scanner;

public class OperatorController {
	//	�ֿ� ����� ������ Ŭ����
	

	public void singleOp() {
		/*
		 * 	<���� ������>
		 * 1. ���� ������ : "boolean��" �����͸� "����"��Ű�� ���� (true->false || false-> true)
		 * 			   : (ǥ����) !����٣
		 */
	
	System.out.println("====����������====");
	boolean flag= true;
	System.out.println("flag: "+flag);
	boolean flag2= !flag;	//flag�� "����"���� flag2�� ������ 
	System.out.println("flag2: "+flag2);
	flag2= !!flag; //true->false->true
	System.out.println("flag2: "+flag2);
	
	//-------------------------------------------------------------------------------------------------------
	//�� (����)���������� ���������ڸ� ���� ���
	String name= "������";
	//�̸��� '������', �� "�ƴϸ�" -> ���� ����
	System.out.println(!name.equals("������"));	//"'equals�Ұ�ȣ Ү �����Ϳ�~ name����Ү�����Ͱ�', ���� �ʴٸ�~", �̶�� �ǹ�
	//name������ '��', �� ���ԵǾ� ���� "������"
	System.out.println(!name.contains("��"));
	if(!name.equals("������")) {
		//if����-> �̸��� "������"�� �ƴ� ���, ~������ ó���϶�
	}
	//-------------------------------------------------------------------------------------------------------
	
	
	/* 	
	 * 2. [����/����] ������ : 
	 * 
	 * (����)
	 * ++����٣: ���� ���� Ү ���� +1�ϰ�, �ش� ������� ���� ������ ����
	 * 		 : ����٣=����٣+1;
	 * --����٣: ���� ���� Ү ���� -1�ϰ�, �ش� ������� ���� ������ ����
	 * 		 : ����٣=����٣-1;
	 * 
	 * (�뵵)
	 * 1. �ݺ��� ó��
	 * 2. Ƚ���� �� �� counting (1�� �����ϴ� ���̴ϱ�)
	 * 
	 */
	
	int su= 10;
	++su;	//su=su+1;
	++su;	//1�� �� �� �� ������Ŵ
	System.out.println("su= "+su); //10+1+1 �� �����12�� �ٽ�, ����su�� ������
	--su;
	System.out.println("su= "+su); //11
	
	int count=0;
	for (int i=0;i<10;i++) {	//0���� 10���� ������ �ϳ��� ������Ű�� ���� ��~ ++�� ����.
		
		if (i%2==0) count++;	//0~10 �߿��� ¦���� ������ ���� ��, count���� �ö󰡰���
	}
	
	/*	[����/����]����������
	 * 	�� ���� : ���� �� (����/����) ������ �����
	 * 	�� ���� : ���� ���� (����/����) ������ �����
	 */
	
	su++;
	System.out.println("su= "+su);
	
	su--;
	System.out.println("su= "+su); //11
	
	//�ܵ� �����, ����/���� ������ ���̴� ����
	//�� �⿬���ڿ� ���� ��� ��, ���� �߻���
	int su2= 0;
	su=10;
	su2= ++su;	//[���� ����] ��������-> ���� ����(=)
	System.out.println("su2= "+su2+", su= "+su); //11
	su=10;
	su2= su++;	//[���� ����] ���Կ���(=)-> ���� ���� 
				// -> su2�� su�� �����͸� �ְ� -> su�� 1������Ŵ
	System.out.println("su2= "+su2+", su= "+su); //11(x) 10(o)
	su2= 100;
	
	su2= su+++100;	//���������� �� �������� ó���Ѵ�
					//su+100�� ������� su2�� �ִ´�. -> ����, su�� 1 ������Ų��.
	System.out.println(su2);
	
	} //singleOp�޼ҵ� �ݴ� �߰�ȣ
	
	public void calculatorOp() {
		/*
		 * <��� ������>
		 * (����) + - / * %
		 */
		
		int su=10;
		int su2=20;
		
		//�� ���ϱ� ���� (�� ���ڿ�����: ���� ����)
		int result= su+su2;
		System.out.println("su+su2= "+result);
		
		//�� ���� ���� (�� ���ڿ�����: ���� ����)
		result= su-su2;
		System.out.println("su-su2= "+result);
		
		result= su+20;
		System.out.println("����+���ͷ�= "+result);
		
		result= su+100+su2-200-6;
		System.out.println(result);
		
		String strSu= "20";
		//result=strSu+su2;	//String�� int�� ������ �� ����. 
		
		//�� ���ϱ� ����
		result= su*su2;
		System.out.println("���ϱ�= "+result);
		
		//�� ������ ���� -> ��������(�Ҽ���)�� ���� Ȯ���� ũ�� ������... double������ ����� �� ����. 
		double result2= (double)su/su2;	//double(�Ǽ�, 8byte)�� int(����, 4byte)�� �ٲ� �� �����Ƿ�... 
										//double���� ������ �� �ִ� ����, result2�� ���� ����
		System.out.println("������= "+result2);
	
	
		result2= su/3.0;
		
		System.out.println("������: "+result2);
	
		/*	�� ������ ���� -> %
		 * 	-> ¦��, Ȧ��, ���, ���... ���� ���� �� �ִ�. 
		 * 	�� ���α׷��ֿ� �������� ���ϴ� ������ �ʿ��ұ�?
		 * 	�ڵ��� ����� ������ �ֱ� ��������! 
		 * 	(��)���� ��Ģ�� �ľ��ϸ� ��!
		 * (ex. n%2=0�̸� ¦��, n%2=1�̸� Ȧ��)
		 * (ex. n�� 3�� ��� -> n%3=0)
		 * (ex. �Ҽ�(1�� �ڱ� �ڽŸ��� ����� ��)
		 */
		
		result= su%3; //������, �ϱ� ����� ������ ��������
		
		System.out.println("������ : "+result);
		
		
		
	}
	
	
	


	public void compareOp() {
		
		/*	<�� ����>
		 * 	(���)boolean��: true / false
		 * 	1. ����񱳿���: "������ �� ��(�� ����)"�� �������� ���ϴ� ����
		 * 	�����(==)��, ������ �ִ� �� ��ü�� ���� (���� char�� �񱳿����� ������ ���� (ex. A�� 65))
		 */
		
		System.out.println("======= �񱳿��� =======");
		//���� ���Ͽ��� ��
		int num=13;
		int num2= 19;
		int num3= 13;
		
		//�� ����� : ==
		System.out.println(num==num2);	//false
		System.out.println(num==num3);	//true
		
		//�� ��ġ���� �ʴ� ���� �� : !=
		System.out.println(num!=num2);	//true		(��� �ڵ�� �ݴ��� boolean���� �����)
		System.out.println(num!=num3);	//false
		
		//int���Ӹ� �ƴ϶�, double���� �� ����!
		double dnum= 180.5;
		double dnum1= 190.5;
		double dnum2= 180.5;
		System.out.println(dnum==dnum1);
		System.out.println(dnum==dnum2);
		
		//���� ���� �� > char ���ϱ�
		System.out.println("====== char �� ======"); //�����ϴ�! �ֳĸ�, ����񱳴� ������ �ִ� �� ��ü�� ���ϱ� ����!
		char ch= 'A';
		char ch1= 'Z';
		char ch2= 'A';
		char ch3= 'a';
		
		
		System.out.println(ch==ch1); //false
		System.out.println(ch==ch2); //true
		System.out.println(ch==ch3); //false (�ƽ�Ű�ڵ�, �빮��A�� �ҹ���a�� ���� �����ϱ� ������)
		
		System.out.println(ch!=ch1); //true
		System.out.println(ch!=ch2); //false
		
		//���ڿ� �� > String ���ϱ�
		System.out.println("====== String �� ======");
		String str= "������";
		String str1= "������";
		String str2= "Ȳ����";
		
		String str3= new String("������"); 
		
		//�� String�� Class��. Class�� ���ϴ� ����� �ٸ� �ڷ������� �޶�. 
		System.out.println(str==str2);	//false
		System.out.println(str==str1);	//true
		
		System.out.println(str==str3);  //true...�� �ƴ϶�, false! ��?
										//�����, �ϴϱ� false�� ������?
		
		Scanner sc= new Scanner(System.in);
		System.out.println("�̸� : ");
		String name= sc.next();
		System.out.println(str+" : "+name); //���� �ȿ� �����Ͱ� �� ������ Ȯ��
		System.out.println("����� Ȱ���� ���ڿ� �� : "+str==name);
		
		//�� �Ȱ���, name�� '������'�� �־~ str(������)���� �ٸ��ٴ� ����� ��ȯ�ɱ�?
		//�� "���� ��(==)"�� ������ �ִ� "��" ��ü�� ���ϱ� �����̾�. 
		//���ڿ�String�� Class. "������ �ڷ���"�ε�, ��ġ "�⺻ �ڷ���"�ε� �� �� �ְ� ����� �� ����.
		//(����) Class�� �����͸� ������� ����, ==���� ���� �� ����!!!!!!!!
		//(���) Class��~ equals()��� ����� �̿��Ѵ�. 
		
		//(����)
		//Class�� HeapҮ ������ ������ Ȯ���� �̿��ϰ� �Ǿ� ����. 
		//����, Class�̿� ��, "new ������"�� �̿��ϴ� ����.  
		//(new�������� ��� : heap�� ������ Ȯ������)
		//�⺻�� �ڷ����� stack������ �����͸� �״�� ������ (int su=10; �� ���, 10�̶�� ���� �״�� �����صδ� ����)
		//������ �ڷ�����, new�����ڸ� �̿��ؼ�-> heap�� ������ Ȯ���ϰ�-> �ش� ������ ������(ex. "Ȳ����")�� �����ϰ�...
		//			  -> �ش� ������ "�ּ�"�� stack�� �����ص�. �� �̶�, �ּҴ� ����!!! �ߺ����� ����!	��
		//			     ��, ���ڿ� ���� name1, name2�� �Ȱ��� "Ȳ����"�� �Է��ߴ���,
		//				 heap�� �ּҴ� �ݵ�� �����ϱ� ������, stack������ ���� "�ٸ� �ּҰ�"�� �����!
		//			    (���) ����񱳴� '��'�� ���ϴ� ���̹Ƿ�... 
		//				String�� ���� ���, "���� '�ٸ�' �ּҰ�"�� ���ϰ� �Ǳ� ������, �ݵ�� false�� ��ȯ��.
		//				����, equals()�޼ҵ带 Ȱ���� ���ؾ� �Ѵ�!
		//				(����) ����� != ���Ϻ�
		//				�� ����� : �ܼ��� �� ��ü�� ����	 (0111 != 0155) (���� �� 0111�� heap������ �ּҰ�) 
		//				�� ���Ϻ� : �������� �����͸� ���� (Ȳ���� = Ȳ����)	(���� �� Ȳ������ heap������ ����� �������� ������!)
		//				(�����ε�) ���߿�, Override�� ������ �� �ٽ� ��� ����!
		
		
		//�� equals()�޼ҵ� ����
		// "���ͷ�".equals("�� ���ڿ�");
		// ���ڿ�����٣.equals("�� ���ڿ�");
		// ���ڿ�����٣.equals(�� ��� ���ڿ�����٣);
		// "���ͷ�".equals(�� ��� ���ڿ�����٣);
		
		System.out.println("equals()�޼ҵ� Ȱ���� ���ڿ� �� : "+str.equals(name));
		System.out.println("equals()�޼ҵ� Ȱ���� ���ڿ� �� : "+str.equals("Ȳ����"));
		
		//�� equals()�� �������� : ����������(!)�� �̿��ϸ� ����!
		// : �� ����� ���ڿ���, Ư�� ���ڿ��� "��ġ���� ����?" ���� ���� ��
		System.out.println(!str.equals(name)); // ��ġ���� ���� ���, true�� ����!
		
		
		
		/*	<��� ��>
		 *  ���� ���� ���� ��Һ�
		 */
		 
		int su= 100;
		int su2= 200;
		int su3= 100;
		System.out.println("=====���� ��Һ��ϱ�=====");
		System.out.println(su>su2);
		System.out.println(su<su2);
		System.out.println(su<su3);
		System.out.println(su<=su3);
		double dsu= 180.5;
		double dsu1=190.5;
		double dsu2=180.5;
		System.out.println(dsu<dsu2);
		System.out.println(dsu<dsu1);
		System.out.println(dsu<=dsu2);
		
		//����(char) ��Һ��ϱ�-> ����! (���������δ� '����'�� ����Ǳ� ������)
		System.out.println("=====���� ��Һ��ϱ�=====");
		char ch4= 'A';
		char ch5= 'Z';
		char ch6= 'A';
		System.out.println(ch4<ch5);
		System.out.println(ch4<ch6);
		System.out.println('A'<='C'); //���ڷ� ��Һ� ����!
		
		//���ڿ�(String) ��Һ��ϱ�-> �Ұ���!
		//System.out.println(str<str2);	//���� �߻�! "���� ��(equals.())"�� ������!
		
		String suStr= "20";
		String suStr2="30";
		//System.out.println(suStr<suStr); //���� �߻�! -> �ֵ���ǥ�� ���� ����, ���ڸ� �������� '����'�� �ν���!
		
	}
	
	public void logicalOp() {
		
		/*	<�� ����>
		 * 	(����) ���� and || or�� ������ �����~ true||false�� ������
		 * 	&&(and): 2�� ���� "���" ture�� ��, true�� ������
		 *  ||(or) : 2�� �� �� "�ϳ���" true����, true�� ������
		 */
		 
		// ID�� admin�̰� �н����尡 1234�̸� true��ȯ�ϴ� �� ����
		
		String id= "admin";
		String password= "1234";
		
		System.out.println(id.equals("admin")&&password.equals("5555")); //password�� false�̹Ƿ�~ false�� ��ȯ��!
		
		//	or����
		//	�Է¹��� ���� '��'�̳� '��'�̸�, true�� ��ȯ
		Scanner sc=new Scanner(System.in);
		
//		System.out.println("����(��/��)�� �Է����ּ���: ");
//		String gender= sc.next();
//		
//		System.out.println(gender.equals("��")||gender.equals("��"));
//		
//		//���������� ������ ǥ���� �� �ִ�. 
//		//	�Է¹��� ����, 10~20������ ���̸�, true
//		
//		System.out.println("���ڸ� �Է��ϼ���: ");
//		int input=sc.nextInt();
//		
//		System.out.println("�Է��� ���ڴ�, 10~20������ ���ϱ��? :"+(input>=10&&input<=20));
		
		//����. 
		//���̸� �Է¹޾�-> ����л��� ��� true, �ƴ� ��� false�� ����ϴ� ��� ����
		
//		System.out.println("���̸� �Է��ϼ���: ");
//		int age= sc.nextInt();
//		System.out.println("����� ����л��Դϱ�?: "+(age>=17&&age<=19));
		
		/*	����.
		 * 	���̿� ������ �Է¹޾�,
		 * 	���̰� 20���̰�, ������ ������ ��� true��ȯ/ �ƴϸ� false��ȯ
		 */
		
//		System.out.println("���̸� �Է��ϼ���: ");
//		int age2= sc.nextInt();
//
//		System.out.println("������ �Է��ϼ���: (����/����)");
//		String gender2= sc.next();
//		
//		System.out.println(age2>=20&&age2<=29&&gender2.equals("����"));
		
		//��� ���� �����̳� ��õ�� ���, true �ƴϸ� false ���
		
//		System.out.println("�����ϴ� ������ �̸��� �Է��ϼ���(ex. ����): ");
//		
//		String city= sc.next();
//		System.out.println("����� ����� �Ǵ� ��õ�ÿ� ���� ���Դϴ�: "+(city.equals("����")||city.equals("��õ")));
		
		//��� ���� ���� �Ǵ� ��õ�̸鼭, ���̰� 30���� ��� true
		
		System.out.println("�����ϴ� ������ �̸��� �Է��ϼ���(ex. ����): ");
		String city2= sc.next();
		int age3= sc.nextInt();
		
		//System.out.println(city2.equals("����")||city2.equals("��õ")&&age3>=30&&age3<=39); //Ʋ�Ⱦ�! ���� 29������ true�� �����ŵ�
		//System.out.println((city2.equals("����")||city2.equals("��õ"))&&age3>=30&&age3<=39); //or�κ��� ���� �����ϵ��� �Ұ�ȣ�� �����!
		
		//������ Ǯ��
		boolean flag= city2.equals("����")||city2.equals("��õ")
					  &&age3>29&&age3<40; //Ʋ�Ⱦ�! ���� 29������ true�� �����ŵ�
					  
		// TODO �� �켱���� && -> ||
		// ���� ���� Ǯ��
		// 1.	��õ�ΰ�?f && 29�� �Ѱ峪?f -> "f"
		// 2.	f && 40�� �̸��ΰ�?t -> "f"
		// 3.	�����ΰ�?t || f -> "t"
					  
		//�׷���, �켱 ������ �ٲ㺸���� "�Ұ�ȣ"�� ����߾�
		boolean flag2= (city2.equals("����")||city2.equals("��õ"))
					  &&age3>29&&age3<40;			  
					  
		System.out.println(flag2);
	}
	
	public void complexOp() {
		
		/*	<���� ���Կ�����>
		 * 	(�뵵) �ַ� ���� ����or���� �� �����
		 */
		
//		int account= 100;
//		
//		//account= account+10;
//		//System.out.println(account);
//		account+=10;
//		System.out.println("���� �ܾ�: "+account);
//		account-=10;
//		System.out.println("���� �ܾ�: "+account);
		
		
		/*	����.
		 * 	����, ����, ����, �ڵ� ������ �Է¹ް�
		 * 	�հ踦 ������ִ� ����� �����ϼ���. 
		 */
		
		//int math,eng,kor,coding;	//������ total�� ���� �Ŵϱ�! ���� ������ ������ ������ �ʾƵ� �ǰ���!
									//��, ���� �� ������ ������ ����� �� ����. 
//		int total=0;
//		
		Scanner sc= new Scanner(System.in);
//		System.out.println("���� ������ �Է��ϼ���: ");
//		
//		total+=sc.nextInt();	//������ total�� ���� �Ŵϱ�! ���� ������ ������ ���� �ʾƵ� ��
//		//math= sc.nextInt();
//		//total+=math; //total= total+math;
//		System.out.println("���� ������ �Է��ϼ���: ");
//		//int eng= sc.nextInt();
//		total+=sc.nextInt();
//		System.out.println("���� ������ �Է��ϼ���: ");
//		//int kor= sc.nextInt();
//		total+=sc.nextInt();
//		System.out.println("�ڵ� ������ �Է��ϼ���: ");
//		//int coding= sc.nextInt();
//		total+=sc.nextInt();
//		
//		//int total=math+eng+kor+coding; //���� �̰� ���Կ����ڸ� ������ Ǯ�̰� �ƴ��ݴ�!
//
//		System.out.println("���� �Ѱ�= "+total);
		
		/*	����.
		 * 	�ʱⰪ 50000���� ������ �����ϰ�,
		 * ���� 4���� �Է¹޾�, �Է¹��� ����ŭ �ʱⰪ���� �����Ͽ�
		 * �ܾ��� ����ϴ� ��� �����ϱ�
		 * 
		 */
		
		int won= 50000;
		System.out.println("�ݾ��� 4ȸ �Է��ϼ���: ");
		won-=sc.nextInt();
		won-=sc.nextInt();
		won-=sc.nextInt();
		won-=sc.nextInt();
		System.out.println("�ܾ�= "+won);
		
		for(int i=0;i<4;i++) {
			System.out.println("�ݾ��� �Է��ϼ���: ");
			won-=sc.nextInt();
		}
		System.out.println("�ܾ�= "+won);
		
		//�������� > ���ڿ��� �����Ѱ�?
		// String msg += "����"; || String msg-= "����"; 
		
		// ���ڿ��� ���� �÷��� ������ ����! -> String msg= msg+"����";
		// ���ڿ��� ���� ���̳ʽ� ������ �Ұ���! -> String msg= msg-"����";
		// (���) ���ڿ��� ���������� ������ų �� ������
		
		//(��� ����) �����Client���� ���� ���� 4�� �Է¹ް�, �Է¹��� ���� �� ���� ����ϱ�
		
		String msg = ""; //���� ���� �� �� ���� ���� (���� ������ �����, �ݵ�� �ʱ�ȭ����� �ϱ� ������)
		
		sc.nextLine();	//������ sc.next()�� �Է� �޾ƿ����Ƿ�... �Է� ���۸� ��������!
		System.out.print("�Է� : ");
		msg += sc.nextLine();
		System.out.print("�Է� : ");
		msg += sc.nextLine();
		System.out.print("�Է� : ");
		msg += sc.nextLine();
		System.out.print("�Է� : ");
		msg += sc.nextLine();
		System.out.println("�Է� �� : "+msg);
		
		/*	������ ���ڿ� ����ó���ϱ�
		 * 	������ ���� ��
		 */
		
		String content = "";
		content += "<html>";
		content += "<head>";
		content+= "<title>���� ������</title>";
		content+= "</head>";
		content+= "<body>";
		content+= "<h1>���� ù ������</h>";
		content+= "</body>";
		content+= "</html>";
		
		//content�� ������ ���ڿ�����, ��������� �ϳ��� �������� �����ϰ� ��!
		System.out.println(content);
		
	}
	
		public void thirdOp(){
			
			/*	<���� ������>
			 * 	(����) "���ǹ�(����, ����� ��: '~ �Ѵٸ�')"�� ����� ����, ����Ǵ� ������ ������ �� �ִ� ������
			 * 	���ǹ�(true||false) ? true�� �� ����� ���� ! false�� �� ����� ����; 
			 */	
			 
			//(����) "(���ǹ�)���� su�� �ִ� ���� 10�� ��ġ�ϸ�", (true)"��� 10�̴�", (false)�ٸ��� "10�� �ƴϳ�...��"�� ����ϼ���. 

			int su= 10;
			String msg = su==10 ? "��� 10�̴�" : "10�� �ƴϳ�...��";	//���ǿ� ����, ����msg�� �� ������ �޶����� ��
			System.out.println(msg);
			
			//����ڿ��� ���� �Է¹޾� ó���ϴ� �ڵ�
			Scanner sc= new Scanner(System.in);
			System.out.println("�Է� : ");
			int su2 = sc.nextInt();
			System.out.println(su2==10 ? "��� 10�̴�" : "10�� �ƴϳ�...��");
			
			
			//(����2) ���� �� ���� �Է¹޾�, �Է¹��� ���� 100���� Ŭ ���, 
			// "��� 100���� ũ��!"
			// "���� 100���� �۳�!" ...�� ����ϱ�
			
			System.out.println("���� : ");
			int su3= sc.nextInt();
			
			String result= su3==100 ? "100�̴�!" : (su3>100 ? "��� 100���� ũ��!" : "���� 100���� �۳�!");
			System.out.println(result);
			
			/*	(����3) ����ڰ� �̼����� ���, "������ �����ϼ���"
			 * 	������ ���, "���� ������ ������" ����ϱ�
			 */
			
			System.out.print("���̸� �Է��ϼ��� : ");
			int age= sc.nextInt();
			String msg2= age<20 ? "������ �����ϼ���" : "���� ������ ������";
			System.out.println(msg2);
			
			/*	(����3) ����ڿ��� ID�� PW�� �Է¹ް�
			 * 	ID : admin
			 * 	PW : 1234
			 * 	��ġ �� "�α��� ����"
			 * 	����ġ �� "�α��� ����"
			 */
			
			System.out.print("ID : ");
			String id= sc.next();
			System.out.print("PW : ");
			String pw= sc.next();
			
			//Class�� �����͸� ����� ��, ==�� ���� �� ��
			//�ֳĸ�, Class�� ����ϱ� ���ؼ�, new�����ڸ� �̿��� heap������ ���� ������ ������ �ϰ�, 
			//stack������ ��� heap������ Ȯ���� �ּҰ��� ����� (* �ּҰ��� ���� �ߺ����� ����)
			//�׸��� ==�� ����, stack������ ����� '�ּҰ�'�� �������� ��� �� �񱳰� ����� (* �ּҰ��� ���� �ߺ����� �����Ƿ�, �� �� ������ false�� ����) 
			//����, ==�� �ƴ϶� "equals()�޼ҵ�"�� ����� *�������� �����͸� ���ؾ� ��
			String msg3= id.equals("admin")&&pw.equals("1234") ? "�α��� ����" : "�α��� ����";
			System.out.print(msg3);
			
			/*	(����4) ���� ��ī���� �л��̸�,
			 * 	"������ �ڵ� �����غ���"
			 * 	�ƴϸ�, "��������ϽǷ���?" ���
			 */	
			
			System.out.print("���� ��ī���� �л��̽Ű���?  : (Y/N) ");
			String answer = sc.next();
			String msg4= (!answer.equals("Y")&&!answer.equals("N")) ? "�߸� �Է��ϼ̽��ϴ�. Y�Ǵ� N�� �Է��ϼ���." : 
						 (answer.equals("Y") ? "������ �ڵ� �����غ���." : "��������ϽǷ���?");
			
			System.out.println(msg4);
			
			/*	���׿����� > "��ø"ó�� ���� ����!	> �׷��� ����� �������� ����. (������ ������)
			 * 	���ǹ� ? true�� �� ���� : false�� �� ����; 
			 */
			
			/*	(����5) ���� Ȯ�� ��, 
			 * 	�̼����� ��� "���� ��" ���
			 * 	������ ���
			 * 	�����̸� "�����׿�"
			 * 	�����̸� "���ڳ׿�" ���
			 * 	�Է� �� �� ���� ���� �޾Ƽ� ó��
			 */
			
			System.out.print("���� : ");
			int age2 = sc.nextInt();
			System.out.println("���� : (M/F)");
			char gender= sc.next().charAt(0); 
			//TODO sc.next()�� ���ڿ��� �޾ƿ��� �޼ҵ���. 
			//���� sc.next()�� ���� String���� ���� �ް� -> charAt(�ε��� ��ȣ)�� ���� char�� �����͵� ��!
			//String gender2 = sc.next();

			String msg5 = age2 < 20 ? "���� ��" : gender== 'M' ? "�����׿�" : "���ڳ׿�";
			System.out.println(msg5);
			
			/*	���� �������� ���𰡸� ������ �� ���
			 * 	jsp����
			 * <input type= 'checkbox'> name "test" <%data ==1? "checked" : ""%>>
			 */

		}
		
		
		// <��Ʈ ������>
		public void bitOp() {
			
			/*	<��Ʈ ����>
			 * 	(����) �����(����)�� �ִ� ��Ʈ���� ������ �����ϴ� ��
			 * 	A&B	(and����): A�� B, �� ��Ʈ�� ���� "��� 1"�� �� 1�� �����. �ƴ� ��� 0�� �����. 
			 * 	A|B (or����) : A�� B, �� ��Ʈ�� ���� "�ϳ��� 1"�� �� 1�� �����. �ƴ� ��� 0�� �����. 
			 * 	A^B (xor����)	: A�� B, �� ��Ʈ�� ���� "�ٸ� ��"�̸� 1�� �����. "���� ��"�̸� 0�� �����.
			 * 	~A			: �� ��Ʈ�� ��� "����"��Ű�� ����
			 * 	A<<2, A>>2	: ��Ʈ �� ��ü��, ����||���������� "�̵�"��Ŵ (2�� ����� "���ϱ�/������" ȿ��) 
			 */
			
			int a=10, b=22;
			String basic = "";
			for (int i=0; i<32 ; i++) {
				basic +="0";
			}
			
			String bit= basic+Integer.toBinaryString(a);
			bit= bit.substring(bit.length()-32);
			System.out.println(bit+" -> a ��Ʈ��");

			bit= basic+Integer.toBinaryString(b);
			bit= bit.substring(bit.length()-32);
			System.out.println(bit+" -> b ��Ʈ��");
			
			//"��Ʈ ���� ���" Ȯ���ϱ�
			bit= basic+Integer.toBinaryString(a&b);
			bit= bit.substring(bit.length()-32);
			System.out.println(bit+" -> a&b ��Ʈ��");	
			
			bit= basic+Integer.toBinaryString(a|b);
			bit= bit.substring(bit.length()-32);
			System.out.println(bit+" -> a|b ��Ʈ��");	
			
			bit= basic+Integer.toBinaryString(a^b);
			bit= bit.substring(bit.length()-32);
			System.out.println(bit+" -> a^b ��Ʈ��");	
			
			bit= basic+Integer.toBinaryString(~a);
			bit= bit.substring(bit.length()-32);
			System.out.println(bit+" -> ~a ��Ʈ��");	
			
			bit= basic+Integer.toBinaryString(a<<1);	//a*2 a*4
			bit= bit.substring(bit.length()-32);
			System.out.println(bit+" -> a<<1 ��Ʈ��");	
			
			bit= basic+Integer.toBinaryString(a>>1);	//a/2 a/4
			bit= bit.substring(bit.length()-32);
			System.out.println(bit+" -> a>>1 ��Ʈ��");	
			
		}
		
		
		
}
