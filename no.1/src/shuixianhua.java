
public class shuixianhua {
	public static void display()
	{
		int x = 0;
        for(int i=100;i<=999;i++){
            int b = i/100;
            int s = i%100/10;
            int g = i%10;
            
            if(i==Math.pow(b, 3) + Math.pow(s, 3) + Math.pow(g, 3)){
                x++;
                System.out.print(i+" ");
                }
            
        }
	}

}
