package com.declare;

import java.util.Scanner;	//Scanner클래스를 쓰고 싶으면, import를 해야 해. (왜냐면, 지금 클래스와 Scanner클래스는 소속된 패키지가 상이하기 때문이지)

public class InputOutputTest {

	public static void main(String[] args) {
		//모니터에 데이터 "출력"하기(2가지- 개행o/x)
		System.out.print(""); //"개행"없이 데이터를 출력함
		System.out.print("안녕");
		System.out.print(" 테스트");
		//출력-> 안녕 테스트
		System.out.println(); //"개행"이 된 데이터가 출력됨
		System.out.println("안녕");
		System.out.println(" 테스트");
		//출력-> 안녕
		//      테스트
		
		//System.out.printf(): 형식을 미리 정해두고, 들어올 리터럴의 자료형을 미리 정해둠
		//%s는 String
		//%d는 정수
		//%f는 실수
		System.out.printf("나의 이름은 %s 나이는 %d 몸무게는 %f입니다.", "유병승", 19, 65.5);
		
		System.out.println(); //개행: 한 줄을 띄는 효과!
//		System.out.println("이름 나이 성별");
//		System.out.println("유병승 19 남자");
//		System.out.println("이황 20 남자");
		
		//printf를 사용하면, 예쁘게 정렬할 수 있음.
		System.out.printf("%-2s %2d %s\n", "유병승", 19, "남자");	 //(오른쪽 정렬)%3s 공백을 3만큼 확보하고 String형 값을 넣어라
																 //(왼쪽 정렬)%-2s
		System.out.printf("%-3s %2d %s", "이황", 20, "남자");
		
		System.out.println();
		double dnum= 3.1456465454;
		System.out.println(dnum);
		System.out.printf("%.2f", dnum); //".2f"소수점 둘 째자리까지만 출력함
		System.out.println();
		System.out.printf("%.1f", dnum); //".1f"소수점 첫 째자리까지만 출력함
		
		System.out.println();
		//○ 문자열에 "escape문" 작성하기
		//1. tab -> 지정한 만큼의 공간을 띄어쓸 수 있다. 
		//String temp="안녕               ";
		String temp="안녕\t하세요";
		System.out.println(temp);
		
		//2. \n -> 개행
		temp= "안녕\n나는 유병승이야.";
		System.out.println(temp);

		//3. 특수문자를 쓰고 싶을 때
		//temp= "c\:Users\Goodee"; //에러 발생! 문자열 內 역슬러시는 'escape'를 의미하기 때문임
								   //escape로 지정된 걸(\n, \t 등) 쓰지 않아서 에러가 발생한 것임. 
		temp= "c\\:Users\\Goodee";
		System.out.println(temp); //(해결법)역슬러시를 하나 더 써주면 돼
		temp= "그는 \"안녕\", 이라고 말했다!"; //String內 쌍따옴표를 쓰고 싶거든... 쌍따옴표 앞에 슬러시를 넣어준다. 
		System.out.println(temp);
		
		//○ 키보드에서 입력한 값 가져오기
		/*	1. Scanner클래스 import하기 (왜냐면, Scanner클래스는 util패키지에 소속되어 있으므로)
		 * 		- import java.util.Scanner;
		 * 	2. Scanner클래스 생성해서, 변수에 넣기
		 * 		- Scanner sc= new Scanner(System.in); 
		 */
			Scanner sc= new Scanner(System.in);	//new연산자를 활용해, 객체를 생성함
			
		/*	3. 원하는 데이터 입력받기
		 * 	3-1. Scanner클래스> 클래스엔 메소드(기능)이 있지!
		 * 		- 정수: sc.nextInt();
		 * 		- 실수: sc.nextDouble();
		 * 		- 문자열: sc.next() 또는 sc.nextLine();
		 */
		 
//			//sc.nextInt(); //데이터(정수)를 받아오는 코드: 여기에 사용자가 입력한 정수가 입력될 거야~
//			System.out.println("당신의 나이를 입력하세요: ");
//			int input= sc.nextInt();	//키보드로부터 입력받는 값은~ 변수를 만들고, 변수에 넣어주면 돼
//			System.out.println("당신의 나이: "+input);
//			
//			System.out.println("당신의 키는?");
//			double height= sc.nextDouble();
//			System.out.println("당신의 키는 "+height+"cm입니다.");
			
			//문자열 받기
			//sc.next();	//공백을 기준으로~ 공백 앞에 있는 문자열을 가져옴
			//sc.nextLine();	//개행을 기준으로~ 개행 전의 문자열을 가져옴
			System.out.println("당신의 이름은? ");
			String name=sc.next();					//유 병 승
//			System.out.println("당신의 이름은 "+name);	//유
			
			System.out.println("당신의 이름을 한 번만 더 알려주세요: ");
			sc.nextLine(); //입력 버퍼를 비워주자!
			String name2=sc.nextLine();	//이 코드가 나오기 전에, next(), nextInt()등이 있으면... nextLine()으로 값을 입력받을 수 없다. 
										//그래서... 전에, 입력 버퍼를 비워주는 코드sc.nextLine();를 넣어두었지! 
			System.out.println(name2);	//
			
			//예제. 2 
			//새로운 프로젝트 test2를 만들고
			//com.test2패키지에 Variable클래스를 생성하고
			//사용자에게 이름, 나이, 키, 전화번호, 주소를 입력받고
			//출력하는 기능 구현하기!

		}

	}
