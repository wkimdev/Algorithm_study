package algo.string;

import java.util.Scanner;

// https://www.acmicpc.net/problem/11655
// 14404KB	100ms
public class problem11655 {
	
	// 대문자 소문자 구분, 
	// a~m ==> +13
	// n~z ==> -13
	public static String rot13(String s) {
		String text = "";
		for (int i = 0; i < s.length() ; i++) {
			
			char c = s.charAt(i);
			
			if ( 'a' <= c && 'm' >= c ) {
				c += 13;
			} else if ( 'n' <= c && 'z' >= c ) {
				c -= 13;
			} else if ( 'A' <= c && 'M' >= c ) {
				c += 13;
			} else if ( 'N' <= c && 'Z' >= c ) {
				c -= 13;
			}
			text +=c;
		}
		return text;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		System.out.print(rot13(text));
	}
}
