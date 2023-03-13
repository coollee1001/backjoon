package backjoonProject.chap1.ch_1157;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * ���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. 
 * ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
 *  
 * input : ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־�����. 
 * �־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�.
 * 
 * output : ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. 
 * ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int[] charArr = new int[26]; // ���ĺ������� 26
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
