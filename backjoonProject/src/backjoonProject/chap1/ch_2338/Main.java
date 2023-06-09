package backjoonProject.chap1.ch_2338;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * 두 수 A, B를 입력받아, A+B, A-B, A×B를 구하는 프로그램을 작성하시오. 
 * input : 첫째 줄에 A가, 둘째 줄에 B가 주어진다. 각각의 수는 10진수로 **1,000자리**를 넘지 않으며 양수와 음수가 모두 주어질 수 있다.
 * output : 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A×B를 출력한다. 각각을 출력할 때, 답이 0인 경우를 제외하고는 0으로 시작하게 해서는 안 된다(1을 01로 출력하면 안 된다는 의미).
 * @author siwon
 *
 */
public class Main {
	private final static int MAX = 2;
	private static List<BigInteger> BigIntegerArr = new ArrayList<BigInteger>();;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int index=0; index<MAX; index++) { // 변수 세팅			
			BigIntegerArr.add(new BigInteger(br.readLine()));
		}
		
		//출력
		System.out.println(BigIntegerArr.get(0).add(BigIntegerArr.get(1)));
		System.out.println(BigIntegerArr.get(0).subtract(BigIntegerArr.get(1)));
		System.out.println(BigIntegerArr.get(0).multiply(BigIntegerArr.get(1)));
	}
}
