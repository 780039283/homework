package homwork3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.text.DecimalFormat;  
import java.util.LinkedList;  
import java.util.List;
import java.util.Random;
import java.util.Scanner; 
  
public class experiment1 {
	 private Object a;

	public static void main(String[] args) {  
	        Scanner in= new Scanner(System.in);   
	          
	        System.out.println("请输入进程个数：");  
	        int n=in.nextInt();  
	          
	        Task[] p=new Task[n];  
	          
	        System.out.println("请输入每个进程的到达时间和服务时间和进程ID:");
	        File file =new File("D:/myeclipse代码/homwork3/a.txt");  
	        
	        	
	        	if(file.exists()==false){
	        		try{
	        			file.createNewFile();
	        	}catch (Exception e) {
	        		e.printStackTrace();
					// TODO: handle exception
				}
	        		
	        	}
	       try {
			BufferedWriter bw =new BufferedWriter(new FileWriter(file));
			
			for(int i=0;i<n;i++){
				String TaskID=String.valueOf(i+1);		
				bw.write(TaskID);
				String arrTime=String.valueOf(i);
				bw.write(arrTime);
				
		        String []numbers = {"6","2","1","3","9"};
		        Random random = new Random();
		        int index = random.nextInt(numbers.length);
		        String serTime=numbers[index];
		        bw.write(serTime);
		        bw.newLine();
			}
			bw.close();
		} catch (Exception e) {
			// TODO: handle exception
		} 
	        
	        
	        try {

	        	BufferedReader reader = new BufferedReader (new FileReader(file));
	            String tempchar;
	            char[] x;
	            int TaskID,arrTime,serTime;
	            int y=0;
	            while((tempchar=reader.readLine())!=null){                    
	            	x=tempchar.toCharArray();
	            	TaskID=(int)x[0]-48;
	            	System.out.print(TaskID);
	            	
	            	arrTime=(int)x[1]-48;
	            	System.out.print(arrTime);
	            	
	            	serTime=(int)x[2]-48;
	            	System.out.print(serTime);
	            	System.out.println();
	            	p[y]=new Task(TaskID,arrTime, serTime);
	            	y++;
	            }	
		            	
		               /* if (((char) reader.read()) != '\r') {
		                   // System.out.print((char) tempchar); 

		                    
		                   
		                    /*TaskID=reader.read()-48;
		                    System.out.println(TaskID);
		                    arrTime=reader.read()-48;
		                    System.out.println(arrTime);
		                    serTime=reader.read()-48;
		                    System.out.println( serTime);
		                    p[x]=new Task(TaskID,arrTime, serTime);*/
		              //  }
		             
	            /*while ((tempchar = reader.read()) != -1) {
	            	
	            	
	                if (((char) tempchar) != '\r') {
	                    System.out.print((char) tempchar); 

	                    
	                   
	                    TaskID=tempchar-48;
	                    arrTime=tempchar-48;
	                    serTime=tempchar-48;
	                    System.out.print(TaskID);
	               }*/
	            
	            reader.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	      /*  try{
	        	
  
               
               
		        for(int x=0;x<n;x++){  
	        	BufferedReader reader = new BufferedReader(new FileReader(file));
		        	int TaskID; 
		        	reader.read(TaskID);
		        	System.out.println(TaskID);
		            int arrTime=reader.read(); 
		            System.out.println(arrTime);
		            int serTime=reader.read();  
		            System.out.println(serTime);
		            
		            p[x]=new Task(TaskID,arrTime, serTime); 
		            
		            reader.close();
		        }
	        }catch(Exception e){
	        
	        	System.out.println(e.toString());
	        } */
	        //System.out.println(p[0].arrivalTime);
	        while(true){  
	            System.out.println("请选择进程调度算法，1：FCFS 2:SJF 其他键:quit");  
	            int select=in.nextInt();  
	            if(select==1){  
	                System.out.println("----------------您选择了FCFS-------------------");  
	                FCFS(p);  
	                Out(p);  
	                  
	            }  
	            else if(select==2){  
	                System.out.println("----------------您选择了SJF-------------------");  
	                Task[] Taskes=SJF(p);  
	                Out(Taskes);  
	            }  
	            else{  
	                break;  
	            }  
	        }  
	}    
	      
	      
	    //输出  
	    public static void Out(Task[] p){  
	        DecimalFormat df = new DecimalFormat("#.00");     
	        float sumWT=0;  
	        float sumWWT=0;  
	        float AverageWT;  
	        float AverageWWT;  
	        for(int i=0;i<p.length;i++){  
	            System.out.println("时刻"+p[i].startTime+": 进程"+p[i].TaskID+"开始运行，完成时间为:"+p[i].finishTime+",周转时间为："+p[i].WholeTime+",带权周转时间为："+df.format(p[i].weightWholeTime));  
	            sumWT+=p[i].WholeTime;  
	            sumWWT+=p[i].weightWholeTime;  
	        }  
	        AverageWT=sumWT/p.length;  
	        AverageWWT=sumWWT/p.length;  
	          
	        System.out.println("平均周转时间为："+df.format(AverageWT));  
	        System.out.println("平均带权周转时间为："+df.format(AverageWWT));  
	        System.out.println("---------------------------------------------------------");  
	    }  
	      
	    //找出下一个处理的进程  
	    public static Task FindNextPro(List<Task> list,int now){  
	        Task pro=list.get(0);  
	        int index=0;  
	        for(int i=1;i<list.size();i++){  
	            if(list.get(i).serviceTime<pro.serviceTime&&list.get(i).arrivalTime<now){  
	                pro=list.get(i);  
	                index=i;  
	            }  
	        }  
	        list.remove(index);  
	        return pro;  
	    }  
	      
	    //插入排序  
	    public static void InsertSort(Task[] array)  
	    {  
	        int i, j;  
	        int n = array.length;  
	        Task target;  
	        for (i = 1; i < n; i++)  
	        {  
	            j = i;  
	            target = array[i];   
	            while (j > 0 && target.arrivalTime < array[j - 1].arrivalTime)  
	            {  
	                array[j] = array[j - 1];  
	                j--;  
	            }   
	            array[j] = target;  
	        }  
	    }  
	      
	    //先来先服务算法  
	    public static void FCFS(Task[] p){  
	          
	        //按到达时间对进程进行排序  
	        InsertSort(p);  
	                  
	        for(int i=0;i<p.length;i++){  
	            //计算完成时间  
	            if(i==0){  
	                p[i].finishTime=p[i].arrivalTime+p[i].serviceTime;  
	            }else{  
	                if(p[i].arrivalTime>p[i-1].finishTime){  
	                    p[i].finishTime=p[i].arrivalTime+p[i].serviceTime;  
	                    p[i].startTime=p[i].arrivalTime;  
	                }  
	                else{  
	                    p[i].finishTime=p[i].serviceTime+p[i-1].finishTime;  
	                    p[i].startTime=p[i-1].finishTime;  
	                }  
	            }  
	              
	            //计算周转时间和带权周转时间   b 
	            p[i].WholeTime=p[i].finishTime-p[i].arrivalTime;  
	            p[i].weightWholeTime=(double)p[i].WholeTime/(double)p[i].serviceTime;  
	              
	        }  
	    }  
	      
	    //短作业优先算法  
	    public static Task[] SJF(Task[] p){  
	          
	        //当前时间  
	        int now=0;  
	        //待处理list  
	        List<Task> list=new LinkedList<>();  
	        //结果list  
	        List<Task> res=new LinkedList<>();  
	        //按时间对进程进行排序  
	        InsertSort(p);  
	          
	        //处理第一个进程  
	        p[0].finishTime=p[0].arrivalTime+p[0].serviceTime;  
	        p[0].WholeTime=p[0].finishTime-p[0].arrivalTime;  
	        p[0].weightWholeTime=p[0].WholeTime/p[0].serviceTime;  
	        res.add(p[0]);  
	          
	        now=p[0].finishTime;  
	          
	        //将剩余进程添加进待处理list  
	        for(int i=1;i<p.length;i++){  
	            list.add(p[i]);  
	        }  
	          
	        while(list.size()!=0){  
	            Task next=FindNextPro(list, now);  
	            if(next.arrivalTime>now){  
	                next.finishTime=next.arrivalTime+next.serviceTime;  
	                next.startTime=next.arrivalTime;  
	            }else{  
	                next.finishTime=now+next.serviceTime;  
	                next.startTime=now;  
	            }  
	            now=next.finishTime;  
	            next.WholeTime=next.finishTime-next.arrivalTime;  
	            next.weightWholeTime=(double)next.WholeTime/(double)next.serviceTime;  
	            res.add(next);  
	        }     
	              
	        return res.toArray(new Task[0]);  
	          
	    } 
}
class Task{  
    public int arrivalTime;  
    public int serviceTime;  
    public int finishTime;  
    public int startTime;  
    public int WholeTime;  
    public double weightWholeTime;  
    public int TaskID;  
      
    Task(int id,int x,int y){  
        TaskID=id;
        arrivalTime=x;  
        serviceTime=y;  
          
    }  
}  