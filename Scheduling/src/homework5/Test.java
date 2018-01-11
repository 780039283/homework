package homework5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;



public class Test {

	public Test() {
		
	}

	public static void main(String[] args) {
		List<Task> tasks = new ArrayList<Task>();
		
		File file =new File("D:/myeclipse代码/homework5/a.txt");  
         
    	
    	
		try {

        	BufferedReader reader = new BufferedReader (new FileReader(file));
            String tempchar;
            
            int TaskID,arrTime,serTime;
            int y=0;
            while((tempchar=reader.readLine())!=null){                    
            	String[] sourceStrArray = tempchar.split("	");//分割出来的字符数组
	               

                TaskID=Integer.parseInt(sourceStrArray[0]);
                
                arrTime=Integer.parseInt(sourceStrArray[1]);
                
                serTime=Integer.parseInt(sourceStrArray[2]);
                Task task =new Task(TaskID,arrTime, serTime);
            	tasks.add(task);
            	y++;
            }	
	            	

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		//FCFS fcfs = new FCFS();
		//fcfs.oneLine(tasks);
		//FCFS fcfs2 = new FCFS();
		//fcfs2.twoLine(tasks);
		//SJF sjf = new SJF();
		//sjf.oneLine(tasks);
		SJF sjf2 = new SJF();
		sjf2.twoLine(tasks);
	}
	

}
