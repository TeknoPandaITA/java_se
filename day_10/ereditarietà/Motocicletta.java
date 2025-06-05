package day_10.ereditarietà;

public class Motocicletta extends Veicolo {

	private boolean sidecar;

	public Motocicletta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motocicletta(String marca, String modello, String targa, boolean assicurazione) {
		super(marca, modello, targa, assicurazione);
		// TODO Auto-generated constructor stub
	}

	public boolean isSidecar() {
		return sidecar;
	}

	public void setSidecar(boolean sidecar) {
		this.sidecar = sidecar;
	}

}
