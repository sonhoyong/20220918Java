

/*	
		//��������
		//���� Ÿ�� �����̸�
        int num; //���� ��  ����
        
        //���� �� ����
        //�����Ʒ� = ��;
        num = 5;
        
        //������ ���Ȱ� �ʱ�ȭ
        int num2 = 4;
        
        double d = 0.3;
        
        //���� �� ��
        // == ������ ��
        //  |= �ٸ��� ��
        // > (���ʰ��� ū��)
   
        //ū������ ���� ���� ���� �� �μ��� ���� ������������ �ִ��� Ȯ��
		System.out.print(0.1+0.1+0.1);
	
		//���� ����
		// ����Ÿ�� �̸�;
		
		//���� �� ����
		//�̸� = ��;
		
		//���� ����� �ʱ�ȭ
		//���� Ÿ�� �̸�  = ��;
		
		//String = ����(x) Ŭ���� (o)
		String name = "��ȣ��";
		
		System.out.print(name);
		
		int number = 123;
		int number2 = 456;
		// +,-,/,%
		
		
		String a = "00";
		String b = number + number2 + name + a;
		
		//����� ����ȯ
		
		double d =2.5;
		int  n = (int) d;
		
		//int (���� = �Ҽ����� ����) double (�Ǽ� = �Ҽ��� ����)
		
		System.out.print((int)d);
			
		
		
		
		//��ü�� ����
		//��ü�̸� �̸�;
		
		//��ü�� �� ����
        //�̸� = new ��ü ������;
		
		//��ü �������� ����
		//new ��ü�̸�(�Ű����� or ����) -> ��ü�� ����
		
		//��ĳ�ʴ� ����ڰ� �Է��ϴ� �������� System Input
		//System.out (�ܼ�) -> �ܼ�.print(asd)
		//system.in
		Scanner asd = new Scanner(System.in);
		
		//���� ����
		//����Ÿ�� �����̸�;
		//������ �� ����
		//�����̸� = ��;
		//������ �ʱ�ȭ + ����
		//����Ƽ�� �����̸� = ��;
		System.out.print("����1�� �Է��ϼ��� :");
		String number1 = asd.nextline();
		
		System.out.print("���� 2�� �Է��ϼ���");
		String number2 = asd.nextline();
		
		//integer.parseInt(number1); //int ��
		
		//try catch
		
		//try {
		//    ������ �ڵ�
		//} catch(���� �ַ�) {
		//�ַ� �߻��� ���� �� �ڵ�
		//}
		try {
			System.out.print(Integer.parseInt(number1) + Integer.parseInt(number2));
			
		} catch(NumberFormatException e) {
			System.out.print("���ڸ� �Է��ϼ���");
			
		}
		
		
		//System.out.print("10+5=15");
		
		//format (���Ĺ��ڸ� ���� ������ ǥ���ϴ� ��)
		// %s - ���ڿ�
		// %c - ���� 
		// %d - ����
		// %f - ���
		//System.out.printf
		//System.out.printf("%d + %d = %d",number1, number2,number1 + number2);
		
		//String output = String.format("%d + %d = %d",number1, number2,number1 + number2);
		
		int a = 10;
		
		//a = a + 1
		// a += 1;
		//a++; => a�� ���� 1���ؼ� ���� �ض�
		//++a; => ���� 1�� ���ϰ� �����ϰ� a�� ó��
		
		//line -> in
		System.out.println(++a);
		System.out.print(a);
		
		//------------------------------------------------------------
		System.out.print("������ �Է����ּ���       :");
		
		Scanner sc = new Scanner(System.in);
	    
		int number;
		
		number = sc.nextInt();
		
		//���� �Ѱ��� ����
		//++, --
		
		//���������ڰ� �ڿ��ִ°��, ������ ���� ����ϰ� 1�� ������Ŵ.
		//���������ڰ� �տ� �ִ°��, ������ 1�� ������Ű�� �����.
		
        	
        //11
		//line -> ln
		System.out.println(number++); //50
		System.out.println(number); //51
		//�� ������ (boolean)
		// >,<,>=,<=,!=
		
		//��������(boolean)
		//100 > number > 50 number �� 100���� �����鼭,50���� ū��
		//&& - AND / || - OR / ^ - XOR
		
		
		//���� ������
		// =
		
		System.out.print(number == 25 || number > 50); 
		//--------------------------------------------------------------
	
		//____________________________________________________________________________
		
		//��Ȳ ������ (����� ������)
		//(����)? �� : ����;
		//boolean Ÿ���ǰ� (true / false)
		
		int number = new Scanner(System.in).nextInt();
		
		//�Է¹��� ���� 50���� ũ�� ,100 ���ϴ� ���ڸ� ������ϰ�, 50���� ������ 0����ϴ� ����
		System.out.println(number > 50 ? 100 : 0); //integer ��
		
		int a = number > 50 ? 100 : 0; //a�ǰ��� number�� ���� ���� ���� ��.
		//_______________________________________________________________________
		 
		 *	int  number = new Scanner(System.in).nextInt();
		
		String text = number > 19 ? "�����Դϴ�" : "û�ҳ��Դϴ�";
		
		System.out.print(text);
		
		
		//number = number * 10;
		number *= 10;
		System.out.println(number);
		*/