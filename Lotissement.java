package abstract_tp;

import java.util.Arrays;

class Lotissement implements GestionPropriete {
	protected Propriété [] tabProp;
	protected int nombre;
	
	Lotissement(int capacité)
	{
		if(capacité<MAX_PROPRIETES)
		tabProp=new Propriété[capacité];
		
	
	}
	Propriété getPropriétéByIndice(int i)
	{
		if((i>0)&&(i<this.tabProp.length))
		{
			 return tabProp[i];
			
		}
		
			return null;
	}
			
	int getnbPièces()
	{
		int nb=0;
		for(int j=0;j<tabProp.length;j++)
			if(tabProp[j] instanceof  PropriétéPrivée)
			{
				
				nb+=((PropriétéPrivée) tabProp[j]).getNbPièces();
			}
		return nb;
	}
	@Override
	public String toString() {
		return "Lotissement [tabProp=" + Arrays.toString(tabProp) + ", nombre=" + nombre + "]";
	}
	@Override
	public void afficherPropriétés() {
		for(int j=0;j<nombre;j++)
		{
			System.out.println(tabProp[j].toString());
			System.out.println(tabProp[j].calculImpot());
			
		
			
		}
		
		
		
	}
	@Override
	public boolean ajouter(Propriété p) {
		if(nombre<tabProp.length)
		 {
			tabProp[nombre]=p;
			 nombre++;
			 return true;
			 
		 }
		 else
		 return false;
	
	}
	public boolean supprimer(Propriété p) {
		int i=0;
			while(i<this.nombre && !(this.tabProp[i].equals(p))) {
				i++;
			}
			if(this.tabProp[i].equals(p)) {
					for(int j=i;j<this.nombre-1;j++) {
						this.tabProp[j]=tabProp[j+1];
					}
						this.nombre--;
						return true;
					
				}
			return false;
			
	}
}



