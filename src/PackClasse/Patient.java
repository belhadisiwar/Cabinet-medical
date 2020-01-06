package PackClasse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Patient {

	private int id;
	private String nom;
	private String prénom;
	private Date datenais;
	private String adressep;
	private String nbrtel;
	

	@OneToMany(mappedBy="patient",  cascade = CascadeType.ALL)
	private List<RDV> RDVS = new ArrayList<RDV>();
	
	@OneToMany(mappedBy="patient",  cascade = CascadeType.ALL)
	private List<Consultation> Consultations = new ArrayList<Consultation>();

	    @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "idpaiement", referencedColumnName = "id")
	    private Paiement paiement;
	
	public List<Consultation> getConsultations() {
		return Consultations;
	}

	public void setConsultations(List<Consultation> consultations) {
		Consultations = consultations;
	}

	public List<RDV> getRDVS() {
		return RDVS;
	}

	public void setRDVS(List<RDV> rDVS) {
		RDVS = rDVS;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", nom=" + nom + ", prénom=" + prénom + ", datenais=" + datenais + ", adressep="
				+ adressep + ", nbrtel=" + nbrtel + "]";
	}
	
	public Patient(int id, String nom, String prénom, Date datenais, String adressep, String nbrtel) {
		super();
		this.id = id;
		this.nom = nom;
		this.prénom = prénom;
		this.datenais = datenais;
		this.adressep = adressep;
		this.nbrtel = nbrtel;
	}
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Paiement getPaiement() {
		return paiement;
	}

	public void setPaiement(Paiement paiement) {
		this.paiement = paiement;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrénom() {
		return prénom;
	}
	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}
	public Date getDatenais() {
		return datenais;
	}
	public void setDatenais(Date datenais) {
		this.datenais = datenais;
	}
	public String getAdressep() {
		return adressep;
	}
	public void setAdressep(String adressep) {
		this.adressep = adressep;
	}
	public String getNbrtel() {
		return nbrtel;
	}
	public void setNbrtel(String nbrtel) {
		this.nbrtel = nbrtel;
	}
	
	
	
	
}
