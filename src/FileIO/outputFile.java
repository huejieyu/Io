package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * �ļ���д��
 * 1��������ϵ
 * 2��ѡ����
 * 3������
 * 4���ͷ���Դ
 * @author zyq
 *
 */
public class outputFile {
	
	public static void main(String[] args) {
		File dest=new File("D:/Users/zyq/2.txt");
		OutputStream os=null;
		try {
			os=new FileOutputStream(dest,true);//��׷�ӵ���ʽ����д��true,������Ǹ���
			String str="hello Zhao Yingqing\r\n";
			//�ַ���ת�ֽ�����
			byte[] data=str.getBytes();
			os.write(data,0,data.length);
			
			os.flush();//ǿ��ˢ�³�ȥ,���ϵ��Ƴ�ȥ
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�ļ�δ�ҵ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�ļ�д��ʧ��");
		}finally{
			if(os!=null){
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("�ر��ļ�ʧ��");
				}
			}
		}
		
	}
}
