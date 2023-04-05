package backjoonProject.chap1.ch_26575;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/26575
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int[] intArr = new int[count];
		
		for(int i = 0; i<count; i++) {
			String[] inputData = br.readLine().split(" ");
			double sum = 1.0d;
			for(int j=0; j<inputData.length; j++) {
				sum *= Double.parseDouble(inputData[j]);
			}
			sum = Math.round(sum * 100.0d)/100.0d;
			System.out.printf("$%.2f\n", sum);
		}
		
	}
}
