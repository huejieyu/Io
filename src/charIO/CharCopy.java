package charIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * ���ı��Ŀ���
 * @author zyq
 *
 */
public class CharCopy {
	public static void main(String[] args) {
		/**
		 * �ļ��Ķ�ȡ   ����Դ �������ַ��Ĵ��ı�������
		 */
		File src=new File("D:/Users/zyq/2.txt");
		File dest=new File("D:/Users/zyq/4.txt");
	
		//
		Reader reader=null;//����������
		Writer wr=null;
		try {
			reader=new FileReader(src);//�ַ���ȡ��

			wr=new FileWriter(dest,true);//true��׷�ӣ���д������False�Ǹ���
			char [] flush=new char[10];//�����������뵽flush �У��൱��һ��meijie
			int len=0;
			while(-1!=(len=reader.read(flush))){
				wr.write(flush,0,len);
			}
			wr.flush();//ǿ��ˢ��
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Դ�ļ�������");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�ļ���ȡʧ��");
		}finally{
			if(null!=wr){
				try {
					wr.close();
				}catch(Exception e1){
				}
			if(null!=reader){
				try {
					reader.close();
				}catch(Exception e2){
				}
			}
}
			}
		
		
	}
}
