package backjoonProject.chap1.ch_2739;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

/**
 * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
 * 
 * input : 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
 * 
 * output : 출력형식과 같게 N*1부터 N*9까지 출력한다.
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException, ParseException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 입력
		int timesTable = Integer.parseInt(br.readLine());
		br.close();
		// 구구단 출력
		for(int i =1; i<=9; i++) {
			System.out.println(timesTable + " * " + i + " = " + timesTable*i);
		}
	}
}