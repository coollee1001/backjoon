package backjoonProject.chap1.ch_2744;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
 * 
 * input : 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
 * 
 * output : 첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로, 소문자는 대문자로 바꾼 단어를 출력한다.
 * 
 * @author siwon
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String str = br.readLine();
    	
    	for(int index=0; index<str.length(); index++) {
    		if(Character.isUpperCase(str.charAt(index))) {
    			bw.append(String.valueOf(str.charAt(index)).toLowerCase());
    		}else {
    			bw.append(String.valueOf(str.charAt(index)).toUpperCase());
    		}
    	}
    	bw.close();
    }
}