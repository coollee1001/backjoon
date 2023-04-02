package backjoonProject.chap1.ch_17256;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/17256
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] aArr = br.readLine().split(" ");
		String[] cArr = br.readLine().split(" ");
		
		System.out.printf("%d %d %d", Integer.parseInt(cArr[0]) - Integer.parseInt(aArr[2]),
				Integer.parseInt(cArr[1]) / Integer.parseInt(aArr[1]),
				Integer.parseInt(cArr[2]) - Integer.parseInt(aArr[0]));
	}
}
