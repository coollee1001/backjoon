package backjoonProject.chap1.ch_14652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/14652
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputData = br.readLine().split(" ");
		int[] data = new int[3];
		data[0] = Integer.parseInt(inputData[0]);
		data[1] = Integer.parseInt(inputData[1]);
		data[2] = Integer.parseInt(inputData[2]);

		int count = 0;
		for(int i = 0; i<data[0]; i++) {
			for(int j=0; j<data[1]; j++) {
				if(count == data[2]) System.out.printf("%d %d", i, j);
				count++;
			}
		}
	}
}
