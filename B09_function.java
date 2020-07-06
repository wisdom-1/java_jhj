
public class B09_function {

	// ����
	//	- ���� �̸� ������ ���� ���߿� ������ ���� ��
	
	// �Լ� (function)
	//	- ����� �̸� ������ ���� ���߿� ������ ���� ��
	//	- ������ ���� ��ɾ���� ������ �̸��� �ٿ� �ϳ��� ������� �����Ѵ�
	//	- ���߿� ������ ����� �̸� ����� �۾��� �ݺ��� ���Ѵ� 

	// ex: �䳢�� ����ϴ� ����� ����
	public static void printRabbit() {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >��");
		
		return; // ���� Ÿ���� void�� �Լ��� ���� ��ȯ���� �ʴ´�
	}
	
	// ex: ����� ������ �ٱ����� ũ�⸦ �����ϸ� �ʿ��� �ٱ����� ������ ��ȯ�ϴ� �Լ�
	
	// �Լ��� �����ϴ� ����� ������ �ٱ����� ũ�⸦ �Ű�����(argument)��� �Ѵ�
	public static int appleBasket(int appleNum, int basketSize) {
		// �����̶�?
		//	- return�� ������ ���� �޼��带 �ٷ� �����Ѵ�
		//	- ������ �� �� �Լ��� ȣ���� ���� �� �Լ� Ÿ���� ����� �ݵ�� ��ȯ�ؾ� �Ѵ� 
		if (appleNum % basketSize == 0)
			return appleNum / basketSize;  
		else
			return appleNum / basketSize + 1;				
	}
	
	// 1. ���ؿ� �¾ �⵵�� �Ű������� �ѱ�� �ѱ��� ���̸� �������ִ� �Լ��� �����غ�����
	static int getKoreanAge(int this_year, int birth_year) {
		return this_year - birth_year + 1;		
	}	
	
	// 2. ���� ����, ����1�� ����, ����2�� ���Ը� �ѱ�� ���� ���Ը� ��ȯ�ϴ� �Լ��� �����غ�����
	//	  (�� ��ȯ�Ǵ� ���Դ� doubleŸ���̾�� ��)
	static double getRemain(int limit, double stuff1, double stuff2) {
		return limit - stuff1 - stuff2;	
	}
	
	// 3. ȯ���Ϸ��� �ѱ����� �޷� ȯ���� �����ϸ� floatŸ������ ȯ���� �޷��� �����ϴ� �Լ�  
	static float exchange(int won, float ex_rate) {
		return (float) (Math.floor(won / ex_rate * 100) / 100.0);
	}
	
	
	public static void main(String[] args) {		
		for (int i = 0; i < 10; ++i)
			printRabbit();	
		
		int need = appleBasket(121, 10);
		System.out.println("�ʿ��� �ٱ����� ���� : " + need);
		
		System.out.println(getKoreanAge(2020, 2010));
		System.out.println(getRemain(600, 35.55, 66.11));
		System.out.println(exchange(5000, 1200));
	}
	
}








