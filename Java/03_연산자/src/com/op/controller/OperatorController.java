package com.op.controller;

import java.util.Iterator;
import java.util.Scanner;

public class OperatorController {
	//	주요 기능을 보유한 클래스
	

	public void singleOp() {
		/*
		 * 	<단항 연산자>
		 * 1. 부정 연산자 : "boolean형" 데이터를 "반전"시키는 연산 (true->false || false-> true)
		 * 			   : (표현식) !변수名
		 */
	
	System.out.println("====부정연산자====");
	boolean flag= true;
	System.out.println("flag: "+flag);
	boolean flag2= !flag;	//flag를 "반전"시켜 flag2에 저장함 
	System.out.println("flag2: "+flag2);
	flag2= !!flag; //true->false->true
	System.out.println("flag2: "+flag2);
	
	//-------------------------------------------------------------------------------------------------------
	//○ (예시)실질적으로 부정연산자를 쓰는 경우
	String name= "유병승";
	//이름이 '유병승', 이 "아니면" -> 부정 연산
	System.out.println(!name.equals("유병승"));	//"'equals소괄호 內 데이터와~ name변수內데이터가', 같지 않다면~", 이라는 의미
	//name변수에 '승', 이 포함되어 있지 "않으면"
	System.out.println(!name.contains("승"));
	if(!name.equals("유병승")) {
		//if조건-> 이름이 "유병승"이 아닐 경우, ~연산을 처리하라
	}
	//-------------------------------------------------------------------------------------------------------
	
	
	/* 	
	 * 2. [증가/감소] 연산자 : 
	 * 
	 * (유형)
	 * ++변수名: 증가 변수 內 값에 +1하고, 해당 결과값을 당해 변수에 저장
	 * 		 : 변수名=변수名+1;
	 * --변수名: 증가 변수 內 값에 -1하고, 해당 결과값을 당해 변수에 저장
	 * 		 : 변수名=변수名-1;
	 * 
	 * (용도)
	 * 1. 반복문 처리
	 * 2. 횟수를 셀 때 counting (1씩 증가하는 셈이니까)
	 * 
	 */
	
	int su= 10;
	++su;	//su=su+1;
	++su;	//1을 한 번 더 증가시킴
	System.out.println("su= "+su); //10+1+1 後 결과값12을 다시, 변수su에 저장함
	--su;
	System.out.println("su= "+su); //11
	
	int count=0;
	for (int i=0;i<10;i++) {	//0에서 10까지 개수가 하나씩 증가시키고 싶을 때~ ++를 쓴다.
		
		if (i%2==0) count++;	//0~10 중에서 짝수의 개수를 구할 때, count값이 올라가겠지
	}
	
	/*	[전위/후위]증감연산자
	 * 	○ 전위 : 변수 前에 (증가/감소) 연산을 사용함
	 * 	○ 후위 : 변수 後에 (증가/감소) 연산을 사용함
	 */
	
	su++;
	System.out.println("su= "+su);
	
	su--;
	System.out.println("su= "+su); //11
	
	//단독 사용時, 전위/후위 연산의 차이는 없음
	//★ 他연산자와 같이 사용 時, 차이 발생함
	int su2= 0;
	su=10;
	su2= ++su;	//[연산 순위] 전위연산-> 대입 연산(=)
	System.out.println("su2= "+su2+", su= "+su); //11
	su=10;
	su2= su++;	//[연산 순위] 대입연산(=)-> 후위 연산 
				// -> su2에 su의 데이터를 넣고 -> su를 1증가시킴
	System.out.println("su2= "+su2+", su= "+su); //11(x) 10(o)
	su2= 100;
	
	su2= su+++100;	//후위연산은 맨 마지막에 처리한다
					//su+100의 결과값을 su2에 넣는다. -> 이후, su를 1 증가시킨다.
	System.out.println(su2);
	
	} //singleOp메소드 닫는 중괄호
	
