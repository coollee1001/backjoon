package backjoonProject.chap1.ch_13277;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * https://www.acmicpc.net/problem/13277
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] intArr = br.readLine().split(" ");
		System.out.print(new BigInteger(intArr[0]).multiply(new BigInteger((intArr[1]))));
	}
}
