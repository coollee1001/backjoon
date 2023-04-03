package backjoonProject.chap1.ch_22193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * https://www.acmicpc.net/problem/22193
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arrCount = br.readLine().split(" ");
		BigInteger n = new BigInteger(br.readLine().substring(0, Integer.parseInt(arrCount[0])));
		BigInteger m = new BigInteger(br.readLine().substring(0, Integer.parseInt(arrCount[1])));
		System.out.print(n.multiply(m));
	}
}
