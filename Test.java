package kr.sonhoyongtest;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		/*
        //if (����)  {
		//��ȣ���� ������ ���,����Ǵ� �ڵ�
		// }
		
		Scanner sc = new Scanner(System.in);
		int age;
		age  = sc.nextInt();
		
		//����ڰ� �Է��Ѽ���(����) ������ (age > 19) ���, ���� �� �ڵ带 ���ǹ��� ���� ǥ��
		//���� ������ ���� �̸鼭 , �Ʒ��� ������ ���� ���
	    if (age > 19) {
	    	System.out.println("�����Դϴ�");
	    }
	    else if(age < 8) {
	    	System.out.println("��� �Դϴ�");
	    }
	    else {
	    	System.out.println("û�ҳ� �Դϴ�");
	    }
	    //else {
	    // �ٷ� ���� �����ϴ� if ���� ������ �����ΰ�� ������ �ڵ�;
	    //  }
	    
	    //else if(��) {
	    //�ٷ� ���� if ���� ������ �����̸鼭 �ڽ��� ���Ǹ� ���ΰ�� ,������  �ڵ�
	    //     }
	    
	    //switch(�� ) {
	    //case ��
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
		int grade,grade2; //Ÿ���� ���� ������ �������� �����Ҷ� ,��ǥ�� �����Ѵ�
		grade  = sc.nextInt();
		grade2  = sc.nextInt();
		
		if(grade == grade2) {
			
		}else {
			//���� �������
			
		}
		
		//for(���� �ʱ�ȭ; ���ǽ�; ������; {
		//
		//
		//
		//}
		
		//������ ����
        //����Ÿ�� �����̸�;
		
		//������ ��  ����
		//����Ÿ�� �����̸� = ��;
		

		

		
		// i
		//i�� ���ؼ� 10���ݺ�
		//i�� 0���� 9���� 1�� �����ϸ鼭 �ݺ��ϸ� 10���ݺ��Ѵ�.
		for(int i = 0; i <= 9; i++) {
			System.out.println(i);
		}
		
		*/
		//while(���ǽ�(������� boolean [true or false]) {
		//
		// }
        int a; //������ ���� �����ڰ� ���ϴ� ������ ������ ��Ű�� ����
		a = 15; //������ ���� �����ϰ� ������ 15�� ���� (�ʱ�ȭ)
	//���� �ݺ���
		while(a > 0) {
			System.out.print("�ȳ��ϼ���");
		    a--;
		    }
		//a = 0
		//do �� ���Ǿ��� �� ���� ����, while �� ������ ���ؼ� ���̸� while {} �ݺ�����
		do {
             a++; //2
     		System.out.println(a);
		} while (a != 0 && a < 15); 
		
		
		
		} 

} 
