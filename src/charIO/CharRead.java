package charIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 * 纯文本读取
 * 1、创建源
 * 2、选择流
 * 3、读取
 * 4、关闭资源
 */
public class CharRead {
	public static void main(String[] args) {
		//创建源
		File src=new File("D:/Users/zyq/2.txt");
		//选择流
		Reader reader=null;//提升作用域
		try {
			reader=new FileReader(src);
			char [] flush=new char[10];//缓冲流，读入到flush 中，相当于一个meijie
			int len=0;
			while(-1!=(len=reader.read(flush))){
				String str=new String(flush,0,len);
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("源文件不存在");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("文件读取失败");
		}finally{
			if(null!=reader){
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("关闭失败");
				}
			}
		}
		
	}
}
