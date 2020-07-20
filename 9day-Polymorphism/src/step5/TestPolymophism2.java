package step5;

class Zoo{
	/*
	 * ÀÌ¿Í °°ÀÌ °´Ã¼ÀÇ Á¾·ù°¡ »õ·Î »ı¼ºµÉ °æ¿ì ÀÌ¿¡ ´ëÀÀÇÏ´Â Ã³¸® ¸Ş¼­µå´Â
	 * °è¼Ó »ı¼ºµÇ¾î¾ß ÇÑ´Ù. ÀÌ´Â ½Ã½ºÅÛÀÇ °áÇÕµµ°¡³ô¾Æ À¯Áöº¸¼ö¼ºÀÌ ÁÁÁö ¾Ê´Ù.
	 * public void pass(Person p) {
	 * 		p.eat();
	 * }
	 * public void pass(Monkey monkey) {
	 * monkey.eat();
	 * }
	 */
	// ¾Æ·¡¿Í ¯˜ÀÌ ´ÙÇü¼ºÀÌ Àû¿ëµÈ ¸Å°³ º¯¼ö·Î Ã³¸®ÇÏ¸é Animal ÀÚ½Ä °´Ã¼ÀÇ ¼ö¿Í
	// °ü°è¾øÀÌ ÇÏ³ªÀÇ ¸Ş¼­µå(¸Ş¼¼Áö ¹æ½Ä)¿¡¼­ ¸ğµÎ Ã³¸®ÇÒ ¼ö ÀÖ´Ù.
	public void pass(Animal a) {
		a.eat();		
	}
	
}

public class TestPolymophism2 {
	public static void main(String[] args) {
		Zoo z = new Zoo();
		z.pass(new Person());
		z.pass(new Monkey());
		// ±× ¿Ü µ¿¹°¿ø¿¡ ´Ù¾çÇÑ ±¸¼º¿ø °´Ã¼°¡ ÀÖ´Ù°í °¡Á¤ÇÑ´Ù.
	}
}
