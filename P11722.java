package com.home.test;

import java.util.*;
public class P11722 {
	public static void main(String[] args) {
		
		//LIS �� �ݴ�� Ǯ��
		//����A�� ����� ���� �� �����ϴ� �κ� ������ ���ϴ� ���
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int d[] = new int[n];
		
		//�ݴ�� �̹�����, j > i , a[j] > a[i]
		for (int i = 0; i < n; i++) {
			d[i] = 1;
			for (int j = 0; j < i; j++) {
				if (a[j] > a[i] && d[i] < d[j] + 1) {
					d[i] = d[j] + 1;
				}
			}
		}
		
		//�پ��� ������� ���ĵ� �迭 d�� �ִ�
		int ans = d[0];
		for (int i = 0; i < n; i++) {
			if(ans < d[i]) {
				ans = d[i];
			}
		}
		System.out.println(ans);
		
	}

}
