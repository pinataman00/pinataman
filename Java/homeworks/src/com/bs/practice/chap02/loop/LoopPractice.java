package com.bs.practice.chap02.loop;
import java.util.Scanner;
public class LoopPractice {

	public void practice1() {
		
		/*	�ǽ�����1
		 * 	����ڷκ��� �� ���� ���� �Է� �޾� 
		 * 	1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���. 
		 * 	��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�. 
		 * 	���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.println("1 �̻��� ���ڸ� �Է��ϼ��� : ");
		int input= sc.nextInt();
		
		
		if (input >= 1) {

			for (int i = 1; i <= input; i++) {

				System.out.print(i + " ");

			}

		} else
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		
	}
	
	
	public void practice2() {
		
		/*	�ǽ�����2
		 * 	�� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
		 * 	��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���. 
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
		int input= sc.nextInt();
		
		if (input < 1) {

			for (;;) {

				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
				System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
				input = sc.nextInt();

				if (input >= 1) break;
			}
		} 

			for (int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
		
	}
	
	public void practice3() {
		
		
		/*	�ǽ�����3
		 * 	����ڷκ��� �� ���� ���� �Է� �޾� 
		 * 	1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϼ���. 
		 * 	��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
		int input= sc.nextInt();
		
		if(input>=1) {
			
			for(int i = input ; i>0 ; i--) {
				
				System.out.print(i+" ");
				
			}
			
			
		} else System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		
		
		
	}
	
	public void practice4() {
		
		/*	�ǽ�����4
		 * 	�� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
		 * 	��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���. 
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		if (input < 1) {

			for (;;) {

				System.out.println("1 �̻��� ���ڸ� �Է����ּ���. ");
				System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
				input = sc.nextInt();

				if (input >= 1)
					break;

			}

		}

		for (int i = input; i > 0; i--) {

			System.out.print(i + " ");
		}

	}
	
	public void practice5() {
		
		/*	�ǽ�����5
		 * 	1���� ����ڿ��� �Է� ���� �������� �������� ���� ����ϼ���.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int input = sc.nextInt();
		int su = 0;

		for (int i = 1; i <= input; i++) {

			su += i;
		}

		System.out.print(su);

	}
	
	public void practice6() {
		
		/*	�ǽ�����6
		 * 	����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���. 
		 * 	���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2= sc.nextInt();
		//int result= 0;
		
		if (num1>=1 && num2>=1) {
			

			if (num1 > num2) {
				for (int i = num2; i <= num1; i++) {
					System.out.print(i+" ");
				}
			} else {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i+" ");
				}

			}
			
			
			//TODO ���� �����ڷ� Ǯ���ϴ� ���� ������?
			
//			num1>num2 ?
//							  for (int i = num2 ; i <=num1 ; i++) {
//								  System.out.print(i);
//							  }
//					  	:		 	
//						  	for (int i = num2 ; i <=num1 ; i++) {
//							  System.out.print(i);
//						  	}
			
			
			
		} else System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		
		
	}
	
	
	public void practice7() {
		
		/*	�ǽ�����7
		 * 	�� ������ ��� ���� �����ϳ�, 
		 * 	1 �̸��� ���ڰ� �Էµƴٸ�	
		 * 	��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2= sc.nextInt();
		//int result= 0;
		
		if (!(num1>=1 && num2>=1)) {
		
			
			for(;;) {
				
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
				System.out.print("ù ��° ���� : ");
				num1 = sc.nextInt();
				System.out.print("�� ��° ���� : ");
				num2= sc.nextInt();
				
				if (num1>=1 && num2>=1) break;

			}

		} 
			
			if (num1 > num2) {
				for (int i = num2; i <= num1; i++) {
					System.out.print(i+" ");
				}
			} else {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i+" ");
				}

			}
			
			
		
	}
		
		public void practice8() {
			
			/*	�ǽ�����8
			 * 	����ڷκ��� �Է� ���� ������ ���� ����ϼ���.
			 */
		
			Scanner sc= new Scanner(System.in);
			System.out.print("���� : ");
			int dan = sc.nextInt();
			System.out.println("===== "+dan+"�� =====");
			
			for (int i = 1; i <= 9; i++) {

				System.out.println(dan + " * " + i + " = " + dan * i);

			}
			
		}
			
