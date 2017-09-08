package Buffered;
//�ļ��Ŀ���
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * �ֽ����ļ�����+������ ���������
 * ��ʽ���ڵ�������������
 * 
 * BufferedInputStream
 * 
 * �ֽڻ�����
 * 
 * �ַ�������
 * @author zyq
 *
 */

public class Buffer {

	/**
	 * �ļ��Ŀ���,   ע�����ļ��������ļ��У���
	 * @author zyq
	 *1��������ϵ File���� ԴͷĿ�ĵ�
	 *2��ѡ����
	 *3������������
	 *4���ͷ���Դ���ر�������
	 */
		public static void main(String[] args) {
			
			String src="D:/Users/zyq/2.txt";
			String dest="D:/Users/zyq/3.txt";
			try {
				copyFile1(src,dest);
			} catch(FileNotFoundException e){
				e.printStackTrace();
				System.out.println("�ļ�������");
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("����ʧ�ܻ��߹ر���ʧ��");
			}
		}
		
		//�ļ��Ŀ���
		/**
		 * Դ�ļ�·��
		 * Ŀ���ļ�·��
		 * @throws
		 * @throws FileNotFoundException
		 * @return
		 * 
		 */
		public static void copyFile1(String srcPath, String destPath) throws IOException {
			//1/1������ϵԴ  ȷ��������Ϊ�ļ�������Ŀ�ĵص��ļ����Բ�����
			File src=new File(srcPath);
			File dest=new File(destPath);
			if(!src.isFile()){
				System.out.println("ֻ�ܿ����ļ�");
				throw new IOException();
			}
			//2, ѡ����
			InputStream is=new BufferedInputStream(new FileInputStream(src));//���ϻ��������������
			OutputStream os=new BufferedOutputStream(new FileOutputStream(dest));
			//3�ļ��Ŀ��� ѭ�� ��ȡ д��
			byte[] flush=new byte[1024];//����һ������Ϊ1024��byte����
			int len;
			while(-1!=(len=is.read(flush))){//
				os.write(flush,0,len);
			}
			os.flush();
			//�ر��� �ȴ򿪵ĺ�ر�
			os.close();
			is.close();
		}
	}

