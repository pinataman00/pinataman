package com.declare;

import java.util.Iterator;

public class OverFlowTest {

	
	
	
	public static void main(String[]args) {
	
		//데이터 오버 플로우Overflow
		byte bnum= 120;
		for (int i=0; i<300; i++) {
			System.out.println(bnum++);
		} //참고(for문): 해당 코드를 300회 반복하라는 의미
		//127이상은 byte로 표현할 수 없어, 실행 결과를 보면 127 다음은 -128이 나옴. 
		//제대로된 연산 결과가 안 나올 경우, overflow가 발생한 건 아닌지 확인할 것!
	
	
	int inum= 120;
	for (int i=0; i<300; i++) {
		System.out.println(inum++);
	} //참고(for문): 해당 코드를 300회 반복하라는 의미
	//127이상은 byte로 표현할 수 없어, 실행 결과를 보면 127 다음은 -128이 나옴. 
	//그래서 자료형을 int로 바꿈!
}

	
	
	
}
