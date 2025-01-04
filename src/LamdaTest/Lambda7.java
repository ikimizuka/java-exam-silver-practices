package LamdaTest;

import java.util.function.Predicate;

public class Lambda7 {

	public static void main(String[] args) {
		
		Predicate<String> x = s  -> {
			return s.equals("abc");
		};
		
		System.out.println(x.test("abc"));
		
	}



}
