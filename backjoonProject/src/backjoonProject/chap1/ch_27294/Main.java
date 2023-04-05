package backjoonProject.chap1.ch_27294;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/27294
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sushi = br.readLine().split(" ");
		int time = Integer.parseInt(sushi[0]);
		if(12 <= time && time <= 16 && Integer.parseInt(sushi[1]) == 1) {
			System.out.print(280);
		}else if(!(12 <= time && time <= 16)){
			System.out.print(280);
		}else {
			System.out.print(320);
		}
	}
}
