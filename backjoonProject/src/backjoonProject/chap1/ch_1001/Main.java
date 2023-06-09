package backjoonProject.chap1.ch_1001;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
 *  
 * input : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * output : 첫째 줄에 A-B를 출력한다.
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력
		String str = br.readLine();
		br.close();
		
		// 처리
		String[] strArr = str.split(" ");
		int[] intArr = new int[strArr.length];
		intArr[0] = Integer.parseInt(strArr[0]);
		intArr[1] = Integer.parseInt(strArr[1]);
		
		// 출력
		bw.write(String.valueOf(intArr[0] - intArr[1]));
		bw.close();		
	}
}
