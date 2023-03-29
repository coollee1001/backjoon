package backjoonProject.chap1.ch_15727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/15727
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int far = Integer.parseInt(br.readLine());
		int farResult = far/5;
		if(far%5 != 0)  farResult += 1;
		System.out.print(farResult);
		
	}
}
