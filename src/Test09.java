

public class Test09 {

	public static void main(String[] args) {
		int a= 10;
		int b= a++;
		System.out.println("a = "+a);
		System.out.println(b);
		b += a;
		System.out.println("a = "+a);
		System.out.println(b);
		b +=a--;
		System.out.println("a = "+a);
		System.out.println(b);		
		b -=a--;
		System.out.println("a = "+a);
		System.out.println(b);		
		b +=++a;
		System.out.println("a = "+a);
		System.out.println(b);
		
	}

}