package backjoonProject.chap1.ch_15740;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * https://www.acmicpc.net/problem/15740
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		BigInteger a = new BigInteger(arr[0]);
		BigInteger b = new BigInteger(arr[1]);
		
		System.out.print(a.add(b));
	}
}
