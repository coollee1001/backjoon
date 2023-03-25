package backjoonProject.chap1.ch_7891;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 * https://www.acmicpc.net/problem/7891
 * 
 * @author siwon
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 입력 개수
    	int count = Integer.parseInt(br.readLine());
    	for(int i = 0; i < count; i++) {
    		String[] line = br.readLine().split(" ");
    		BigInteger a = new BigInteger(line[0]);
    		BigInteger b = new BigInteger(line[1]);
    		bw.append(a.add(b) + "\n");
    	}
    	
    	br.close();
    	bw.flush();
    	bw.close();
    }
}