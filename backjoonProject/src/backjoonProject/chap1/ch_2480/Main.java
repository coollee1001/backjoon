package backjoonProject.chap1.ch_2480;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.HashMap;

/**
* 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다
* 
* 1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다* 
* 2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다* 
* 3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다
*  
* 예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다
* 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다
* 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
* 
* 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
 * 
 * input : 
 * 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다. 
 * 
 * output : 
 * 첫째 줄에 게임의 상금을 출력 한다.
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException, ParseException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 입력
		String dice = br.readLine();
		String[] diceArr = dice.split(" ");
		
		HashMap<Integer, Integer> diceMap = new HashMap<Integer, Integer>();
		//초기화
		for(int i =1; i<=6; i++) {
			diceMap.put(i, 0);
		}
		
		//put
		for(int i=0; i<diceArr.length; i++) {
			diceMap.put(Integer.parseInt(diceArr[i]), diceMap.get(Integer.parseInt(diceArr[i]))+1);
		}
		
		//계산
		int sum = 0;
		for(int i=1; i<=6; i++) {
			if(diceMap.get(i) == 3) {
				sum = 10000 + (i * 1000);
				break;
			} else if(diceMap.get(i) == 2) {
				sum = 1000 + (i * 100);
				break;
			} else if(diceMap.get(i) == 1){
				sum = i * 100;
			}
		}
		System.out.println(sum);
	}
}	