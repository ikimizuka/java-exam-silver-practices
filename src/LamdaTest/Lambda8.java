package LamdaTest;

import java.util.ArrayList;

public class Lambda8 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		for (String str : list) {
			if("B".equals(str)) {
				list.remove("B");
			}else {
				System.out.println(str);
			}
		}
/**
 * "B"を削除したことで、"C"が繰り上がりListが2つ目で終了する
 */
		
	}



}
