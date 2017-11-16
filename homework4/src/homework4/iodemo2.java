package homework4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class iodemo2 {

	public iodemo2() {
		// TODO Auto-generated constructor stub
	}
	public void compare() {
		File file1 = new File("D:/myeclipse����/homework4/test1.txt");
		File file2 = new File("D:/myeclipse����/homework4/test2.txt");
        long start = 0L;
	    long end = 0L; 

	    /*���ֽ����ķ�ʽ��ȡ�ļ��������ֽ����ķ�ʽд���ļ�*/
		try{
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");//�Ż�ʱ����ʾ
			start=System.currentTimeMillis();//�õ�ϵͳ��ǰʱ����Ϊ��ʼʱ��
			Date d=new Date();
			
			System.out.println("����ʼִ��ʱ��:"+sdf.format(d));
			FileInputStream fin = new FileInputStream(file1);
			FileOutputStream fout = new FileOutputStream(file2);
			int c;
			if(d!=null){
                d.setTime(start);
			}
			while((c=fin.read())!=-1){
				fout.write(c);
			}
			end=System.currentTimeMillis();//�õ�ϵͳ��ǰʱ����Ϊ����ʱ��
			d=new Date();
			if(d!=null){ 
			     d.setTime(end);
			}
			System.out.println("����ִ�еĽ���ʱ��:"+sdf.format(d));
			System.out.println("����ִ��ʱ��(ms):"+(end-start)+"����");
			fin.close();
			fout.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
		/*BufferedInputStream���������Ի�������ʽ��ȡ�ļ���BufferedOutputStream���������Ի�������ʽд���ļ�*/
		try {
			FileInputStream fin = new FileInputStream(file1);
			FileOutputStream fout = new FileOutputStream(file2);
			BufferedInputStream bfin = new BufferedInputStream(fin);
			BufferedOutputStream bfout = new BufferedOutputStream(fout);
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");//�Ż�ʱ����ʾ
			start=System.currentTimeMillis();//�õ�ϵͳ��ǰʱ����Ϊ��ʼʱ��
			Date d=new Date();
			int c;
			System.out.println("����ʼִ��ʱ��:"+sdf.format(d));
			if(d!=null){
                d.setTime(start);
			}
			while((c=bfin.read())!=-1){
				bfout.write(c);
			}
			end=System.currentTimeMillis();//�õ�ϵͳ��ǰʱ����Ϊ����ʱ��
			d=new Date();
			if(d!=null){ 
			     d.setTime(end);
			}
			System.out.println("����ִ�еĽ���ʱ��:"+sdf.format(d));
			System.out.println("����ִ��ʱ��(ms):"+(end-start)+"����");
			fin.close();
			fout.close();
			bfin.close();
			bfout.close();
			System.out.println("����ʼִ��ʱ��:"+sdf.format(d));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
