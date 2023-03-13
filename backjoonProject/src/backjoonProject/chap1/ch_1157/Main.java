package backjoonProject.chap1.ch_1157;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
 * 단, 대문자와 소문자를 구분하지 않는다.
 *  
 * input : 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 
 * 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 * 
 * output : 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 
 * 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int[] charArr = new int[26]; // 알파벳개수는 26
		for(int i=0; i<str.length(); i++) {
			char charStr = Character.toUpperCase(str.charAt(i));
			int index = charStr - 'A';
			charArr[index] += 1;  
		}
		
		int maxIndex = 0, max = 0;
		for(int i=0; i<charArr.length; i++) {
			if(max <= charArr[i]) {
				maxIndex = i;
				max = charArr[i];
			}
		}
		int count = -1; 
		for(int i=0; i<charArr.length; i++) {
			if(max == charArr[i]) {
				count++;
			}
		}
		if(count != 0) bw.write("?\n");
		else {
			char c = 'A';
			c += maxIndex;
			bw.write(c+"\n");
		}
		
		bw.flush();
		bw.close();
	}
}
