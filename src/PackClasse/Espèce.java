package PackClasse;

import java.util.Date;

public class Esp�ce extends Paiement {

	private float idrecu;

	public Esp�ce() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Esp�ce(int numpaiem, Date datepeim, float montantpaim) {
		super(numpaiem, datepeim, montantpaim);
		// TODO Auto-generated constructor stub
	}

	public Esp�ce(float idrecu) {
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
		return "Esp�ce [idrecu=" + idrecu + "]";
	}
	
	
}
