package backjoonProject.chap1.ch_1065;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
 *  
 * input : 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
 * output : 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		if(str.length() <= 2) bw.write(Integer.parseInt(str) + "\n");
		else {
			int count = 99;
			for(int j=100; j<=Integer.parseInt(str); j++) {
				String jToStr = String.valueOf(j);
				String ap = String.valueOf(jToStr.charAt(0) - jToStr.charAt(1));
				for(int i=1; i<jToStr.length()-1; i++) {
					String ap2 = String.valueOf(jToStr.charAt(i) - jToStr.charAt(i+1));
					if(!ap.equals(ap2)) break;
					else count++;
				}
			}
			bw.write(count+"\n");
		}		
		bw.flush();
		bw.close();
	}
}
