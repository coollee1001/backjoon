package backjoonProject.chap1.ch_2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 * https://www.acmicpc.net/upload/images/f5NhGHVLM4Ix74DtJrwfC97KepPl27s%20(1).png
 * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 * 
 * input : 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
 * 
 * output : 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 입력 저장 배열 (2개 input, 4개 계산값)
		int[] inputArr = new int[2 + 4]; 
		
		// 입력
		for(int i=0; i<2; i++) {
			inputArr[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
		// 계산
		int num = inputArr[1];
		for(int i=2; i<inputArr.length-1; i++) {
			int multi = num % 10;
			inputArr[i] = inputArr[0] * multi;
			num /= 10;
		}
		inputArr[inputArr.length-1] = inputArr[0] * inputArr[1];
		
		//출력
		for(int i=2; i<inputArr.length; i++) {
			System.out.println(inputArr[i]);
		}				
	}
}