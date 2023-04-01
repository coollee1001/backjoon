package backjoonProject.chap1.ch_16099;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 * https://www.acmicpc.net/problem/16099
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		String[][] field = new String[count][4];
		for(int i=0; i<count; i++) {
			field[i] = br.readLine().split(" ");
			if((new BigInteger(field[i][0]).multiply(new BigInteger(field[i][1]))).compareTo(new BigInteger(field[i][2]).multiply(new BigInteger(field[i][3]))) == 1) {
				bw.append("TelecomParisTech");
			}else if((new BigInteger(field[i][0]).multiply(new BigInteger(field[i][1]))).compareTo(new BigInteger(field[i][2]).multiply(new BigInteger(field[i][3]))) == -1) {
				bw.append("Eurecom");
			}else {
				bw.append("Tie");
			}
			bw.append("\n");
		}
		br.close();
		bw.close();
	}
}
