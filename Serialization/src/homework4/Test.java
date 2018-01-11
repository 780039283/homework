package homework4;

public class Test {

	public static void main(String []arges) {
		iodemo io = new iodemo();
		io.basicio();
		io.getfile();
		iodemo2 io2 = new iodemo2();
		io2.compare();
		serialize s = new serialize();
		s.serializeStudent();
		s.DeserializeStudent();
	}

}
