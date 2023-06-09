package backjoonProject.chap1.ch_5339;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * https://www.acmicpc.net/problem/5339
 * 
 * @author siwon
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	bw.append("     /~\\"); bw.append("\n");
    	bw.append("    ( oo|"); bw.append("\n");
    	bw.append("    _\\=/_"); bw.append("\n");
    	bw.append("   /  _  \\"); bw.append("\n");
    	bw.append("  //|/.\\|\\\\"); bw.append("\n");
    	bw.append(" ||  \\ /  ||"); bw.append("\n");
    	bw.append("============"); bw.append("\n");
    	bw.append("|          |"); bw.append("\n");
    	bw.append("|          |"); bw.append("\n");
    	bw.append("|          |"); bw.append("\n");
    	
    	bw.flush();
    	bw.close();
    }
}