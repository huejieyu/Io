package Buffered;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * ת������ֻ���ֽ���ת�ַ������������루��
 * 1�����������
 * ���룺������ת���� �ַ�
 * ���룺�ַ���������
 * 2������ԭ��
 * ���������ַ�����ͳһ
 * �ֽڲ�����������ȱʧ
 * @author zyq
 *
 */
public class TransferStream {
	public static void main(String[] args) throws IOException {
		/**
		 * ����������ַ�������ͳһ����������
		 *
		 */
		 String str="�й�";
		byte[] data=str.getBytes();
		System.out.println(new String(data, 0,data.length));//�ֽ�����������С��data.length����Ŀ��������
		
		System.out.println(data.length);
	}
public static void test1() throws IOException{
	String str="�й�";
	//����
	byte[] data=str.getBytes();//ʹ��ƽ̨��Ĭ���ַ������� String ����Ϊ byte ���У���������洢��һ���µ� byte �����С�
	//String(data),��˼��ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ���� byte ���飬����һ���µ� Stringlei
	
	System.out.println(new String(data));//��Ϊ�������ַ���һ�£�����û�г�������
	data=str.getBytes("utf-8");//�趨������ַ���
	System.out.println(new String(data));//�������ַ���ͳһ����������
	//���²���ͳһ�ı���ͽ����ַ���
	byte [] data2=str.getBytes("utf-8");
	str=new String(data2,"utf-8");
	System.out.println(new String(str));//��������
	}
}
