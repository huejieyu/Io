package Buffered;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * �ַ�������+��������(ʹ�������������ܷ�����̬)
 * @author zyq
 *
 */
public class BufferedChar {


	public static void main(String[] args) {
		/**
		 * �ļ��Ķ�ȡ   ����Դ �������ַ��Ĵ��ı����������Ǵ��ı���ʲô����أ�
		 * ����ԭ��  �ַ�����ͳһ �ռ䲻��
		 */
		File src=new File("D:/Users/zyq/2.java");
		File dest=new File("D:/Users/zyq/4.txt");
	
		//
		BufferedReader reader=null;//����������
		BufferedWriter wr=null;
		try {
			reader=new BufferedReader(new FileReader(src));//�ַ���ȡ��

			wr=new BufferedWriter(new FileWriter(dest,true));//true��׷�ӣ���д������False�Ǹ���
			//��ȡ����
			/*
			char [] flush=new char[10];//�����������뵽flush �У��൱��һ��meijie
			int len=0;
			while(-1!=(len=reader.read(flush))){
				wr.write(flush,0,len);
			}*/
			//��������
			String line=null;
			while(null!=(line=reader.readLine())){
				wr.write(line);
				wr.newLine( );//���з�
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
