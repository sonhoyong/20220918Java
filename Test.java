package kr.sonhoyongtest;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		/*
        //if (조건)  {
		//괄호안의 조건일 경우,실행되는 코드
		// }
		
		Scanner sc = new Scanner(System.in);
		int age;
		age  = sc.nextInt();
		
		//사용자가 입력한숫자(나이) 성인인 (age > 19) 경우, 실행 할 코드를 조건문을 통해 표현
		//위의 내용이 거짓 이면서 , 아래의 내용이 참인 경우
	    if (age > 19) {
	    	System.out.println("성인입니다");
	    }
	    else if(age < 8) {
	    	System.out.println("어린이 입니다");
	    }
	    else {
	    	System.out.println("청소년 입니다");
	    }
	    //else {
	    // 바로 위에 존재하는 if 문의 조건이 거짓인경우 실행할 코드;
	    //  }
	    
	    //else if(값) {
	    //바로 위에 if 문이 조건이 거짓이면서 자신의 조건만 참인경우 ,실행할  코드
	    //     }
	    
	    //switch(값 ) {
	    //case 값
	    //break;
	    //}
	     * 
	     
	
		Scanner sc = new Scanner(System.in);
		int grade;
		grade  = sc.nextInt();
		
		if(grade >= 90) {
			System.out.println("A");
		} else if(grade >= 80) {
			System.out.println("b");
		} else if(grade >= 70) {
			System.out.println("c");
		} else {
			System.out.println("D");
		}


		grade /= 10;
  		
	    	
		switch(grade) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
		    System.out.println("B");
		    break;
		case 7:
		    System.out.println("C");
		    break;
		default:
		    break;
		}
	
		Scanner sc = new Scanner(System.in);
		int grade,grade2; //타입이 같은 변수를 여러개를 선언할때 ,쉼표로 구분한다
		grade  = sc.nextInt();
		grade2  = sc.nextInt();
		
		if(grade == grade2) {
			
		}else {
			//같지 않은경우
			
		}
		
		//for(변수 초기화; 조건식; 증감식; {
		//
		//
		//
		//}
		
		//변수의 선언
        //변수타입 변수이름;
		
		//변수의 값  저장
		//변수타입 변수이름 = 값;
		

		

		
		// i
		//i를 통해서 10번반복
		//i가 0부터 9까지 1씩 증가하면서 반복하면 10번반복한다.
		for(int i = 0; i <= 9; i++) {
			System.out.println(i);
		}
		
		*/
		//while(조건식(결과값이 boolean [true or false]) {
		//
		// }
        int a; //변수의 값을 개발자가 원하는 갑으로 저장을 시키기 때문
		a = 15; //원래의 값을 무시하고 강제로 15를 저장 (초기화)
	//무한 반복문
		while(a > 0) {
			System.out.print("안녕하세요");
		    a--;
		    }
		//a = 0
		//do 는 조건없이 한 번만 실행, while 은 조건을 비교해서 참이면 while {} 반복실행
		do {
             a++; //2
     		System.out.println(a);
		} while (a != 0 && a < 15); 
		
		
		
		} 

} 
