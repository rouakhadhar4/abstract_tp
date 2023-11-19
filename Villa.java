package abstract_tp;
 class Villa extends PropriétéPrivée {
	private boolean avecPiscine;

	public Villa(int id, Personne responsable, String adresse, double surface, int nbPièces, boolean avecPiscine) {
		super(id, responsable, adresse, surface, nbPièces);
		this.avecPiscine = avecPiscine;
	}

	@Override
	public String toString() {
		return super.toString()+"Villa [avecPiscine=" + avecPiscine + "]";
	}
	@Override
	double calculImpot() {
		double m=0;
		if(this.avecPiscine=true)
			m= super.calculImpot()+200;
		return m;
	}
	

}
