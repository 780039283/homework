package homework5;

import java.util.ArrayList;
import java.util.List;

public abstract class taskWork {

	public taskWork() {
		// TODO Auto-generated constructor stub
	}
	public abstract Task findTask(List<Task> tasks);
	public void oneLine(List<Task> tasks) {
		
		int present_time=0;//��ǰʱ��
		int service_time=0;//��ǰ�������ʣ��ʱ��
		Task i= new Task();
		List<Task> waiTasks = new ArrayList<Task>();//��ǰʱ��ȴ�������
		
		while(true){
			
			if(tasks.isEmpty()&&waiTasks.isEmpty()&&service_time==0)break;//�������б�͵ȴ����������б�Ϊ���ҵ�ǰ����Ҳ�����������ѭ��
			if(!tasks.isEmpty()){//��Ϊÿ��һ����һ�����񵽴�����ÿ�ΰ�һ������Ž��ȴ�����
			/*	//��������б��е�һ�����񵽴�ʱ��С�ڻ���ڵ�ǰʱ��Ͱ����Ž��ȴ������б�
				if(tasks.get(0).getArrivalTime()<=present_time){
					waiTasks.add(tasks.remove(0));
				}*/
				waiTasks.add(tasks.remove(0));
			}
			//û�е�ǰִ�������ҵȴ����л�û�����񵽴�ʱ��service_time<0����ʱ�жϵȴ������Ƿ�������������еĻ���service_timeΪ0

			if(service_time<=0&&!waiTasks.isEmpty()){//����ǰ����ʣ��ʱ��Ϊ0ʱ����ʼ��һ������
				i = findTask(waiTasks);
				service_time = i.getServiceTime();//���ü�����ʼ�������ʱ��Ϊ��ǰ����ʣ��ʱ��
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
		int present_time=0;//��ǰʱ��
		int service_time1=0;//��ǰ�������ʣ��ʱ��
		int service_time2=0;
		Task i= new Task();
		List<Task> waiTasks = new ArrayList<Task>();//��ǰʱ��ȴ�������
		
		while(true){
			
			if(tasks.isEmpty()&&waiTasks.isEmpty()&&service_time1==0&&service_time2==0)break;//�������б�͵ȴ����������б�Ϊ���ҵ�ǰ����Ҳ�����������ѭ��
			if(!tasks.isEmpty()){//��Ϊÿ��һ����һ�����񵽴�����ÿ�ΰ�һ������Ž��ȴ�����
			/*	//��������б��е�һ�����񵽴�ʱ��С�ڻ���ڵ�ǰʱ��Ͱ����Ž��ȴ������б�
				if(tasks.get(0).getArrivalTime()<=present_time){
					waiTasks.add(tasks.remove(0));
				}*/
				waiTasks.add(tasks.remove(0));
			}
			//û�е�ǰִ�������ҵȴ����л�û�����񵽴�ʱ��service_time<0����ʱ�жϵȴ������Ƿ�������������еĻ���service_timeΪ0

			if(service_time1<=0&&!waiTasks.isEmpty()){//����ǰ����ʣ��ʱ��Ϊ0ʱ����ʼ��һ������
				i = findTask(waiTasks);
				service_time1 = i.getServiceTime();//���ü�����ʼ�������ʱ��Ϊ��ǰ����ʣ��ʱ��
				i.setStartingTime(present_time);
				i.setFinishingTime(i.getStartingTime()+i.getServiceTime());
				i.setTurnAroundTime(i.getFinishingTime()-i.getArrivalTime());
				i.setWeightTurnAround((double)i.getTurnAroundTime()/(double)i.getServiceTime());
				printTask(i);
						
					
				
				
			}
			if(service_time1!=0&&service_time2<=0&&!waiTasks.isEmpty()){
				
				i = findTask(waiTasks);
				service_time2 = i.getServiceTime();//���ü�����ʼ�������ʱ��Ϊ��ǰ����ʣ��ʱ��
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
	public void printTask(Task t){//��ӡ������ִ�����������Ϣ
		System.out.println("����ID:"+t.getTaskID()+" ����ʱ��:"+t.getArrivalTime()+" ����ʱ��:"+
	t.getServiceTime()+" ��ʼʱ��:"+t.getStartingTime()+" ���ʱ��:"+t.getFinishingTime()+" ��תʱ��:"+
	t.getTurnAroundTime()+" ��Ȩ��תʱ��:"+t.getWeightTurnAround());
	}
}
