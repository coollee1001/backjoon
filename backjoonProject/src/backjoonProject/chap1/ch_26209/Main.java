package backjoonProject.chap1.ch_26209;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/26209
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] abc = br.readLine().split(" ");
		for(int i=0; i<abc.length; i++) {
			char temp = abc[i].charAt(0);
			if(!(temp == '0' || temp == '1')) {
				System.out.print("F");
				return;
			}
		}
		System.out.print("S");
	}
}
