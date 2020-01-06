package PackClasse;

import java.util.Date;

public class Espèce extends Paiement {

	private float idrecu;

	public Espèce() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Espèce(int numpaiem, Date datepeim, float montantpaim) {
		super(numpaiem, datepeim, montantpaim);
		// TODO Auto-generated constructor stub
	}

	public Espèce(float idrecu) {
		super();
		this.idrecu = idrecu;
	}

	public float getIdrecu() {
		return idrecu;
	}

	public void setIdrecu(float idrecu) {
		this.idrecu = idrecu;
	}

	@Override
	public String toString() {
		return "Espèce [idrecu=" + idrecu + "]";
	}
	
	
}
