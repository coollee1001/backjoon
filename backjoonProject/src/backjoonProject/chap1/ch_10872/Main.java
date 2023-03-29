package backjoonProject.chap1.ch_10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/10872
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int factorial = Integer.parseInt(st.nextToken());
		System.out.println(multi(factorial));
	}
	
	private static BigInteger multi(int factorial){
		BigInteger tempInteger = new BigInteger(String.valueOf(factorial));
		if(factorial == 0) return new BigInteger("1");
		return tempInteger.multiply(multi(factorial-1));
	}
}
