package patient;

import java.util.HashSet;
import java.util.Objects;


public class Patient {
	private int patientId;
	private String patientName;
	private String patientDob;
	private char patientGender;
	private long patientContact;
	private HashSet<Integer> patientClaimId;

	
	public Patient() {
		
	}
	
		
	public Patient(int patientId, String patientName, String patientDob, char patientGender, long patientContact,
			HashSet<Integer> patientClaimId) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientDob = patientDob;
		this.patientGender = patientGender;
		this.patientContact = patientContact;
		this.patientClaimId = patientClaimId;
	}



	public int getPatientId() {
		return patientId;
	}


	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}


	public String getPatientName() {
		return patientName;
	}


	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}


	public String getPatientDob() {
		return patientDob;
	}


	public void setPatientDob(String patientDob) {
		this.patientDob = patientDob;
	}


	public char getPatientGender() {
		return patientGender;
	}


	public void setPatientGender(char patientGender) {
		this.patientGender = patientGender;
	}


	public long getPatientContact() {
		return patientContact;
	}


	public void setPatientContact(long patientContact) {
		this.patientContact = patientContact;
	}


	public HashSet<Integer> getPatientClaimId() {
		return patientClaimId;
	}


	public void setPatientClaimId(HashSet<Integer> patientClaimId) {
		this.patientClaimId = patientClaimId;
	}


	
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientDob=" + patientDob
				+ ", patientGender=" + patientGender + ", patientContact=" + patientContact + ", patientClaimId="
				+ patientClaimId + "]\n";
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(patientId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return patientId == other.patientId;
	}


	public void insertPatientClaimId(int c){
		patientClaimId.add(c);
		System.out.println("Claim inserted!");
	}
	
	

}
