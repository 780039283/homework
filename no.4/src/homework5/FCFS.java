package homework5;

import java.util.List;

public class FCFS extends taskWork{

	public FCFS() {
		// TODO Auto-generated constructor stub
	}
	public Task findTask(List<Task> tasks) {
		
		return tasks.remove(0);
		
	}

}
