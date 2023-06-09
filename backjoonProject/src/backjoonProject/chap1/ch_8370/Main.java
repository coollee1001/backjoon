package backjoonProject.chap1.ch_8370;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/8370
 * 
 * @author siwon
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String[] seats = br.readLine().split(" ");
    	br.close();
    	
    	int sum = Integer.parseInt(seats[0]) * Integer.parseInt(seats[1]);
    	sum += Integer.parseInt(seats[2]) * Integer.parseInt(seats[3]);
    	
    	System.out.println(sum);
    	
    }
}