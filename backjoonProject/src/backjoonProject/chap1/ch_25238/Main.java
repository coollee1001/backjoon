package backjoonProject.chap1.ch_25238;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/25238
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		float result = Integer.parseInt(arr[0]) - (Integer.parseInt(arr[0]) * (Integer.parseInt(arr[1]) / 100.0f));
		if(result < 100) {
			System.out.print(1);
		}else {
			System.out.print(0);
		}
	}
}
