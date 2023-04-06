package backjoonProject.chap1.ch_27324;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/27324
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputData = Integer.parseInt(br.readLine());
		if(inputData/10 == inputData%10) System.out.print(1);
		else System.out.print(0);
	}
}