	public void calculatorOp() {
		/*
		 * <산술 연산자>
		 * (유형) + - / * %
		 */
		
		int su=10;
		int su2=20;
		
		//○ 더하기 연산 (※ 문자열끼리: 결합 연산)
		int result= su+su2;
		System.out.println("su+su2= "+result);
		
		//○ 빼기 연산 (※ 문자열끼리: 결합 연산)
		result= su-su2;
		System.out.println("su-su2= "+result);
		
		result= su+20;
		System.out.println("변수+리터럴= "+result);
		
		result= su+100+su2-200-6;
		System.out.println(result);
		
		String strSu= "20";
		//result=strSu+su2;	//String과 int는 연산할 수 없다. 
		
		//○ 곱하기 연산
		result= su*su2;
		System.out.println("곱하기= "+result);
		
		//○ 나누기 연산 -> 나머지값(소수점)이 나올 확률이 크기 때문에... double형으로 만드는 게 좋다. 
		double result2= (double)su/su2;	//double(실수, 8byte)을 int(정소, 4byte)로 바꿀 수 없으므로... 
										//double형을 저장할 수 있는 변수, result2를 새로 만듦
		System.out.println("나누기= "+result2);
	
	
		result2= su/3.0;
		
		System.out.println("나누기: "+result2);
	
		/*	○ 나머지 연산 -> %
		 * 	-> 짝수, 홀수, 배수, 약수... 등을 구할 수 있다. 
		 * 	왜 프로그래밍에 나머지를 구하는 연산이 필요할까?
		 * 	코딩에 요긴한 쓰임이 있기 때문이지! 
		 * 	(팁)수의 법칙을 파악하면 돼!
		 * (ex. n%2=0이면 짝수, n%2=1이면 홀수)
		 * (ex. n이 3의 배수 -> n%3=0)
		 * (ex. 소수(1과 자기 자신만이 약수가 됨)
		 */
		
		result= su%3; //나머지, 니까 결과로 정수가 나오겠지
		
		System.out.println("나머지 : "+result);
		
		
		
	}
	
	
	


