package threads;

public class Mythread extends Thread{
	
	public static void main(String[] args) {
		
		Mythread t1=new Mythread();
		t1.setPriority(MAX_PRIORITY);
		t1.setName("Child 1");
		System.out.println(t1);
		
		System.out.println(t1.isAlive());
		
		Mythread t2=new Mythread();
		t2.setPriority(NORM_PRIORITY-1);
		t2.setName("Child 2");
		System.out.println(t2);
		
		
		t1.start();
		t2.start();
			
		System.out.println(t1.isAlive());
	}
	
	@Override
	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}

}
