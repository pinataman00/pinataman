package com.repeat;

import java.util.Iterator;
import java.util.Scanner;

public class RepeatController {

	// <반복문 : for문, while문>
	public void basicFor(){
	
		/*	<기본 for문>
		 * 	(구조) 
		 * 	for(초기식;조건식;증감식){반복할 명령어}
		 * 	○ 초기식	:	'반복 횟수' 관련 정보를 기억할 수 있는 저장공간을 선언함 (일반적인 의미)
		 * 	○ 조건식	:	반복을 [멈추거나/실행하는]기준이 되는 값 (boolean형 : true||false)
		 * 				- true일 때, 반복문 실행
		 * 				- false일 때, 반복문 중단
		 * 
		 * 				★ 무한 루프 ★
		 * 				"증감식"에 의해~ 조건식이 [true/false]가 판별됨. 
		 * 				무한 루프(반복)을 피하고 싶거든, 언젠가는 false가 나오도록 
		 * 				조건식을 설정해둬야 함. 
		 * 
		 * 	○ 증감식	:	초기식에서 설정한 변수의 값을 수정함
		 * 				- (기능) '연산'을 통해 ~ 반복횟수의 값을 [증가/감소]함
		 * (효용)	'명령어'를 '내가 원하는 횟수만큼' '반복'실행시킬 때 사용함
		 */
		
		// (예제) "안녕하세요"를 10번 출력하세요.
		System.out.println("안녕하세요. ");
		System.out.println("안녕하세요. ");
		System.out.println("안녕하세요. ");
		System.out.println("안녕하세요. ");
		System.out.println("안녕하세요. ");
		System.out.println("안녕하세요. ");
		System.out.println("안녕하세요. ");
		System.out.println("안녕하세요. ");
		System.out.println("안녕하세요. ");
		System.out.println("안녕하세요. ");
		//쉽지! 복사+붙여넣기, 를 10번 하면 되지!
		//쉽니? 만약 1,000번을 반복해야 하면 어떻게 할래?!
		//이때, "for문"을 쓰면 편리하다. 
		
		for (int i=1; i<=100 ; i++) {
			System.out.println("\"안녕하세요\", 를 "+i+"번 말했다.");
		}
		
		//(쓰임 예) 100명의 고객에게 회원가입 관련 정보를 받을 때, 
		//회원가입서를 100번 반복되도록 설정할 수 있다. 
		
		for (int i=1 ; i<10 ; i++) {
			
			//★중요★ 
			//for의 초기식에 쓴 i변수를, 명령문 안에서 활용할 수 있다. 
			System.out.println(i);
			
		}
		
		// (예제) 반복문을 활용, 본인 이름을 5회 출력하세요. 
		
		for (int i = 1; i <= 5; i++) {

			System.out.println(i+". 김도영");

		}
		
		/*	for문 {}내부 : 연산자, 변수, 조건문... 등 "모든 명령문"을 사용할 수 있음. 
		 */
		
		//{}내부의 명령어를 총 3회 반복할 것임.
		for(int i=1; i<=3 ; i++) {
			
			if(i==2) {
						System.out.println("드디어 2회차 반복 시작!");
					 }	//조건문> if문
			
			String name = "김도영";	//변수 선언
			
			switch (name) {	
			
			case "김도영" : System.out.println("내 이름은 "+name+"이야."); break;
			
			}	//조건문> case문
		
		}
		
		//(예제)	
		// 1. 1부터 50까지 숫자를 출력하세요. 
		// 2. 숫자를 짝수만 출력하세요
		
		for (int i=1 ; i<=50 ; i++) {
			
			
			//1. 1~50 숫자 출력
			//System.out.print(i+" "); //코드를 이렇게 작성하면 1열로 깔끔하게 출력됨
			
			//2. 1~50 중 짝수만 출력
			if(i%2==0) {
				System.out.println(i+" : 짝수예요.");
			}

			//3. 1~50까지 홀짝 교차 출력
//			if(i%2==1) {
//				System.out.println(i+" : 홀수예요.");
//			} else System.out.println(i+" : 짝수예요.");

		}
		
		//1~50 중, 짝수만 출력하고 싶을 때
		// 가장 효율적인 코드! (연산이 짧으니까!)
		for(int i=2 ; i<=50; i+=2) {
			System.out.print(i+" ");
		}
		
		//(예제) 1~10까지 홀수만 출력하기
		
		System.out.println();
		//방법1
		for(int i=1; i<=10; i+=2) {
			
			System.out.print(i+" ");
		}
		
		//방법2
		System.out.println();
		for (int i=1; i<=10 ; i++) {
			
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
		
		/*	for문 > 감소식
		 * 	100부터 1까지 내림차순으로 수 출력하기
		 */
		 
		System.out.println();
		for (int i=100; i>=1; i--) {	//TODO 조건식: "0<i&&i<=100"이렇게 복잡하게 적었었는데... 간단히 적을 수도 있었음을.
			
			System.out.print(i+" ");
		}
		
		/*	(효용)
		 * 
		 */
		
		/*	(예제)
		 * 	금액을 5회 입력받아, 
		 * 	금액의 총계가 양수인 경우, 잔액에 누적하고 
		 * 	잔액을 출력하라. 
		 */
		
//		System.out.println();
		Scanner sc= new Scanner(System.in);
//		int account= 10;
//		int money= 0;
//		
////		for (int i = 1; i <= 5; i++) {
////
////			System.out.print(i+". 금액 : ");
////			money += sc.nextInt();
////
////		}
//
//		if (money > 0) {
//			account += money;
//		}
//
//		System.out.println("잔액 : " + account);
		
		
		/*	(예제)
		 * 	학생 정보를 입력받고,
		 * 	출력하는 것을 3회 반복하기
		 * 
		 * 	학생 정보 : 이름, 나이, 학년
		 * 
		 */
		
//		System.out.println();
//		String name= "";
//		int age= 0;
//		int grade= 0;
//		

		
//		for(int i=1; i<=3 ; i++) {
//			
//			sc.nextLine();	//입력 버퍼 비워주기
//			System.out.println();
//			System.out.println("=== 학생 정보를 입력하세요 ===");
//			System.out.print("이름 : ");
//			name= sc.nextLine();
//			System.out.print("나이 : ");
//			age= sc.nextInt();
//			System.out.print("학년 : ");
//			grade= sc.nextInt();
//		
//			System.out.println();
//			System.out.println("=== "+i+"번째 학생 정보 ===");
//			System.out.println("○ 이름: "+name+" \n○ 나이 : "+age+"\n○ 학년 : "+grade);
//			
//		}
		
		/*	반복문의 중괄호에서는, 
		 * 	중괄호 외부에서 선언한 변수를 사용할 수 있다. 
		 */
		
//		int count = 1;
//		for (int i= 1 ; i<=5; i++) {
//			System.out.println(count++);	//중괄호 외부에서 선언한, 변수 count를 사용할 수 있음!
//		}
		
		
		/*	(예제)
		 * 	5개의 금액을 입력받고,
		 * 	account변수에 값을 누적하고,
		 * 	누적 결과를 출력하세요.
		 */
		
		
//		int money1= 0;
//		int account1= 0;
//		
//		for (int i = 1; i <= 5; i++) {
//
//			System.out.print("금액 : ");
//			money1 = sc.nextInt();
//			// TODO 다시 풀어보기!
//			// 아까는, money1+=sc.nextInt()로 해서 조금 헤맸었다.
//			// 이렇게 했다면, account에 누적값 money를 최종적으로 account1에 더하면 됐지.
//
//			account1 += money1;
//
//		}
//		
//		System.out.println("잔액 : ");
//		System.out.print(account1+" 원");
//		//money1+=sc.nextInt()을 5회 반복했을 경우,
//		//System.out.println(account1+money1);

		
		
		
		/*	(예제)
		 * 	사용자가 입력한, 8개의 메시지를 한 번에 출력하기
		 */
		
		System.out.println();
		String msg= "";
		
		//System.out.println();
		for (int i = 1; i <= 2; i++) {

			//sc.nextLine(); //앞에서 sc.next()등을 사용한 경우엔 입력버퍼를 비워줘야 해.
			System.out.print(i + ". 메시지를 입력하세요 : ");
			msg += sc.nextLine() + "\n"; // "\n"을 넣으면 개행된 문구가 출력됨!

		}
		System.out.println(msg);
		
		/*
		 * (예제) 1~100까지 합을 출력하기
		 */

		int num = 0;
		System.out.println("1~100까지의 합");
		for (int i = 1; i <= 100; i++) {

			num += i;

		}
		System.out.println(num);
		

		 //○ for() 내부에 선언된 변수 i는, 외부에서 사용이 가능한가? 
		 
		for(int i= 0; i<=5 ; i++) {
			
		} 
		//System.out.println(i); 에러 발생!
		//(결론) -> 불가능하다!
		
		
		//○ for문의 초기식, 조건식, 증감식은 무조건 사용해야 하나? -> X
		int count=0;
		
		//1. 초기식을 쓰지 않음
		for(;count<10;count++) {	
			System.out.print(count+" ");
		}
		
		//2. 증감식을 쓰지 않음
		count=0;
		for(;count<10;) {	//초기식을 쓰지 않음
			System.out.println("실행되니?");	//무한히 반복됨. 조건식을 false로 멈춰줄 증감식이 부재하기 때문임
			//무한 반복문을 멈추고 싶거든, 
			count++; //반복문 내부에서 증감식을 추가해주면 됨. 조건식의 값을 변화시킬 수 있는.
		}
		
		String test= "";
		for (; !test.equals("종료");) {

			System.out.println("\"종료\" 작성 時, for문이 종료됩니다.");
			System.out.println("단어 또는 문구를 입력하세요 : ");
			test = sc.nextLine();

		}
		
		//3. 의도적으로 무한루프를 실행하는 경우
		//'조건식' 부재할 경우, 'true'로 간주함.
		for(;;) {
			
			System.out.println("실행");
			
			//무한루프를 중지하고 싶다면, 
			count++;	//※ 앞서 count를 9까지 올려뒀었음. 
						//  바로 다음 if문의 조건에 걸려서 break문에 걸려 반복문은 종료됨
			if(count>10) {
				break;
			}
		}
		
		for(int a=0, i=1; i<10; i++, a+=2) {
			System.out.println(a+" : "+i);
		}

	}
		

	//for문 응용
	public void forApplication() {
		
		/*	(예제)
		 * 	1부터 ~ 사용자에게 입력받은 수까지 출력하기
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int su = sc.nextInt();

		for (int i = 1; i <= su; i++) {

			System.out.print(i + " ");

		}
		
	}
		
		/*	(예제)
		 * 	학생을 등록하는 기능을 만들어보자.
		 * 	public void ex_enrollStudent()
		 * 	1. 등록할 학생의 수를 먼저 입력받으세요.
		 * 	2. 해당 명수만큼 등록하는 기능을 구현하세요. 
		 * 	3. 학생 정보 => 이름, 나이, 학년, 전공, 성별(char)
		 * 	조건, 등록한 학생의 데이터를 한 번에 모두 출력
		 */
		
		
	public void ex_enrollStudent() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("등록할 학생의 수를 입력하세요 : ");
		int students= sc.nextInt();
		String name= "";
		int age= 0;
		int grade=0;
		String major= "";
		char gender= ' ';
		//TODO : 등록한 학생들의 정보를 일괄적으로 출력하는 법!
		String studentsInfo="";
		
		
		for (int i=1; i<=students ; i++) {
			
			sc.nextLine();
			System.out.println("====== "+i+"번 학생 등록 프로그램 실행 ======");
			System.out.println("이름 : ");
			name= sc.nextLine();
			System.out.println("나이 : ");
			age= sc.nextInt();
			System.out.println("학년 : ");
			grade= sc.nextInt();
			
			sc.nextLine();
			System.out.println("전공 : ");
			major= sc.nextLine();
			System.out.println("성별(M/F) : ");
			gender=sc.next().charAt(0);
			
			//System.out.println("====== "+i+"번 학생 등록 완료 ======");
			//System.out.println("이름 : \t"+name+"\n나이 : \t"+age+"세 \n학년 : \t"+grade+ "\n전공 : \t"+major+"\n성별 : \t"+gender);
			
			studentsInfo+="○ "+i+"번째 학생 등록 정보"+"\n이름 : \t"+name+"\n나이 : \t"+age+"세 \n학년 : \t"+grade+ "\n전공 : \t"+major+"\n성별 : \t"+gender+"\n";
			
		}
		
		System.out.println("====== 학생 등록 완료 ======");
		System.out.println(studentsInfo);
		
		
		/*	문자열 > 한 글자씩 찾거나, 구분할 수 있음
		 */
		
		String name1= "유병승";
		name1.charAt(0); //유
		name1.charAt(1); //병
		name1.charAt(2); //승
		
		//charAt() 안의 숫자가, 규칙적으로 1씩 증가하고 있음
		//패턴을 찾았네! -> 반복문을 사용해서 한 글자씩 출력할 수 있지
		
		for(int i=0; i<3 ; i++) {
			
			
			System.out.println(name1.charAt(i));
			
		}
		
	//	입력받은 문자열을, 단일문자 한 글자씩 출력하기
		
		sc.nextLine();
		System.out.print("문자열 입력 : ");
		String inputStr= sc.nextLine();
		
		//○ length()메소드 : 문자열의 길이를 출력함
		for (int i = 0; i<inputStr.length(); i++) {
			
			System.out.println(inputStr.charAt(i));
			
		}
		
		//	입력받은 문자열에 공백이 포함되어 있는지, 여부 확인하는 기능
		
		boolean flag = false; //공백 여부에 대한 기준 값: [ true : 공백 있음 / false : 공백 없음 ]
							  //일단은, 공백이 없다고 상정하여 false로 초기화함
		
		for (int i=0; i<inputStr.length(); i++) {
			
			if(inputStr.charAt(i)==' ') {
				flag=true; //특정 자릿수에서 공백이 발생하면 (if 조건문의 내용)
						   //boolean형인 flag의 값이 true가 됨
			}
			
		}
		System.out.println();
		System.out.println(flag ? "공백이 있습니다!" : "공백이 없습니다!");
		
		
		// 	(예제) 입력받은 (영문)문자열이 대문자/소문자인지 확인
		//	(심화) 영문이 아닌 경우, "영문이 아닌데요" 출력
		// ※ 단일문자, 인 경우엔 대소비교 가능함 (왜냐면 문자는 컴퓨터 내부적으론 '숫자'로서 저장되기 때문)
		
		//sc.nextLine();
		System.out.print("영어로 문장을 작성해보세요. : ");
		String eng = sc.nextLine();
		boolean flag2= false;
		
	
		
		
		
		for (int i=0 ; i<eng.length();i++) {
			
			
			//국문||영문, 판별하는 코드는 어떻게 만드는 걸까?
			//if (65<=eng.charAt(i)&&eng.charAt(i)<=122) {
				
				//아스키 코드를 활용함 (대문자 A~Z를 65 ~ 90으로 표현함)
				if (65<=eng.charAt(i)&&eng.charAt(i)<=90) {
					flag2= true;
				}

			}

			System.out.println(flag2 ? "대문자가 포함된 문장입니다" : "오직 소문자로만 구성된 문장입니다");
		
		
	}

}
	
	

