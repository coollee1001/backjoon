package backjoonProject.chap1.ch_27434;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.PriorityQueue;

/**
 * https://www.acmicpc.net/problem/27434
 * 
 * @author siwon
 *
 */

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(factorial(n));
	}
	private static BigInteger factorial(int n) {
		PriorityQueue<BigInteger> pq = new PriorityQueue<>();
		for (int i = 0; i <= n; ++i) {
			pq.add(BigInteger.valueOf(Math.max(i, 1)));
		}
		while (pq.size() > 1) {
			BigInteger x = pq.poll();
			BigInteger y = pq.poll();
			pq.add(x.multiply(y));
		}
		return pq.peek();
	}
}

