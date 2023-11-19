package abstract_tp;

 class PropriétéProfessionnelle  extends Propriété {
	private int nbEmployés;
	private boolean estEtatique;
	public PropriétéProfessionnelle(int id, Personne responsable, String adresse, double surface,int nbEmployés, boolean estEtatique) {
		super(id,responsable,adresse,surface);
		this.nbEmployés = nbEmployés;
		this.estEtatique = estEtatique;
	}
	@Override
	public String toString() {
		return super.toString()+"PropriétéProfessionnelle [nbEmployés=" + nbEmployés + ", estEtatique=" + estEtatique + "]";
	}
	@Override
	double calculImpot() {
		double  s=0;
		if(this.estEtatique=false)
			s= surface + (30/this.nbEmployés);
		else
			s=0;
		return s;
	}
	

}
