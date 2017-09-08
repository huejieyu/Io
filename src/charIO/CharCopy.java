package charIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * 纯文本的拷贝
 * @author zyq
 *
 */
public class CharCopy {
	public static void main(String[] args) {
		/**
		 * 文件的读取   创建源 仅限于字符的纯文本！！！
		 */
		File src=new File("D:/Users/zyq/2.txt");
		File dest=new File("D:/Users/zyq/4.txt");
	
		//
		Reader reader=null;//提升作用域
		Writer wr=null;
		try {
			reader=new FileReader(src);//字符读取流

			wr=new FileWriter(dest,true);//true是追加，不写或者是False是覆盖
			char [] flush=new char[10];//缓冲流，读入到flush 中，相当于一个meijie
			int len=0;
			while(-1!=(len=reader.read(flush))){
				wr.write(flush,0,len);
			}
			wr.flush();//强制刷出
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("源文件不存在");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("文件读取失败");
		}finally{
			if(null!=wr){
				try {
					wr.close();
				}catch(Exception e1){
				}
			if(null!=reader){
				try {
					reader.close();
				}catch(Exception e2){
				}
			}
}
			}
		
		
	}
}
