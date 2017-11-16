package homework4;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;



public class serialize {

	public serialize() {
		// TODO Auto-generated constructor stub
	}
	public void serializeStudent () {
		List<Student> list = new ArrayList<Student>();
		
		File file = new File("D:/myeclipse代码/homework4/list.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String tempchar;
			/*从list文件读取信息创建Student对象放进List对象中*/
			while((tempchar=br.readLine()) != null){
				String[] strs = tempchar.split("\\s");
				Student st = new Student(); 
				st.setstudentID(strs[0]);
				st.setname(strs[1]);
				st.setsex(strs[2]);
				list.add(st);
			}
			/*序列化对象List*/
			 ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("D:/myeclipse代码/homework4/student.bin")));
			 
			 oo.writeObject(list);
			 System.out.println("Student对象序列化成功！");
			 oo.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
	public void DeserializeStudent() {
		try {
			/*反序列化对象List*/
			ObjectInputStream oo = new ObjectInputStream(new FileInputStream(new File("D:/myeclipse代码/homework4/student.bin")));
			ArrayList<Student> list2 = null;
			list2 = (ArrayList<Student>)oo.readObject();
			System.out.println("Student对象反序列化成功！");
			for(Student l:list2){
				System.out.println(l.getstudentID()+" "+l.getname()+" "+l.getsex());
			}
				
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
