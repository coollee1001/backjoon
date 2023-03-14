package backjoonProject.chap1.ch_2751;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * 
 * input : 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 
 * 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 * 
 * output : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 * 
 * @author siwon
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 숫자 input
    	int m = Integer.parseInt(br.readLine());
    	
    	// 숫자  input List
    	List<Integer> intArr = new ArrayList<Integer>();
    	for(int i=0; i<m; i++) {
    		intArr.add(Integer.parseInt(br.readLine()));
    	}
    	br.close();
    	
    	// 배열 정렬
    	Collections.sort(intArr);
    	
    	for(int i=0; i<intArr.size(); i++) {
    		bw.write(String.valueOf(intArr.get(i)));
    		bw.write("\n");
    	}
    	bw.close();
    }    
}