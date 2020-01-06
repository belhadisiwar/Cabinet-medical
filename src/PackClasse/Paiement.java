package PackClasse;

import java.util.Date;

import javax.persistence.OneToOne;

public class Paiement {
	private int id;
	private int numpaiem;
	private Date datepeim;
	private float montantpaim;
	
	public Paiement() {
		super();
		// TODO Auto-generated constructor stub
	}

	 @OneToOne(mappedBy = "paiement")
	    private Patient patient;
	 
	@Override
	public String toString() {
		return "Paiement [numpaiem=" + numpaiem + ", datepeim=" + datepeim + ", montantpaim=" + montantpaim + "]";
	}

	public Paiement(int numpaiem, Date datepeim, float montantpaim) {
		super();
		this.numpaiem = numpaiem;
		this.datepeim = datepeim;
		this.montantpaim = montantpaim;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public int getNumpaiem() {
		return numpaiem;
	}

	public void setNumpaiem(int numpaiem) {
		this.numpaiem = numpaiem;
	}

	public Date getDatepeim() {
		return datepeim;
	}

	public void setDatepeim(Date datepeim) {
		this.datepeim = datepeim;
	}

	public float getMontantpaim() {
		return montantpaim;
	}

	public void setMontantpaim(float montantpaim) {
		this.montantpaim = montantpaim;
	}
	
	
}
