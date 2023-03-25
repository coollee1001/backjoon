package backjoonProject.chap1.ch_8437;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * https://www.acmicpc.net/problem/8437
 * 
 * @author siwon
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    	
    	
    	// 입력
    	BigInteger sum = new BigInteger(br.readLine());
    	BigInteger diff = new BigInteger(br.readLine());
    	
    	br.close();
    	
    	// 계산 및 출력 (diff만큼 차이 있어야 함)
    	sum = sum.subtract(diff);
    	System.out.println(sum.divide(new BigInteger("2")).add(diff));
    	System.out.println(sum.divide(new BigInteger("2")));
    }
}