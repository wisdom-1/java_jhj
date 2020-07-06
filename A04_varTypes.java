
public class A04_varTypes {

	public static void main(String[] args) {
		
		// �ڹ��� ���� Ÿ�Ե� 
		
		/*
		 	������
		 		- byte	(1byte)
		 			-128(2 ^ 7) ~ +127(2 ^ 7 - 1)
		 			�� ������� 0�� ���ԵǱ� ������ ��Ÿ�� �� �ִ� ���ڰ� �������� �� �� ���� 
		 				 		
		 		- short	(2byte)
		 			-(2 ^ 15) ~ +(2 ^ 15 - 1)
		 		
		 		- char	(2byte) : ���� Ÿ�� (���ڸ� ��Ÿ���� ����, ��ȣ�� ����)
		 			0 ~ 65535(2 ^ 16)
		 			�� ��ȣ�� ���� ������ 16bit�� ��� ������ �̿��Ѵ� 
		 		
		 		- int	(4byte)		* �⺻ Ÿ�� *
		 			-(2 ^ 31) ~ +(2 ^ 31 - 1)
		 		
		 		- long	(8byte)				
		 			-(2 ^ 63) ~ +(2 ^ 63 - 1) 
		 */
		
		byte _byte_max = 127;
		byte _byte_min = -128;
		
		System.out.println("���� ū byte �� : " + _byte_max);
		System.out.println("���� ���� byte �� : " + _byte_min);
		
		short _short_max = 32767;
		short _short_min = -32768;
		
		System.out.println("���� ū short �� : " + _short_max);
		System.out.println("���� ���� short �� : " + _short_min);
		
		// char Ÿ���� �����δ� ������ ������ ����� ���ڷ� ���´�
		char _char_max = 65535;
		char _char_min = 0;
		
		// ���� Ÿ�������� ���� Ÿ�� ���� ���� ���� �ִ�
		// char Ÿ���� ���ڸ� ǥ���ϱ� ���� ���� Ÿ���̴�
		char ch = 'A';
		
		System.out.println("���� ū char �� : " + _char_max);
		System.out.println("���� ���� char �� : " + _char_min);
		System.out.println(ch);
		
		// ������ �ڸ��� ������ �����ϰ� ���� �� _�� ����ص� �ȴ�
		int _int_max = 21_4748_3647;
		int _int_min = -21_4748_3648;
		
		System.out.println("���� ū int �� : " + _int_max);
		System.out.println("���� ���� int �� : " + _int_min);
		
		// �ڹ� ���� �������� �⺻ Ÿ���� int��.
		// ���� ������ ���� int�� ������ �Ѿ�� �Ǹ� ������ �߻��Ѵ�.
		// int������ ����� ���� �����͸� ����ϰ� �������� �ڿ� L�� �ٿ��� �Ѵ�.
		long _long = 50_0000_0000L;
		long _long_min = -5000000000000000000L;
		
		/*
		 	�Ǽ��� (���� �׷��� ��꿡�� ���ȴ�)
		 		- �����ϰ� ������ ���� ����� �ʿ��� �о߿� ���ȴ�
		 		- �ε��Ҽ��� ����� ����Ѵ�
		 		
		 		float (4byte)
		 		double (8byte)		* �⺻ Ÿ�� * 
		 */
		
		// �ڹ� �Ҽ� �������� �⺻Ÿ���� double�̴�.
		// �Ҽ��� ���� �������� Ÿ���� double�̱� ������ 
		// floatŸ�� ������ �Ҽ��� �������� �ڿ� F�� �ٿ� floatŸ������ ����ؾ� �Ѵ�
		float _float = 1.234F;
		double _double = 1.234;
		
		/*
		 	��/������
		 	
		 		boolean 
		 		 	- true, false �� ������ ���� ������ �ִ� Ÿ��
		 		 	- ���� ������ ��Ÿ���µ����� ���δ�		  
		 */
		boolean b = true;
		b = false;
		
		boolean isMale = true;
		boolean isFemale = true;
		boolean under20 = false;
		
		System.out.println("�����ΰ���? " + isMale);
		System.out.println("�����ΰ���? " + isFemale);
		System.out.println("20���̸��Դϱ�? " + under20);
		
		/*
		  	������ Ÿ�� (Ŭ���� Ÿ��)
		  		- String : ���ڿ� Ÿ��
		  		- �� �� ��� �빮�ڷ� �����ϴ� Ÿ�Ե� ..		 
		 */
		
		// String Ÿ�Կ� ���ڿ� Ÿ�� �����͸� ��Ƴ��� �� �ִ�
		String name = "��ö��";
		String helloMessage = "hi! nice to meet you!!";
		String byeMessage = "by by! " + name;
		
		System.out.println(helloMessage);
		System.out.println(byeMessage);
	}
	
}






