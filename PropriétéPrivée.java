package abstract_tp;

 class PropriétéPrivée extends  Propriété {
	protected int nbPièces;

	public PropriétéPrivée(int id, Personne responsable, String adresse, double surface,int nbPièces) {
		super(id,responsable,adresse,surface);
		this.nbPièces = nbPièces;
	}

	

	@Override
	public String toString() {
		return super.toString()+"PropriétéPrivée [nbPièces=" + nbPièces + "]";
	}
	@Override
	double calculImpot() {
		return 0.5*surface +10/this.nbPièces;
	}



	public int getNbPièces() {
		return nbPièces;
	}



	public void setNbPièces(int nbPièces) {
		this.nbPièces = nbPièces;
	}
	

}
