package backjoonProject.chap1.ch_27389;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/27389
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int metronome = Integer.parseInt(br.readLine());
		System.out.print(metronome/4.0f);
	}
}
