package backjoonProject.chap1.ch_24736;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/24736
 * 
 * @author siwon
 *
 */
public class Main {
	private static final int TEAM_COUNT = 2;
	private static final int[] SCORE = {6, 3, 2, 1, 2};
	private static final int RESULT_COUNT = SCORE.length;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[][] ab = new String[TEAM_COUNT][RESULT_COUNT+1];
		for(int i = 0; i<ab.length; i++) {
			String[] temp = br.readLine().split(" ");
			for(int j=0; j<temp.length; j++) {
				ab[i][j] = temp[j];
			}
			ab[i][ab[i].length-1] = "0";
			for(int j = 0; j<ab[i].length-1; j++) {
				ab[i][ab[i].length-1] = String.valueOf(Integer.parseInt(ab[i][ab[i].length-1]) + Integer.parseInt(ab[i][j]) * SCORE[j]); 
			}
		}
		for(int i=0; i<ab.length; i++) {
			System.out.printf("%s", ab[i][ab[i].length-1]);
			if(ab.length-1 != i) System.out.print(" ");
		}
		
	}
}
