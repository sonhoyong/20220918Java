

/*	
		//변수선언
		//변수 타입 변수이름
        int num; //선언만 한  상태
        
        //변수 값 저장
        //변수아룸 = 값;
        num = 5;
        
        //변수의 선안과 초기화
        int num2 = 4;
        
        double d = 0.3;
        
        //변수 값 비교
        // == 같은지 비교
        //  |= 다른지 비교
        // > (왼쪽값이 큰지)
   
        //큰수에서 작은 수를 빼서 그 두수의 차가 오차범위내에 있는지 확인
		System.out.print(0.1+0.1+0.1);
	
		//변수 선언문
		// 변수타입 이름;
		
		//변수 값 저장
		//이름 = 값;
		
		//변수 선언과 초기화
		//변수 타입 이름  = 값;
		
		//String = 변수(x) 클래스 (o)
		String name = "손호용";
		
		System.out.print(name);
		
		int number = 123;
		int number2 = 456;
		// +,-,/,%
		
		
		String a = "00";
		String b = number + number2 + name + a;
		
		//명시적 형변환
		
		double d =2.5;
		int  n = (int) d;
		
		//int (정수 = 소수점이 없다) double (실수 = 소수점 존재)
		
		System.out.print((int)d);
			
		
		
		
		//객체의 선언
		//객체이름 이름;
		
		//객체의 값 저장
        //이름 = new 객체 생성자;
		
		//객체 생성자의 형태
		//new 객체이름(매개변수 or 인자) -> 객체를 생성
		
		//스캐너는 사용자가 입력하는 값을받음 System Input
		//System.out (콘솔) -> 콘솔.print(asd)
		//system.in
		Scanner asd = new Scanner(System.in);
		
		//변수 선언
		//변수타입 변수이름;
		//변수의 값 저장
		//변수이름 = 값;
		//변수의 초기화 + 선언
		//변수티입 변수이름 = 값;
		System.out.print("숫자1을 입력하세여 :");
		String number1 = asd.nextline();
		
		System.out.print("숫자 2를 입력하세여");
		String number2 = asd.nextline();
		
		//integer.parseInt(number1); //int 값
		
		//try catch
		
		//try {
		//    실행할 코드
		//} catch(잡을 애러) {
		//애러 발생시 실행 할 코드
		//}
		try {
			System.out.print(Integer.parseInt(number1) + Integer.parseInt(number2));
			
		} catch(NumberFormatException e) {
			System.out.print("숫자만 입력하세요");
			
		}
		
		
		//System.out.print("10+5=15");
		
		//format (형식문자를 통해 변수를 표현하는 것)
		// %s - 문자열
		// %c - 문자 
		// %d - 정수
		// %f - 상수
		//System.out.printf
		//System.out.printf("%d + %d = %d",number1, number2,number1 + number2);
		
		//String output = String.format("%d + %d = %d",number1, number2,number1 + number2);
		
		int a = 10;
		
		//a = a + 1
		// a += 1;
		//a++; => a를 쓰고 1더해서 저장 해라
		//++a; => 먼저 1을 더하고 저장하고 a를 처리
		
		//line -> in
		System.out.println(++a);
		System.out.print(a);
		
		//------------------------------------------------------------
		System.out.print("정수를 입력해주세요       :");
		
		Scanner sc = new Scanner(System.in);
	    
		int number;
		
		number = sc.nextInt();
		
		//항이 한개만 존재
		//++, --
		
		//증강연산자가 뒤에있는경우, 변수를 먼저 사용하고 1을 증가시킴.
		//증강연산자가 앞에 있는경우, 변수를 1을 증가시키고 사용함.
		
        	
        //11
		//line -> ln
		System.out.println(number++); //50
		System.out.println(number); //51
		//비교 연산자 (boolean)
		// >,<,>=,<=,!=
		
		//논리연산자(boolean)
		//100 > number > 50 number 는 100보다 작으면서,50보다 큰수
		//&& - AND / || - OR / ^ - XOR
		
		
		//대입 연산자
		// =
		
		System.out.print(number == 25 || number > 50); 
		//--------------------------------------------------------------
	
		//____________________________________________________________________________
		
		//상황 연산자 (제어문과 유사함)
		//(조건)? 참 : 거짓;
		//boolean 타입의값 (true / false)
		
		int number = new Scanner(System.in).nextInt();
		
		//입력받은 값이 50보다 크면 ,100 이하는 숫자를 출력을하고, 50보다 작으면 0출력하는 구문
		System.out.println(number > 50 ? 100 : 0); //integer 값
		
		int a = number > 50 ? 100 : 0; //a의값은 number의 값에 따라 결정 함.
		//_______________________________________________________________________
		 
		 *	int  number = new Scanner(System.in).nextInt();
		
		String text = number > 19 ? "성인입니다" : "청소년입니다";
		
		System.out.print(text);
		
		
		//number = number * 10;
		number *= 10;
		System.out.println(number);
		*/