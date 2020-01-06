package PackClasse;

import java.util.Date;

public class Priseencharge  extends Paiement {

	private int id;
	private int numdossier;
	private Date daterendu;
	private String typeassure;
	public Priseencharge() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Priseencharge(int numpaiem, Date datepeim, float montantpaim) {
		super(numpaiem, datepeim, montantpaim);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Priseencharge [id=" + id + ", numdossier=" + numdossier + ", daterendu=" + daterendu + ", typeassure="
				+ typeassure + "]";
	}
	public Priseencharge(int id, int numdossier, Date daterendu, String typeassure) {
		super();
		this.id = id;
		this.numdossier = numdossier;
		this.daterendu = daterendu;
		this.typeassure = typeassure;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumdossier() {
		return numdossier;
	}
	public void setNumdossier(int numdossier) {
		this.numdossier = numdossier;
	}
	public Date getDaterendu() {
		return daterendu;
	}
	public void setDaterendu(Date daterendu) {
		this.daterendu = daterendu;
	}
	public String getTypeassure() {
		return typeassure;
	}
	public void setTypeassure(String typeassure) {
		this.typeassure = typeassure;
	}
	
	
}