	public void compareOp() {
		
		/*	<비교 연산>
		 * 	(결과)boolean형: true / false
		 * 	1. 동등비교연산: "임의의 두 값(두 변수)"이 동일한지 비교하는 연산
		 * 	동등비교(==)는, 변수에 있는 값 자체를 비교함 (따라서 char도 비교연산이 가능한 것임 (ex. A는 65))
		 */
		
		System.out.println("======= 비교연산 =======");
		//숫자 동일여부 비교
		int num=13;
		int num2= 19;
		int num3= 13;
		
		//○ 동등비교 : ==
		System.out.println(num==num2);	//false
		System.out.println(num==num3);	//true
		
		//○ 일치하지 않는 것을 비교 : !=
		System.out.println(num!=num2);	//true		(상기 코드와 반대의 boolean값이 도출됨)
		System.out.println(num!=num3);	//false
		
		//int형뿐만 아니라, double형도 비교 가능!
		double dnum= 180.5;
		double dnum1= 190.5;
		double dnum2= 180.5;
		System.out.println(dnum==dnum1);
		System.out.println(dnum==dnum2);
		
		//단일 문자 비교 > char 비교하기
		System.out.println("====== char 비교 ======"); //가능하다! 왜냐면, 동등비교는 변수에 있는 값 자체를 비교하기 때문!
		char ch= 'A';
		char ch1= 'Z';
		char ch2= 'A';
		char ch3= 'a';
		
		
		System.out.println(ch==ch1); //false
		System.out.println(ch==ch2); //true
		System.out.println(ch==ch3); //false (아스키코드, 대문자A와 소문자a의 값은 상이하기 때문임)
		
		System.out.println(ch!=ch1); //true
		System.out.println(ch!=ch2); //false
		
		//문자열 비교 > String 비교하기
		System.out.println("====== String 비교 ======");
		String str= "유병승";
		String str1= "유병승";
		String str2= "황정은";
		
		String str3= new String("유병승"); 
		
		//★ String은 Class임. Class는 비교하는 방법이 다른 자료형과는 달라. 
		System.out.println(str==str2);	//false
		System.out.println(str==str1);	//true
		
		System.out.println(str==str3);  //true...가 아니라, false! 왜?
										//동등비교, 하니까 false가 나오네?
		
		Scanner sc= new Scanner(System.in);
		System.out.println("이름 : ");
		String name= sc.next();
		System.out.println(str+" : "+name); //변수 안에 데이터가 잘 들어갔는지 확인
		System.out.println("동등비교 활용한 문자열 비교 : "+str==name);
		
		//왜 똑같이, name에 '유병승'을 넣어도~ str(유병승)과는 다르다는 결과가 반환될까?
		//★ "동등 비교(==)"는 변수에 있는 "값" 자체를 비교하기 때문이야. 
		//문자열String은 Class. "참조형 자료형"인데, 마치 "기본 자료형"인듯 쓸 수 있게 만들어 둔 것임.
		//(유의) Class의 데이터를 동등비교할 때는, ==으로 비교할 수 없다!!!!!!!!
		//(결론) Class는~ equals()라는 기능을 이용한다. 
		
		//(사유)
		//Class는 Heap內 별도의 공간을 확보해 이용하게 되어 있음. 
		//따라서, Class이용 時, "new 연산자"를 이용하는 것임.  
		//(new연산자의 기능 : heap에 공간을 확보해줌)
		//기본형 자료형은 stack영역에 데이터를 그대로 저장함 (int su=10; 일 경우, 10이라는 값을 그대로 저장해두는 것임)
		//참조형 자료형은, new연산자를 이용해서-> heap에 영역을 확보하고-> 해당 영역에 데이터(ex. "황정은")를 저장하고...
		//			  -> 해당 영역의 "주소"를 stack에 저장해둠. ★ 이때, 주소는 절대!!! 중복되지 않음!	★
		//			     즉, 문자열 변수 name1, name2에 똑같이 "황정은"을 입력했더라도,
		//				 heap의 주소는 반드시 고유하기 때문에, stack영역엔 각기 "다른 주소값"이 저장됨!
		//			    (결론) 동등비교는 '값'을 비교하는 것이므로... 
		//				String을 비교할 경우, "서로 '다른' 주소값"을 비교하게 되기 때문에, 반드시 false가 반환됨.
		//				따라서, equals()메소드를 활용해 비교해야 한다!
		//				(참고) 동등비교 != 동일비교
		//				○ 동등비교 : 단순히 값 자체를 비교함	 (0111 != 0155) (예로 든 0111은 heap영역의 주소값) 
		//				○ 동일비교 : 실질적인 데이터를 비교함 (황정은 = 황정은)	(예로 든 황정은은 heap영역에 저장된 실질적인 데이터!)
		//				(리마인드) 나중에, Override를 공부할 때 다시 배울 것임!
		
		
		//○ equals()메소드 사용법
		// "리터럴".equals("비교 문자열");
		// 문자열변수名.equals("비교 문자열");
		// 문자열변수名.equals(비교 대상 문자열변수名);
		// "리터럴".equals(비교 대상 문자열변수名);
		
		System.out.println("equals()메소드 활용한 문자열 비교 : "+str.equals(name));
		System.out.println("equals()메소드 활용한 문자열 비교 : "+str.equals("황정은"));
		
		//○ equals()의 부정연산 : 부정연산자(!)를 이용하면 되지!
		// : 비교 대상의 문자열이, 특정 문자열과 "일치하지 않지?" 묻고 싶을 때
		System.out.println(!str.equals(name)); // 일치하지 않을 경우, true가 나옴!
		
		
		
		/*	<대소 비교>
		 *  숫자 값에 대한 대소비교
		 */
		 
		int su= 100;
		int su2= 200;
		int su3= 100;
		System.out.println("=====숫자 대소비교하기=====");
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
		
		//문자(char) 대소비교하기-> 가능! (내부적으로는 '숫자'가 저장되기 때문임)
		System.out.println("=====문자 대소비교하기=====");
		char ch4= 'A';
		char ch5= 'Z';
		char ch6= 'A';
		System.out.println(ch4<ch5);
		System.out.println(ch4<ch6);
		System.out.println('A'<='C'); //문자로 대소비교 가능!
		
		//문자열(String) 대소비교하기-> 불가능!
		//System.out.println(str<str2);	//에러 발생! "동등 비교(equals.())"만 가능함!
		
		String suStr= "20";
		String suStr2="30";
		//System.out.println(suStr<suStr); //에러 발생! -> 쌍따옴표가 들어가는 순간, 숫자를 적었더라도 '문자'로 인식함!
		
	}
	
