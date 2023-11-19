package abstract_tp;

class Appartement extends PropriétéPrivée{
	private int numEtage;

	public Appartement(int id, Personne responsable, String adresse, double surface,int nbPièces, int numEtage) {
		super(id,responsable,adresse,surface,nbPièces);
		this.numEtage = numEtage;
	}

	@Override
	public String toString() {
		return super.toString()+"Appartement [numEtage=" + numEtage + "]";
	}
	

}
