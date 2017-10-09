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
		
		//���̿� ���������� ���̱� ������, 
		//�����ϸ鼭 ���� ���� ū ���� ã�ƾ� �Ѵ�. ==> max(D[j]) + A[i]
		//1�� �ƴ�, a[i]�� ���� ���Ѵ�.
		int d[] = new int[n];
		for (int i = 0; i < n; i++) {
			//���̰� �ƴ� ���̱� ������, �Ʒ��� �� ����
			d[i] = a[i];
			for(int j = 0; j < i ; j++){
				//1��� ���� �ִ´�.
				if(a[j] < a[i] && d[i] < d[j] + a[i]){
					d[i] = d[j] + a[i];
				}
			}
		}
		
		//�׸��� �ٽ� �ִ� �����ؼ� ���
		int ans = d[0];
		for (int i = 0; i < n; i++) {
			if(ans <d[i]) {
				ans = d[i];
			}
		}
		System.out.println(ans);
		
	}

}
