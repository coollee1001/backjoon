package backjoonProject.chap1.ch_27331;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/27331
 * 
 * @author siwon
 *
 */
public class Main {
	private static final int ARRAY_SIZE = 2;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] intArr = new int[ARRAY_SIZE];
		for(int i=0; i<ARRAY_SIZE; i++) {
			intArr[i] = Integer.parseInt(br.readLine());
		}
		System.out.printf("%d%d",intArr[0], intArr[1]);
	}
}
