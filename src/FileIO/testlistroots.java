package FileIO;

import java.io.File;
import java.util.Arrays;

public class testlistroots {
	public static void main(String[] args){
		String path="D:/Users/zyq";
		File parent=new File(path);
		File[] roots =File.listRoots();//列出可用的文件系统根 
		System.out.println(Arrays.toString(roots));
	}
}
