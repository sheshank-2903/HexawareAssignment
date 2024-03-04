package synchronize;

public class Admission implements Runnable{
	int seats=1;
	
	public static void main(String[] args) {
		
		Runnable ad=new Admission();
		
		Thread t1= new Thread(ad,"Yash");
		
		Thread t2= new Thread(ad,"Ravi");
		
		t1.start();
		t2.start();
		
	}

	@Override
	public synchronized void run() {
		
		System.out.println("No of seats before "+seats);
		
		if(seats>0) {
			System.out.println("Seat Allocated to: "+Thread.currentThread().getName());
			seats-=1;
		}
		else {System.out.println("Sorry Try next year");}
		
		System.out.println("No of seats after "+seats);
	
		
	}
	
	

}
