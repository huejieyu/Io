package FileIO;

import java.io.File;
import java.util.Arrays;

/**
 * 输出子孙级目录或者文件的名称
 * @author zyq
 *listFiles()
 *递归
 */
public class zisunji {
	public static void main(String[] args){
		String path="D:/Users/zyq";
		File parent=new File(path);
//		File[] roots =File.listRoots();//列出可用的文件系统根 
//		System.out.println(Arrays.toString(roots));
		  printName(parent);
			}
	  public static void printName(File src){
		  if(src==null||!src.exists()){//不是文件夹的时候就结束了
			  return;
		  }
		  System.out.println(src.getAbsolutePath());
		  for(File sun:src.listFiles()){
			  printName(sun);
		  }
	  }
	
}
