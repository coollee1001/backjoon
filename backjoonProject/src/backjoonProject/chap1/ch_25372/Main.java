package backjoonProject.chap1.ch_25372;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://www.acmicpc.net/problem/25372
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {
			String password = br.readLine();
			if(6 <= password.length() && password.length() <=9) {
				bw.append("yes");
			}else {
				bw.append("no");
			}
			bw.append("\n");
		}
		bw.close();
	}
}
