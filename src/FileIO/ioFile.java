package FileIO;
// �ļ��Ķ�ȡ
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/**
 * �ļ��Ķ�ȡ
 * 1��������ϵ   File����
	2��ѡ����     �ļ�������  InputStream FileInputStream
	3������  : byte[] car =new byte[1024];  +read+��ȡ��С
              ���
	4���ͷ���Դ :�ر�

 * @author zyq
 *
 */

public class ioFile {
	public static void main(String[] args){
		File src=new File("D:/Users/zyq/sun.jpg");//1������ϵ
		//2 ѡ����
		InputStream is=null;//����������
		try {
			 is=new FileInputStream(src);
			 //3������  ���϶�ȡ ��������
			 byte[] car=new byte[10];//ÿ�ζ�ȡ�ֽ�����С
			 int len=0;//����   ʵ�ʶ�ȡ��С
			 //ѭ����ȡ 
			 //�ڲ�try catch��ʼ
			 try {
				while(-1!=(len=is.read(car))){//��ȡ��ϵ�ʱ��len��ֵ��-1
					 //��� �ֽ�����ת���ַ���
					String info=new String(car,0,len);
					System.out.println(info);
				 }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("�ļ�������");
			}
			 //һ���ڲ�try catch����
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("��ȡ�ļ�ʧ��");
		}
		finally{
			if(null!=is){
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("�ر��ļ�ʧ��");
				}
			}
		}
		
	}
}
