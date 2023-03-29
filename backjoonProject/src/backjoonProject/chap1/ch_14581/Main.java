package backjoonProject.chap1.ch_14581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/14581
 * 
 * @author siwon
 *
 */
public class Main {
	private final static String FANSTR = ":fan:";
	private final static int MAX = 3;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String id = ":" + br.readLine() + ":";
		for(int i=0; i<MAX; i++) {
			for(int j=0; j<MAX; j++) {
				String temp = FANSTR;
				if(i==1 && j ==1)temp = id;
				System.out.print(temp);
			}
			System.out.print("\n");
		}
	}
}
