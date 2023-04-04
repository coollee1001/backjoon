package backjoonProject.chap1.ch_26574;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://www.acmicpc.net/problem/26574
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		int[] intArr = new int[count+1];
		for(int i = 0; i<count; i++) {
			intArr[i] = Integer.parseInt(br.readLine());
			bw.append(intArr[i] + " " + intArr[i] + "\n");
		}
		bw.close();
	}
}
