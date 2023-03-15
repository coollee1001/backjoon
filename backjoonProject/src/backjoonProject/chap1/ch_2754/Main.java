package backjoonProject.chap1.ch_2754;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

/**
 * 어떤 사람의 C언어 성적이 주어졌을 때, 평점은 몇 점인지 출력하는 프로그램을 작성하시오.
 * A+: 4.3, A0: 4.0, A-: 3.7
 * B+: 3.3, B0: 3.0, B-: 2.7
 * C+: 2.3, C0: 2.0, C-: 1.7
 * D+: 1.3, D0: 1.0, D-: 0.7
 * F: 0.0
 * 
 * input : 첫째 줄에 C언어 성적이 주어진다. 성적은 문제에서 설명한 13가지 중 하나이다.
 * 
 * output : 첫째 줄에 C언어 평점을 출력한다.
 * 
 * @author siwon
 *
 */
public class Main {
	// 성적
	private static HashMap<String, Float> score = new HashMap<String, Float>(); 
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	scoreSetting();
    	
    	// input
    	String str = br.readLine();
    	br.close();
    	
    	if(str.length() == 1) {
    		bw.write(String.valueOf(score.get(String.valueOf(str.charAt(0)))));
    	}else if(str.length() == 2) {
    		char gubun = str.charAt(1);
        	if(gubun == '0') bw.write(String.valueOf(score.get(String.valueOf(str.charAt(0)))));
        	else if(gubun == '+') bw.write(String.valueOf(score.get(String.valueOf(str.charAt(0))) + 0.3f));
        	else if(gubun == '-') bw.write(String.valueOf(score.get(String.valueOf(str.charAt(0))) - 0.3f));
    	}
    	
    	bw.close();
    }
    
    private static void scoreSetting() { // 성적 기준 세팅
    	score.put("A", 4.0f);
    	score.put("B", 3.0f);
    	score.put("C", 2.0f);
    	score.put("D", 1.0f);
    	score.put("F", 0.0f);
    }
}