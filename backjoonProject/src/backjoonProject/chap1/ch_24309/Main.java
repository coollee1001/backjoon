package backjoonProject.chap1.ch_24309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * https://www.acmicpc.net/problem/24309
 * 
 * @author siwon
 *
 */
public class Main {
	private static int INT_ARR_SIZE = 3;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<BigInteger> list = new ArrayList<BigInteger>(); 
		for(int i=0; i<INT_ARR_SIZE; i++) {
			list.add(new BigInteger(br.readLine()));
		}
		System.out.print((list.get(1).subtract(list.get(2))).divide(list.get(0)));
	}
}
