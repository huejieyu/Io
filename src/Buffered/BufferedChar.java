package Buffered;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符缓冲流+新增方法(使用新增方法不能发生多态)
 * @author zyq
 *
 */
public class BufferedChar {


	public static void main(String[] args) {
		/**
		 * 文件的读取   创建源 仅限于字符的纯文本！！！不是纯文本是什么情况呢？
		 * 乱码原因  字符集不统一 空间不够
		 */
		File src=new File("D:/Users/zyq/2.java");
		File dest=new File("D:/Users/zyq/4.txt");
	
		//
		BufferedReader reader=null;//提升作用域
		BufferedWriter wr=null;
		try {
			reader=new BufferedReader(new FileReader(src));//字符读取流

			wr=new BufferedWriter(new FileWriter(dest,true));//true是追加，不写或者是False是覆盖
			//读取操作
			/*
			char [] flush=new char[10];//缓冲流，读入到flush 中，相当于一个meijie
			int len=0;
			while(-1!=(len=reader.read(flush))){
				wr.write(flush,0,len);
			}*/
			//新增方法
			String line=null;
			while(null!=(line=reader.readLine())){
				wr.write(line);
				wr.newLine( );//换行符
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
