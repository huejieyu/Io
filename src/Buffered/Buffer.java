package Buffered;
//文件的拷贝
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 字节流文件拷贝+缓冲流 ，提高性能
 * 方式：节点流（缓冲流）
 * 
 * BufferedInputStream
 * 
 * 字节缓冲流
 * 
 * 字符缓冲流
 * @author zyq
 *
 */

public class Buffer {

	/**
	 * 文件的拷贝,   注意是文件，不是文件夹！！
	 * @author zyq
	 *1、建立联系 File对象 源头目的地
	 *2、选择流
	 *3、操作：拷贝
	 *4、释放资源：关闭两个流
	 */
		public static void main(String[] args) {
			
			String src="D:/Users/zyq/2.txt";
			String dest="D:/Users/zyq/3.txt";
			try {
				copyFile1(src,dest);
			} catch(FileNotFoundException e){
				e.printStackTrace();
				System.out.println("文件不存在");
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("拷贝失败或者关闭流失败");
			}
		}
		
		//文件的拷贝
		/**
		 * 源文件路径
		 * 目标文件路径
		 * @throws
		 * @throws FileNotFoundException
		 * @return
		 * 
		 */
		public static void copyFile1(String srcPath, String destPath) throws IOException {
			//1/1建立联系源  确保存在且为文件，但是目的地的文件可以不存在
			File src=new File(srcPath);
			File dest=new File(destPath);
			if(!src.isFile()){
				System.out.println("只能拷贝文件");
				throw new IOException();
			}
			//2, 选择流
			InputStream is=new BufferedInputStream(new FileInputStream(src));//加上缓冲流，提高性能
			OutputStream os=new BufferedOutputStream(new FileOutputStream(dest));
			//3文件的拷贝 循环 读取 写出
			byte[] flush=new byte[1024];//构建一个长度为1024的byte数组
			int len;
			while(-1!=(len=is.read(flush))){//
				os.write(flush,0,len);
			}
			os.flush();
			//关闭流 先打开的后关闭
			os.close();
			is.close();
		}
	}

