package backjoonProject.chap1.ch_10430;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
 * (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
 * 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
 * input : 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
 * output : 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
 * @author siwon
 */

public class Main {
	public static void main(String[] args) {
		// 변수 초기화  및 입력 설정
		int[] arrInt = {0, 0, 0};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] temp = br.readLine().split(" ");

			// 3개의 변수가 안들어왔을 경우 강제 종료
			if(temp.length != 3) return;
			
			for(int index =0; index<arrInt.length; index++) {
				arrInt[index] = Integer.parseInt(temp[index]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(( arrInt[0] + arrInt[1] ) % arrInt[2]);
		System.out.println(( ( arrInt[0] % arrInt[2] ) + ( arrInt[1] % arrInt[2] ) ) % arrInt[2]);
		System.out.println(( arrInt[0] * arrInt[1] ) % arrInt[2]);
		System.out.println(( ( arrInt[0] % arrInt[2] ) * ( arrInt[1] % arrInt[2] ) ) % arrInt[2]);
		
	}
}
