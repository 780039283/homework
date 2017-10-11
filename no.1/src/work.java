
public class work {
	public static void main(String[] arge)
	{
		year y=new year();
		System.out.println("No.1 find year :");
		y.display();
		
		score sc=new score();
		int[] s={20,0,80,95,100};
		sc.input(s);
		System.out.println("\n\nNo.2 ToGradeScore :");
		sc.ToGradeScore();
		
		picture p=new picture();
		System.out.println("\n\nNo.3 print picture :");
		p.display();
		
		shuixianhua f=new shuixianhua();
		System.out.println("\n\nNo.4 flower number :");
		f.display();
		
	}
}
