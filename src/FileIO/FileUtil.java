package FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/**
 * �ļ��Ŀ���
 *  �ļ��еĿ���
 * @author zyq
 *
 */
public class FileUtil {
	public static void copyFile1(String srcPath, String destPath) throws IOException {
		//1/1������ϵԴ  ȷ��������Ϊ�ļ�������Ŀ�ĵص��ļ����Բ�����
		File src=new File(srcPath);
		File dest=new File(destPath);
	copyFile1(src,dest);
	}
	/**
	 * 
	 * @param src
	 * @param dest
	 * @throws IOException
	 */
	public static void copyFile1(File src,File dest) throws IOException {
		//1/1������ϵԴ  ȷ��������Ϊ�ļ�������Ŀ�ĵص��ļ����Բ�����
		if(!src.isFile()){
			System.out.println("ֻ�ܿ����ļ�");
			throw new IOException("ֻ�ܿ����ļ���");
		}
		//destΪ�Ѿ����ڵ��ʼۼУ����ܽ������ļ���ͬ�����ļ�
		if(dest.isDirectory()){
			System.out.println("ֻ�ܿ����ļ�");
			throw new IOException("ֻ�ܿ����ļ�");
		}
		//ѡ����
		InputStream is=new FileInputStream(src);
		OutputStream os=new FileOutputStream(dest);
		//3�ļ��Ŀ��� ѭ�� ��ȡ д��
		byte[] flush=new byte[1024];
		int len;
		while(-1!=(len=is.read(flush))){
			os.write(flush,0,len);
		}
		os.flush();
		//�ر��� �ȴ򿪵ĺ�ر�
		os.close();
		is.close();
	}
	/**
	 * �����ļ���
	 * @param srcPathԴ·��
	 *@param   destPath Ŀ��·��
	 * @throws IOException 
	 **/
	public static void copyDir(String srcPath, String destPath) throws IOException{
		File src=new File(srcPath);
		File dest=new File(destPath);
		
		if(src.isDirectory()){//������ļ���,ֱ�Ӵ���
		 dest=new File(dest,src.getName());//ֻ�Ǵ���һ���ļ�����û��д��
			}
		
				copyDirDetail(src,dest);
			
		//System.out.println(1145);
	}
	/**
	 *�����ļ�
	 * @param src
	 * @param dest
	 */

	public static void copyDirDetail(File src, File dest) throws IOException{
//		File src=new File(srcPath);
//		File dest=new File(destPath);
	//	System.out.println(1147);
		if(src.isFile()){
			try {
				FileUtil.copyFile1(src,dest);
			//	System.out.println(1146);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw e;
			}
		}else if(src.isDirectory()){//���ļ��е����,�����ļ���
			//ȷ��Ŀ���ļ�����
			dest.mkdirs();
			//��ȡ��һ��Ŀ¼�����ļ�
			for(File sub:src.listFiles()){
				copyDirDetail(sub,new File(dest,sub.getName()));
			}
		}
	}
}
