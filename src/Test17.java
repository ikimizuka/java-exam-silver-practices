

public class Test17 {

	public static void main(String[] args) {
		String a = "abc";
		String b = new String(a);
		System.out.println(a.intern());
		System.out.println(b.intern());
		int count = 0;
		
		if(a.intern() == "abc") {
			count++;
		}
		
		if(b.intern() == "abc") {
			count++;
		}
		
		if(a.intern() == b.intern()) {
			count++;
		}
		
		System.out.println(count);
		
	}
	
	
}