	public void logicalOp() {
		
		/*	<논리 연산>
		 * 	(의의) 논리를 and || or로 연결한 결과를~ true||false로 가져옴
		 * 	&&(and): 2개 논리가 "모두" ture일 때, true를 가져옴
		 *  ||(or) : 2개 논리 중 "하나만" true여도, true를 가져옴
		 */
		 
		// ID가 admin이고 패스워드가 1234이면 true반환하는 논리 연산
		
		String id= "admin";
		String password= "1234";
		
		System.out.println(id.equals("admin")&&password.equals("5555")); //password가 false이므로~ false가 반환됨!
		
		//	or연산
		//	입력받은 값이 '남'이나 '여'이면, true를 반환
		Scanner sc=new Scanner(System.in);
		
//		System.out.println("성별(남/여)을 입력해주세요: ");
//		String gender= sc.next();
//		
//		System.out.println(gender.equals("남")||gender.equals("여"));
//		
//		//논리연산으로 범위를 표현할 수 있다. 
//		//	입력받은 값이, 10~20사이의 수이면, true
//		
//		System.out.println("숫자를 입력하세요: ");
//		int input=sc.nextInt();
//		
//		System.out.println("입력한 숫자는, 10~20사이의 수일까요? :"+(input>=10&&input<=20));
		
		//예제. 
		//나이를 입력받아-> 고등학생일 경우 true, 아닐 경우 false를 출력하는 기능 구현
		
//		System.out.println("나이를 입력하세요: ");
//		int age= sc.nextInt();
//		System.out.println("당신은 고등학생입니까?: "+(age>=17&&age<=19));
		
		/*	예제.
		 * 	나이와 성별을 입력받아,
		 * 	나이가 20대이고, 성별이 여자일 경우 true반환/ 아니면 false반환
		 */
		
//		System.out.println("나이를 입력하세요: ");
//		int age2= sc.nextInt();
//
//		System.out.println("성별을 입력하세요: (남자/여자)");
//		String gender2= sc.next();
//		
//		System.out.println(age2>=20&&age2<=29&&gender2.equals("여자"));
		
		//사는 곳이 서울이나 인천인 경우, true 아니면 false 출력
		
//		System.out.println("거주하는 도시의 이름을 입력하세요(ex. 용인): ");
//		
//		String city= sc.next();
//		System.out.println("당신은 서울시 또는 인천시에 거주 중입니다: "+(city.equals("서울")||city.equals("인천")));
		
		//사는 곳이 서울 또는 인천이면서, 나이가 30대인 사람 true
		
		System.out.println("거주하는 도시의 이름을 입력하세요(ex. 용인): ");
		String city2= sc.next();
		int age3= sc.nextInt();
		
		//System.out.println(city2.equals("서울")||city2.equals("인천")&&age3>=30&&age3<=39); //틀렸어! 서울 29세여도 true가 나오거든
		//System.out.println((city2.equals("서울")||city2.equals("인천"))&&age3>=30&&age3<=39); //or부분을 먼저 연산하도록 소괄호로 묶어보자!
		
		//선생님 풀이
		boolean flag= city2.equals("서울")||city2.equals("인천")
					  &&age3>29&&age3<40; //틀렸어! 서울 29세여도 true가 나오거든
					  
		// TODO ★ 우선순위 && -> ||
		// 연산 과정 풀이
		// 1.	인천인가?f && 29세 넘겼나?f -> "f"
		// 2.	f && 40세 미만인가?t -> "f"
		// 3.	서울인가?t || f -> "t"
					  
		//그래서, 우선 순위를 바꿔보려고 "소괄호"를 사용했어
		boolean flag2= (city2.equals("서울")||city2.equals("인천"))
					  &&age3>29&&age3<40;			  
					  
		System.out.println(flag2);
	}
	
