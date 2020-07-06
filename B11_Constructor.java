
public class B11_Constructor {

	// Ŭ������ ������ (Constructor)
	//	- Ŭ������ �̸��� �Ȱ��� �̸��� �Լ�
	//	- ���� Ÿ���� ����
	//	- new�� �Բ� Ŭ������ �����ڸ� ȣ���ϸ� �ν��Ͻ��� �����ȴ�
	//	- �����ڸ� �������� ���� Ŭ������ �⺻ �����ڸ� �ڵ����� ������ �ش�
	
	public static void main(String[] args) {
		// ������ Ŭ������ �����ڸ� ���� �������� �ʾұ� ������ �⺻ �����ڸ� ����Ѵ�
		Orange orange01 = new Orange();
		
		System.out.println(orange01.size);
		System.out.println(orange01.sweet);
		
		Grape grape01 = new Grape();
		
		System.out.println(grape01.num);
		System.out.println(grape01.color);
		
		// ���� Ŭ������ �ٸ� ������ �����ڸ� �����߱� ������ 
		// �⺻ �����ڰ� �ڵ����� �������� �ʾҴ� 
		Strawberry berry01 = new Strawberry(50, 99);
		Strawberry berry02 = new Strawberry(60, 80);
		
		System.out.println("berry01�� �� ���� : " + berry01.seed);
		System.out.println("berry01�� �� : " + berry01.sweet);
		
		System.out.println("berry02�� �� ���� : " + berry02.seed);
		System.out.println("berry02�� �� : " + berry02.sweet);
		
		// CherryŬ������ �⺻�����ڰ� �ڵ����� ���������� �ʾ�����
		// �⺻�����ڸ� ���� �����߱� ������ ����� �� �ִ� 
		Cherry cherry01 = new Cherry();
		Cherry cherry02 = new Cherry(3.33);		// double�� �� ����
		Cherry cherry03 = new Cherry(0x00FF00); // int�� �� ����
		
		System.out.println(cherry01.taste);
		System.out.println(cherry01.loc);
		System.out.println(cherry01.fresh);
		System.out.println(cherry01.color);
	}	
	
	// ���� ��� ��ü���� ������ �������� myobj ��Ű���� Ŭ������ �ϳ� �����غ����� 
	//	1. ������ ����
	//	2. ���� 3�� �̻�
	//	3. ������ 2�� �̻�
}

class Orange {
	int size;
	int sweet;
}

class Grape {
	int num;
	String color;
	
	// GrapeŬ������ �⺻ ������ 
	Grape() {
		// �Ϲ�������, �����ڴ� Ŭ������ ��� ���� ���� �ʱ�ȭ �ϴ� �뵵�� ����Ѵ�
		num = 23;
		color = "�����"; 
	}	
}

class Strawberry {
	int seed;
	int sweet;
	
	// StrawberryŬ������ �Ű������� �޴� ������  
	Strawberry(int seed, int sweetness) {
		// this.seed : �ν��Ͻ� ���� seed
		// seed : �Ű������� ���޹��� seed		
		
		// this
		//	- ���� �ν��Ͻ� �ڱ� �ڽ��� ���Ѵ�
		//	- � �ν��Ͻ����� ȣ���ϴ��Ŀ� ���� �޶����� ���̴�
		this.seed = seed;
		
		// �̸��� �ٸ� ��쿡�� this�� ������ �� �ʿ䰡 ����
		sweet = sweetness;
	}
}


class Cherry {
	int color;
	double taste;
	int fresh;
	String loc;
	
	// ������ �����ε� 
	//	- �Ű� ������ ������ �ٸ��ų� 
	//    ������ ������ Ÿ���� �ٸ� �����ڸ� ������ �����ϴ� ��
	
	// �⺻���� �������ִ� �⺻ ������
	Cherry() {
		color = 0xFF0000;
		taste = 80.00;
		loc = "�⺻��";
		fresh = 10;
	}
	/** 
	 * ���� �����ϴ� ������
	 */
	Cherry(double taste) {
		this.taste = taste;
	}
	/** 
	 * ���� �����ϴ� ������
	 * @param color
	 */
	Cherry(int color) {
		this.color = color;
	}	
	// �������� �����ϴ� ������
	Cherry(String loc) {
		this.loc = loc;
	}
	// ����� ���� �����ϴ� ������
	Cherry(int color, int taste) {
		this.color = color;
		this.taste = taste;
	}
}









