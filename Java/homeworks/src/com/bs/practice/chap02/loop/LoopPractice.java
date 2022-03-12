package com.bs.practice.chap02.loop;
import java.util.Scanner;
public class LoopPractice {

	public void practice1() {
		
		/*	실습문제1
		 * 	사용자로부터 한 개의 값을 입력 받아 
		 * 	1부터 그 숫자까지의 숫자들을 모두 출력하세요. 
		 * 	단, 입력한 수는 1보다 크거나 같아야 합니다. 
		 * 	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.println("1 이상의 숫자를 입력하세요 : ");
		int input= sc.nextInt();
		
		
		if (input >= 1) {

			for (int i = 1; i <= input; i++) {

				System.out.print(i + " ");

			}

		} else
			System.out.println("1 이상의 숫자를 입력해주세요.");
		
	}
	
	
	public void practice2() {
		
		/*	실습문제2
		 * 	위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		 * 	“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요. 
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input= sc.nextInt();
		
		if (input < 1) {

			for (;;) {

				System.out.println("1 이상의 숫자를 입력해주세요.");
				System.out.print("1 이상의 숫자를 입력하세요 : ");
				input = sc.nextInt();

				if (input >= 1) break;
			}
		} 

			for (int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
		
	}
	
	public void practice3() {
		
		
		/*	실습문제3
		 * 	사용자로부터 한 개의 값을 입력 받아 
		 * 	1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요. 
		 * 	단, 입력한 수는 1보다 크거나 같아야 합니다
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input= sc.nextInt();
		
		if(input>=1) {
			
			for(int i = input ; i>0 ; i--) {
				
				System.out.print(i+" ");
				
			}
			
			
		} else System.out.println("1 이상의 숫자를 입력해주세요.");
		
		
		
	}
	
	public void practice4() {
		
		/*	실습문제4
		 * 	위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		 * 	“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요. 
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if (input < 1) {

			for (;;) {

				System.out.println("1 이상의 숫자를 입력해주세요. ");
				System.out.print("1 이상의 숫자를 입력하세요 : ");
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
		
		/*	실습문제5
		 * 	1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		int su = 0;

		for (int i = 1; i <= input; i++) {

			su += i;
		}

		System.out.print(su);

	}
	
	public void practice6() {
		
		/*	실습문제6
		 * 	사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요. 
		 * 	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
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
			
			
			//TODO 삼항 연산자로 풀이하는 법은 없을까?
			
//			num1>num2 ?
//							  for (int i = num2 ; i <=num1 ; i++) {
//								  System.out.print(i);
//							  }
//					  	:		 	
//						  	for (int i = num2 ; i <=num1 ; i++) {
//							  System.out.print(i);
//						  	}
			
			
			
		} else System.out.println("1 이상의 숫자를 입력해주세요.");
		
		
	}
	
	
	public void practice7() {
		
		/*	실습문제7
		 * 	위 문제와 모든 것이 동일하나, 
		 * 	1 미만의 숫자가 입력됐다면	
		 * 	“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2= sc.nextInt();
		//int result= 0;
		
		if (!(num1>=1 && num2>=1)) {
		
			
			for(;;) {
				
				System.out.println("1 이상의 숫자를 입력해주세요");
				System.out.print("첫 번째 숫자 : ");
				num1 = sc.nextInt();
				System.out.print("두 번째 숫자 : ");
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
			
			/*	실습문제8
			 * 	사용자로부터 입력 받은 숫자의 단을 출력하세요.
			 */
		
			Scanner sc= new Scanner(System.in);
			System.out.print("숫자 : ");
			int dan = sc.nextInt();
			System.out.println("===== "+dan+"단 =====");
			
			for (int i = 1; i <= 9; i++) {

				System.out.println(dan + " * " + i + " = " + dan * i);

			}
			
		}
			
