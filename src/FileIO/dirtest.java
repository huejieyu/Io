package FileIO;

import java.io.File;
/**
 * mkdir();必须确保有父目录
 * mkdirs();如果父目录不存在，则一起创建
 * list();子文件的目录名，依次输出，是文件的字符串的表示形式
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
		String path="D:/Users/zyq/dir";//文件地址，备注：如果父目录不存在，就会创建失败，多以必须确保父目录存在
		File src=new File(path);//创建一个文件类
		src.mkdir();//创建目录
		String path1="D:/Users/zyq/2/3";
		File src1=new File(path1);
		src1.mkdirs();
	}
}
