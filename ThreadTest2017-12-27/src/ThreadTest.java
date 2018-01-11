

public class ThreadTest{
	
	private int sum1 = 0;
	private int sum2 = 0;
	private int sum3 = 0;
	private int sum4 = 0;
	private int sum = 0;
	private Thread thread1;
	private Thread thread2;
	private Thread thread3;
	private Thread thread4;
	private Thread thread5;
	public ThreadTest() {
		
		Thread thread1 =  new Thread(new Runnable() {
			int num = 1;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					synchronized ("") {
						
					
					sum1 = num+sum1;
					num = num+1;
					if(num>25)
						break;
					}
				}
				thread2.start();
				System.out.println("1-25总和："+sum1);
				try {
					thread2.join();
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		Thread thread2 =  new Thread(new Runnable() {
			int num = 26;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					synchronized ("") {
						
					
					sum2 = num+sum2;
					num = num+1;
					if(num>50)
						break;
					}
				}
				System.out.println("26-50总和："+sum2);
				try {
					thread3.join();
					thread3.start();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		Thread thread3 =  new Thread(new Runnable() {
			int num = 51;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					synchronized ("") {
						
					
					sum3 = num+sum3;
					num = num+1;
					if(num>75)
						break;
					}
				}
				System.out.println("51-75总和："+sum3);
				try {
					thread4.join();
					thread4.start();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		Thread thread4 =  new Thread(new Runnable() {
			int num = 76;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					synchronized ("") {
						
					
					sum4 = num+sum4;
					num = num+1;
					if(num>100)
						break;
					}
				}
				System.out.println("76-100总和："+sum4);
				try {
					thread5.join();
					thread5.start();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		Thread thread5 =  new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					synchronized ("") {
						
					sum=sum1+sum2+sum3+sum4;
						break;
					}
				}
				System.out.println("1-100总和："+sum);
			}
		});
		thread1.start();
		/*thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();*/
		
		
	}

	
	
	public static void main(String[] args) {
		new ThreadTest();
		

	}

}
