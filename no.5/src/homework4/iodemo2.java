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
		File file1 = new File("D:/myeclipse代码/homework4/test1.txt");
		File file2 = new File("D:/myeclipse代码/homework4/test2.txt");
        long start = 0L;
	    long end = 0L; 

	    /*以字节流的方式读取文件，再以字节流的方式写入文件*/
		try{
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");//优化时间显示
			start=System.currentTimeMillis();//得到系统当前时间设为开始时间
			Date d=new Date();
			
			System.out.println("程序开始执行时间:"+sdf.format(d));
			FileInputStream fin = new FileInputStream(file1);
			FileOutputStream fout = new FileOutputStream(file2);
			int c;
			if(d!=null){
                d.setTime(start);
			}
			while((c=fin.read())!=-1){
				fout.write(c);
			}
			end=System.currentTimeMillis();//得到系统当前时间设为结束时间
			d=new Date();
			if(d!=null){ 
			     d.setTime(end);
			}
			System.out.println("程序执行的结束时间:"+sdf.format(d));
			System.out.println("程序执行时间(ms):"+(end-start)+"毫秒");
			fin.close();
			fout.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
		/*BufferedInputStream创建对象以缓存流方式读取文件，BufferedOutputStream创建对象以缓存流方式写入文件*/
		try {
			FileInputStream fin = new FileInputStream(file1);
			FileOutputStream fout = new FileOutputStream(file2);
			BufferedInputStream bfin = new BufferedInputStream(fin);
			BufferedOutputStream bfout = new BufferedOutputStream(fout);
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");//优化时间显示
			start=System.currentTimeMillis();//得到系统当前时间设为开始时间
			Date d=new Date();
			int c;
			System.out.println("程序开始执行时间:"+sdf.format(d));
			if(d!=null){
                d.setTime(start);
			}
			while((c=bfin.read())!=-1){
				bfout.write(c);
			}
			end=System.currentTimeMillis();//得到系统当前时间设为结束时间
			d=new Date();
			if(d!=null){ 
			     d.setTime(end);
			}
			System.out.println("程序执行的结束时间:"+sdf.format(d));
			System.out.println("程序执行时间(ms):"+(end-start)+"毫秒");
			fin.close();
			fout.close();
			bfin.close();
			bfout.close();
			System.out.println("程序开始执行时间:"+sdf.format(d));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
