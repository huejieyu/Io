package charIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 文件的写出
 * 1、创建源
 * 2、选择流
 * 3、写出
 * 4、关闭资源
 * @author zyq
 *write()
 */
public class CharWrite {
	public static void main(String[] args) {
		//创建源
		File dest=new File("D:/Users/zyq/4.txt");
		//选择流
		Writer wr=null;
		try {
			wr=new FileWriter(dest,true);//true是追加，不写或者是False是覆盖
			//写出
			String msg="Today is Wednesday, Iam happy.";
			wr.write(msg);
			wr.append("哈哈");//将制定的支付添加到此writer
			wr.flush();//强制刷新出去
		} catch(FileNotFoundException e){
			e.printStackTrace();
			//System.out.println("文件未找到");
				}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("");
		}finally{
			if(null!=wr){
				try {
					wr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("关闭失败");
				}
			}
		}
	}
}
