package com.bs.practice.func;
import java.util.Scanner;
public class OperatorPractice {

	
	
	
	public void practice1() {

		/*
		 * 실습문제1 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();

		System.out.println(input > 0 ? "양수다" : "양수가 아니다");

	}
	
	public void practice2() {

		/*
		 * 실습문제2 
		 * 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();

		System.out.println(input > 0 ? "양수다" : (input == 0 ? "0이다" : "음수다"));

	}
	
	public void practice3() {
		
		/*	실습문제3
		 * 	키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("정수 : ");
		int input= sc.nextInt();
		System.out.println(input%2==0 ? "짝수다" : "홀수다");
		
	}
	
	public void practice4() {
		
		/*	실습문제4
		 * 	모든 사람이 사탕을 골고루 나눠가지려고 한다. 
		 * 	인원 수와 사탕 개수를 키보드로 입력 받고 
		 * 	1인당 동일하게 나눠가진 사탕 개수와 
		 * 	나눠주고 남은 사탕의 개수를 출력하세요.
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("인원 수 : ");
		int personnel= sc.nextInt();
		System.out.print("사탕 수 : ");
		int candies= sc.nextInt();

		System.out.print("1인당 사탕 개수 : "+ candies/personnel);
		System.out.print("\n남는 사탕 개수 : " + candies%personnel);
	}
	
	public void practice5() {
		
		/*	실습문제5
		 * 	키보드로 입력 받은 값들을 변수에 기록하고 
		 * 	저장된 변수 값을 화면에 출력하여 확인하세요. 
		 * 	이 때 성별이 ‘M’이면 남학생, 
		 * 	‘M’이 아니면 여학생으로 출력 처리 하세요.
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("이름 : ");
		String name= sc.next();
		System.out.print("학년(숫자만) : ");
		int grade= sc.nextInt();
		System.out.print("반(숫자만) : ");
		int classroom= sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int number= sc.nextInt();
		System.out.print("성별(M/F) : ");
		String gender= sc.next();
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score= sc.nextDouble();
		
		System.out.println(grade+"학년 "+classroom+"반 "+number+"번 "+name+" "+
						  (gender.equals("M")?"남학생" : "여학생")+"의 성적은 "+score+"이다.");

	}
	
	public void practice6() {
		
		/*	실습문제6
		 * 	나이를 키보드로 입력 받아 
		 * 	어린이(13세 이하)인지, 
		 * 	청소년(13세 초과 ~ 19세 이하)인지, 
		 * 	성인(19세 초과)인지 출력하세요.
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("나이 : ");
		int age= sc.nextInt();
		
		System.out.print(age>13&&age<=19 ? "청소년" : (age>19 ? "성인" : "어린이"));
		
		
	}
	
	public void practice7() {
		
		/*	실습문제7
		 * 	국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
		 * 	세 과목에 대한 합계(국어+영어+수학)와 
		 * 	평균(합계/3.0)을 구하세요. 
		 * 	세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		 * 	세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 
		 * 	아니라면 불합격을 출력하세요. 
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("국어 : ");
		int kor= sc.nextInt();
		System.out.print("영어 : ");
		int eng= sc.nextInt();
		System.out.print("수학 : ");
		int math= sc.nextInt();
		
		int sum= kor+eng+math;
		double avg= sum/3.0;
		
		System.out.print("합계 : " + sum);
		System.out.print("\n평균 : " + avg);
		System.out.print(kor>=40 && eng>=40 && math>= 40 && avg>=60? " \n합격" : " \n불합격");
		
	}
	
	public void practice8() {
		
		/*	실습문제8
		 * 	주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("주민번호를 입력하세요 : ");
		String info = sc.next();
		//System.out.println(info.charAt(7)==0? "여자" : "남자");
		System.out.println(info.charAt(7)=='2'? "여자":"남자");
		
	}
	
	public void practice9() {
		
		/*	실습문제9
		 * 	키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
		 * 	그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 
		 * 	true를 출력하고 아니면 false를 출력하세요.
		 * 	(단, num1은 num2보다 작아야 함)
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("정수 : ");
		int num1= sc.nextInt();
		System.out.print("정수 : ");
		int num2= sc.nextInt();
		System.out.print("입력 : ");
		int num3= sc.nextInt();
		
		System.out.println(num3>=num1||num3>num2);
		
	}
	
	public void practice10() {
		
		/*	실습문제10
		 * 	3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("입력1 : ");
		int num1= sc.nextInt();
		System.out.print("입력2 : ");
		int num2= sc.nextInt();
		System.out.print("입력3 : ");
		int num3= sc.nextInt();

		boolean flag= (num1==num2)&&(num1==num3)&&(num2==num3);
		
		System.out.print(flag);
	
	}
	
	public void practice11() {
		
		/*	실습문제11
		 * 	A, B, C 사원의 연봉을 입력 받고 
		 * 	각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고 
		 * 	인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 
		 * 	미만이면 “3000 미만”을 출력하세요. 
		 * 	(A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		int salaryA = sc.nextInt();
		double finA= salaryA*1.4;
		
		System.out.print("B사원의 연봉 : ");
		int salaryB = sc.nextInt();
		double incentiveB= salaryB*0;
		double finB= salaryB+incentiveB;
		
		System.out.print("C사원의 연봉 : ");
		int salaryC = sc.nextInt();
		double finC= salaryC*1.15;

		
		System.out.println("A사원 연봉/연봉+a : "+salaryA+"/"+finA+ (finA>=3000 ? "\n3000이상" : "\n3000미만"));
		System.out.println("B사원 연봉/연봉+a : "+salaryB+"/"+finB+ (finB>=3000 ? "\n3000이상" : "\n3000미만"));
		System.out.println("C사원 연봉/연봉+a : "+salaryC+"/"+finC+ (finC>=3000 ? "\n3000이상" : "\n3000미만"));
	}
	
	
	
}
