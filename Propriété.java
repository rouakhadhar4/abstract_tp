package abstract_tp;

import java.util.Objects;

abstract class Propriété {
	protected int id;
	protected Personne responsable;
	protected String adresse;
	protected double surface;
   Propriété(int id, Personne responsable, String adresse, double surface) {
	
		this.id = id;
		this.responsable = responsable;
		this.adresse = adresse;
		this.surface = surface;
	}
	@Override
	public String toString() {
		return "Propriété [id=" + id + ", responsable=" + responsable + ", adresse=" + adresse + ", surface=" + surface
				+ "]";
	}
	
	
	 abstract double calculImpot() ;
	
	@Override
	public boolean equals(Object obj) {
		
		if ((obj == null) ||((getClass() != obj.getClass())))
			return false;
		
		Propriété other = (Propriété) obj;
	
		return this.id== other.id;
		
		
	}
	
}
	 


