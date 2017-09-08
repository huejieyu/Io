package FileIO;

import java.io.File;

/**
 * 相对路径与绝对路径
 * 绝对路径
 * @author zyq
 *
 */
public class pathtest {
	public static void main(String[] args){
	String parentpath="F:/赵颖清生活/网络图片";
	String name="1.jpg";
	//相对路径
	File src=new File(parentpath, name);
	src= new File(new File(parentpath),name);
	System.out.println(src.getName());//名字
	System.out.println(src.getPath());//相对路径
	//绝对路径
	src=new File("F:/赵颖清生活/网络图片/1.jpg");
	System.out.println(src.getName());
	System.out.println(src.getPath());
	//没有盘符，以user.dir构建,在当前工作的文件下面构建
	src=new File("test.text");
	System.out.println(src.getName());
	System.out.println(src.getPath());
	System.out.println(src.getAbsolutePath());
	}	
}
