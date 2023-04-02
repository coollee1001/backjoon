package backjoonProject.chap1.ch_18409;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/18409
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String spell = br.readLine();
		char[] aiueo = {'a', 'i', 'u', 'e', 'o'};
		int result = 0;
		for(int i=0; i<count; i++) {
			for(int j=0; j<aiueo.length; j++) {
				if(spell.charAt(i) == aiueo[j]) result++; 
			}
		}
		System.out.print(result);
	}
}
