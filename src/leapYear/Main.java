package leapYear;

import java.io.*;

public class Main {

	public static int getNumberOfDays(int year) {
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			return 366;
		} else return 365;
	}
	public static void fgetNumberOfDays(int year) {
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			
		} 
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());
		System.out.println(getNumberOfDays(year));

	}

}