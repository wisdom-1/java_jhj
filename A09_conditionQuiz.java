package quiz;

public class A09_conditionQuiz {

	public static void main(String[] args) {
		// 1. intÇü º¯¼ö x°¡ 10º¸´Ù Å©°í 20º¸´Ù ÀÛÀ» ¶§ true
		int x = 13;
		System.out.println(x > 10 && x < 20);
		
		// 2. charÇü º¯¼ö ch°¡ °ø¹éÀÌ³ª ÅÇÀÌ ¾Æ´Ò ¶§ true
		char ch = 'a';
		
		System.out.println((int)' ');
		System.out.println((int)'	');
		System.out.println((int)'\t');
		
		System.out.println(ch != ' ' && ch != '\t');
		
		// 3. charÇü º¯¼ö ch°¡ 'x'¶Ç´Â 'X'ÀÏ ¶§ true
		System.out.println(ch == 'x' || ch == 'X');
		
		// 4. charÇü º¯¼ö ch°¡ ¹®ÀÚ('0'~'9')ÀÏ ¶§ true
		System.out.println(ch >= '0' && ch <= '9');
		
		// 5. charÇü º¯¼ö ch°¡ ¿µ¹®ÀÚ(´ë¹®ÀÚ ¶Ç´Â ¼Ò¹®ÀÚ)ÀÏ ¶§ true
		System.out.println((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'));
		
		// if¹®ÀÇ {}³»ºÎ¿¡ ¾µ ¸í·É¾î°¡ ÇÑ ÁÙÀÌ¶ó¸é {}¸¦ »ý·«ÇÒ ¼ö ÀÖ´Ù.
		if (ch >= 'A' && ch <= 'Z')
			System.out.println(ch + "´Â ´ë¹®ÀÚÀÔ´Ï´Ù.");
		else if (ch >= 'a' && ch <= 'z')
			System.out.println(ch + "´Â ¼Ò¹®ÀÚÀÔ´Ï´Ù.");
		else
			System.out.println(ch + "´Â ¿µ¾î°¡ ¾Æ´Õ´Ï´Ù.");
		
		// 5-2. ch°¡ ÇÑ±ÛÀÎ °æ¿ì true 
		System.out.println('ÇÏ' > '°¡');
		System.out.println('ÇÏ' < '°¡');
		
		ch = '´Ù';
		System.out.println(ch >= '°¡' && ch <= 'ÆR');
		System.out.println((int)'°¡');
		System.out.println((int)'ÆR');
		System.out.println((int)'ÑÑ');
		
		// 6. intÇü º¯¼ö year°¡ 400À¸·Î ³ª´©¾î ¶³¾îÁö°Å³ª 
		// 	    ¶Ç´Â 4·Î ³ª´©¾î ¶³¾îÁö°í 100À¸·Î ³ª´©¾î¶³¾îÁöÁö ¾ÊÀ» ¶§ true
		int year = 2096;
		System.out.println(year % 400 == 0 
				|| (year % 4 == 0 && year % 100 != 0));
		
		// 7. booleanÇü º¯¼ö powerOnÀÌ falseÀÏ ¶§ true
		boolean powerOn = false;
		
		System.out.println(powerOn == false);
		System.out.println(!powerOn);
		
		// 8. ¹®ÀÚ¿­ ÂüÁ¶º¯¼ö strÀÌ "yes"ÀÏ ¶§ true
		
		// ÂüÁ¶Çü º¯¼ö : ´ë¹®ÀÚ·Î ½ÃÀÛÇÑ´Ù, ºñ±³ÇÒ ¶§ ==À» »ç¿ëÇÏ¸é ÁÖ¼Ò¸¦ ºñ±³ÇÑ´Ù.
		// ±âº»Çü º¯¼ö : ¼Ò¹®ÀÚ·Î ½ÃÀÛÇÑ´Ù
		String str = "yes";
		String str2 = "yes";
		String str3 = new String("yes");
		
		System.out.println("str : " + str);
		System.out.println("str3 : " + str3);
		
		System.out.println(str == str3);
		
		// str.equals() : µÎ ¹®ÀÚ¿­À» ÁÖ¼Ò°ªÀÌ ¾Æ´Ñ ½ÇÁ¦ °ªÀ¸·Î ºñ±³ÇÑ´Ù
		System.out.println(str.equals(str3)); 
		
		// str.hashCode() : ¹®ÀÚ¿­ÀÇ °ªÀ¸·Î ÇØ½¬ÄÚµå¸¦ »ý¼ºÇÑ´Ù
		//	¡Ø ÇØ½¬ ¾Ë°í¸®Áò 
		//		- °°Àº °ªÀ» ³ÖÀ¸¸é °°Àº °á°ú°¡ ³ª¿À´Â ¾Ë°í¸®Áò
		//		- °á°ú¸¦ ¿¹ÃøÇÒ ¼ö ¾ø¾î¾ß ÇÑ´Ù
		//		- ´Ü¹æÇâÀÌ¾î¾ß ÇÑ´Ù. °á°ú·Î ¿øº»À» À¯ÃßÇÏ±â Èûµé¾î¾ß ÇÑ´Ù.		
		//		abc -> FESAFWEQWERSAFXCVXVSDFWE...
		//		abd -> ASDFERWETQWFXZASDFW...
		System.out.println(str.hashCode() == str3.hashCode());
	}
}














