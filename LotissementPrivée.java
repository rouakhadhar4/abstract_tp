package abstract_tp;

public class LotissementPrivée  extends Lotissement {
	 LotissementPrivée (int capacité)
	 {
		 super(capacité);
	 }
	 @Override
		public boolean ajouter(Propriété p) {
		 if(p instanceof PropriétéPrivée)
			 super.ajouter(p);
		 return false;
	 }
	 
	 @Override
	 public PropriétéPrivée getPropriétéByIndice(int i)  {
		 Propriété p= super.getPropriétéByIndice(i);
		    if (p instanceof  PropriétéPrivée ) {
		        return (PropriétéPrivée) p;
		    }
		    return null;
		}
	 @Override
	 public int  getnbPièces() {
	     int totalPieces = 0;
	     for (int i = 0; i < nombre; i++) {
	         if (tabProp[i] instanceof  PropriétéPrivée ) {
	             totalPieces += (( PropriétéPrivée) tabProp[i]).getNbPièces();
	         }
	     }
	     return totalPieces;
	 }


		
		
				
}
