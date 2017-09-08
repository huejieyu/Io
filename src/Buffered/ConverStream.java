package Buffered;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * encode编码
 * decode解码
 * 转换流：只有字节转换为字符
 * 1、输出流 OutputStreamWriter   编码
 * 2、输入流 InputStreamReader   解码
 * @author zyq
 *
 */
public class ConverStream {
	public static void main(String[] args) throws IOException {
		//制定解码字符集
		BufferedReader br=new BufferedReader(//字符缓冲流
				new InputStreamReader(//字符输入流
						new FileInputStream(//文件输入流
								new File("D:/Users/zyq/2.txt","utf-8"))));
	}
	
}
