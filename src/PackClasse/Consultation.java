package PackClasse;

import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Consultation {
 
	private int numconsult;
	private Date dateconsult;
	private Date dur�consult;
	
	@JoinColumn(name = "idpatient") 
	@ManyToOne 
	private Patient patient;
	
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Consultation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Consultation(int numconsult, Date dateconsult, Date dur�consult) {
		super();
		this.numconsult = numconsult;
		this.dateconsult = dateconsult;
		this.dur�consult = dur�consult;
	}

	@Override
	public String toString() {
		return "Consultation [numconsult=" + numconsult + ", dateconsult=" + dateconsult + ", dur�consult="
				+ dur�consult + "]";
	}

	public int getNumconsult() {
		return numconsult;
	}

	public void setNumconsult(int numconsult) {
		this.numconsult = numconsult;
	}

	public Date getDateconsult() {
		return dateconsult;
	}

	public void setDateconsult(Date dateconsult) {
		this.dateconsult = dateconsult;
	}

	public Date getDur�consult() {
		return dur�consult;
	}

	public void setDur�consult(Date dur�consult) {
		this.dur�consult = dur�consult;
	}
	
	
}