		public void practice9() {

			/*
			 * 실습문제9 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요. 
			 * 단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
			 */

			Scanner sc = new Scanner(System.in);
			System.out.print("숫자 : ");
			int dan = sc.nextInt();

			if (dan < 9) {

				for (int i = dan; i <= 9; i++) {

					System.out.println("===== " + i + "단 =====");

					for (int a = 1; a <= 9; a++) {

						System.out.println(i + " * " + a + " = " + i * a);

					}

				}

			} else
				System.out.println("9 이하의 숫자만 입력해주세요.");

		}
		
		
		public void practice10() {
			
			/*	실습문제10
			 * 	위 문제와 모든 것이 동일하나, 9를 초과하는 숫자가 입력됐다면
			 * 	"9 이하의 숫자를 입력해주세요"가 출력되면서
			 * 	다시 사용자가 값을 입력하도록 하세요. 
			 */
			
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자 : ");
			int dan = sc.nextInt();

			if (dan > 9) {

				for (;;) {

					System.out.println("9 이하의 숫자를 입력해주세요");
					System.out.print("숫자 : ");
					dan = sc.nextInt();

					if (dan < 10)
						break;

				}

			}
			for (int i = dan; i <= 9; i++) {
				System.out.println("===== " + i + "단 =====");			
				for (int a = 1; a <= 9; a++) {
					System.out.println(i + "*" + a + " = " + i * a);
				}
			}
		}
		
		public void practice11() {
			
			/*	TODO 실습문제11
			 * 	사용자로부터 시작 숫자와 공차를 입력 받아
			 * 	일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요. 
			 * 	단, 출력되는 숫자는 총 10개입니다.
			 */
			
			Scanner sc = new Scanner(System.in);
			System.out.print("시작 숫자 : ");
			int start = sc.nextInt();
			System.out.print("공차 : ");
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
			
			/*	실습문제12
			 * 	정수 두 개와 연산자를 입력 받고 
			 * 	입력된 연산자에 따라 알맞은 결과를 출력하세요. 
			 * 
			 * 	단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
			 * 	exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다. 
			 * 
			 * 	또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
			 * 	“0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며, 
			 * 	없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
			 * 	두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
			 */
			
			Scanner sc = new Scanner(System.in);
			System.out.print("연산자(+, -, *, /, %) : ");
			String operator = sc.next();
	
			for(;!operator.equals("exit");) {
				
				
				System.out.print("정수1 : "); 
				int operand1= sc.nextInt();
				System.out.print("정수2 : "); 
				int operand2= sc.nextInt();
				
			
				switch (operator) {
				
				case "+" :	System.out.print(operand1+" + "+operand2+" = "+(operand1+operand2)); break; 
				case "-" :	System.out.print(operand1+" - "+operand2+" = "+(operand1-operand2)); break; 
				case "*" :	System.out.print(operand1+" * "+operand2+" = "+operand1*operand2); break; 
				case "/" :	if (operand1==0||operand2==0) {
								System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요."); break;
							}
							else System.out.print(operand1+" / "+operand2+" = "+operand1/operand2); break; 
				case "%" :	System.out.print(operand1+" % "+operand2+" = "+operand1%operand2); break; 
				default :	System.out.println("없는 연산자입니다. 다시 입력해주세요."); break;
				
				}
				
				System.out.print("\n\n연산자(+, -, *, /, %) : ");
				operator = sc.next();
				
			}
			System.out.println("프로그램을 종료합니다.");

		}
		
		public void practice13() {
			
			/*	다음과 같은 실행 예제를 구현하세요.
			   
			  		*
			 		**
			 		***
			 		****	
			 */
			
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 입력 : ");
			int input= sc.nextInt();
			
			for (int i = 0 ; i <= input; i++) {

				for (int a = 0 ; a < i ; a++) {

					System.out.print("*");

				}
				System.out.println();
			}
		}
		
		
			public void practice14() {
				
				/*	실습문제14
				 	다음과 같은 실행 예제를 구현하세요.
				 
				 	****
					***
					**
					*
				 
				 */
				
				Scanner sc= new Scanner(System.in);
				System.out.print("정수 입력 : ");
				int input = sc.nextInt();
				
				for (int i = 0; i < input; i++) {

					for (int a = input - i; a > 0; a--) {

						System.out.print("*");

					}

					System.out.println();

				}

			}

		}
	
		
		

	


