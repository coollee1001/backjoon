package backjoonProject.chap1.ch_26307;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Time;

/**
 * https://www.acmicpc.net/problem/26307
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputData = br.readLine().split(" ");
		Time inputTime = new Time(Integer.parseInt(inputData[0]), Integer.parseInt(inputData[1]), 0);
		inputTime.setHours(inputTime.getHours() - 9);
		System.out.println((inputTime.getHours() * 60) + inputTime.getMinutes());
	}
}
