package FileIO;

import java.io.File;
/**
 * mkdir();����ȷ���и�Ŀ¼
 * mkdirs();�����Ŀ¼�����ڣ���һ�𴴽�
 * list();���ļ���Ŀ¼����������������ļ����ַ����ı�ʾ��ʽ
 * listFilies()
 * static listRoots()
 * @author zyq
 *
 */
public class dirtest {
	public static void main(String[] args){
		/**
		 * 
		 */
		String path="D:/Users/zyq/dir";//�ļ���ַ����ע�������Ŀ¼�����ڣ��ͻᴴ��ʧ�ܣ����Ա���ȷ����Ŀ¼����
		File src=new File(path);//����һ���ļ���
		src.mkdir();//����Ŀ¼
		String path1="D:/Users/zyq/2/3";
		File src1=new File(path1);
		src1.mkdirs();
	}
}
