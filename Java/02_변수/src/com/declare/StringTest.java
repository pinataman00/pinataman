package com.declare;

public class StringTest {

	public static void main(String[]args) {
		
		/*	<String 자료형 활용하기>
		 * 	String은 "클래스/객체"임
		 * 	그러나, "기본 자료형"처럼 사용할 수 있음 (본래 클래스를 이용하라면... 객체를 생성하고... 일련의 절차가 필요함)
		 */
		
		//이름 저장하기
		String name= "유병승"; //기본 자료형처럼 사용함
		
		//본래, String은 클래스!
		//▼일반적으로 "클래스"를 사용할 때 필요한 코드 작성
		String nameObject= new String("유병승");
		
		System.out.println(name);
		System.out.println(nameObject);
		
		//	문자열은 "+연산"을 사용했을 때, "문자열을 합치는" 결합 연산을 수행함
		
		//int형의 더하기 연산
		int su= 20+20;
		System.out.println(su);
		
		//문자열의 더하기 연산
		String temp="20"+"20";
		System.out.println(temp); //상기 문자열 두개를 결합한 결과가 출력됨
		temp= 10+"30";	
		//★ 그냥 숫자10(정수)은 int일 텐데, 에러가 발생하지 않음(type mismatch에러가 안 남). 왜?
		//문자열을 기준으로, '더하기'하면~ 무조건 '결합'연산이 수행됨
		System.out.println(temp);
		temp= 10+20+"30";//3030이 출력됨. 
		//int(정수)+int(정수)+String=> "int+int"를 먼저 연산하고, 뒤에 문자열을 더함
		//★ 더하기는, 이항연산. 그리고 코드는 왼쪽에서 오른쪽으로 흐름. 
		temp= "30"+10+20;
		System.out.println(temp); //301020이 출력됨
		//괄호를 활용하면, 연산의 우선 순위를 바꿀 수 있다. 
		temp= "30"+(10+40); //3030이 출력됨
		System.out.println(temp);
		
		//나이와 성별을 출력하는 프로그램 작성하기
		
		int age=19;
		char gender= 'M';
		
		System.out.println("당신의 나이는: "+age+" 성별은: "+gender);
		
		//변수 이용 출력
		String msg="당신의 나이는 "+age+" 성별은 "+gender; //어차피, String이 기준이 되면 모두 문자열이 되니까, 이런 형태로도 변수 초기화 가능함
		System.out.println(msg);
		//System.out.println(age+gender);
	
		//String은 클래스!
		//클래스는 유용한 기능(메소드)을 보유하고 있음
		/*	1. String이 저장하고 있는, "문자열의 길이(음절 개수)"를 알 수 있음 -> String.length()메소드를 이용하자
		 * 	변수名.length()
		 */
		
			String lengthTest= "점심은 맛있게";
			System.out.println(lengthTest.length());	//lengthTest에 저장된 문자열의 개수를 출력함. 7가 출력됨
			//컴퓨터는 0과 1만 안다. 문자를 숫자로 mapping시킴-> ex. 아스키 코드
			//공백 또한 일종의 문자로 처리되어, 문자 개수로 7이 출력된 것임
			int size= lengthTest.length(); //길이는 '숫자'니까, int형 변수에 저장할 수 있음
			System.out.println(size);
			
		 /*	2. String이 저장하고 있는 문자열의, "단일 문자"를 확인할 수 있음
		 * 	변수名.charAt(숫자); //숫자는 "index번호", 0부터 시작함!
		 */
			System.out.println(lengthTest.charAt(0));
			System.out.println(lengthTest.charAt(1));
			//lengthTest에서 "맛" 출력하기
			System.out.println(lengthTest.charAt(4));
		
			//"리터럴"을 이용해서도, 기능(메소드)활용 가능함
			size= "구디아카데미".length();
			System.out.println(size);
		
			System.out.println("구디아카데미".charAt(4));

			//실습 예제(1)
			//본인의 이름, 나이, 성별(한 글자 M/F), 주소, 키, 몸무게, 결혼 여부
			//~를 저장하는 변수를 만들고 -> 값을 저장하고-> 아래와 같이 출력하기
			//나의 이름은 000이고 나이는 00살 0(성별)입니다. 사는 곳은 000이고 키는 000cm 몸무게는 00kg 결혼은 false/true입니다. 
			
			//풀이. 변수名 고안하기> 변수가 어떤 데이터를 의미하는지 예측할 수 있도록!
			
			String myName= "김도영";
			int myAge= 32;
			char myGender= 'F';
			String myAddress= "용인시";
			int myHeight= 160;
			int myWeight= 50;
			boolean maritalStatus= false;
			
			//문자열을 기준으로 결합하면, 문자열이 된다는 사실을 명심하자!
			System.out.println("나의 이름은 "+myName+"이고, "+"나이는 "+myAge+"입니다. "
					+ "사는 곳은 "+myAddress+"이고 키는 "+myHeight+"cm 몸무게는 "+myWeight+"kg 결혼은 "+maritalStatus+"입니다.");
			
			//실습 예제(2)
			//2-1. 출력 문장의 문자 개수 출력하기
			//2-2. 출력한 문장의 첫 번째, 두 번째 문자 출력하기
			
			//풀이. 1 (변수를 따로 만듦)
			String myInfo= "나의 이름은 "+myName+"이고, "+"나이는 "+myAge+"입니다. "
					+ "사는 곳은 "+myAddress+"이고 키는 "+myHeight+"cm 몸무게는 "+myWeight+"kg 결혼은 "+maritalStatus+"입니다.";
			
			System.out.println(myInfo);
			System.out.println(myInfo.length());
			System.out.println("첫번째 문자: '"+myInfo.charAt(0)+"' 두번째 문자: '"+myInfo.charAt(1)+"'");
			System.out.println(myInfo.charAt(0)+myInfo.charAt(1)); //숫자가 나옴. 왜? 한 개의 문자는 내부적으로 '코드(숫자 형태)'임. 따라서 코드 값이 나오는 것임
			System.out.println(""+myInfo.charAt(0)+myInfo.charAt(1)); //
			
			//풀이. 2
//			System.out.println(("나의 이름은 "+myName+"이고, "+"나이는 "+myAge+"입니다. "
//					+ "사는 곳은 "+myAddress+"이고 키는 "+myHeight+"cm 몸무게는 "+myWeight+"kg 결혼은 "+maritalStatus+"입니다.").length());	
//			System.out.println("첫 번째 글자 : "+("나의 이름은 "+myName+"이고, "+"나이는 "+myAge+"입니다. "
//					+ "사는 곳은 "+myAddress+"이고 키는 "+myHeight+"cm 몸무게는 "+myWeight+"kg 결혼은 "+maritalStatus+"입니다.").charAt(0));
//			System.out.println("두 번째 글자 : "+("나의 이름은 "+myName+"이고, "+"나이는 "+myAge+"입니다. "
//					+ "사는 곳은 "+myAddress+"이고 키는 "+myHeight+"cm 몸무게는 "+myWeight+"kg 결혼은 "+maritalStatus+"입니다.").charAt(1));
//		
	
			//(결론)→ 풀이1로 하는 게 더 적합하다. 변수를 하나 만들고, 코드가 간결함.
			
			
			
			
			
		}

	}
