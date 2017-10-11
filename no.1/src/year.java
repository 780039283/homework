
public class year {
	private static int start;
	private static int end;
	
	year(){
		start=1990;
		end=2007;
	}
	year(int a,int b){
		start=a;
		end=b;
	}
	public  static void display(){
		int i;
		int n=0;
		for(i=start;i<=end;i++){
			if(i%100==0){
				if(i%400==0){
					n++;
					if(n%2==1){
						System.out.print(i+"  ");
					}
					else{
						System.out.println(i);
					}
				}
			}
			else{
				if(i%4==0){
					n++;
					if(n%2==1){
						System.out.print(i+"  ");
					}
					else{
						System.out.println(i);
					}
				}
			}
		}
	}

}




