package homework5;

import java.util.ArrayList;
import java.util.List;

public abstract class taskWork {

	public taskWork() {
		// TODO Auto-generated constructor stub
	}
	public abstract Task findTask(List<Task> tasks);
	public void oneLine(List<Task> tasks) {
		
		int present_time=0;//当前时间
		int service_time=0;//当前任务服务剩余时间
		Task i= new Task();
		List<Task> waiTasks = new ArrayList<Task>();//当前时间等待的任务
		
		while(true){
			
			if(tasks.isEmpty()&&waiTasks.isEmpty()&&service_time==0)break;//当任务列表和等待服务任务列表为空且当前任务也完成了则跳出循环
			if(!tasks.isEmpty()){//因为每隔一秒有一个任务到达所以每次把一个任务放进等待队列
			/*	//如果任务列表中第一个任务到达时间小于或等于当前时间就把他放进等待任务列表
				if(tasks.get(0).getArrivalTime()<=present_time){
					waiTasks.add(tasks.remove(0));
				}*/
				waiTasks.add(tasks.remove(0));
			}
			//没有当前执行任务且等待队列还没有任务到达时，service_time<0，此时判断等待队列是否有新任务进来有的话设service_time为0

			if(service_time<=0&&!waiTasks.isEmpty()){//当当前任务剩余时间为0时，开始下一个任务
				i = findTask(waiTasks);
				service_time = i.getServiceTime();//设置即将开始任务服务时间为当前任务剩余时间
				i.setStartingTime(present_time);
				i.setFinishingTime(i.getStartingTime()+i.getServiceTime());
				i.setTurnAroundTime(i.getFinishingTime()-i.getArrivalTime());
				i.setWeightTurnAround((double)i.getTurnAroundTime()/(double)i.getServiceTime());
				printTask(i);
						
					
				
				
			}
			
			present_time++;
			service_time--;
			
		}
	}
	public void twoLine(List<Task> tasks){
		int present_time=0;//当前时间
		int service_time1=0;//当前任务服务剩余时间
		int service_time2=0;
		Task i= new Task();
		List<Task> waiTasks = new ArrayList<Task>();//当前时间等待的任务
		
		while(true){
			
			if(tasks.isEmpty()&&waiTasks.isEmpty()&&service_time1==0&&service_time2==0)break;//当任务列表和等待服务任务列表为空且当前任务也完成了则跳出循环
			if(!tasks.isEmpty()){//因为每隔一秒有一个任务到达所以每次把一个任务放进等待队列
			/*	//如果任务列表中第一个任务到达时间小于或等于当前时间就把他放进等待任务列表
				if(tasks.get(0).getArrivalTime()<=present_time){
					waiTasks.add(tasks.remove(0));
				}*/
				waiTasks.add(tasks.remove(0));
			}
			//没有当前执行任务且等待队列还没有任务到达时，service_time<0，此时判断等待队列是否有新任务进来有的话设service_time为0

			if(service_time1<=0&&!waiTasks.isEmpty()){//当当前任务剩余时间为0时，开始下一个任务
				i = findTask(waiTasks);
				service_time1 = i.getServiceTime();//设置即将开始任务服务时间为当前任务剩余时间
				i.setStartingTime(present_time);
				i.setFinishingTime(i.getStartingTime()+i.getServiceTime());
				i.setTurnAroundTime(i.getFinishingTime()-i.getArrivalTime());
				i.setWeightTurnAround((double)i.getTurnAroundTime()/(double)i.getServiceTime());
				printTask(i);
						
					
				
				
			}
			if(service_time1!=0&&service_time2<=0&&!waiTasks.isEmpty()){
				
				i = findTask(waiTasks);
				service_time2 = i.getServiceTime();//设置即将开始任务服务时间为当前任务剩余时间
				i.setStartingTime(present_time);
				i.setFinishingTime(i.getStartingTime()+i.getServiceTime());
				i.setTurnAroundTime(i.getFinishingTime()-i.getArrivalTime());
				i.setWeightTurnAround((double)i.getTurnAroundTime()/(double)i.getServiceTime());
				printTask(i);
			}
			
			present_time++;
			service_time1--;
			service_time2--;
		}
	}
	public void printTask(Task t){//打印出所有执行完任务的信息
		System.out.println("任务ID:"+t.getTaskID()+" 到达时间:"+t.getArrivalTime()+" 服务时间:"+
	t.getServiceTime()+" 开始时间:"+t.getStartingTime()+" 完成时间:"+t.getFinishingTime()+" 周转时间:"+
	t.getTurnAroundTime()+" 带权周转时间:"+t.getWeightTurnAround());
	}
}
