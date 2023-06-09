package backjoonProject.chap1.ch_8545;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/8545
 * 
 * @author siwon
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    	
    	
    	// 입력
    	String str = br.readLine();
    	br.close();
    	
    	// 출력 (입력 반대로)
    	for(int index = str.length()-1; index >= 0; index--) {
    		System.out.print(str.charAt(index));
    	}

    }
}