package com.bs.practice2.func;
import java.util.Scanner;
public class CastingPractice1 {

	public void uni() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("¹®ÀÚ : ");
		String input= sc.next();
		//int temp= (int)input;
		
		System.out.println(input+" unicode : "+(int)input.charAt(0));
		
		
	}
	
	
}
