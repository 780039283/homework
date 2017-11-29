package homework5;

public class Task {
	private int TaskID;
	private int arrivalTime;
	private int serviceTime;
	private int startingTime;
	private int finishingTime;
	private int turnAroundTime;
	private double weightTurnAround;
	public Task() {
		// TODO Auto-generated constructor stub
	}
	public Task(int i,int j,int k) {
		this.TaskID=i;
		this.arrivalTime=j;
		this.serviceTime=k;
	}
	
	public int getTaskID() {
		return TaskID;
	}
	public void setTaskID(int taskID) {
		TaskID = taskID;
	}
	public int getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getServiceTime() {
		return serviceTime;
	}
	public void setServiceTime(int serviceTime) {
		this.serviceTime = serviceTime;
	}
	public int getStartingTime() {
		return startingTime;
	}
	public void setStartingTime(int startingTime) {
		this.startingTime = startingTime;
	}
	public int getFinishingTime() {
		return finishingTime;
	}
	public void setFinishingTime(int finishingTime) {
		this.finishingTime = finishingTime;
	}
	public int getTurnAroundTime() {
		return turnAroundTime;
	}
	public void setTurnAroundTime(int turnAroundTime) {
		this.turnAroundTime = turnAroundTime;
	}
	public double getWeightTurnAround() {
		return weightTurnAround;
	}
	public void setWeightTurnAround(double weightTurnAround) {
		this.weightTurnAround = weightTurnAround;
	}

}
