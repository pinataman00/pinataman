package com.condition;
import java.util.Scanner;
public class ConditionController {

	/*	<조건문 if>
	 * 	if(조건문) { 조건문이 true일 때 실행될 명령어}
	 * 	if()안의 조건문은 boolean변수, 비교연산자, 논리연산자, 기능(메소드)이 들어갈 수 있다.
	 * 	true||false를 가지는 값을 말함. 
	 */

	public void ifTest() {

		if (100 < 10) {
			System.out.println("조건이 true일 때 출력해!");	//조건문이 (100<10일 경우, 이클립스에서 'Dead code'라고 알려줌)
														//(영원히 쓸 일 없는 코드라는 의미!)

		}
		System.out.println("기본 if문 실행!"); // false일 경우 실행됨
		Scanner sc= new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int su= sc.nextInt();
		//	(예제1) 입력받은 정수가 200이면, "200입니다"를 출력하는 기능 구현
		if (su==200) {
			System.out.println("200입니다.");
		}
		
		//	(예제2) 입력받은 정수가 100~200사이일 경우, "잘 입력했습니다." 출력하기

		if(100<=su&&su<=200) {
			System.out.println("잘 입력했습니다.");
		}
		
		// (예제3) 혈액형을 입력받고, 혈액형이 AB형인 경우 "좀 독특하시네요!" 출력하기
		System.out.print("혈액형을 입력하세요 : ");
		String blood= sc.next();
		if (blood.equals("AB")) {
			System.out.print("좀 독특하시네요!");
		}
		
		// (예제4) 정수를 입력받아, 그 값이 3의 배수인지 확인하는 프로그램 만들기
		// 3의 배수일 때, "3의 배수입니다." 출력
		
		System.out.print("\n정수 : ");
		int su2= sc.nextInt();
		
		if (su2%3==0) {
			System.out.println("3의 배수입니다.");
		}
		
		//	(예제5) 다니는 학원을 입력받고, 구디아카데미이면, "좋은 곳에서 수업받고 있네요."를 출력하기
		System.out.print("학원 이름 : ");
		sc.nextLine(); //입력 버퍼를 비워주자. 
		String academyName= sc.nextLine();
		if (academyName.equals("구디아카데미")||academyName.equals("구디 아카데미")) {
			System.out.println("좋은 곳에서 수업받고 있네요.");	//"if의 영역"
		}	//if의 "외부"영역
		
		/*	조건문 if > 중괄호{} 범위와 (외부/내부)변수 활용
		*	java프로그램은 {}를 기준으로, 블록 범위(scope==활용영역)를 설정함. 
		*	if의 중괄호 범위에서는 ~ (조건문이 true일 때만 -> ) 변수를 선언하고, 연산을 수행하거나, 기능(메소드)을 호출할 수 있다. 
		*/	
		//	1. if중괄호 외부에 선언된, 변수를 if문에서 사용하기 -> 可能
		
		String name= "유병승";
		
		if (su>0) {
			//외부의 변수 name 이용하기
			System.out.println(name);
			name="김동영";
			
		}	System.out.println("외부에서 출력 : "+name);
		
//		2. if중괄호 내부에 선언된 변수를, if문 외부에서 사용하기 -> 不可能
		
		if(su>0) {
			char gender = 'F';
			System.out.println(gender);
		}	
			//System.out.println(gender); //에러 발생! cannot be resolved as a variable(변수가 선언되지 않음). 
			//선언했는데? -> if문 내부 코드는, 조건문이 true인 경우에만 작동함. 
			//			  true가 가능하지 않은 경우도 있으니까... 변수가 선언되어 있다고 장담할 수 없음! 그래서 에러가 발생하는 것임. 
		
		
//		3. if중괄호 내부에서, 외부변수와 동일한 이름의 변수를 선언할 수 있다? -> 不可能
		// (사유) if문은 메소드 선언부에 '포함'되어 있음!
		
		if (su>0) {
			//String name = "황정은";	//에러 발생! "dublicate variable name(변수名 중복)"
		}
		
		//	(예제6)	사용자Client에게 이름을 입력받고, 이름이 본인 이름과 일치할 경우,
		//	"코딩 천재 000님~~" 출력하기
		
		System.out.print("이름 : ");
		String name1= sc.next();
		if (name1.equals("김도영")) {
			System.out.println("코딩 천재 "+name1+"님~~~");
		}
		
// 		4.	if문 내부에 다른 if문을 사용할 수 있음
//		(예제7) 호프집 주문 프로그램 : 성인이면 메뉴선택 (1. 맥주, 2. 양주, 3. 포도주)		
//								메뉴 선택 1은 치킨, 2는 과일, 3은 치즈 출력
		
		System.out.print("나이 : ");
		int age= sc.nextInt();
		
		if (age > 19) {

			System.out.println("=======호프 주문=======");
			System.out.println("1. 맥주 \n2. 양주 \n3. 포도주 \n○ 메뉴를 선택하세요 : ");
			int menu = sc.nextInt();

			if (menu == 1) {

				System.out.println("맥주는 치킨");

			}

			if (menu == 2) {
				System.out.println("양주는 과일");

			}

			if (menu == 3) {
				System.out.println("포도주는 치즈");
			}

		}

		
		/*	(예제8)	통장에 입금되는 프로그램 구현하기
		 * 	0. 통장 잔액은 10원
		 * 	1. 금액을 3회 입력받고, 입력받은 값이 양수일 때 통장 잔액에 값을 누적하고
		 * 	2. 잔액을 출력하세요.  
		 */
		
		int account = 10; 
		
		System.out.print("입금액 : ");
		int money = sc.nextInt();
		
		if(money>0) {
			account+=money;
		}
		
		System.out.print("입금액 : ");
		money = sc.nextInt();
		
		if(money>0) {
			account+=money;
		}
		
		System.out.print("입금액 : ");
		money = sc.nextInt();
		
		if(money>0) {
			account+=money;
		}
		
		System.out.println("잔액 : " + account + "원");
		
		
	} // 메소드 선언부

	
	public void ifelseTest() {
		
		/*	<if~ else>
		 * 	"if문의 조건식이 true가 아닐 때 실행할 명령어"를 지정할 때 else를 쓴다.
		 * 	○ else문은 단독 사용 불가 (if조건문이 false일 때 실행하므로)
		 * 	○ 둘 중 하나의 logic은 반드시 실행됨 
		 * 	(※ 삼항 연산자와 유사함)
		 */
		
		if(100<10) {
			System.out.println("100은 10보다 크다");	//Dead code (if조건문이 100<0, 즉 false로 고정되어 있음)
		} else {
			System.out.println("100은 10보다 작다");	//if조건이 false일 때는 -> else 이하 코드 실행함
		}

		// (예제1) 입력받은 수의 [홀수/짝수]여부를 판별하는 프로그램
		
		Scanner sc= new Scanner(System.in);
		System.out.print("정수 : ");
		int su= sc.nextInt();
		
		if (su % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		/* (예제2) ID, PW를 입력받고,
		 * 	ID : user01
		 * 	PW : user01
		 * 	...이면 "로그인 성공" 출력. 아니면 "로그인 실패" 출력. 
		 */
		
		System.out.println("ID : ");
		String id= sc.next();
		System.out.println("PW : ");
		String pw= sc.next();
		
		if (id.equals("user01")&&pw.equals("user01")) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
		/*	(예제3) 사용자가 미성년인지 확인 후, 
		 * 	미성년일 경우, "회원가입이 불가능합니다." 출력
		 * 	성년일 경우, 아이디, 패스워드, 이메일을 입력받는 로직 구현하기
		 */
		
		System.out.print("나이 : ");
		int age= sc.nextInt();
		
		if(age>19) {
			
			sc.nextLine(); //입력 버퍼 비워주기
			System.out.print("ID : ");
			String id2= sc.nextLine();
			System.out.print("PW : ");
			String pw2= sc.nextLine();
			System.out.print("e-mail : ");
			String email= sc.nextLine();
			
			System.out.println("===== 회원가입 완료 =====");
			System.out.println("ID : "+id2+"\nPW : "+pw2+"\ne-mail : "+email);
			
		} else {
			System.out.println("회원가입이 불가능합니다.");
		}

	}
	
	public void ifElseifTest() {
		
		/*	<if ~ else if ~ else if ~ else>
		 * 	(의의) "추가적인 경우의 수(조건)"를 처리하는 로직
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("계절을 확인하고 싶은 달 : ");
		int month= sc.nextInt();
		
		if (month==1||month==2||month==12) {
			System.out.println("겨울입니다~ 아 추워~");
		} else if (month>=3&&month<=5) {
			System.out.println("봄입니다~ 개나리");
		} else if (month>=6&&month<=8) {
			System.out.println("여름입니다~ 바다로, 계곡으로...");
		} else if (month>=9&&month<=11) {
			System.out.println("가을입니다~ 낙엽처럼...");
		} else {
			System.out.println("1~12까지의 숫자를 입력해주세요.");
		}
		
		
		/*	(예제1) 학생 성적 등급 출력하기
		 * 	90점 이상 A
		 * 	80점 이상 B
		 *  70점 이상 C
		 *  60점 이상 D
		 *  그밖에는 F
		 */
		
		System.out.print("성적 : ");
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
		System.out.println("당신의 등급은 "+grade);
		
		
		
//		System.out.print("성적 : ");
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
//				System.out.println("당신의 등급은: "+grade+="+");
//			} else {
//				System.out.println("당신의 등급은: "+grade);
//			}
//				
		}
	

	/*	public void ageMessage()생성해서, 
	 *	연령별 메시지 출력하기 
	 * 	10대 : 열심히 공부해야지 -> 좋은 대학가지
	 * 	20대 : 열심히 공부해야지 -> 취직하지
	 * 	30대 : 열심히 일해야지 -> 돈벌지
	 *  40대 : 열심히 돈벌어야지 -> 자식 먹여 살리지
	 *  50대 : 열심히 운동해야지 -> 오래 살지
	 */
	
	public void ageMessage() {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("나이 : ");
		int age= sc.nextInt();
		
		
		if (10 <= age && age < 60) {

			if (50 <= age) {
				System.out.println("50대 : 열심히 운동해야지 -> 오래 살지");
			} else if (age >= 40) {
				System.out.println("40대 : 열심히 돈벌어야지 -> 자식 먹여 살리지");
			} else if (age >= 30) {
				System.out.println("30대 : 열심히 일해야지 -> 돈벌지");
			} else if (age >= 20) {
				System.out.println("20대 : 열심히 공부해야지 -> 취직하지");
			} else if (age >= 10) {
				System.out.println("10대 : 열심히 공부해야지 -> 좋은 대학가지");
			}

		} else
			System.out.println("10~59사이의 수를 입력하세요.");

	}
	
	public void switchTest() {
		
		/*	<switch문>
		 * 	(의의) 정해진 값에 대해서 분기 처리 時 사용. 
		 * 	특정 값과 "동등 비교" 後 "true"가 나오는 구문을 실행함
		 * 	(용법) "메뉴" 생성 時, "특정 값", "연산 결과"에 대해 동등할 때
		 * 	(유의) switch의 값으로 가능한 자료형: (int정수, char문자, String문자열)
		 */
		
		/*	(예제1) 저녁 메뉴 고르기
		 * 	1. 피자
		 * 	2. 치킨
		 * 	3. 떡볶이
		 * 	4. 마라탕
		 * 	5. 햄버거
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.println("==== 저녁 메뉴 ====");
		System.out.println("1. 피자 \n2. 치킨 \n3. 떡볶이 \n4. 마라탕 \n5. 햄버거");
		
		System.out.print("○ 입력 : ");
		int cho = sc.nextInt();
		switch (cho) {
	
		case 1 : System.out.println("피자는 얼굴을 피고 먹어야지."); break;	//cho가 1이라면, 코드 실행 후 -> break를 만나 switch구문이 끝난다. 
		case 2 : System.out.println("치킨은 음치킨 음치킨~"); break;
		case 3 : System.out.println("떡볶이는 순대, 튀김과 함께"); break;
		case 4 : System.out.println("마라탕은 뭘 말지? 코드를 말면 안 돼!!"); break;
		case 5 : System.out.println("햄버거는 버거워 햄~~~!"); break;
		
		//지정한 case 外 숫자를 입력했다면?
		default : System.out.println("잘못 입력하셨습니다. 1~5사이의 숫자만 입력하세요!"); break;

		}

	}
	
	
	
	
}	//클래스 선언부

