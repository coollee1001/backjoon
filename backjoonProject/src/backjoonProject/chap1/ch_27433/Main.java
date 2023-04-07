package backjoonProject.chap1.ch_27433;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * https://www.acmicpc.net/problem/27433
 * 
 * @author siwon
 *	
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.print(factorial(n));
	}
	private static long factorial(int n) {
		if(n == 0) return 1;
		return n * factorial(--n);
	}
}