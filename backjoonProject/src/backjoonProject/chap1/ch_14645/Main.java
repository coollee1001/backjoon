package backjoonProject.chap1.ch_14645;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/14645
 * 
 * @author siwon
 *
 */
public class Main {
	private final static String BUS_DRIVER_NAME = "비와이";
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] byBus = br.readLine().split(" ");
		for(int i = 0; i<Integer.parseInt(byBus[0]); i++) {
			br.readLine();
		}
		System.out.print(BUS_DRIVER_NAME);
	}
}
