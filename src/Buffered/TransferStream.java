package Buffered;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 转换流：只有字节流转字符流，处理乱码（）
 * 1、编码与解码
 * 解码：二进制转换成 字符
 * 编码：字符到二进制
 * 2、乱码原因
 * 编码解码的字符集不统一
 * 字节不完整，长度缺失
 * @author zyq
 *
 */
public class TransferStream {
	public static void main(String[] args) throws IOException {
		/**
		 * 编码与解码字符集必须统一，否则乱码
		 *
		 */
		 String str="中国";
		byte[] data=str.getBytes();
		System.out.println(new String(data, 0,data.length));//字节数不完整，小于data.length的数目都是乱码
		
		System.out.println(data.length);
	}
public static void test1() throws IOException{
	String str="中国";
	//编码
	byte[] data=str.getBytes();//使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
	//String(data),意思是通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 Stringlei
	
	System.out.println(new String(data));//因为编解码的字符集一致，所以没有出现乱码
	data=str.getBytes("utf-8");//设定编码的字符集
	System.out.println(new String(data));//编解码的字符不统一，出现乱码
	//如下采用统一的编码和解码字符集
	byte [] data2=str.getBytes("utf-8");
	str=new String(data2,"utf-8");
	System.out.println(new String(str));//不会乱码
	}
}
