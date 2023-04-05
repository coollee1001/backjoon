package backjoonProject.chap1.ch_27219;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/27219
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		for(int i = 0; i<count/5; i++) {
			System.out.print("V");
		}
		for(int i = 0; i<count%5; i++) {
			System.out.print("I");
		}
	}
}
