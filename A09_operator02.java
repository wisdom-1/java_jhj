
public class A09_operator02 {

	public static void main(String[] args) {
		
		// �� ���� (�� �� ������ ����� boolean Ÿ���̴�)
		int a = 7, b = 3;
		
		System.out.println("a > b : " + (a > b));
		System.out.println("a < b : " + (a < b));
		// >=, <= : �ε�ȣ�� ���� ���;� �� (=>, =< ����)
		System.out.println("a >= b : " + (a >= b)); 
		System.out.println("a <= b : " + (a <= b)); 
		
		System.out.println("a == b : " + (a == b)); // ���� �� true
		System.out.println("a != b : " + (a != b)); // �ٸ� �� true
		
		// �� ������ ����� ������ ���� �� �ִ�
		boolean result = a != b;
		System.out.println("a != b�� ��� : " + result);
		
		// �� ����
		//	&& : �� ���� ����� ��� true�� �� true (AND) 
		//	|| : �� ���� ����� �ϳ��� true���� true (OR)
		//	!  : true�� false, false�� true (NOT)
		
		// AND : TFFF
		System.out.println("-- AND --");
		System.out.println(true && true);
		System.out.println(true && false);
		
		// &&������ ���� ���� ����� false�� �� ���� ���� �������� �ʴ´�
		// false�� �� ���� �߻��ϴ� ������ �տ� ��ġ�ϸ� ���ҽ��� ����ȴ�
		System.out.println(false && true);
		System.out.println(false && false);
		
		// OR : TTTF
		System.out.println("-- OR --");
		
		// ||������ ���� ���� ����� true�� �� ���� ���� �������� �ʴ´�
		// true�� �� ���� �߻��ϴ� ������ �տ� ��ġ�ϸ� ���ҽ��� ����ȴ�
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("not true : " + !true);
		System.out.println("not false : " + !false);
		
		boolean powerOn = false;
		System.out.println(!powerOn);		
		System.out.println(!(a > b));
		
		if (powerOn) {
			System.out.println("������ �����ֽ��ϴ�.");
		} else if (!powerOn) {
			System.out.println("������ �����ֽ��ϴ�.");
		}
	}
	
}









