package backjoonProject.chap1.ch_4999;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://www.acmicpc.net/problem/4999
 * 
 * @author siwon
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	String[] str = new String[2];
    	
		str[0] = br.readLine();
		str[1] = br.readLine();
		
    	// 판단
		String result = null;
		
		if(str[0].length() < str[1].length()) result = "no";
		else result = "go";
		
    	bw.append(result + "\n");
    	
    	br.close();
    	bw.flush();
    	bw.close();
    }
}