package FileIO;
//�ļ��еĿ���
import java.io.File;
import java.io.IOException;

/**
 * �ļ��еĿ���
 * 1���ݹ鷽��     �������Ｖ�ļ�
 * 2�����ļ�ֱ�Ӹ���copyFile
 *      ���ļ��� ��������mkdirs()
 * @author zyq
 *
 */
public class CopyDir {
	public static void main(String[] args) {
		//ԴĿ¼
		String srcPath="D:/Users/zyq/2";
		
		//Ŀ��Ŀ¼
		String destPath="D:/Users/zyq/dir/";
	
//		File dest=null;
		/**
		 * �����ļ��л����ļ�
		 */
	try {
		FileUtil.copyDir(srcPath,destPath);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
			}
}
	