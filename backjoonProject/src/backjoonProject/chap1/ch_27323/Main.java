package backjoonProject.chap1.ch_27323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/27323
 * 
 * @author siwon
 *
 */
public class Main {
	private static final int ARRAY_SIZE = 2;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] intArr = new int[ARRAY_SIZE];
		int size = 0;
		for(int i=0; i<intArr.length; i++) {
			size *= Integer.parseInt(br.readLine());
		}
		System.out.print(size);
	}
}
