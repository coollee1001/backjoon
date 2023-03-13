package backjoonProject.chap1.ch_1181;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

/**
 * 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
 * 1. 길이가 짧은 것부터
 * 2. 길이가 같으면 사전 순으로
 * 단, 중복된 단어는 하나만 남기고 제거해야 한다.
 *  
 * input : 첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 
 * 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 
 * 주어지는 문자열의 길이는 50을 넘지 않는다.
 * 
 * output : 조건에 따라 정렬하여 단어들을 출력한다.
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 단어 개수 input
    	int m = Integer.parseInt(br.readLine());
    	
    	// 단어  input List(중복 제거 HashSet)
    	HashSet<String> strArr = new HashSet<String>();
    	for(int i=0; i<m; i++) {
    		strArr.add(br.readLine());
    	}
    	br.close();
    	
    	// 정렬 메서드 사용을 위한 변환 후 정렬
    	List<String> list = new ArrayList<String>(strArr);
    	list.sort(Comparator.comparing(String::length).thenComparing(String::compareTo));
    	
    	for(int i=0; i<list.size(); i++) {
    		bw.write(list.get(i));    
    		bw.write("\n");    		    		
    	}
    	bw.close();
	}
}
