package api;

import java.time.LocalDate;

public class Api4 {
	public static void main(String[] args) {
		LocalDate localDate1 = LocalDate.of(2024,11, 11);
		System.out.println(localDate1);
		
		LocalDate localDate2 = LocalDate.now();
		System.out.println(localDate2);
		
		LocalDate localDate3 = LocalDate.parse("2024-11-11");
		System.out.println(localDate3);
		
	}

}

