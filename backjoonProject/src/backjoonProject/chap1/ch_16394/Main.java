package backjoonProject.chap1.ch_16394;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/16394
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args){
		int startYear = 1946;
		
		Scanner sc = new Scanner(System.in);
		int nowYear = sc.nextInt();
		
		System.out.print(nowYear - startYear);
		
	}
}
