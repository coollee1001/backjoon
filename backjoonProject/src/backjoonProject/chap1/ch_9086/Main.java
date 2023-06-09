package backjoonProject.chap1.ch_9086;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://www.acmicpc.net/problem/9086
 * 
 * @author siwon
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 입력
    	int count = Integer.parseInt(br.readLine());    	
    	// 출력
    	for(int idx = 0; idx < count; idx++) {
    		String temp = br.readLine();
    		bw.append(String.valueOf(temp.charAt(0)) + String.valueOf(temp.charAt(temp.length()-1)) + "\n");
    	}
    	
    	br.close();
    	bw.close();
    	
    }
}