package algo.string;

import java.util.Scanner;

// 14392KB	104ms
public class problem10824 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        String A = String.valueOf(a);
        String B = String.valueOf(b);
        String C = String.valueOf(c);
        String D = String.valueOf(d);  
        
        long num1 = Long.valueOf(A += B);
        long num2 = Long.valueOf(C += D);
        
        System.out.println(num1+num2);
        
        // 아래는 runtime exception 
//		String s = sc.nextLine(); // 10 20 30 40 
//		// 공백단위로 분리한다. 
//		String[] test = s.split(" ");
//		String[] arr = new String[4];
//		
//		for (int i = 0; i < test.length ; i++) {
//			//System.out.println(test[i]);
//			arr[i] = test[i];
//		}
//		long num1 = Integer.parseInt(arr[0] + arr[1]);
//		long num2 = Integer.parseInt(arr[2] + arr[3]);
//		System.out.println(num1 + num2);
	}
}
