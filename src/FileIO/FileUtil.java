package FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/**
 * 文件的拷贝
 *  文件夹的拷贝
 * @author zyq
 *
 */
public class FileUtil {
	public static void copyFile1(String srcPath, String destPath) throws IOException {
		//1/1建立联系源  确保存在且为文件，但是目的地的文件可以不存在
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
		//1/1建立联系源  确保存在且为文件，但是目的地的文件可以不存在
		if(!src.isFile()){
			System.out.println("只能拷贝文件");
			throw new IOException("只能拷贝文件夹");
		}
		//dest为已经存在的问价夹，不能建立与文件夹同名的文件
		if(dest.isDirectory()){
			System.out.println("只能拷贝文件");
			throw new IOException("只能拷贝文件");
		}
		//选择流
		InputStream is=new FileInputStream(src);
		OutputStream os=new FileOutputStream(dest);
		//3文件的拷贝 循环 读取 写出
		byte[] flush=new byte[1024];
		int len;
		while(-1!=(len=is.read(flush))){
			os.write(flush,0,len);
		}
		os.flush();
		//关闭流 先打开的后关闭
		os.close();
		is.close();
	}
	/**
	 * 拷贝文件夹
	 * @param srcPath源路径
	 *@param   destPath 目标路径
	 * @throws IOException 
	 **/
	public static void copyDir(String srcPath, String destPath) throws IOException{
		File src=new File(srcPath);
		File dest=new File(destPath);
		
		if(src.isDirectory()){//如果是文件夹,直接创建
		 dest=new File(dest,src.getName());//只是创建一个文件，并没有写出
			}
		
				copyDirDetail(src,dest);
			
		//System.out.println(1145);
	}
	/**
	 *拷贝文件
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
		}else if(src.isDirectory()){//是文件夹的情况,创建文件夹
			//确保目标文件存在
			dest.mkdirs();
			//获取下一级目录或者文件
			for(File sub:src.listFiles()){
				copyDirDetail(sub,new File(dest,sub.getName()));
			}
		}
	}
}
