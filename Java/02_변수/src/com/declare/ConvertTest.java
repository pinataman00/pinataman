package com.declare;

//형변환(2): 자동형변환/강제형변환
public class ConvertTest {

	public static void main(String[]args) {
		/*	<자동 형변환>
		 * 	1. 크기가 작은 자료형 값을, 큰 자료형 값으로 저장할 때 ~ 컴파일러가 자동으로 형변환을 해준다. 
		 */
		 
		long lnum=100; //100, 이라고 그냥 숫자를 적은 int형(4byte)임. long에 넣기 위해~ 컴파일러가 자동형변환을 해준 것이다. 
		//int 100을 long으로 형 변환해서 대입한다. 
		System.out.println(lnum);	//100이 출력됨
		float fnum= lnum; //"자동형변환"을 통해~ long(정수, 실제 값, 8byte)을 float(실수, 계산식, 4byte)에 넣을 수 있음
						  //자칫하면, 어떻게 4byte에 8byte를 넣을 수 있냐, 의문을 가질 수 있으나...
						  //실제값을 저장하는 정수long과 달리, 실수float는 계산식을 저장하므로... 정수보다 실수가 저장할 수 있는 범위가 훨씬 크다!
		System.out.println(fnum);	//100이 '실수'로 형변환 되어, 100.0이 출력됨
		
		//2. 산술 계산(ex. 사칙연산)을 할 때도 '자동형변환'이 발생한다. 
		//왜냐면, 계산 時, 값(리터럴)이 2개 이상 필요하잖아. 
		//그리고 리터럴에는 고유의 자료형이 있잖아(ex. 그냥 정수: int형/ 그냥 실수: double/ 홑따옴표: char/ 겹따옴표: String)
		int result= 10+10; //둘 다 int형이므로 무리 없이 계산 가능
		//result= 10+10.5; //에러 발생! "cannot convert double into int(double형에서 int형으로 형변환을 할 수 없다)"
						 //double(8byte)이 int(4byte)보다 크니까. 
						 //두 리터럴의 자료형 중, "더 큰" 리터럴의 자료형으로만 변환할 수 있다. 
						 //따라서, double->int(x) △ int->double(o)
		double result2= 10+10.5;
		
		char ch='A';
		result=ch; //char는 (사실, 내부적으로는)숫자형이므로~ 숫자형에 들어갈 수 있음 (아스키코드 값이 출력됨)
		System.out.println(result); //(아스키코드 값) 65가 출력됨
		
		// 산술 계산> 나누기, 일 경우엔... 나머지 값이 나오므로 double형으로 값을 받아야 겠지!
		
		/* <강제형변환>
		 * 큰 자료형에서, 작은 자료형으로 형변환할 때, 
		 * 원하는 자료형으로 형변환할 때 -> "객체(상속, 다형성)" 파트에서 많이 쓸 것임
		 * (변경할 자료형 입력)값;
		 */
		//int inum= lnum; //에러 발생! cannot convert long(8byte) to int(4byte)
		//(사유) 작은 값으로 바꾸는 과정에서 자료 손실이 발생할 수 있기 때문임
		int inum=(int)lnum;	//그러나, 상기 코드를 보면 lnum에 100을 넣음... 이를 int로 형변환해도 자료 손실이 없겠군!
		System.out.println(inum);
		lnum= 40000000000000000L;
		//inum=lnum; //에러 발생! cannot convert long(8byte) to int(4byte)
		inum=(int)lnum;	//그래도 어쨌든 형변환을 해본다. 
		System.out.println(inum);	// 40000000000000000가 아니라, "-1090256896"가 출력됨! 자료 손실 발생!
		
		//자동형변환: 데이터 손실이 없다. (작은 것-> 큰 것, 으로 변환하는 데 문제는 없지!)
		//반면, 강제형변환 時, 개발자는 '자료 손실'의 위험 여부를 사전에 고려해야만 한다.
		
		System.out.println((char)result); //int형의 65를, char로 강제형변환 時, A가 출력된다!
		//★ 괄호는 "형변환 연산자"다!
		
		result= (int)180.5;	//실수->정수, 강제형변환 時, 소수점 아래의 숫자는 날아감.
		System.out.println(result);	//자료 손실 발생! 
		//★ 강제형변환은, 실질적으론 '값(리터럴)'에 대해서만 한다. 
		
		
	}
}
