package com.op.run;
//main메소드가 있는 클래스

import com.op.controller.OperatorController;
//상이한 패키지에 속한, 클래스(內메소드를 이용하고 싶을 時)

public class Main {
	
	//생성한 어플리케이션을 실행하는 start point(시작점)
	public static void main(String[]args) {
		//프로그램이 작동할 때 필요한 프로그램들을 호출해, 이용할 것임
		
		//OperatorController 클래스의, 메소드singleOp를 실행시키고 싶음. 어떻게?

		//1. (불러오고픈 클래스와 당해 클래스가 소속된 패키지가 상이함을 확인함) -> import
		//2. new연산자를 이용해 생성한다 -> 접근연산자 '.', 를 이용해 메소드를 가져오자
		//	 -> new클래스名().메소드名();
		//new OperatorController().singleOp();	//기능(메소드) 호출!
		//new OperatorController().calculatorOp();
		//new OperatorController().compareOp();
		//new OperatorController().logicalOp();
		//new OperatorController().complexOp();
		//new OperatorController().thirdOp();
		new OperatorController().bitOp();
		
	}
}
