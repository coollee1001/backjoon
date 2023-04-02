package backjoonProject.chap1.ch_18301;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/18301
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] xArr = br.readLine().split(" ");
		
		long n1 = Long.parseLong(xArr[0]);
		long n2 = Long.parseLong(xArr[1]);
		long n12 = Long.parseLong(xArr[2]);
		
		long result = (((n1 * n2) + n1 + n2 + 1) / (n12 + 1)) - 1;
		System.out.print(result);
	}
}