	public void complexOp() {
		
		/*	<복합 대입연산자>
		 * 	(용도) 주로 값을 누적or차감 時 사용함
		 */
		
//		int account= 100;
//		
//		//account= account+10;
//		//System.out.println(account);
//		account+=10;
//		System.out.println("통장 잔액: "+account);
//		account-=10;
//		System.out.println("통장 잔액: "+account);
		
		
		/*	예제.
		 * 	수학, 영어, 국어, 코딩 점수를 입력받고
		 * 	합계를 출력해주는 기능을 구현하세요. 
		 */
		
		//int math,eng,kor,coding;	//어차피 total만 구할 거니까! 굳이 변수를 일일이 만들지 않아도 되겠지!
									//단, 따라서 각 과목의 점수는 출력할 수 없다. 
//		int total=0;
//		
		Scanner sc= new Scanner(System.in);
//		System.out.println("수학 점수를 입력하세요: ");
//		
//		total+=sc.nextInt();	//어차피 total만 구할 거니까! 굳이 변수에 일일이 넣지 않아도 돼
//		//math= sc.nextInt();
//		//total+=math; //total= total+math;
//		System.out.println("영어 점수를 입력하세요: ");
//		//int eng= sc.nextInt();
//		total+=sc.nextInt();
//		System.out.println("국어 점수를 입력하세요: ");
//		//int kor= sc.nextInt();
//		total+=sc.nextInt();
//		System.out.println("코딩 점수를 입력하세요: ");
//		//int coding= sc.nextInt();
//		total+=sc.nextInt();
//		
//		//int total=math+eng+kor+coding; //어휴 이건 대입연산자를 적용한 풀이가 아니잖니!
//
//		System.out.println("점수 총계= "+total);
		
		/*	예제.
		 * 	초기값 50000원을 변수에 저장하고,
		 * 정수 4개를 입력받아, 입력받은 값만큼 초기값에서 차감하여
		 * 잔액을 출력하는 기능 구현하기
		 * 
		 */
		
		int won= 50000;
		System.out.println("금액을 4회 입력하세요: ");
		won-=sc.nextInt();
		won-=sc.nextInt();
		won-=sc.nextInt();
		won-=sc.nextInt();
		System.out.println("잔액= "+won);
		
		for(int i=0;i<4;i++) {
			System.out.println("금액을 입력하세요: ");
			won-=sc.nextInt();
		}
		System.out.println("잔액= "+won);
		
		//누적연산 > 문자열도 가능한가?
		// String msg += "문자"; || String msg-= "문자"; 
		
		// 문자열에 대한 플러스 연산은 가능! -> String msg= msg+"문자";
		// 문자열에 대한 마이너스 연산은 불가능! -> String msg= msg-"문자";
		// (결론) 문자열을 지정변수에 누적시킬 때 가능함
		
		//(사용 예시) 사용자Client에게 문자 값을 4개 입력받고, 입력받은 값을 한 번에 출력하기
		
		String msg = ""; //변수 생성 後 빈 값을 저장 (지역 변수를 만들면, 반드시 초기화해줘야 하기 때문임)
		
		sc.nextLine();	//이전에 sc.next()로 입력 받아왔으므로... 입력 버퍼를 비워줘야지!
		System.out.print("입력 : ");
		msg += sc.nextLine();
		System.out.print("입력 : ");
		msg += sc.nextLine();
		System.out.print("입력 : ");
		msg += sc.nextLine();
		System.out.print("입력 : ");
		msg += sc.nextLine();
		System.out.println("입력 값 : "+msg);
		
		/*	웹에서 문자열 누적처리하기
		 * 	페이지 구성 時
		 */
		
		String content = "";
		content += "<html>";
		content += "<head>";
		content+= "<title>나의 페이지</title>";
		content+= "</head>";
		content+= "<body>";
		content+= "<h1>나의 첫 페이지</h>";
		content+= "</body>";
		content+= "</html>";
		
		//content에 누적된 문자열들이, 결과적으로 하나의 페이지를 구성하게 됨!
		System.out.println(content);
		
	}
	
