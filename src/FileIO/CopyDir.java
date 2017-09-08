package FileIO;
//文件夹的拷贝
import java.io.File;
import java.io.IOException;

/**
 * 文件夹的拷贝
 * 1、递归方法     查找子孙级文件
 * 2、是文件直接复制copyFile
 *      是文件夹 创建即可mkdirs()
 * @author zyq
 *
 */
public class CopyDir {
	public static void main(String[] args) {
		//源目录
		String srcPath="D:/Users/zyq/2";
		
		//目标目录
		String destPath="D:/Users/zyq/dir/";
	
//		File dest=null;
		/**
		 * 拷贝文件夹或者文件
		 */
	try {
		FileUtil.copyDir(srcPath,destPath);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
			}
}
	