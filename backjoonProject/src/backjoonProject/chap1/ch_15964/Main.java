package backjoonProject.chap1.ch_15964;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * https://www.acmicpc.net/problem/15964
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ab = br.readLine().split(" ");
		System.out.print(customCalc(ab));
	}
	
	private static BigInteger customCalc(String[] ab) {
		BigInteger a = new BigInteger(ab[0]);
		BigInteger b = new BigInteger(ab[1]);
		return (a.add(b)).multiply((a.subtract(b)));
	}
}
