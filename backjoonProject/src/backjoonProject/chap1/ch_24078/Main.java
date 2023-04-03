package backjoonProject.chap1.ch_24078;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/24078
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(Integer.parseInt(br.readLine()) % 21);
	}
}
