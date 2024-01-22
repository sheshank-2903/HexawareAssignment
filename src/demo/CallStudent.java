package demo;
import com.hexaware.student.Students;
class CallStudent{
	public static void main(String []args){
		int sid=Integer.parseInt(args[0]);
		String sname=args[1];
		double m1=Double.parseDouble(args[2]);
		double m2=Double.parseDouble(args[3]);
		double m3=Double.parseDouble(args[4]);
		Students s=new Students(sid,sname,m1,m2,m3);
		System.out.println("total - "+s.getTotal());
		System.out.println("Average - "+s.getAvg());
		System.out.println("class - "+s.getRank());
	}

}