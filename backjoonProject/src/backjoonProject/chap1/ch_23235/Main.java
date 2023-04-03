package backjoonProject.chap1.ch_23235;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/23235
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = "";
		int count = 0;
		while(true) {
			if((temp = br.readLine()).equals("0")) break;
			System.out.printf("Case %d: Sorting... done!\n", ++count);
		}
	}
}
