package com.condition;
import java.util.Scanner;
public class ConditionController {

	/*	<���ǹ� if>
	 * 	if(���ǹ�) { ���ǹ��� true�� �� ����� ��ɾ�}
	 * 	if()���� ���ǹ��� boolean����, �񱳿�����, ��������, ���(�޼ҵ�)�� �� �� �ִ�.
	 * 	true||false�� ������ ���� ����. 
	 */

	public void ifTest() {

		if (100 < 10) {
			System.out.println("������ true�� �� �����!");	//���ǹ��� (100<10�� ���, ��Ŭ�������� 'Dead code'��� �˷���)
														//(������ �� �� ���� �ڵ��� �ǹ�!)

		}
		System.out.println("�⺻ if�� ����!"); // false�� ��� �����
		Scanner sc= new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int su= sc.nextInt();
		//	(����1) �Է¹��� ������ 200�̸�, "200�Դϴ�"�� ����ϴ� ��� ����
		if (su==200) {
			System.out.println("200�Դϴ�.");
		}
		
		//	(����2) �Է¹��� ������ 100~200������ ���, "�� �Է��߽��ϴ�." ����ϱ�

		if(100<=su&&su<=200) {
			System.out.println("�� �Է��߽��ϴ�.");
		}
		
		// (����3) �������� �Է¹ް�, �������� AB���� ��� "�� ��Ư�Ͻó׿�!" ����ϱ�
		System.out.print("�������� �Է��ϼ��� : ");
		String blood= sc.next();
		if (blood.equals("AB")) {
			System.out.print("�� ��Ư�Ͻó׿�!");
		}
		
		// (����4) ������ �Է¹޾�, �� ���� 3�� ������� Ȯ���ϴ� ���α׷� �����
		// 3�� ����� ��, "3�� ����Դϴ�." ���
		
		System.out.print("\n���� : ");
		int su2= sc.nextInt();
		
		if (su2%3==0) {
			System.out.println("3�� ����Դϴ�.");
		}
		
		//	(����5) �ٴϴ� �п��� �Է¹ް�, �����ī�����̸�, "���� ������ �����ް� �ֳ׿�."�� ����ϱ�
		System.out.print("�п� �̸� : ");
		sc.nextLine(); //�Է� ���۸� �������. 
		String academyName= sc.nextLine();
		if (academyName.equals("�����ī����")||academyName.equals("���� ��ī����")) {
			System.out.println("���� ������ �����ް� �ֳ׿�.");	//"if�� ����"
		}	//if�� "�ܺ�"����
		
		/*	���ǹ� if > �߰�ȣ{} ������ (�ܺ�/����)���� Ȱ��
		*	java���α׷��� {}�� ��������, ��� ����(scope==Ȱ�뿵��)�� ������. 
		*	if�� �߰�ȣ ���������� ~ (���ǹ��� true�� ���� -> ) ������ �����ϰ�, ������ �����ϰų�, ���(�޼ҵ�)�� ȣ���� �� �ִ�. 
		*/	
		//	1. if�߰�ȣ �ܺο� �����, ������ if������ ����ϱ� -> ʦ��
		
		String name= "������";
		
		if (su>0) {
			//�ܺ��� ���� name �̿��ϱ�
			System.out.println(name);
			name="�赿��";
			
		}	System.out.println("�ܺο��� ��� : "+name);
		
//		2. if�߰�ȣ ���ο� ����� ������, if�� �ܺο��� ����ϱ� -> ��ʦ��
		
		if(su>0) {
			char gender = 'F';
			System.out.println(gender);
		}	
			//System.out.println(gender); //���� �߻�! cannot be resolved as a variable(������ ������� ����). 
			//�����ߴµ�? -> if�� ���� �ڵ��, ���ǹ��� true�� ��쿡�� �۵���. 
			//			  true�� �������� ���� ��쵵 �����ϱ�... ������ ����Ǿ� �ִٰ� ����� �� ����! �׷��� ������ �߻��ϴ� ����. 
		
		
//		3. if�߰�ȣ ���ο���, �ܺκ����� ������ �̸��� ������ ������ �� �ִ�? -> ��ʦ��
		// (����) if���� �޼ҵ� ����ο� '����'�Ǿ� ����!
		
		if (su>0) {
			//String name = "Ȳ����";	//���� �߻�! "dublicate variable name(����٣ �ߺ�)"
		}
		
		//	(����6)	�����Client���� �̸��� �Է¹ް�, �̸��� ���� �̸��� ��ġ�� ���,
		//	"�ڵ� õ�� 000��~~" ����ϱ�
		
		System.out.print("�̸� : ");
		String name1= sc.next();
		if (name1.equals("�赵��")) {
			System.out.println("�ڵ� õ�� "+name1+"��~~~");
		}
		
// 		4.	if�� ���ο� �ٸ� if���� ����� �� ����
//		(����7) ȣ���� �ֹ� ���α׷� : �����̸� �޴����� (1. ����, 2. ����, 3. ������)		
//								�޴� ���� 1�� ġŲ, 2�� ����, 3�� ġ�� ���
		
		System.out.print("���� : ");
		int age= sc.nextInt();
		
		if (age > 19) {

			System.out.println("=======ȣ�� �ֹ�=======");
			System.out.println("1. ���� \n2. ���� \n3. ������ \n�� �޴��� �����ϼ��� : ");
			int menu = sc.nextInt();

			if (menu == 1) {

				System.out.println("���ִ� ġŲ");

			}

			if (menu == 2) {
				System.out.println("���ִ� ����");

			}

			if (menu == 3) {
				System.out.println("�����ִ� ġ��");
			}

		}

		
		/*	(����8)	���忡 �ԱݵǴ� ���α׷� �����ϱ�
		 * 	0. ���� �ܾ��� 10��
		 * 	1. �ݾ��� 3ȸ �Է¹ް�, �Է¹��� ���� ����� �� ���� �ܾ׿� ���� �����ϰ�
		 * 	2. �ܾ��� ����ϼ���.  
		 */
		
		int account = 10; 
		
		System.out.print("�Աݾ� : ");
		int money = sc.nextInt();
		
		if(money>0) {
			account+=money;
		}
		
		System.out.print("�Աݾ� : ");
		money = sc.nextInt();
		
		if(money>0) {
			account+=money;
		}
		
		System.out.print("�Աݾ� : ");
		money = sc.nextInt();
		
		if(money>0) {
			account+=money;
		}
		
		System.out.println("�ܾ� : " + account + "��");
		
		
	} // �޼ҵ� �����

	
	public void ifelseTest() {
		
		/*	<if~ else>
		 * 	"if���� ���ǽ��� true�� �ƴ� �� ������ ��ɾ�"�� ������ �� else�� ����.
		 * 	�� else���� �ܵ� ��� �Ұ� (if���ǹ��� false�� �� �����ϹǷ�)
		 * 	�� �� �� �ϳ��� logic�� �ݵ�� ����� 
		 * 	(�� ���� �����ڿ� ������)
		 */
		
		if(100<10) {
			System.out.println("100�� 10���� ũ��");	//Dead code (if���ǹ��� 100<0, �� false�� �����Ǿ� ����)
		} else {
			System.out.println("100�� 10���� �۴�");	//if������ false�� ���� -> else ���� �ڵ� ������
		}

		// (����1) �Է¹��� ���� [Ȧ��/¦��]���θ� �Ǻ��ϴ� ���α׷�
		
		Scanner sc= new Scanner(System.in);
		System.out.print("���� : ");
		int su= sc.nextInt();
		
		if (su % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
		
		/* (����2) ID, PW�� �Է¹ް�,
		 * 	ID : user01
		 * 	PW : user01
		 * 	...�̸� "�α��� ����" ���. �ƴϸ� "�α��� ����" ���. 
		 */
		
		System.out.println("ID : ");
		String id= sc.next();
		System.out.println("PW : ");
		String pw= sc.next();
		
		if (id.equals("user01")&&pw.equals("user01")) {
			System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����");
		}
		
		/*	(����3) ����ڰ� �̼������� Ȯ�� ��, 
		 * 	�̼����� ���, "ȸ�������� �Ұ����մϴ�." ���
		 * 	������ ���, ���̵�, �н�����, �̸����� �Է¹޴� ���� �����ϱ�
		 */
		
		System.out.print("���� : ");
		int age= sc.nextInt();
		
		if(age>19) {
			
			sc.nextLine(); //�Է� ���� ����ֱ�
			System.out.print("ID : ");
			String id2= sc.nextLine();
			System.out.print("PW : ");
			String pw2= sc.nextLine();
			System.out.print("e-mail : ");
			String email= sc.nextLine();
			
			System.out.println("===== ȸ������ �Ϸ� =====");
			System.out.println("ID : "+id2+"\nPW : "+pw2+"\ne-mail : "+email);
			
		} else {
			System.out.println("ȸ�������� �Ұ����մϴ�.");
		}

	}
	
	public void ifElseifTest() {
		
		/*	<if ~ else if ~ else if ~ else>
		 * 	(����) "�߰����� ����� ��(����)"�� ó���ϴ� ����
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("������ Ȯ���ϰ� ���� �� : ");
		int month= sc.nextInt();
		
		if (month==1||month==2||month==12) {
			System.out.println("�ܿ��Դϴ�~ �� �߿�~");
		} else if (month>=3&&month<=5) {
			System.out.println("���Դϴ�~ ������");
		} else if (month>=6&&month<=8) {
			System.out.println("�����Դϴ�~ �ٴٷ�, �������...");
		} else if (month>=9&&month<=11) {
			System.out.println("�����Դϴ�~ ����ó��...");
		} else {
			System.out.println("1~12������ ���ڸ� �Է����ּ���.");
		}
		
		
		/*	(����1) �л� ���� ��� ����ϱ�
		 * 	90�� �̻� A
		 * 	80�� �̻� B
		 *  70�� �̻� C
		 *  60�� �̻� D
		 *  �׹ۿ��� F
		 */
		
		System.out.print("���� : ");
		int score = sc.nextInt();
		char grade= ' ';

		if (score >= 90) {
			grade= 'A';
		} else if (score >= 80) {
			grade= 'B';
		} else if (score >= 70) {
			grade= 'C';
		} else if (score >= 60) {
			grade= 'D';
		} else {
			grade= 'F';
		}
		System.out.println("����� ����� "+grade);
		
		
		
//		System.out.print("���� : ");
//		int score1 = sc.nextInt();
//		String grade= "";
//
//		if (score1 >= 90) {
//			grade="A";
//		} else if (score1 >= 80) {
//			grade="B";
//		} else if (score1 >= 70) {
//			grade="C";
//		} else if (score1 >= 60) {
//			grade="D";
//		} else {
//			grade="F";
//		}
//			
//			if (score1>=60&&score1%10>=5) {
//				System.out.println("����� �����: "+grade+="+");
//			} else {
//				System.out.println("����� �����: "+grade);
//			}
//				
		}
	

	/*	public void ageMessage()�����ؼ�, 
	 *	���ɺ� �޽��� ����ϱ� 
	 * 	10�� : ������ �����ؾ��� -> ���� ���а���
	 * 	20�� : ������ �����ؾ��� -> ��������
	 * 	30�� : ������ ���ؾ��� -> ������
	 *  40�� : ������ ��������� -> �ڽ� �Կ� �츮��
	 *  50�� : ������ ��ؾ��� -> ���� ����
	 */
	
	public void ageMessage() {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("���� : ");
		int age= sc.nextInt();
		
		
		if (10 <= age && age < 60) {

			if (50 <= age) {
				System.out.println("50�� : ������ ��ؾ��� -> ���� ����");
			} else if (age >= 40) {
				System.out.println("40�� : ������ ��������� -> �ڽ� �Կ� �츮��");
			} else if (age >= 30) {
				System.out.println("30�� : ������ ���ؾ��� -> ������");
			} else if (age >= 20) {
				System.out.println("20�� : ������ �����ؾ��� -> ��������");
			} else if (age >= 10) {
				System.out.println("10�� : ������ �����ؾ��� -> ���� ���а���");
			}

		} else
			System.out.println("10~59������ ���� �Է��ϼ���.");

	}
	
	public void switchTest() {
		
		/*	<switch��>
		 * 	(����) ������ ���� ���ؼ� �б� ó�� �� ���. 
		 * 	Ư�� ���� "���� ��" �� "true"�� ������ ������ ������
		 * 	(���) "�޴�" ���� ��, "Ư�� ��", "���� ���"�� ���� ������ ��
		 * 	(����) switch�� ������ ������ �ڷ���: (int����, char����, String���ڿ�)
		 */
		
		/*	(����1) ���� �޴� ����
		 * 	1. ����
		 * 	2. ġŲ
		 * 	3. ������
		 * 	4. ������
		 * 	5. �ܹ���
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.println("==== ���� �޴� ====");
		System.out.println("1. ���� \n2. ġŲ \n3. ������ \n4. ������ \n5. �ܹ���");
		
		System.out.print("�� �Է� : ");
		int cho = sc.nextInt();
		switch (cho) {
	
		case 1 : System.out.println("���ڴ� ���� �ǰ� �Ծ����."); break;	//cho�� 1�̶��, �ڵ� ���� �� -> break�� ���� switch������ ������. 
		case 2 : System.out.println("ġŲ�� ��ġŲ ��ġŲ~"); break;
		case 3 : System.out.println("�����̴� ����, Ƣ��� �Բ�"); break;
		case 4 : System.out.println("�������� �� ����? �ڵ带 ���� �� ��!!"); break;
		case 5 : System.out.println("�ܹ��Ŵ� ���ſ� ��~~~!"); break;
		
		//������ case �� ���ڸ� �Է��ߴٸ�?
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�. 1~5������ ���ڸ� �Է��ϼ���!"); break;

		}

	}
	
	
	
	
}	//Ŭ���� �����

