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
 * ���ĺ� �ҹ��ڷ� �̷���� N���� �ܾ ������ �Ʒ��� ���� ���ǿ� ���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 1. ���̰� ª�� �ͺ���
 * 2. ���̰� ������ ���� ������
 * ��, �ߺ��� �ܾ�� �ϳ��� ����� �����ؾ� �Ѵ�.
 *  
 * input : ù° �ٿ� �ܾ��� ���� N�� �־�����. (1 �� N �� 20,000) 
 * ��° �ٺ��� N���� �ٿ� ���� ���ĺ� �ҹ��ڷ� �̷���� �ܾ �� �ٿ� �ϳ��� �־�����. 
 * �־����� ���ڿ��� ���̴� 50�� ���� �ʴ´�.
 * 
 * output : ���ǿ� ���� �����Ͽ� �ܾ���� ����Ѵ�.
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// �ܾ� ���� input
    	int m = Integer.parseInt(br.readLine());
    	
    	// �ܾ�  input List(�ߺ� ���� HashSet)
    	HashSet<String> strArr = new HashSet<String>();
    	for(int i=0; i<m; i++) {
    		strArr.add(br.readLine());
    	}
    	br.close();
    	
    	// ���� �޼��� ����� ���� ��ȯ �� ����
    	List<String> list = new ArrayList<String>(strArr);
    	list.sort(Comparator.comparing(String::length).thenComparing(String::compareTo));
    	
    	for(int i=0; i<list.size(); i++) {
    		bw.write(list.get(i));    
    		bw.write("\n");    		    		
    	}
    	bw.close();
	}
}
