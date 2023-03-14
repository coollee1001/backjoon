package backjoonProject.chap1.ch_2438;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 * 
 * input : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 
 * output : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 입력
		int count = Integer.parseInt(br.readLine());
		
		// 출력
		for(int i=0; i<count; i++) {
			for(int j=0; j<=i; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		// 메모리 누수 방지
		br.close();
		bw.flush();
		bw.close();
	}
}
