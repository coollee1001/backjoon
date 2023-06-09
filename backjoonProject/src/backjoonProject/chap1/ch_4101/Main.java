package backjoonProject.chap1.ch_4101;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Objects;

/**
 * https://www.acmicpc.net/problem/4101
 * 
 * @author siwon
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	while(true) {    		
    		String[] str = br.readLine().split(" ");
    		if(Objects.isNull(str) || (str[0].equals("0") && str[1].equals("0"))) break;
        	// 판단
    		String result = null;
    		if(Integer.parseInt(str[1]) < Integer.parseInt(str[0])) result = "Yes";
    		else result = "No";
        	bw.append(result + "\n");
    	}
    	br.close();
    	bw.flush();
    	bw.close();
    }
}