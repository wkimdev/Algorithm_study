package algo.string;

import java.util.Arrays;
import java.util.Scanner;

// 16640KB	160ms
public class problem11656 {
	
	// 접미사 배열
	// 문자열의 부분 문자열 substr 
	// 그리고 array!
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		int n = text.length();
		String[] a = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = text.substring(i);
		}
		Arrays.sort(a);
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
}
