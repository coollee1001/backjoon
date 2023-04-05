package backjoonProject.chap1.ch_26766;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/26766
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String heart = " @@@   @@@ \n" + 
				"@   @ @   @\n" + 
				"@    @    @\n" + 
				"@         @\n" + 
				" @       @ \n" + 
				"  @     @  \n" + 
				"   @   @   \n" + 
				"    @ @    \n" + 
				"     @     ";
		for(int i = 0; i<count; i++) {
			System.out.println(heart);
		}
	}
}
