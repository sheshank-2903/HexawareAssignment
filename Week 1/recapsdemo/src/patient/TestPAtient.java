package patient;

import java.util.HashSet;
import java.util.Set;

public class TestPAtient {
	public static void main(String[] args) {
		Patient p1=new Patient(101, "Yash","2002-17-04",'M',1234567890,new HashSet<Integer>());
		System.out.println(p1);
		
		p1.insertPatientClaimId(111);
		p1.insertPatientClaimId(112);
		System.out.println(p1);
		
		Set<Patient> patientSet=new HashSet<Patient>();
		patientSet.add(p1);
		patientSet.add(new Patient(102, "Kumar", "12/08/12",'M', 98787765344L, new HashSet<Integer>()));
		patientSet.add(new Patient(102, "Kumar", "12/08/12",'M', 98787765344L, new HashSet<Integer>()));
		
		System.out.println(patientSet);
	}

}
