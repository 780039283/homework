package homework5;

import java.util.List;

public class SJF extends taskWork{

	public SJF() {
		// TODO Auto-generated constructor stub
	}
	public Task findTask(List<Task> tasks) {
		int shortestTask=tasks.get(0).getServiceTime();
		int j=0;
		for(int i=0;i<tasks.size();i++){
			if(tasks.get(i).getServiceTime()<shortestTask){
				shortestTask=tasks.get(i).getServiceTime();
				j=i;
			}
		}
		return tasks.remove(j);
		
	}

}
