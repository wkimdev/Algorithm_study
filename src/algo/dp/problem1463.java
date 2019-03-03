package algo.dp;

import java.util.Scanner;

public class problem1463 {

//	
//	정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
//
//	X가 3으로 나누어 떨어지면, 3으로 나눈다.
//	X가 2로 나누어 떨어지면, 2로 나눈다.
//	1을 뺀다.
//	정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 '최솟값'을 출력하시오.
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt(); // n = 10
//		System.out.println(cal(n));
//	}
//	
//	public static int cnt = 0;
//	public static int d = 0;
//	
//	public static int cal(int n) {
//		// 계산 횟수를 구해야한다!
//		// 조건에 맞지 않으면 n = 1
////		 아래 구문을 다시 돌아야 함 .
////		int d = 0;
//		int ans = 0;
//		
//		if( n%3 == 0 ) {
//			d = n/3;
//			cnt += 1;
//			if (d != 1) {
//				cal(d);
//			} else {
//				ans = cnt;
//			}
//		} else if(n%2 == 0 ) {
//			d = n/2;
//			cnt += 1;
//			
//			if (d != 1) {
//				cal(d);
//			} else {
//				ans = cnt;
//			}
//		} else {
//			d = n - 1;
//			cnt += 1;
//			
//			if (d != 1) {
//				cal(d);
//			} else {
//				ans = cnt;
//			}
//		}
//		
//		return ans;
//		
//	}  
	
	 public static int[] d;
	    public static int go(int n) {
	    	System.out.println(" n :"+n);
	        if (n == 1) {
	            return 0;
	        }
//	        if (d[n] > 0) {
//	            return d[n];
//	        }
	        System.out.println(" go("+n+"-1) : "+go(n-1));
	        //d[n] = go(n-1) + 1; // 제일 많이 걸리는 방식
//	        System.out.println(" d["+n+"] : "+d[n]);
//	        System.out.println(" go("+n+"-1) : "+go(n-1));
	        
//	        if (n%2 == 0) {
//	            int temp = go(n/2)+1;
//	            if (d[n] > temp) { // 위에서 연산했을때보다 n/2로 연산한게 작을 경우 이쪽에서 연산한 놈을 최소값으로 사용한다. 
//	            	// 이거 단위로 쪼개서 연산 해야 할 듯 
//	                d[n] = temp;
//	            }
//	        }
//	        if (n%3 == 0) {
//	            int temp = go(n/3)+1;
//	            if (d[n] > temp) {
//	                d[n] = temp;
//	            }
//	        }
	        return d[n];
	    }
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        d = new int[n+1];
	        System.out.println(go(n));
	    }
	
}	
