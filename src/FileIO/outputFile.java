package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 文件的写出
 * 1、建立联系
 * 2、选择流
 * 3、操作
 * 4、释放资源
 * @author zyq
 *
 */
public class outputFile {
	
	public static void main(String[] args) {
		File dest=new File("D:/Users/zyq/2.txt");
		OutputStream os=null;
		try {
			os=new FileOutputStream(dest,true);//以追加的形式必须写成true,否则就是覆盖
			String str="hello Zhao Yingqing\r\n";
			//字符串转字节数组
			byte[] data=str.getBytes();
			os.write(data,0,data.length);
			
			os.flush();//强制刷新出去,不断的推出去
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("文件未找到");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("文件写出失败");
		}finally{
			if(os!=null){
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("关闭文件失败");
				}
			}
		}
		
	}
}
