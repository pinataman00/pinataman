package com.declare;

public class VariableTest {

	
	//클래스가 작동하기 위해서는, "main 메소드"가 필요해 
	public static void main(String[]args) {
	
		//선언된 변수 활용하기
		//선언된 변수에 "값 대입"하기
		//변수에 값을 대입할 때, "=(대입연산자)"를 활용한다. 
		//기본적으로, 대입연산자 좌측에는 "변수名"을 호출하며, 우측에는 "값(리터럴)"을 작성한다.
		//예) int age;
		//	  age=19;
		//리터럴에는 자료형에 대한 표시를 해줘야 한다. 
		
		//○ 숫자> 정수 (default타입: int)
		//byte, short, int: 그냥 숫자만 작성해도 됨
		//long: 숫자L
		
		//○ 숫자> 실수 (default타입: double)
		//float: 실수f
		//double: 실수
		
		//○ 문자형> 단일 문자
		//char: '단일 문자'
		//○ 문자형> 문자열
		//String: "문자열"
		
		//○ 논리형
		//boolean : true 또는 false
		
		boolean flag;	//RAM에 boolean자료형이 들어갈 수 있는 저장공간, flag를 만듦
		flag= true;		//flag라는 저장공간에, true라는 값(리터럴)을 넣음. 
		//★ 규칙 ★ 값 대입 時, 대입되는 변수와 동일한 자료형의 리터럴을 넣어야 한다. 
		//flag= 200; //에러 발생! 자료형이 상이하기 때문임 (에러 메시지: "type mismatch")
		flag= false; //변수 선언 後 여러 차례 값을 넣을 수 있는데, 최종 리터럴 값만 살아남는다. 
		
		int age;
		age= 19; //숫자(정수) default자료형은 int이므로, 별도로 자료형을 명기하지 않아도 됨
		//age= 180.5; //안 들어감. (double을 int로 바꿀 수 없음)
		
		//○ 선언과 동시에 초기화
		byte bnum= 127; //양수 127까지는, JVM이 알아서 int->byte로 변환해서 넣어줌
		//short snum= 2000000;
		//▶ byte, short자료형은~ int리터럴을 자동으로 "형 변환"해서 대입해줌
		

		//float height= 180.5; //에러 발생함. 180.5는 double형이기 때문임
		float height= 180.5f; //숫자f, 형태로 적어야만 함!
		
		double weight= 65.5;
		weight= 71.5;
		
		System.out.println(weight); //마지막으로 대입한 리터럴인, 71.1이 출력됨
		
		long memberNumber;
		memberNumber= 200; //200은 int값인데 long자료형 변수에 들어가네? 왜?
		//memberNumber= 130000000000; //에러 발생! "...int is out of range"
		memberNumber= 130000000000L; //숫자L, 형태로 적어야만 함! (숫자가 int형이 아니라, long형이라는 사실을 명기해야 함)
		//long은 int가 표현할 수 있는 숫자 정도는 거뜬히 커버할 수 있음! (왜냐면, long가 int보다 더 크니까)
		
		//(관습)웬만해서는 리터럴 표기법을 지켜라! (숫자f, 숫자L 등)
		
		//문자, 문자열 변수에 값 대입하기
		
		char gender;
		gender= 'M';
		//gender= M; 홑따옴표를 적지 않으면, 에러 발생. 왜냐면 M을 코드의 일부로 인식하기 때문임. 
		//gender= 'ab'; //홑따옴표 內, 반드시 한 음절, 한 개의 글자만 들어올 수 있다. 
		
		//문자열
		String msg;
		msg= "남자";
		msg= "AB";
		msg= "여러분 개강한 지 벌써 3일 차네요. 다들 아직 할 만 하시죠?";
		msg= "1234"; //숫자 대입 또한 가능. 그러나 문자로 인식함.
		msg= "하"; //단일 문자 또한 대입 가능
		
		//변수에 값을 넣었으면, 해당 데이터를 가지고 뭔가를 하면 좋겠지. 
		//변수에 저장된 값을 가져오기
		//1. 변수名을 이용한다. (따라서, 변수명 작명 時, 어떤 데이터가 들어있는지 누구나 쉽게 예측할 수 있는 이름을 고안해야 함)
		
		boolean flag2= flag; //flag라는 저장소를 불러와서, 해당 변수 內 값을 불러와서, flag2에 넣어라...는 의미
		
		//2. 변수에 저장된 값 확인하기: 특정 기능을 보유한 메소드를 불러오기 (기능=메소드, 라고 생각하자)
		//자바에서 제공하는 '기능(메소드)'을 이용하자. 
		System.out.println(flag2); //flag라는 저장소에 가서, 해당 저장소에 들어있는 값을 출력하라...는 의미
		
		//age변수에 저장된 값 확인하기
		System.out.println(age);
		age=20;	//코드는 위에서 아래로 흐르기 때문에, 상기 메소드는 19를 출력한다. 
		System.out.println(age); //이제 업데이트된 값인, 20이 출력된다. 
		
		System.out.println(height);

		System.out.println(weight);
		

		//System.out.println(nickName); //에러 발생! 호출 時 변수 선언이 완료되어 있어야 했음
		//▶ nickName이라는 변수를 만들어보자. 
		//★ 변수type은, 사용자가 '어떤 type의 값'을 입력할지 예측해서 지정해야 한다. 
		String nickName;
		//System.out.println(nickName); //에러 발생!
		//왜냐면 "지역변수(local variable)(=해당 메소드 內에서만 쓰는 변수)"는 반드시, "초기화(initialize)"해야 함
		nickName= "멍멍이";
		System.out.println(nickName);
		
		//학점을 저장할 수 있는 변수를 선언하고, 출력해보자
		//학점은 본인 학점으로 저장할 것
		
		double grade= 3.6;
		System.out.println(grade);
		
		//타입이 동일한 여러 변수 한 번에 선언하기
		//국어, 영어, 수학 점수를 저장하기 위한 변수 선언
		
//		int kor;
//		int eng;
//		int math;		
		
		int kor, eng, math;
		
		String name,phone,address;
		
		kor=100;
		eng=100;
		math=100;
		name= "유병승";
		phone="010-3644-6259";
		address= "경기도 시흥시";
		
		//변수 선언과 동시에 초기화하기
		
		int coding= 90, science= 90;
		char blood='a', gender2='여';
		
		//변수명에 한글 사용 가능함
		String 반장;
		반장= "이민규";
		//하지만 한글은 쓰지 마
		
		/*	<상수 이용하기>
		 * 	상수는 프로그램內, 고정값으로 활용해야 하는 데이터를 저장할 때 사용 (ex. 에러 코드 등)
		 * 	상수는 "대문자"로 작성하며, 여러 단어가 이어질 때는 "언더바_"로 구분한다. 
		 * 	예) ADMIN_NUMBER, ERROR_E202
		 * 	선언 방식: fianl예약어를 사용함.
		 * 	final String NAME; 
		 */
		
		final String ERROR;
		ERROR= "프로그램 에러";
		System.out.println(ERROR);
		//ERROR= "시스템 에러"; //에러 발생!
		//상수는 "고정값"이므로, 변수 초기화 後 다시는 변경할 수 없음
		//ERROR라는 변수 자체는 여러 번 불러오며 쓸 수 있지만, 값을 수정할 수는 없다는 의미!
		
		
		
		
	}
	
	
}
