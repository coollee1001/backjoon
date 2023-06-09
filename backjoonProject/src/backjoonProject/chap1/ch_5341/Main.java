package backjoonProject.chap1.ch_5341;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://www.acmicpc.net/problem/5341
 * 
 * @author siwon
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	
    	while(true) {
    		int pyramid = Integer.parseInt(br.readLine());
    		if(pyramid == 0) break;
    		
    		int result = 0;
    		for(int index = pyramid; index>0; index--) {
    			result += index;
    		}
    		bw.append(result + "\n");
    	}
    	
    	br.close();
    	bw.flush();
    	bw.close();
    }
}