package algo.com.io;

import java.util.Scanner;

public class P10952_2 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		while(sc.hasNextInt()) {
			// 연달에 두번 들어오는 걸.. 어떻게 체크하지??
			// 입력의 마지막을 체크
			// 1 0 
			// 0 0 
			
			// 2 0 
			// 0 2
			// 0 0 
			int a = sc.nextInt();
			int b = sc.nextInt();
			String str = String.valueOf(a + " " + b);
			// string 비교는 string끼리 하자.. 이거 안해서 틀림 (equals)
			if(str.equals("0 0")) {
				break;
			} 
			System.out.println(a+b);
		}
		sc.close();	
		
	}
}
