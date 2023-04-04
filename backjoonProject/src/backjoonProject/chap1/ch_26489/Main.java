package backjoonProject.chap1.ch_26489;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/26489
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = "";
		int index = 0;
		while((temp = br.readLine()) != null) {
			index++;
		}
		System.out.print(index);
	}
}
