package FileIO;

import java.io.File;
import java.util.Arrays;

public class testlistroots {
	public static void main(String[] args){
		String path="D:/Users/zyq";
		File parent=new File(path);
		File[] roots =File.listRoots();//�г����õ��ļ�ϵͳ�� 
		System.out.println(Arrays.toString(roots));
	}
}
