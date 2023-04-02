package backjoonProject.chap1.ch_21300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/21300
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		final int GALLON = 5;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] recycle = br.readLine().split(" ");
		int count = 0;
		for(int i =0; i<recycle.length; i++) {
			count += Integer.parseInt(recycle[i]);
		}
		System.out.print(count * GALLON);		
	}
}
