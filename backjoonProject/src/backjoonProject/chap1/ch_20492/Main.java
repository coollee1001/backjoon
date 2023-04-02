package backjoonProject.chap1.ch_20492;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/20492
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[] gold = new long[3];
		gold[0] = Long.parseLong(br.readLine());		
		gold[1] = (long) (gold[0] - (gold[0] * 0.22));
		gold[2] = (long) (gold[0] - ((gold[0] * 0.2) * 0.22));
		System.out.printf("%d %d", gold[1], gold[2]);
		
	}
}
