package demo;
import com.hexaware.interest.Interest;
class CallInterest{
	public static void main(String []args){
		double r=Double.parseDouble(args[0]);
		double t=Double.parseDouble(args[1]);
		double p=Double.parseDouble(args[2]);
		Interest i=new Interest();
		System.out.println("Simple Interest -> "+i.Si(r,t,p));
		System.out.println("Compound Interest -> "+i.Ci(r,t,p));
	}

}