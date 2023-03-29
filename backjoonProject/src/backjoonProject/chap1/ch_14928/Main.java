package backjoonProject.chap1.ch_14928;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/14928
 * 
 * @author siwon
 *
 */
public class Main {
	private final static long NUM = 20000303;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		long reminder = 0;
		
		for(int i = 0; i<num.length(); i++) {
			reminder = (reminder * 10 + (Integer.parseInt(String.valueOf(num.charAt(i))))) % NUM;
		}
		System.out.print(reminder);
	}
}
