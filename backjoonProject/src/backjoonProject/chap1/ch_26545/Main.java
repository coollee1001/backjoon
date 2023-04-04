package backjoonProject.chap1.ch_26545;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/26545
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int[] intArr = new int[count+1];
		for(int i = 0; i<count; i++) {
			intArr[i] = Integer.parseInt(br.readLine());
			intArr[count] += intArr[i];
		}
		System.out.print(intArr[count]);
	}
}
