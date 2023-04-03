package backjoonProject.chap1.ch_24082;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/24082
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("%d",(int)Math.pow(Integer.parseInt(br.readLine()), 3));
	}
}
