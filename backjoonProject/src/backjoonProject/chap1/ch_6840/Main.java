package backjoonProject.chap1.ch_6840;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/6840
 * 
 * @author siwon
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int[] bears = new int[3];
    	for(int index = 0; index < bears.length; index++) {
    		bears[index] = Integer.parseInt(br.readLine());    		
    	}
    	Arrays.sort(bears);
    	
    	bw.append(bears[1] + "\n");
    	
    	br.close();
    	bw.flush();
    	bw.close();
    }
}