package homework4;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class iodemo {
	
	public void iodemo() {
		
		
	}
	public void basicio(){
		System.out.println("请输入：");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		File file1 = new File("D:/myeclipse代码/homework4/src.txt");
		File file2 = new File("D:/myeclipse代码/homework4/dest.txt");
		if(file1.exists()==false){
			try{
		
			file1.createNewFile();
			
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		if(file2.exists()==false){
			try{
		
			file2.createNewFile();
			
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		try{
			FileOutputStream f= new FileOutputStream(file1);
			byte buy[]=str.getBytes();
			f.write(buy);
			f.close();
		}catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
		try{
		FileReader fin = new FileReader(file1);
		FileWriter fout = new FileWriter(file2);
		int c;
		while((c=fin.read())!=-1){
			fout.write(c);
		}
		fin.close();
		fout.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("操作成功！");
	}
	public void getfile() {
		 File file = new File("D:/myeclipse代码/homework4");
		 File[] list = file.listFiles();
		 Format simpleFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		/* for (int i = 0; i < list.length; i++)
	        {
	            System.out.println("fileName:"+list[i].getName());
	            if(list[i].isFile()){
		            Date d = new Date(list[i].lastModified());
		            String dateString = simpleFormat.format(d);
		            System.out.println("modifyTime:"+dateString);
		            System.out.println("filesize:"+list[i].length()+"B");
	            }else{
	            Date d = new Date(list[i].lastModified());
	            String dateString = simpleFormat.format(d);
	            System.out.println("modifyTime:"+dateString);
	            }
	        }*/
		 File f =new File("D:/myeclipse代码/homework4/fileinfo.txt");
			 if(f.exists()==false){
				 try {
					f.createNewFile();   //如果文件不存在就创建文件
				} catch (Exception e) {
					// TODO: handle exception
				}
			 }
		 try {
			
			BufferedWriter fw = new BufferedWriter(new FileWriter(f));
			System.out.println("文件夹类型的有：");
			for(int i = 0; i < list.length; i++){
				if(list[i].isDirectory()){
					String str1="fileName:"+list[i].getName();
					System.out.println(str1);
					fw.write(str1);
					fw.newLine();
		            Date d = new Date(list[i].lastModified());
		            String dateString = simpleFormat.format(d);
		            String str2="modifyTime:"+dateString;
		            System.out.println(str2);
		            fw.write(str2);
		            fw.newLine();

				}
				
			}
			System.out.println("文件类型的有：");
			for(int i = 0; i < list.length; i++){
				if(list[i].isFile()){
					String str1="fileName:"+list[i].getName();
					System.out.println(str1);
					fw.write(str1);
					fw.newLine();
		            Date d = new Date(list[i].lastModified());
		            String dateString = simpleFormat.format(d);
		            String str2="modifyTime:"+dateString;
		            System.out.println(str2);
		            fw.write(str2);
		            fw.newLine();
		            String str3="filesize:"+list[i].length()+"B";
		            System.out.println(str3);
		            fw.write(str3);
		            fw.newLine();
				}
			}
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
