package com.declare;

public class DeclareTest {
	
	public static void main(String[] args) {
		//변수를 선언해보자
		//변수를 선언하는 것은, "RAM영역"에 "저장 공간"을, 자료형의 크기만큼 확보하는 작업이다.
		//(How)변수를 선언하는 방법
		
		//자료형(type) 변수名;
		
		//자료형(유형): [기본 자료형/ 참조형 자료형]
		
		//논리형을 저장하는 변수선언하기
		//boolean표현식 (1byte)
		boolean flag;
		
		
		//[문자형: 문자||문자열/자료형] 저장하는 변수선언하기
		//문자형은 "단일 문자 (예) 가, A, B 1, 9)"를 의미함.
		//char표현식 (2byte)
		char gender;
		
		//문자열을 저장하는 변수선언하기
		//문자열은 문자를 여러개보관할 수 있는 저장공간 
		// 예) 안녕, 잘 살고 있니?, hello, 남
		//String표현식 (참조형)
		String name;
		
		//정수형 변수를 선언하기
		//4가지 자료형이 있음
		//byte : 파일 처리, 암호화 처리 (1byte)
		//short : (2byte)
		//int : 일반적인 숫자를 처리할 때, default자료형 (4byte)
		//long : 회원 아이디, 클래스 아이디 번호, 금액 처리 (8byte)
		byte bnum;
		short snum;
		int inum;
		long lnum;
		
		
		//실수형 변수 선언하기
		//"소수점 값"을 저장하는 변수
		//실제값을 저장하지않고 계산식에 활용될 값을 저장(가수, 지수)
		//계산으로 표현을 하기 때문에 범위가 커지만 오차범위가 발생함.
		//float : (4byte)
		//double : default자료형 (8byte) 
		float fnum;
		double dnum;
		
		//변수명 설정 시 주의할점
		//1. 대소문자를 구분함. "같은 영역안"에 동일한 이름의 변수명은 사용할 수 없음
		int age;
		int aGe;
		//변수명의 길이에 제한은 없다. 너무 길게 사용하면 안 됨!
		int aaaaaaaaaaabbbbbbbbbccccccddddddeeeeeeeeeaskldjwiqjfoisadjfsadkfjsaldkjfsldkajfkdsjfklsjasldkfjaslkdjflaskdjflkasjdflkjasd;
		//int age; 동일한 명칭은 사용이 안 됨.
		
		//2. 예약어를 사용할 없다.
		//char public;
		
		//3. 변수명은 숫자로 시작할 수 없다.
		//double 1weight;
		double weight1;
		double weight2;
		double wei3ght;
		
		//4. 특수기호는 $, _ 만 사용이 가능함.
		long member$Id;
		long $memberId;
		long _memberId;
		long member_id;
//		long %memberId;
//		long member#Id;
		
		//5. 여러단어로 변수명을 설정할때는 camelcase(낙타봉표기법)를 사용한다.
		// 변수명의 첫글자는 소문자로 작성
		
		
		
		
		
		
		
	}
//	public void test() {
//		int age;
//	}
	
}
