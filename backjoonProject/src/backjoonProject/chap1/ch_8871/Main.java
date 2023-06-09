package backjoonProject.chap1.ch_8871;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/8871
 * 
 * @author siwon
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    	
    	
    	// 입력
    	int round = Integer.parseInt(br.readLine()) + 1;
    	br.close();
    	
    	// 출력 (최소 작업수 최대 작업수)
    	System.out.printf("%d %d", round * 2, round * 3);

    }
}