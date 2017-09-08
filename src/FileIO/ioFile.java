package FileIO;
// 文件的读取
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/**
 * 文件的读取
 * 1、建立联系   File对象
	2、选择流     文件输入流  InputStream FileInputStream
	3、操作  : byte[] car =new byte[1024];  +read+读取大小
              输出
	4、释放资源 :关闭

 * @author zyq
 *
 */

public class ioFile {
	public static void main(String[] args){
		File src=new File("D:/Users/zyq/sun.jpg");//1建立联系
		//2 选择流
		InputStream is=null;//提升作用域
		try {
			 is=new FileInputStream(src);
			 //3、操作  不断读取 缓冲数组
			 byte[] car=new byte[10];//每次读取字节数大小
			 int len=0;//接受   实际读取大小
			 //循环读取 
			 //内部try catch开始
			 try {
				while(-1!=(len=is.read(car))){//读取完毕的时候len的值是-1
					 //输出 字节数组转成字符串
					String info=new String(car,0,len);
					System.out.println(info);
				 }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("文件不存在");
			}
			 //一个内部try catch结束
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("读取文件失败");
		}
		finally{
			if(null!=is){
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("关闭文件失败");
				}
			}
		}
		
	}
}
