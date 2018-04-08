package algo.com.io;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P10952 {
	public static void main(String[] args) throws IOException {
		
		//알고리즘 문제를 제대로 읽자!!!!(0일때 종료시켜야 한다)
		//아래와 같이 스트링처리로 해서 문장을 마치는게 좋은방법일까?..
		//어찌됐든 Scanner를 사용했을때보다 시간과 메모리가 줄었다.
		/*
		1 1
		2 3
		3 4
		9 8
		5 2
		0 0
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		while((str=br.readLine()) != null && str.length() != 0) {
			StringTokenizer st = new StringTokenizer(str);
			if(str.equals("0 0")) {
				break;
			}
			System.out.print(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
		}
		
	}
}
