package LamdaTest;

import java.util.function.Function;

public class Lambda6 {

	public static void main(String[] args) {
		Function<Integer,String> test = (i) -> { return "abc:"+i;};
		/* 
		 * Functionは、値を変換する為の関数型インターフェース。
		 * Function<T, R>のTはメソッドの引数の型、Rは戻り値の型を指定します。
		 */
		String result = test.apply(10);
		System.out.println(result);
		
		/**
		 * String からIntegerへの変換はコンパイルエラーでできない
		 */
		
		Function<Integer,Double> test2 = (a) -> {return (double)a;};
		double answer = test2.apply(10);
		System.out.println(answer);
	}
	


}
