package com.home.test;

import java.util.Scanner;
public class P11055 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		//길이와 동일하지만 합이기 때문에, 
		//증가하면서 합이 가장 큰 것을 찾아야 한다. ==> max(D[j]) + A[i]
		//1이 아닌, a[i]의 값을 더한다.
		int d[] = new int[n];
		for (int i = 0; i < n; i++) {
			//길이가 아닌 합이기 때문에, 아래의 값 선언
			d[i] = a[i];
			for(int j = 0; j < i ; j++){
				//1대신 값을 넣는다.
				if(a[j] < a[i] && d[i] < d[j] + a[i]){
					d[i] = d[j] + a[i];
				}
			}
		}
		
		//그리고 다시 최댓값 정렬해서 출력
		int ans = d[0];
		for (int i = 0; i < n; i++) {
			if(ans <d[i]) {
				ans = d[i];
			}
		}
		System.out.println(ans);
		
	}

}
