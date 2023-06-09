package backjoonProject.chap1.ch_1427;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
 * 
 * input : 첫째 줄에 정렬하려고 하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
 * 
 * output : 첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
 * @author siwon
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 숫자 input
    	String m = br.readLine();
    	br.close();
    	
    	// 숫자  input 1자리수 List
    	List<Integer> intArr = new ArrayList<Integer>();
    	for(int i=0; i<m.length(); i++) {
    		intArr.add(Character.getNumericValue(m.charAt(i)));
    	}
    	
    	// 배열 정렬
    	Collections.sort(intArr, Comparator.reverseOrder());
    	
    	for(int i=0; i<intArr.size(); i++) {
    		bw.write(String.valueOf(intArr.get(i)));    		
    	}
    	bw.close();
    }
}
