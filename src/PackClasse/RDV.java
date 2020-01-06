package PackClasse;

import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class RDV {
	
 private int numrdv;
 private Date daterdv;
 private Date heurerdv;
 
 
 
	@JoinColumn(name = "idpatient") 
	@ManyToOne 
	private Patient patient;
	
	
public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

public RDV() {
	super();
	// TODO Auto-generated constructor stub
}

public RDV(int numrdv, Date daterdv, Date heurerdv) {
	super();
	this.numrdv = numrdv;
	this.daterdv = daterdv;
	this.heurerdv = heurerdv;
}

@Override
public String toString() {
	return "RDV [numrdv=" + numrdv + ", daterdv=" + daterdv + ", heurerdv=" + heurerdv + "]";
}

public int getNumrdv() {
	return numrdv;
}

public void setNumrdv(int numrdv) {
	this.numrdv = numrdv;
}

public Date getDaterdv() {
	return daterdv;
}

public void setDaterdv(Date daterdv) {
	this.daterdv = daterdv;
}

public Date getHeurerdv() {
	return heurerdv;
}

public void setHeurerdv(Date heurerdv) {
	this.heurerdv = heurerdv;
}
 
 
}
