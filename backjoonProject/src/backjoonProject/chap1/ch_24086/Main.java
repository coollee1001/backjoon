package backjoonProject.chap1.ch_24086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/24086
 * 
 * @author siwon
 *
 */
public class Main {
	private static int INT_ARR_SIZE = 2;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] intArr = new int[INT_ARR_SIZE+1];
		for(int i =0; i<INT_ARR_SIZE; i++) {
			intArr[i] = Integer.parseInt(br.readLine());
			if(i != 0) intArr[intArr.length-1] -= intArr[i];
			else intArr[intArr.length-1] = intArr[i];
		}
		System.out.print(Math.abs(intArr[intArr.length-1]));
	}
}
