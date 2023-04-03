package backjoonProject.chap1.ch_25314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/25314
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputByte = Integer.parseInt(br.readLine());
		String result = "long int";
		while(true) {
			if(inputByte == 4 || inputByte == 0) break;
			if(inputByte % 4 == 0) {
				result = "long " + result;
			}
			inputByte -= 4;
		}
		System.out.print(result);
	}
}
