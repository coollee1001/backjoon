package backjoonProject.chap1.ch_16430;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/16430
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ab = br.readLine().split(" ");
		System.out.printf("%d %d", Integer.parseInt(ab[1]) - Integer.parseInt(ab[0]), Integer.parseInt(ab[1]));
		
	}
}
