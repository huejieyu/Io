package FileIO;

import java.io.File;
import java.util.Arrays;

/**
 * ������ＶĿ¼�����ļ�������
 * @author zyq
 *listFiles()
 *�ݹ�
 */
public class zisunji {
	public static void main(String[] args){
		String path="D:/Users/zyq";
		File parent=new File(path);
//		File[] roots =File.listRoots();//�г����õ��ļ�ϵͳ�� 
//		System.out.println(Arrays.toString(roots));
		  printName(parent);
			}
	  public static void printName(File src){
		  if(src==null||!src.exists()){//�����ļ��е�ʱ��ͽ�����
			  return;
		  }
		  System.out.println(src.getAbsolutePath());
		  for(File sun:src.listFiles()){
			  printName(sun);
		  }
	  }
	
}