		public void thirdOp(){
			
			/*	<삼항 연산자>
			 * 	(의의) "조건문(가정, 경우의 수: '~ 한다면')"의 결과에 따라, 실행되는 내용을 지정할 수 있는 연산자
			 * 	조건문(true||false) ? true일 때 실행될 내용 ! false일 때 실행될 내용; 
			 */	
			 
			//(예제) "(조건문)변수 su에 있는 값이 10과 일치하면", (true)"우와 10이다", (false)다르면 "10이 아니네...ㅠ"를 출력하세요. 

			int su= 10;
			String msg = su==10 ? "우와 10이다" : "10이 아니네...ㅠ";	//조건에 따라서, 변수msg에 들어갈 문구가 달라지게 됨
			System.out.println(msg);
			
			//사용자에게 값을 입력받아 처리하는 코드
			Scanner sc= new Scanner(System.in);
			System.out.println("입력 : ");
			int su2 = sc.nextInt();
			System.out.println(su2==10 ? "우와 10이다" : "10이 아니네...ㅠ");
			
			
			//(예제2) 정수 한 개를 입력받아, 입력받은 수가 100보다 클 경우, 
			// "우와 100보다 크다!"
			// "에이 100보다 작네!" ...를 출력하기
			
			System.out.println("정수 : ");
			int su3= sc.nextInt();
			
			String result= su3==100 ? "100이다!" : (su3>100 ? "우와 100보다 크다!" : "에이 100보다 작네!");
			System.out.println(result);
			
			/*	(예제3) 사용자가 미성년일 경우, "열심히 공부하세요"
			 * 	성년일 경우, "돈을 열심히 버세요" 출력하기
			 */
			
			System.out.print("나이를 입력하세요 : ");
			int age= sc.nextInt();
			String msg2= age<20 ? "열심히 공부하세요" : "돈을 열심히 버세요";
			System.out.println(msg2);
			
			/*	(예제3) 사용자에게 ID와 PW를 입력받고
			 * 	ID : admin
			 * 	PW : 1234
			 * 	일치 時 "로그인 성공"
			 * 	불일치 時 "로그인 실패"
			 */
			
			System.out.print("ID : ");
			String id= sc.next();
			System.out.print("PW : ");
			String pw= sc.next();
			
			//Class의 데이터를 동등비교 時, ==을 쓰면 안 됨
			//왜냐면, Class를 사용하기 위해선, new연산자를 이용해 heap영역에 저장 공간을 만들어야 하고, 
			//stack영역엔 상기 heap영역에 확보된 주소값이 저장됨 (* 주소값은 절대 중복되지 않음)
			//그리고 ==을 쓰면, stack영역에 저장된 '주소값'을 기준으로 대상 간 비교가 진행됨 (* 주소값은 절대 중복되지 않으므로, 비교 時 언제나 false가 나옴) 
			//따라서, ==이 아니라 "equals()메소드"를 사용해 *실질적인 데이터를 비교해야 함
			String msg3= id.equals("admin")&&pw.equals("1234") ? "로그인 성공" : "로그인 실패";
			System.out.print(msg3);
			
			/*	(예제4) 구디 아카데미 학생이면,
			 * 	"열심히 코딩 공부해봐요"
			 * 	아니면, "수강등록하실래요?" 출력
			 */	
			
			System.out.print("구디 아카데미 학생이신가요?  : (Y/N) ");
			String answer = sc.next();
			String msg4= (!answer.equals("Y")&&!answer.equals("N")) ? "잘못 입력하셨습니다. Y또는 N을 입력하세요." : 
						 (answer.equals("Y") ? "열심히 코딩 공부해봐요." : "수강등록하실래요?");
			
			System.out.println(msg4);
			
			/*	삼항연산자 > "중첩"처리 또한 가능!	> 그러나 사용을 권장하진 않음. (가독성 떨어짐)
			 * 	조건문 ? true일 때 실행 : false일 때 실행; 
			 */
			
			/*	(예제5) 연령 확인 후, 
			 * 	미성년일 경우 "집에 가" 출력
			 * 	성년일 경우
			 * 	남성이면 "멋지네요"
			 * 	여성이면 "예쁘네요" 출력
			 * 	입력 값 두 개를 먼저 받아서 처리
			 */
			
			System.out.print("연령 : ");
			int age2 = sc.nextInt();
			System.out.println("성별 : (M/F)");
			char gender= sc.next().charAt(0); 
			//TODO sc.next()는 문자열을 받아오는 메소드임. 
			//따라서 sc.next()를 통해 String으로 값을 받고 -> charAt(인덱스 번호)을 통해 char값 가져와도 됨!
			//String gender2 = sc.next();

			String msg5 = age2 < 20 ? "집에 가" : gender== 'M' ? "멋지네요" : "예쁘네요";
			System.out.println(msg5);
			
			/*	간단 조건으로 무언가를 실행할 때 사용
			 * 	jsp구문
			 * <input type= 'checkbox'> name "test" <%data ==1? "checked" : ""%>>
			 */

		}
		
		
		// <비트 연산자>
		public void bitOp() {
			
			/*	<비트 연산>
			 * 	(의의) 저장소(변수)에 있는 비트끼리 연산을 수행하는 것
			 * 	A&B	(and연산): A와 B, 각 비트의 값이 "모두 1"일 時 1을 출력함. 아닐 경우 0을 출력함. 
			 * 	A|B (or연산) : A와 B, 각 비트의 값이 "하나라도 1"일 時 1을 출력함. 아닐 경우 0을 출력함. 
			 * 	A^B (xor연산)	: A와 B, 각 비트가 서로 "다른 값"이면 1을 출력함. "같은 값"이면 0을 출력함.
			 * 	~A			: 각 비트를 모두 "반전"시키는 연산
			 * 	A<<2, A>>2	: 비트 값 자체를, 왼쪽||오른쪽으로 "이동"시킴 (2의 배수로 "곱하기/나누기" 효과) 
			 */
			
			int a=10, b=22;
			String basic = "";
			for (int i=0; i<32 ; i++) {
				basic +="0";
			}
			
			String bit= basic+Integer.toBinaryString(a);
			bit= bit.substring(bit.length()-32);
			System.out.println(bit+" -> a 비트값");

			bit= basic+Integer.toBinaryString(b);
			bit= bit.substring(bit.length()-32);
			System.out.println(bit+" -> b 비트값");
			
			//"비트 연산 결과" 확인하기
			bit= basic+Integer.toBinaryString(a&b);
			bit= bit.substring(bit.length()-32);
			System.out.println(bit+" -> a&b 비트값");	
			
			bit= basic+Integer.toBinaryString(a|b);
			bit= bit.substring(bit.length()-32);
			System.out.println(bit+" -> a|b 비트값");	
			
			bit= basic+Integer.toBinaryString(a^b);
			bit= bit.substring(bit.length()-32);
			System.out.println(bit+" -> a^b 비트값");	
			
			bit= basic+Integer.toBinaryString(~a);
			bit= bit.substring(bit.length()-32);
			System.out.println(bit+" -> ~a 비트값");	
			
			bit= basic+Integer.toBinaryString(a<<1);	//a*2 a*4
			bit= bit.substring(bit.length()-32);
			System.out.println(bit+" -> a<<1 비트값");	
			
			bit= basic+Integer.toBinaryString(a>>1);	//a/2 a/4
			bit= bit.substring(bit.length()-32);
			System.out.println(bit+" -> a>>1 비트값");	
			
		}
		
		
		
}
