package backjoonProject.chap1.ch_21598;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/21598
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		final String OUTPUT = "SciComLove";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		for(int i =0; i<count; i++) {
			System.out.println(OUTPUT);
		}
	}
}
