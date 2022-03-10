package com.bs.practice2.func;
import java.util.Scanner;
public class CastingPractice2 {

	public void score() {
		
		/*	실습문제2
		 * 	실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요. 
		 * 	이 때 총점과 평균은 정수형으로 처리하세요.
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("국어 : ");
		double kor= sc.nextDouble();
		System.out.print("영어 : ");
		double eng= sc.nextDouble();
		System.out.print("수학 : ");
		double math= sc.nextDouble();
		
		System.out.println("총점 : "+ (int)(kor+eng+math));
		System.out.println("평균 : "+ (int)(kor+eng+math)/3);
		
		
	}
}
