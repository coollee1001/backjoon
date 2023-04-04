package backjoonProject.chap1.ch_26082;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/26082
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] abc = br.readLine().split(" ");
		// 경쟁사 성능
		int rival = Integer.parseInt(abc[1]) / Integer.parseInt(abc[0]);
		System.out.println(Integer.parseInt(abc[2]) * rival * 3);
	}
}