		public void practice9() {

			/*
			 * �ǽ�����9 ����ڷκ��� �Է� ���� ������ �ܺ��� 9�ܱ��� ����ϼ���. 
			 * ��, 9�� �ʰ��ϴ� ���ڰ� ������ ��9 ������ ���ڸ� �Է����ּ��䡱�� ����ϼ���.
			 */

			Scanner sc = new Scanner(System.in);
			System.out.print("���� : ");
			int dan = sc.nextInt();

			if (dan < 9) {

				for (int i = dan; i <= 9; i++) {

					System.out.println("===== " + i + "�� =====");

					for (int a = 1; a <= 9; a++) {

						System.out.println(i + " * " + a + " = " + i * a);

					}

				}

			} else
				System.out.println("9 ������ ���ڸ� �Է����ּ���.");

		}
		
		
		public void practice10() {
			
			/*	�ǽ�����10
			 * 	�� ������ ��� ���� �����ϳ�, 9�� �ʰ��ϴ� ���ڰ� �Էµƴٸ�
			 * 	"9 ������ ���ڸ� �Է����ּ���"�� ��µǸ鼭
			 * 	�ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���. 
			 */
			
			Scanner sc = new Scanner(System.in);
			System.out.print("���� : ");
			int dan = sc.nextInt();

			if (dan > 9) {

				for (;;) {

					System.out.println("9 ������ ���ڸ� �Է����ּ���");
					System.out.print("���� : ");
					dan = sc.nextInt();

					if (dan < 10)
						break;

				}

			}
			for (int i = dan; i <= 9; i++) {
				System.out.println("===== " + i + "�� =====");			
				for (int a = 1; a <= 9; a++) {
					System.out.println(i + "*" + a + " = " + i * a);
				}
			}
		}
		
		public void practice11() {
			
			/*	TODO �ǽ�����11
			 * 	����ڷκ��� ���� ���ڿ� ������ �Է� �޾�
			 * 	������ ������ ���ڰ� Ŀ���ų� �۾����� ���α׷��� �����ϼ���. 
			 * 	��, ��µǴ� ���ڴ� �� 10���Դϴ�.
			 */
			
			Scanner sc = new Scanner(System.in);
			System.out.print("���� ���� : ");
			int start = sc.nextInt();
			System.out.print("���� : ");
			int gap = sc.nextInt();
			int stopper= 0;

			
			for (int i = start;; i += gap) {
				stopper++;
				if (stopper > 10)
					break;
				System.out.print(i + " ");

			}

		}
			
		public void practice12() {
			
			/*	�ǽ�����12
			 * 	���� �� ���� �����ڸ� �Է� �ް� 
			 * 	�Էµ� �����ڿ� ���� �˸��� ����� ����ϼ���. 
			 * 
			 * 	��, �ش� ���α׷��� ������ �Է¿� ��exit����� ���� ���� ������ ���� �ݺ��ϸ�
			 * 	exit�� ������ �����α׷��� �����մϴ�.���� ����ϰ� �����մϴ�. 
			 * 
			 * 	���� �����ڰ� �������̸鼭 �� ��° ������ 0���� ������
			 * 	��0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.���� ����ϸ�, 
			 * 	���� �����ڰ� ���� �� ������ �������Դϴ�. �ٽ� �Է����ּ���.����� ����ϰ�
			 * 	�� ��� ��� ó������ ���ư� ����ڰ� �ٽ� �����ں��� �Է��ϵ��� �ϼ���.
			 */
			
			Scanner sc = new Scanner(System.in);
			System.out.print("������(+, -, *, /, %) : ");
			String operator = sc.next();
	
			for(;!operator.equals("exit");) {
				
				
				System.out.print("����1 : "); 
				int operand1= sc.nextInt();
				System.out.print("����2 : "); 
				int operand2= sc.nextInt();
				
			
				switch (operator) {
				
				case "+" :	System.out.print(operand1+" + "+operand2+" = "+(operand1+operand2)); break; 
				case "-" :	System.out.print(operand1+" - "+operand2+" = "+(operand1-operand2)); break; 
				case "*" :	System.out.print(operand1+" * "+operand2+" = "+operand1*operand2); break; 
				case "/" :	if (operand1==0||operand2==0) {
								System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���."); break;
							}
							else System.out.print(operand1+" / "+operand2+" = "+operand1/operand2); break; 
				case "%" :	System.out.print(operand1+" % "+operand2+" = "+operand1%operand2); break; 
				default :	System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���."); break;
				
				}
				
				System.out.print("\n\n������(+, -, *, /, %) : ");
				operator = sc.next();
				
			}
			System.out.println("���α׷��� �����մϴ�.");

		}
		
		public void practice13() {
			
			/*	������ ���� ���� ������ �����ϼ���.
			   
			  		*
			 		**
			 		***
			 		****	
			 */
			
			Scanner sc = new Scanner(System.in);
			System.out.print("���� �Է� : ");
			int input= sc.nextInt();
			
			for (int i = 0 ; i <= input; i++) {

				for (int a = 0 ; a < i ; a++) {

					System.out.print("*");

				}
				System.out.println();
			}
		}
		
		
			public void practice14() {
				
				/*	�ǽ�����14
				 	������ ���� ���� ������ �����ϼ���.
				 
				 	****
					***
					**
					*
				 
				 */
				
				Scanner sc= new Scanner(System.in);
				System.out.print("���� �Է� : ");
				int input = sc.nextInt();
				
				for (int i = 0; i < input; i++) {

					for (int a = input - i; a > 0; a--) {

						System.out.print("*");

					}

					System.out.println();

				}

			}

		}
	
		
		

	


