package charIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * �ļ���д��
 * 1������Դ
 * 2��ѡ����
 * 3��д��
 * 4���ر���Դ
 * @author zyq
 *write()
 */
public class CharWrite {
	public static void main(String[] args) {
		//����Դ
		File dest=new File("D:/Users/zyq/4.txt");
		//ѡ����
		Writer wr=null;
		try {
			wr=new FileWriter(dest,true);//true��׷�ӣ���д������False�Ǹ���
			//д��
			String msg="Today is Wednesday, Iam happy.";
			wr.write(msg);
			wr.append("����");//���ƶ���֧����ӵ���writer
			wr.flush();//ǿ��ˢ�³�ȥ
		} catch(FileNotFoundException e){
			e.printStackTrace();
			//System.out.println("�ļ�δ�ҵ�");
				}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("");
		}finally{
			if(null!=wr){
				try {
					wr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("�ر�ʧ��");
				}
			}
		}
	}
}
