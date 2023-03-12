package backjoonProject.chap1.ch_2475;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * 컴퓨터를 제조하는 회사인 KOI 전자에서는 제조하는 컴퓨터마다 6자리의 고유번호를 매긴다. 
 * 고유번호의 처음 5자리에는 00000부터 99999까지의 수 중 하나가 주어지며 6번째 자리에는 검증수가 들어간다. 
 * 검증수는 고유번호의 처음 5자리에 들어가는 5개의 숫자를 각각 제곱한 수의 합을 10으로 나눈 나머지이다.
 * 예를 들어 고유번호의 처음 5자리의 숫자들이 04256이면, 각 숫자를 제곱한 수들의 합 0+16+4+25+36 = 81 을 10으로 나눈 나머지인 1이 검증수이다.
 * 
 * input : 첫째 줄에 고유번호의 처음 5자리의 숫자들이 빈칸을 사이에 두고 하나씩 주어진다.
 * output : 첫째 줄에 검증수를 출력한다.
 * @author siwon
 *
 */
public class Main {
	private final static int MAX = 3;
	private final static String REMAINDER_VALUE = String.valueOf(10);
	private final static List<BigInteger> bigIntegerList = new ArrayList<BigInteger>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tempStr = br.readLine().split(" ");
		for(int index=0; index<MAX; index++) { // 변수 세팅			
			BigInteger tempBig = new BigInteger(tempStr[index]);
			bigIntegerList.add(tempBig.multiply(tempBig)); // 제곱을 리스트에 추가
		}		
		System.out.println(valid(bigIntegerList, MAX-1).remainder(new BigInteger(REMAINDER_VALUE)));
	}
	
	private static BigInteger valid(List<BigInteger> bigIntegerList, int max) { // 검증수 계산
		if(max == 0) return bigIntegerList.get(max).add(new BigInteger("0"));
		return bigIntegerList.get(max).add(valid(bigIntegerList, max-1));
	}
}
