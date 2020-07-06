
public class B10_OOP {

	// ��ü���� ���α׷��� (OOP: Object Oriented Programming)
	//	- ���� �����ϴ� ��� ��ü�� ������ �Լ��� ǥ���Ϸ��� ���α׷��� ��� 
	//	- ������ ��ü�� ���� ���¸� ��Ÿ���� �Լ�(�޼���)�� �ൿ �� ����� ��Ÿ����
	//	- ��ü (Object) : ���� �����ϴ� ��� ������ ���Ѵ� (�繰, �߻����� �� ��) 
	
	// ex: ��� ��ü
	//	- ���� (������ ǥ��) : ����, ũ��, �� ��¥, �ż��� ... 
	//	- ��� (�޼���� ǥ��) : �Ա�, ������ ���Ѵ�, ������ ...  
	
	// Ŭ���� (class)
	//	- ��ü�� ���α׷��� ���� ǥ���� �� 
	//	- ��ü�� ���赵 (������ ���������� ��ü�� ����)
	//	- Ŭ������ ���� �����ϴ� ���� ��ü�� '�ν��Ͻ�'��� �θ���
	//	- Ŭ������ ������ ���� Ÿ���̴� (������ Ÿ���� �����ϴ� ��)
	
	public static void main(String[] args) {
		
		// new 
		//	- Ŭ����(���赵)�� �̿��� ��ü(�ν��Ͻ�)�� �����Ѵ�
		//	- new �ڿ� Ŭ���� �̸����� �� �Լ��� ȣ���ϸ� 
		//	    ���ο� �ν��Ͻ��� �޸𸮿� �����ǰ� �� �ּҰ��� ��ȯ�ȴ� 

		// �Ȱ��� ���� ����� ���� ���赵�� ������ �� �� �ִ�
		Apple a1 = new Apple();
		Apple a2 = new Apple();		
		
		System.out.println("AppleŸ�� �ν��Ͻ� a1�� �ּ� : " + a1);
		System.out.println("AppleŸ�� �ν��Ͻ� a2�� �ּ� : " + a2);
		
		// �ν��Ͻ� ������ ���� �����ϱ�
		a1.color = "red";
		a2.color = "green";
		
		// �ν��Ͻ� ������ ����� ���� ����ϱ�
		System.out.println("a1�� ���� : " + a1.color);
		System.out.println("a2�� ���� : " + a2.color);
		
		// Ŭ���� Ÿ�� �迭 ����ϱ� 
		Apple[] apples = {
			new Apple(), 
			new Apple(), 
			new Apple(), 
			new Apple()	
		};
		
		apples[0].sweet = 10;
		apples[1].sweet = 11;
		apples[2].sweet = 7;
		apples[3].sweet = 6;
		
		System.out.println("apples[0]�� �絵 : " + apples[0].sweet);
		System.out.println("apples[1]�� �絵 : " + apples[1].sweet);
		System.out.println("apples[2]�� �絵 : " + apples[2].sweet);
		System.out.println("apples[3]�� �絵 : " + apples[3].sweet);
		
		// �ʱ�ȭ ���� ���� Ŭ���� ��� �������� �迭ó�� �ʱ�ȭ�� �Ǿ� �ִ�
		//	- ���� : 0, �Ǽ� : 0.0, boolean : false, ������ : null		
		System.out.println(apples[0].size);
		System.out.println(apples[0].worm);
		System.out.println(apples[0].color);		
		
		
		// Apple[]�� 500ũ��� �����ߴٴ� ���� 
		// AppleŬ������ �ν��Ͻ��� 500�� ������ ���� �ƴ϶�
		// AppleŬ������ �ν��Ͻ��� �� �� �ִ� ������ 500�� �����Ѱ��̴�.
		Apple[] box = new Apple[100];
		
		System.out.println("box[50] : " + box[50]); 
		
		// �ν��Ͻ��� �ϳ��� �����ϰ� ��� �迭�� ���� ����� ����Ű�� �������
		box[0] = new Apple();
		
		for (int i = 1; i < box.length; ++i) {
			box[i] = box[0];			
			// box[i] = new Apple();
		}
		
		System.out.println("box[0] : " + box[0]);
		System.out.println("box[50] : " + box[50]);
		
		box[0].color = "red";		
		System.out.println("box[99] : " + box[99].color);
		
		box[99].color = "blue";		
		System.out.println("box[0] : " + box[0].color);
	}
}

class Apple {	
	// Ŭ������ �ν��Ͻ� ���� (�ʵ尪, �������, �Ӽ�)
	int size;	
	int weight;
	int sweet;
	int location;
	boolean worm;
	String color;	
	String pick_date;
}














