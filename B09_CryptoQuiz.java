package quiz;

public class B09_CryptoQuiz {

	// ��ȣ
	//	- ��� �޼����� �ְ� �ޱ� ���� ��
	//	- ��ȣȭ : ���� �� �ִ� �޼���(��)�� ���� �� ���� �޼���(��ȣ��)���� ��ȯ�ϴ� ��
	//	- ��ȣȭ : ��ȣ���� ������ �ٲٴ� ��
		
	// ���� ��ȣ
	//	- Ű(KEY)�� ��ŭ ���������� ���ĺ��� �̵����� ��ȣ���� �����ϴ� ��ȣ���
	//	- ��ȣȭ : KEY�� ��ŭ ���� ���������� �̵���Ų��
	//	- ��ȣȭ : KEY�� ��ŭ ��ȣ���� �������� �̵���Ų��
	
	// - ��ȣ�� ����� ���ڵ�
	// ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$%^&,.abcdefghijklmnopqrstuvwxyz
	
	// ex: KEY�� 5�� ���
	//		"Hello, World!"	=>	"Mjqqtd%!.."
	
	
	// Ŭ���� ������ �����ϸ� ��� �޼��忡�� ���� ������ ����� �� �ִ�
	static String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
			+ " !@#$%^&,."
			+ "abcdefghijklmnopqrstuvwxyz";
	
	
	public static int indexOfSymbols(char ch) {		
		for (int i = 0; i < symbols.length(); ++i) {
			if (ch == symbols.charAt(i))
				return i;
		}
		
		// �ƹ��͵� ��ã�� ���
		return -1;
	}
	
	// ��ȣȭ �Լ��� ������ ������	
	public static String encryption(String msg, int key) {		
		// str.charAt(index) : ���ڿ��� index��° ���ڸ� ��ȯ�ϴ� �޼��� 
		// str.indexOf(char) : �ش� ���� Ȥ�� ���ڿ��� �� ��° �ε����� ��ġ�ϴ��� ��ȯ�ϴ� �޼���
		key %= symbols.length();		
		
		// String encrypted = "";
		
		// StringBuilder Ŭ���� 
		//	- ���ڿ��� �߰��ذ��鼭 �ϼ������ִ� Ŭ����
		//	- �� ���ڿ��� +=���� ������Ű�°Ͱ� ����� ���������� �ӵ��� �ξ� ������
		StringBuilder encrypted = new StringBuilder();
		
		for (int i = 0; i < msg.length(); ++i) {
			char ch = msg.charAt(i);
			
			// symbols���� ch�� ��ġ�� ã��ʹ�
			int index = indexOfSymbols(ch);
			
			System.out.printf("���� ch[%c]�� symbols������ �ε��� : %d\n", 
					ch, index);
			
			// encrypted += symbols.charAt((index + key) % symbols.length());			
			if (index == -1)
				encrypted.append(ch);
			else
				encrypted.append(symbols.charAt((index + key) % symbols.length()));
		}
		
		return encrypted.toString();
	}
	
	// ��ȣȭ �Լ��� ������ ������ 
	public static String decryption(String crypto, int key) {		
		key %= symbols.length();		
		StringBuilder decrypted = new StringBuilder();
		
		for (int i = 0; i < crypto.length(); ++i) {			
			char ch = crypto.toCharArray()[i];
			
			int index = indexOfSymbols(ch);	
			
			if (index == -1) 
				decrypted.append(ch);
			else if (index - key < 0) 				
				decrypted.append(symbols.charAt(index - key 
						+ symbols.length()));
			else 
				decrypted.append(symbols.charAt(index - key));			
		}
		
		return decrypted.toString();
	}
	
	public static void main(String[] args) {
		String crypto = encryption("H��ello, w��orld!", 5);
		
		System.out.println("�ϼ��� ��ȣ�� : " + crypto);
		
		System.out.println("��ȣȭ�� �� : " + decryption(crypto, 5));
	}
	
}












