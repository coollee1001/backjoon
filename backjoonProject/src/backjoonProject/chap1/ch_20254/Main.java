package backjoonProject.chap1.ch_20254;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/20254
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] xArr = br.readLine().split(" ");
		
		long UR = Long.parseLong(xArr[0]);
		long TR = Long.parseLong(xArr[1]);
		long UO = Long.parseLong(xArr[2]);
		long TO = Long.parseLong(xArr[3]);
		
		long result = (56 * UR) + (24 * TR) + (14 * UO) + (6 * TO);
		System.out.print(result);
	}
}
