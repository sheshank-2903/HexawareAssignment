package exception;


public class AgeRegister {
	public static void main(String[] args){
		
		
		int age=17;
		if(age<18) {
			throw new AgeExcep("You are too young");
		}
	}
}
