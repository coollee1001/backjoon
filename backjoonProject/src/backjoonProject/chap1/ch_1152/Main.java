package backjoonProject.chap1.ch_1152;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * ���� ��ҹ��ڿ� �������� �̷���� ���ڿ��� �־�����. 
 * �� ���ڿ����� �� ���� �ܾ ������? 
 * �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * ��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�.
 *  
 * input : ù �ٿ� ���� ��ҹ��ڿ� �������� �̷���� ���ڿ��� �־�����. 
 * �� ���ڿ��� ���̴� 1,000,000�� ���� �ʴ´�. 
 * �ܾ�� ���� �� ���� ���еǸ�, ������ �����ؼ� ������ ���� ����. 
 * ���� ���ڿ��� �������� �����ϰų� ���� �� �ִ�.
 * output : ù° �ٿ� �ܾ��� ������ ����Ѵ�.
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		String[] strArr = str.split(" ");
		List<String> strList = new ArrayList<String>();
		for(int i=0; i<strArr.length; i++) {
			if(!strArr[i].equals("")) strList.add(strArr[i]);
		}
		bw.write(strList.size()+"\n");
		
		bw.flush();
		bw.close();
	}
}
