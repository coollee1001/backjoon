package backjoonProject.chap1.ch_5337;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * https://www.acmicpc.net/problem/5337
 * 
 * @author siwon
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	bw.append(".  .   .");
    	bw.append("\n");
    	
    	bw.append("|  | _ | _. _ ._ _  _");
    	bw.append("\n");
    	
    	bw.append("|/\\|(/.|(_.(_)[ | )(/.");
    	bw.append("\n");
    	
    	bw.flush();
    	bw.close();
    }
}