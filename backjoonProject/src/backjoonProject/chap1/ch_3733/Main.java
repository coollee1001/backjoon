package backjoonProject.chap1.ch_3733;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Objects;

/**
 * A group of N persons and the ACM Chief Judge share equally a number of S shares (not necessary all of them)
 * Let x be the number of shares aquired by each person (x must be an integer)
 * The problem is to compute the maximum value of x.
 * Write a program that reads pairs of integer numbers from an input text file
 * Each pair contains the values of 1 ≤ N ≤ 10000 and 1 ≤ S ≤ 109 in that order
 * The input data are separated freely by white spaces, are correct, and terminate with an end of file
 * For each pair of numbers the program computes the maximum value of x and prints that value on the standard output from the beginning of a line, as shown in the example below.
 * 
 * @author siwon
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	while(true) {    		
    		String temp = br.readLine();
    		if(Objects.isNull(temp) || temp.isEmpty()) break;
        	// 나누기
    		String[] str = temp.split(" ");
        	bw.append(String.valueOf(Integer.parseInt(str[1]) / (Integer.parseInt(str[0]) + 1)) + "\n");
    	}
    	br.close();
    	bw.flush();
    	bw.close();
    }
}