
public class A06_typeCasting {

	public static void main(String[] args) {
		
		// Ÿ�� ĳ���� 
		//	- � ���� Ȥ�� ���� �ٸ� Ÿ������ ���ϴ� ��
		//	- �ڿ������� ���ϴ� ���� ������ ��ȯ��Ű�� ��찡 �ִ�
	
		// Ÿ���� ũ��
		//	byte < short <= char < int < long(8byte) < float(4byte) < double
		
		// ū Ÿ�� ������ ���� Ÿ�� ���� �����ϴ� ���
		byte b1 = 127;
		
		// byteŸ�� ���� �ڿ������� Ÿ��ĳ���� �Ǿ���
		short s1 = b1;
		int i1 = b1;
		long l1 = b1;		
		// char c1 = b1; // byte�� ������ ���������� char�� ������ ���� ������ ����
		
		System.out.println("���� byte���� ����");
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		
		
		// ū Ÿ�� ���� ���� Ÿ�� ������ ������ �������� ��� (������ Ÿ��ĳ����)
		long l2 = 9999999999999L;
		
		// ū Ÿ�� ���� ���� Ÿ�Կ� ������ ���� ���� �Ҿ���� ���� �ֱ� ������ Ÿ��ĳ������ �䱸�Ѵ�.
		// ��, Ÿ�� ĳ������ 
		//	'���� �� ĳ������ ���� ���� �սǵ� �� ������ �����ϰ� �ֽ��ϴ�. ���� �ȳ��ŵ� �˴ϴ�.' 
		// ��� ���̴�
		int i2 = (int) l2;
		short s2 = (short) l2;
		byte b2 = (byte) l2;
		
		System.out.println("���� �� : " + l2 + ", ��ȯ �� �� : " + i2);
		System.out.println("���� �� : " + l2 + ", ��ȯ �� �� : " + s2);
		System.out.println("���� �� : " + l2 + ", ��ȯ �� �� : " + b2);
				
		// �Ǽ� Ÿ���� �������� �������� �ʴ� �Ҽ����� ������ �ֱ� ������ �׻� �������� ũ��
		float f1 = 1234.999F;
		
		// �ַ�, �Ǽ� Ÿ���� �Ҽ����� �� ����� ���� �� ���� Ÿ������ ĳ�����Ѵ� (�ݿø� X)
		System.out.println("float : " + f1 + ", int : " + (int)f1);
		
		// �Ҽ������� �ݿø��� �ϰ� �ʹٸ� Math.round() �޼��带 ����Ѵ�
		// �Ҽ������� �ø��� �ϰ� �ʹٸ� Math.ceil() �޼��带 ����Ѵ� (ceil : õ��)
		// �Ҽ������� ������ �ϰ� �ʹٸ� Math.floor() �޼��带 ����Ѵ� (floor : �ٴ�)
		System.out.println("round : " + Math.round(f1));
		System.out.println("ceil : " + Math.ceil(f1));
		System.out.println("floor : " + Math.floor(f1));
		
		// ASCII �ڵ�
		//	- ���ڴ� �� ���ڿ� �ش��ϴ� �������� ������ �ִ� (char Ÿ���� ����Ÿ���� ����)
		//	- �� ���ڿ� �����ϴ� ���ڸ� ǥ�� ������ �������� ASCII�ڵ� ǥ��� �Ѵ�
		//	- ���ڴ� ���� �޸𸮻󿡴� �����ν� ����ǰ�, charŸ���̸� �츮���Դ� ���ڷ� �����ش� 
		int ch = 65;
		System.out.println(ch);
		System.out.println((char)ch);
		
		// ���ڸ� ���� ���� ���ڷ� �Ѿ ���� �ִ�
		System.out.println(ch + 1);
		System.out.println((char)(ch + 1));
		
		// ���� Ÿ�Գ��� ����ó�� ������ �����ϴ� (���� Ÿ���� ���� ����� ������)
		System.out.println("z�� a�κ��� �󸶳� ������ �ֳ��� : " + ('Z' - 'A') + "ĭ");
		
		// ���� Ÿ�԰� ������ ���굵 �����ϴ� (���� Ÿ���� ���� ����� ������)
		System.out.println('A' + 25);
		System.out.println((char)('A' + 25));
		
		// ���ڴ� �����δ� �����̱� ������ ����ó�� �����ص� �ƹ� ���� ����
		System.out.println("�ҹ��� a�� �빮�� A���� ũ�� : " + ('a' > 'A'));
		System.out.println("�ҹ��� a�� �빮�� A���� �۴� : " + ('a' < 'A'));			
		
	}
	
}











