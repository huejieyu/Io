package charIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 * ���ı���ȡ
 * 1������Դ
 * 2��ѡ����
 * 3����ȡ
 * 4���ر���Դ
 */
public class CharRead {
	public static void main(String[] args) {
		//����Դ
		File src=new File("D:/Users/zyq/2.txt");
		//ѡ����
		Reader reader=null;//����������
		try {
			reader=new FileReader(src);
			char [] flush=new char[10];//�����������뵽flush �У��൱��һ��meijie
			int len=0;
			while(-1!=(len=reader.read(flush))){
				String str=new String(flush,0,len);
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Դ�ļ�������");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�ļ���ȡʧ��");
		}finally{
			if(null!=reader){
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("�ر�ʧ��");
				}
			}
		}
		
	}
}
