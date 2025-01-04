package LamdaTest;

import java.util.Arrays;

public class Lambda10 {

	public static void main(String[] args) {
		
		//１番目の値が不一致のため0を返す
		String[] a = {"b","c"};
		String[] b = {"a","b","c"};
		System.out.println(Arrays.mismatch(a, b));
		
		//すべて一致するため-1を返す
		String[] c = {"a","b","c"};
		String[] d = {"a","b","c"};
		System.out.println(Arrays.mismatch(c, d));
		
		//2番目が異なるため、1を返す
		String[] e = {"a","b","c"};
		String[] f = {"a"};
		System.out.println(Arrays.mismatch(e, f));	
		
	}



}
