package Buffered;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * encode����
 * decode����
 * ת������ֻ���ֽ�ת��Ϊ�ַ�
 * 1������� OutputStreamWriter   ����
 * 2�������� InputStreamReader   ����
 * @author zyq
 *
 */
public class ConverStream {
	public static void main(String[] args) throws IOException {
		//�ƶ������ַ���
		BufferedReader br=new BufferedReader(//�ַ�������
				new InputStreamReader(//�ַ�������
						new FileInputStream(//�ļ�������
								new File("D:/Users/zyq/2.txt","utf-8"))));
	}
	
}
