package FileIO;

import java.io.File;

/**
 * ���·�������·��
 * ����·��
 * @author zyq
 *
 */
public class pathtest {
	public static void main(String[] args){
	String parentpath="F:/��ӱ������/����ͼƬ";
	String name="1.jpg";
	//���·��
	File src=new File(parentpath, name);
	src= new File(new File(parentpath),name);
	System.out.println(src.getName());//����
	System.out.println(src.getPath());//���·��
	//����·��
	src=new File("F:/��ӱ������/����ͼƬ/1.jpg");
	System.out.println(src.getName());
	System.out.println(src.getPath());
	//û���̷�����user.dir����,�ڵ�ǰ�������ļ����湹��
	src=new File("test.text");
	System.out.println(src.getName());
	System.out.println(src.getPath());
	System.out.println(src.getAbsolutePath());
	}	
}
